package com.dao;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getInstance() {
		return instance;
	}
	
	private MemberDao() {
	}
	
	//커네션풀로 부터 커넥션을 할당 받는 메소드
	private Connection getConnection() throws Exception{
		        Context initCtx= new InitialContext();
		        Context envCtx=(Context)initCtx.lookup("java:comp/env");
		        DataSource ds=(DataSource)envCtx.lookup("jdbc/orcl");
	         
		        return ds.getConnection();
		    }
	
	//회원가입
	public void insertMember(Member member)throws Exception() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		int cnt = 0;
		
		//커넥션 풀로 부터 커넥션 할당
            conn= getConnection();
            sql ="insert into MEMBER values(?,?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(++cnt, member.getId());
            pstmt.setString(++cnt, member.getPasswd());
            pstmt.setString(++cnt, member.getName());
            pstmt.setString(++cnt, member.getJumin1());
            pstmt.setString(++cnt, member.getJumin2());
            pstmt.setString(++cnt, member.getEmail());
            pstmt.setString(++cnt, member.getBlog());
            pstmt.setTimestamp(++cnt, member.getReg_date());
            pstmt.executeUpdate();
            }catch(Exception e){
            e.printStackTrace();
        }finally{
            execClose(null,pstmt,conn);
        }
    }
     
    //회원 아이디 , 비밀번호 체크
    public int userCheck(String id, String passwd)throws Exception{
         
        Connection conn= null;
        PreparedStatement pstmt = null;
        ResultSet rs =null;
        String sql="";
        String dbpasswd="";
        int x = -1;
         
        try{
            conn =getConnection();
            sql ="select passwd from MEMBER where id = ?";
            pstmt =conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs=pstmt.executeQuery();
            
           if(rs.next()){
                dbpasswd =rs.getString("passwd");
                if(dbpasswd.equals(passwd))
                    x=1; //인증성공
                else
                    x=0; //비밀번호 틀림
            }else
                x=-1; //해당 아이디 없음
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            execClose(rs,pstmt,conn);
        }
        return x;
    }
     
	    //회원 상세정보
		    public Member getMember(String id)throws Exception{
		        Connection conn =null;
		       PreparedStatement pstmt = null;
		        ResultSet rs = null;
		        Member member=null;
		        String sql="";
        try{
           conn=getConnection();
           sql="select * from MEMBER where id= ?";
           pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
         rs= pstmt.executeQuery();
            
		           if(rs.next()){
		                member=new Member();
		               member.setId(rs.getString("id"));
		               member.setPasswd(rs.getString("passwd"));
		              member.setName(rs.getString("name"));
		                member.setJumin1(rs.getString("jumin1"));
		             member.setJumin2(rs.getString("jumin2"));
		              member.setEmail(rs.getString("email"));
		                member.setBlog(rs.getString("blog"));
		             member.setReg_date(rs.getTimestamp("reg_date"));
		            }
		        }catch(Exception ex){
		          ex.printStackTrace();
		       }finally{
		            execClose(rs,pstmt,conn);
		      }
		        return member;
		   }
		    
		    //회원정보 수정
		    public void updateMember(Member member)throws Exception{
		        Connection conn=null;
		        PreparedStatement pstmt =null;
		       String sql = null;
		        int cnt =0;
		        try{
		            conn =getConnection();
		            sql = "update MEMBER set passwd=?,name=?,email=?, blog=? where id=?";
		            pstmt =conn.prepareStatement(sql);
		            pstmt.setString(++cnt, member.getPasswd());
		            pstmt.setString(++cnt, member.getName());
		            pstmt.setString(++cnt, member.getEmail());
		            pstmt.setString(++cnt, member.getBlog());
		            pstmt.setString(++cnt, member.getId());
		             
		            pstmt.executeUpdate();
		            
		        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            execClose(null,pstmt,conn);
        }
    }  
     
    //회원탈퇴 , 회원정보 삭제
   public void deleteMember(String id)throws Exception{
       Connection conn=null;
        PreparedStatement pstmt =null;
        String sql = null;
       try{
           conn =getConnection();
            sql = "delete from MEMBER where id=?";
		            pstmt =conn.prepareStatement(sql);
		            pstmt.setString(1, id);
		            pstmt.executeUpdate();
		        }catch(Exception e){
		           e.printStackTrace();
		        }finally{
		            execClose(null,pstmt,conn);
		        }
		    }
		    
		    //ID 중복 체크
		    public int confirmId(String id)throws Exception{
		        Connection conn =null;
		       PreparedStatement pstmt = null;
		       ResultSet rs = null;
	      String sql="";
      int x=-1;
       try{
          conn=getConnection();
           sql="select * from MEMBER where id= ?";
		            pstmt = conn.prepareStatement(sql);
		            pstmt.setString(1, id);
		            rs= pstmt.executeQuery();   
		             
		        if(rs.next())
		                x=1; //해당아이디 있음
	            else
		               x=-1;//해당아이디 없음
		      }catch(Exception ex){
		           ex.printStackTrace();
       }finally{
           execClose(rs,pstmt,conn);
        }       
        return x;
    }
     
    //자원 정리를 위한 메소드
    //계란노른자
    //Connection 를통해서 PreparedStatement 를생성하고
    //PreparedStatement 를 통해서 ResultSet 를 생성하기때문에
    //종료할때는 ResultSet=>PreparedStatement=>Connection 와같이 생성순서의 역순으로 close 해줘야한다
    public void execClose(ResultSet rs, PreparedStatement pstmt, Connection conn)throws Exception{
        //자원정리
       if(rs !=null) try{rs.close();}catch(SQLException sqle){}
       if(pstmt !=null) try{pstmt.close();}catch(SQLException sqle){}
        //커넥션 풀로 반납
        if(conn !=null) try{conn.close();}catch(SQLException sqle){}
    }
}



	}

}
