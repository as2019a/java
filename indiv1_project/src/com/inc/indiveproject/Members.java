package com.inc.indiveproject;

import java.io.Serializable;

public class Members implements Serializable {
	
	//**해당 로직 재구성 작업..
	//정회원, 프리미엄회원
	String Regularmember;
	String Premiummember;
	
	//아이디, 비빌번호
	String id;
	int password;
	
	//이름, 생년월일, 성별
	String name;
	int dateofbirth;
	String gender;
	
	//주민등록번호, 이메일
	int residentRegistration;
	String email;
	
	//본인확인질문, 답변
	String myIdentityConfirmation;
	String questionAnswer;
	
	//관심있는 분야
	String checkInterests;

	//전화번호, 휴대폰번호
	int phonefs;
	int contact;
	
	//우편번호, 주소
	String postMembers;
	String addressfs1;
	String addressfs2;
	
	//직업, 결혼여부
	String jobers;
	String maritalStatuses;
	
	//사이트를 알게된 곳
	String sfns;


	public Members(String regularmember, String premiummember, String id, int password, String name, int dateofbirth,
	            String gender, int residentRegistration, String email, String myIdentityConfirmation,
	            String questionAnswer, String checkInterests, int phonefs, int contact, String postMembers,
	            String addressfs1, String addressfs2, String jobers, String maritalStatuses, String sfns) {
		super();
		Regularmember = regularmember;
		Premiummember = premiummember;
		this.id = id;
		this.password = password;
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
		this.residentRegistration = residentRegistration;
		this.email = email;
		this.myIdentityConfirmation = myIdentityConfirmation;
		this.questionAnswer = questionAnswer;
		this.checkInterests = checkInterests;
		this.phonefs = phonefs;
		this.contact = contact;
		this.postMembers = postMembers;
		this.addressfs1 = addressfs1;
		this.addressfs2 = addressfs2;
		this.jobers = jobers;
		this.maritalStatuses = maritalStatuses;
		this.sfns = sfns;
	}

	
	}
	
