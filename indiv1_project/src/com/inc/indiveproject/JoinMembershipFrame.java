package com.inc.indiveproject;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Member;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public class JoinMembershipFrame extends JFrame {

	/*
	 * // ** New join 01 복합구조 ** 메뉴바 구성 추가(기본)
	 * 
	 * // 회원구분 * : 정회원, 프리미엄회원 
	 * // 회원아이디 * : // 라벨 1 : 4~12자의 영문 소문자, 숫자로 구성합니다. 
	 * // 비밀번호 * : ***** // 라벨 2 : 4~12자의 영문, 소문자로 설정하고 빈칸은 사용하지 마세요. 
	 * // 비밀번호확인 * : * // 라벨 3 : 상단에 입력하신 비밀번호와 동일하게 입력하세요.
	 * // 이름 * : // 라벨 4 : 실명으로 적어주세요. 
	 * //생년월일 *  ; 
	 * // 성별 * : 라디오박스 유지(남자, 여자) 
	 * // 주민등록번호 * : - // resident registration number
	 * // 이메일 주소 * : -----@----- // gmail.com yahoo.com naver.com hanmail.net
	 * nate.com hotmail.com // 체크버튼박스 * : // 체크박스 : 이 주소로 정기적으로 발행되는 소식을 받겠습니다. //
	 * //본인확인질문 * : 
	 * // 질문의 답 * : 
	 * 
	 * // 관심있는분야체크 * :
	 * 
	 * // 전화번호 : - - 
	 * // 휴대폰번호 : - - 
	 * // 우편번호 : - >우편번호검색 
	 * 주소 : 상세주소 :
	 * 
	 * // 직업 : () 
	 * // 결혼여부 : (라디오버튼박스로 미혼, 결혼 생성!!) 
	 * // 뉴스레터 수신여부 : (라디오버튼박스 코드 작성
	 * 필요!!) 
	 * // 가입완료, 로그인, 취소 버튼 생성
	 */
	
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Thread receiver;
	Members members2;
	
	//패널 선언
	JPanel northMembers;
	JPanel southMembers;
	JPanel checkBoxPanel;
	JPanel members;
	
	JLabel blank;
	
	// 메뉴
	JPanel memubers;
	
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	// fileMenu
	JMenuItem newItem;
	JMenuItem openItem;
	JMenuItem saveItem;
	JMenuItem saveAsItem;
	
	// editMenu
	JMenuItem calculatorItem;
	JMenuItem colorItem;
	
	// helpMenu
	JMenuItem webItem;
	JMenuItem careersItem;
	
	// 회원구분
	private JLabel MembershipLabel;
	JRadioButton Regularmemberbtn;
	JRadioButton Premiummemberbtn;
	
	// 회원아이디
	private JLabel idLabel;
	private JTextField idField;
	private JLabel ideLabel;
	
	// 비밀번호
	private JLabel passwordLabel;
	private JTextField passwordField;
	private JLabel passwordsLabel;
	
	// 비밀번호 확인
	private JLabel confirmpasswordLabel;
	private JTextField confirmpasswordField;
	private JLabel confirmpasswords1Label;
	
	// 이름
	private JLabel nameLabel;
	private JLabel name1Label;
	
	// 생년월일
	private JLabel dateofbirthLabel;
	//private JTextField dateofbirthField;
	private JLabel dateLabel;
	
	// 성별
	private JLabel genderLabel;
	JRadioButton manbtn;
	JRadioButton womanbtn;
	
	// 주민등록번호
	private JLabel residentRegistrationNumberLabel;
	private JTextField residentRegistration1Field;
	private JLabel residentRegistrationLabel;
	private JTextField residentRegistration2Field;
	
	// 이메일주소
	private JLabel emailLabel;
	//private JTextField email1Field;
	private JLabel emailwhelkLabel;
	//private JTextField email2Field;
	JComboBox<String> emailBox;
	
	// 본인확인질문, 답변
	private JLabel myIdentityConfirmationQuestionLabel;
	private JLabel myIdentityConfirmationQuestionM1Label;
	JComboBox<String> myIdentityConfirmationQuestionComboBox;
	
	private JLabel questionAnswerLabel;
	//private JTextField myIdentityConfirmationQuestionField;
	
	// 관심있는분야체크
	private JLabel checkInterestsLabel;
	JLabel TechnologyLabel; // 테크놀러지
	JCheckBox JA1; // 자동차
	JCheckBox JA2; // 가젯
	JCheckBox JA3; // 소프트웨어
	JCheckBox JA4; // 웹서비스
	JCheckBox JA5; // 과학
	JLabel entertainmentLabel; // 엔터테인먼트
	JCheckBox JA6; // TV연예
	JCheckBox JA7; // 영화
	JCheckBox JA8; // 애니메이션
	JCheckBox JA9; // 게임
	JLabel lifeLabel; // 생활
	JCheckBox JA10; // 요리
	JCheckBox JA11; // 패션
	JCheckBox JA12; // 사진
	JCheckBox JA13; // 여행
	JCheckBox JA14; // 교육
	JCheckBox JA15; // 재테크
	JLabel cultureLabel; // 문화
	JCheckBox JA16; // 도서
	JCheckBox JA17; // 공연
	JCheckBox JA18; // 전시회
	JCheckBox JA19; // 예술
	JCheckBox JA20; // 음악
	
	// 전화번호
	private JLabel phonefsLabel;
	
	//private JTextField phonefs1Field;
	private JLabel phonefsh1Label;
	//private JTextField phonefs2Field;
	private JLabel phonefsh2Label;
	//private JTextField phonefs3Field;
	
	// 휴대폰번호
	private JLabel contact;
	JComboBox<String> contacts1Box;
	private JLabel contactbar1;
	//private JTextField contacts1Field;
	private JLabel contactbar2;
	
	// 우편번호(주소, 상세주소)
	private JLabel postMembersLabel;
	
	//private JTextField postMembers1Field;
	private JLabel postMembersfsh1Label;
	//private JTextField postMembers2Field;
	private JLabel postMembersfsh2Label;
	//private JTextField postMembersfs3Field;
	
	JButton postMembersn1;
	
	// 주소
	//private JLabel address1Label;
	//private JTextField addressfs1Field;
	
	// 상세주소
	//private JLabel address2Label;
	//private JTextField addressfs2Field;
	
	// 직업
	//private JLabel jobersLabel;
	JComboBox<String> jobers1Box;
	
	// 결혼여부
	//private JLabel maritalStatusesLabel;
	JRadioButton maritalStatusesmanbtn; // 미혼
	JRadioButton maritalStatuseswomanbtn; // 기혼
	
	// 뉴스레터 수신여부
	//private JLabel NewslettersLabel;
	JRadioButton Newsletters1; // 수신
	JRadioButton Newsletters2; // 수신하지않음
	
	// 버튼
	//private JLabel Btns;
	private AbstractButton signedupbtn1;
	private AbstractButton cancebtn2;
	private AbstractButton termsofMembershipbtn3;

	JoinMembershipFrame() {
		setTitle("HKE Join");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 900, 1100);
		setResizable(true);
		setLayout(new BorderLayout());
		initMenu();
		initSocket();
		initComponent();	
		initEvent();
		initUsers();
		initReceiver();
		setVisible(true);
	}

	private void initUsers() {
		/*
		 * File users = new File("users.inc"); if(!users.exists()) { List<User> userList
		 * = new ArrayList<>(); ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream(users)); oos.writeObject(userList); }
		 */
	}

	private void initReceiver() {

	}

	private void initSocket() {
		Socket socket = new Socket();

	}

	private void initEvent() {
		// 메뉴바에 있는 이벤트 액션 적용
		newItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ntr = JOptionPane.showInputDialog("새로만들기 하시겠습니까?");

			}
		});
		openItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		saveItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		saveAsItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		webItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				HKEwebs Hws = new HKEwebs();
			}
		});
		calculatorItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				NCalculator2 nCalc = new NCalculator2();
				nCalc.create();

			}
		});

		careersItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getContentPane(), "HKE회사 사원 채용방법\n"
				            + "서류전형(이력서, 자기소개서) -> 1차 면접(다대다 면접) " 
						+ "-> 2차 면접(임원 면접) -> 신체검사 -> 신원조회 -> 합격");

			}
		});
		colorItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color c = JColorChooser.showDialog(getContentPane(), "choose color", Color.BLACK);

			}
		});

		// 프리미엄 회원 클릭(라디오박스)시에 '!연간결제가 필요합니다'라는 문구 경고창이 뜨도록 이벤트 적용
		Premiummemberbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getContentPane(), "!연간결제가 필요합니다");

			}

		});

		// 이메일박스 이벤트 리스너
		/*
		 * emailBox.addItemListener(new ItemListener() {
		 * 
		 * @Override public void itemStateChanged(ItemEvent e) { if(e.getItem(true)) {
		 * 
		 * }else if(e.getStateChange(true)) {
		 * 
		 * }
		 * 
		 * } });
		 */

		
		signedupbtn1.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				if ("가입완료".equals(signedupbtn1.getText())) {
					JOptionPane.showMessageDialog(getContentPane(), "가입이 완료되었습니다. 로그인하시겠습니까?");
				}
			}
		});
		cancebtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});
		termsofMembershipbtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TermsofMembership Tms = new TermsofMembership();
			}

		});

	}

	private void initMenu() {
		menuBar = new JMenuBar();

		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		// 사이즈 조정
		Dimension d50 = new Dimension(50, 20);
		fileMenu.setPreferredSize(d50);
		editMenu.setPreferredSize(d50);
		helpMenu.setPreferredSize(d50);

		// 단축키 추가(메뉴)
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);

		// file menu
		newItem = new JMenuItem("New");
		openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		saveAsItem = new JMenuItem("Save As...");

		// edit menu
		calculatorItem = new JMenuItem("Calculator");
		colorItem = new JMenuItem("Color");

		// help menu
		webItem = new JMenuItem("Web");
		careersItem = new JMenuItem("Careers");

		// 단축키 추가(메뉴아이템)
		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));

		calculatorItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
		colorItem.setMnemonic(KeyEvent.VK_C);

		webItem.setMnemonic(KeyEvent.VK_W);
		careersItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));

		// openItem에 단축키 추가하고
		/*
		 * newItem.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * getContentPane().setBackground(Color.RED); } });
		 * 
		 * //openItem에 이벤트까지 추가(바탕색이 하얀색으로 변경) openItem.addActionListener(new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * getContentPane().setBackground(Color.white);
		 * 
		 * } });
		 */

		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);

		editMenu.add(calculatorItem);
		editMenu.add(colorItem);
		// 메뉴에 메뉴 집어넣기(서브메뉴)
		editMenu.add(helpMenu);

		helpMenu.add(webItem);
		helpMenu.add(careersItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		// menuBar.add(helpMenu);

		add(menuBar, BorderLayout.NORTH);
	}

	private void initComponent() {
		setBounds(150,50,1300,800);
		
		members = new JPanel(new BorderLayout());
		northMembers = new JPanel(new GridLayout(13, 2));
		southMembers = new JPanel(new GridLayout(9, 2));
		checkBoxPanel = new JPanel(new GridLayout(1, 4));
		
		JScrollPane scrollPane = new JScrollPane(members, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
				, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// 회원구분
		blank = new JLabel("");
		MembershipLabel = new JLabel("회원구분");
		Regularmemberbtn = new JRadioButton("정회원");
		Premiummemberbtn = new JRadioButton("프리미엄회원");

		northMembers.add(MembershipLabel);

		JPanel btnPanel = new JPanel(new GridLayout(1,2));
		btnPanel.add(Regularmemberbtn);
		btnPanel.add(Premiummemberbtn);
		northMembers.add(btnPanel);
		northMembers.add(blank);

		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(Regularmemberbtn); // btnGroup
		btnGroup.add(Premiummemberbtn);

		Regularmemberbtn.setSelected(true);

		// 회원아이디
		idLabel = new JLabel("회원아이디 *");
		idField = new JTextField(7);
		ideLabel = new JLabel("* 4~12자의 영문 소문자, 숫자로 구성합니다.");

		northMembers.add(idLabel);
		northMembers.add(idField);
		northMembers.add(ideLabel);

		// 비밀번호
		passwordLabel = new JLabel("비밀번호 *");
		passwordField = new JPasswordField(7);
		passwordsLabel = new JLabel("* 4~12자의 영문, 소문자로 설정하고 빈칸은 사용하지 마세요.");

		northMembers.add(passwordLabel);
		northMembers.add(passwordField);
		northMembers.add(passwordsLabel);

		// 비밀번호 확인
		confirmpasswordLabel = new JLabel("비밀번호확인 *");
		confirmpasswordField = new JPasswordField(7);
		confirmpasswords1Label = new JLabel("* 상단에 입력하신 비밀번호와 동일하게 입력하세요.");

		northMembers.add(confirmpasswordLabel);
		northMembers.add(confirmpasswordField);
		northMembers.add(confirmpasswords1Label);

		// 이름
		nameLabel = new JLabel("이름 *");
		JTextField nameField = new JTextField(7);
		name1Label = new JLabel(" 실명으로 적어주세요.");

		northMembers.add(nameLabel);
		northMembers.add(nameField);
		northMembers.add(name1Label);

		// 생년월일
		dateofbirthLabel = new JLabel("생년월일 *");
		JTextField dateofbirthField = new JTextField(7);
		dateLabel = new JLabel(" 예 : 1990-12-01");
		
		northMembers.add(dateofbirthLabel);
		northMembers.add(dateofbirthField);
		northMembers.add(dateLabel);

		// 성별
		blank = new JLabel("");
		genderLabel = new JLabel("성별 *");
		manbtn = new JRadioButton("남자");
		womanbtn = new JRadioButton("여자");

		northMembers.add(genderLabel);
		JPanel btnGroupPanel1 = new JPanel(new GridLayout(1,2));
		btnGroupPanel1.add(manbtn);
		btnGroupPanel1.add(womanbtn);
		northMembers.add(btnGroupPanel1);
		northMembers.add(blank);

		ButtonGroup btnGroup1 = new ButtonGroup();
		btnGroup1.add(manbtn); // btnGroup1
		btnGroup1.add(womanbtn);

		// 주민등록번호
		blank = new JLabel("");
		residentRegistrationNumberLabel = new JLabel("주민등록번호 *");
		residentRegistration1Field = new JTextField(7);
		residentRegistrationLabel = new JLabel("-");
		residentRegistrationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		residentRegistration2Field = new JTextField(7);
		
		northMembers.add(residentRegistrationNumberLabel);
		JPanel btnGroupPanel2 = new JPanel(new GridLayout(1,3));
		btnGroupPanel2.add(residentRegistration1Field);
		btnGroupPanel2.add(residentRegistrationLabel);
		btnGroupPanel2.add(residentRegistration2Field);
		northMembers.add(btnGroupPanel2);
		northMembers.add(blank);

		// 이메일 주소
		blank = new JLabel("");
		emailLabel = new JLabel("이메일");
		JTextField email1Field = new JTextField(7);
		emailwhelkLabel = new JLabel("@");
		emailwhelkLabel.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField email2Field = new JTextField(7);
		String[] emails = { "email 선택", "gmail.com", "yahoo.com", "naver.com", "hanmail.net", "nate.com",
		            "hotmail.com", "직접입력" };
		emailBox = new JComboBox<>(emails);

		// email2Field ActionListener
		/*
		 * email2Field.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { //액션 리스너 재정의
		 * if("입력해 주세요".equals(email2Field.getText())) { email2Field.setText(""); }
		 * if("".equals(email2Field.getText())) { email2Field.setForeground(Color.GRAY);
		 * email2Field.setText("입력해 주세요"); }
		 * 
		 * } }
		 */
		//northMembers.add(new JLabel());
		northMembers.add(emailLabel);
		JPanel btnGroupPanel3 = new JPanel(new GridLayout(1,4));
		btnGroupPanel3.add(email1Field);
		btnGroupPanel3.add(emailwhelkLabel);
		btnGroupPanel3.add(email2Field);
		btnGroupPanel3.add(emailBox);
		northMembers.add(btnGroupPanel3);
		northMembers.add(blank);
		
		// 본인확인질문
		blank = new JLabel("");
		myIdentityConfirmationQuestionLabel = new JLabel("본인확인질문 *");
		
		String[] myIdentityConfirmationQuestions = { "선택하기", "나의 보물1호는?", "나의 출신 고향은?", "나의 이상형은?",
		            "처음으로 가 본 콘서트는 무엇입니까?", "가장 좋아하는 영화는?", "가장 좋아하는 계절?", "가장 좋아하는 색깔?", "가장 좋아하는 스포츠는?",
		            "처음으로 가 본 여행지역은?", "나의 첫 직장은?" };
		myIdentityConfirmationQuestionComboBox = new JComboBox<>(myIdentityConfirmationQuestions);
		myIdentityConfirmationQuestionM1Label = new JLabel("선택한 질문과 답변은 비밀번호 분실시 필요한 정보이므로 꼭 기억해두세요");

		// 질문의 답(본인확인질문에 답변 하는 곳)
		questionAnswerLabel = new JLabel("답변");
		JTextField myIdentityConfirmationQuestionField = new JTextField(9);

		northMembers.add(myIdentityConfirmationQuestionLabel);	
		northMembers.add(myIdentityConfirmationQuestionComboBox);
		northMembers.add(myIdentityConfirmationQuestionM1Label);

		northMembers.add(questionAnswerLabel);
		northMembers.add(myIdentityConfirmationQuestionField);

		// 관심분야체크
		blank = new JLabel("");
		checkInterestsLabel = new JLabel("관심있는 분야");
		
		JPanel JATPanel = new JPanel(new GridLayout(7,1));
		TechnologyLabel = new JLabel("테크놀러지");
		JA1 = new JCheckBox("자동차");
		JA2 = new JCheckBox("가젯");
		JA3 = new JCheckBox("소프트웨어");
		JA4 = new JCheckBox("웹서비스");
		JA5 = new JCheckBox("과학");
		
		JPanel JAEPanel = new JPanel(new GridLayout(7,1));
		entertainmentLabel = new JLabel("엔터테인먼트");
		JA6 = new JCheckBox("TV연예");
		JA7 = new JCheckBox("영화");
		JA8 = new JCheckBox("애니메이션");
		JA9 = new JCheckBox("게임");
		
		JPanel JALPanel = new JPanel(new GridLayout(7,1));
		lifeLabel = new JLabel("생활");
		JA10 = new JCheckBox("요리");
		JA11 = new JCheckBox("패션");
		JA12 = new JCheckBox("사진");
		JA13 = new JCheckBox("여행");
		JA14 = new JCheckBox("교육");
		JA15 = new JCheckBox("재테크");
		
		JPanel JACPanel = new JPanel(new GridLayout(7,1));
		cultureLabel = new JLabel("문화");
		JA16 = new JCheckBox("도서");
		JA17 = new JCheckBox("공연");
		JA18 = new JCheckBox("전시회");
		JA19 = new JCheckBox("예술");
		JA20 = new JCheckBox("음악");
		
		northMembers.add(blank);
		northMembers.add(checkInterestsLabel);
		
		JATPanel.add(TechnologyLabel);
		JATPanel.add(JA1);
		JATPanel.add(JA2);
		JATPanel.add(JA3);
		JATPanel.add(JA4);
		JATPanel.add(JA5);
		
		JAEPanel.add(entertainmentLabel);
		JAEPanel.add(JA6);
		JAEPanel.add(JA7);
		JAEPanel.add(JA8);
		JAEPanel.add(JA9);
		
		JALPanel.add(lifeLabel);
		JALPanel.add(JA10);
		JALPanel.add(JA11);
		JALPanel.add(JA12);
		JALPanel.add(JA13);
		JALPanel.add(JA14);
		JALPanel.add(JA15);
		
		JACPanel.add(cultureLabel);
		JACPanel.add(JA16);
		JACPanel.add(JA17);
		JACPanel.add(JA18);
		JACPanel.add(JA19);
		JACPanel.add(JA20);
		
		checkBoxPanel.add(JATPanel);
		checkBoxPanel.add(JAEPanel);
		checkBoxPanel.add(JALPanel);
		checkBoxPanel.add(JACPanel);

		// 전화번호
		blank = new JLabel("");
		phonefsLabel = new JLabel("전화번호");

		JTextField phonefs1Field = new JTextField(7);
		phonefsh1Label = new JLabel("-");
		phonefsh1Label.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField phonefs2Field = new JTextField(7);
		phonefsh2Label = new JLabel("-");
		phonefsh2Label.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField phonefs3Field = new JTextField(7);

		southMembers.add(phonefsLabel);
		JPanel btnGroupPanel5 = new JPanel(new GridLayout(1,5));
		btnGroupPanel5.add(phonefs1Field);
		btnGroupPanel5.add(phonefsh1Label);
		btnGroupPanel5.add(phonefs2Field);
		btnGroupPanel5.add(phonefsh2Label);
		btnGroupPanel5.add(phonefs3Field);
		
		southMembers.add(btnGroupPanel5);
		northMembers.add(blank);

		// 휴대폰번호(소스코드는 위에것을 활용, 액션코드는 적용X)
		blank = new JLabel("");
		contact = new JLabel("연락처");
		String[] contacts1 = { "010", "011", "018", "017", "016", "02" };
		contacts1Box = new JComboBox<>(contacts1);
		contactbar1 = new JLabel("-");
		contactbar1.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField contacts1Field = new JTextField(7);
		contactbar2 = new JLabel("-");
		contactbar2.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField contacts2Field = new JTextField(7);
		
		southMembers.add(new JLabel());
		southMembers.add(contact);
		JPanel btnGroupPanel6 = new JPanel(new GridLayout(1,5));
		btnGroupPanel6.add(contacts1Box);
		btnGroupPanel6.add(contactbar1);
		btnGroupPanel6.add(contacts1Field);
		btnGroupPanel6.add(contactbar2);
		btnGroupPanel6.add(contacts2Field);
		
		southMembers.add(btnGroupPanel6);
		southMembers.add(blank);

		// 우편번호(주소, 상세주소)
		blank = new JLabel("");
		postMembersLabel = new JLabel("우편번호");
		
		JTextField postMembers1Field = new JTextField(7);
		postMembersfsh1Label = new JLabel("-");
		postMembersfsh1Label.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField postMembers2Field = new JTextField(7);
		postMembersfsh2Label = new JLabel("-");
		postMembersfsh2Label.setHorizontalAlignment(SwingConstants.CENTER);
		JTextField postMembersfs3Field = new JTextField(7);
		
		postMembersn1 = new JButton();
		postMembersn1.setText("-> 우편번호 검색");
		postMembersn1.setForeground(Color.BLACK);
		postMembersn1.setBackground(Color.YELLOW);
		
		southMembers.add(postMembersLabel);
		JPanel btnGroupPanel7 = new JPanel(new GridLayout(1,6));
		btnGroupPanel7.add(postMembers1Field);
		btnGroupPanel7.add(postMembersfsh1Label);
		btnGroupPanel7.add(postMembers2Field);
		btnGroupPanel7.add(postMembersfsh2Label);
		btnGroupPanel7.add(postMembersfs3Field);
		btnGroupPanel7.add(postMembersn1);
		
		southMembers.add(btnGroupPanel7);
		southMembers.add(blank);
		
		// 주소
		blank = new JLabel("");
		JLabel address1Label = new JLabel("주소");
		
		JTextField addressfs1Field = new JTextField(7);
		
		southMembers.add(address1Label);
		JPanel btnGroupPanel8 = new JPanel(new GridLayout(1,1));
		btnGroupPanel8.add(addressfs1Field);
		
		southMembers.add(btnGroupPanel8);
		southMembers.add(blank);
		
		// 상세주소
		blank = new JLabel("");
		JLabel address2Label = new JLabel("상세주소");
		
		JTextField addressfs2Field = new JTextField(7);
		
		southMembers.add(address2Label);
		JPanel btnGroupPanel9 = new JPanel(new GridLayout(1,1));
		btnGroupPanel9.add(addressfs2Field);
		
		southMembers.add(btnGroupPanel9);
		southMembers.add(blank);
		
		
		// 직업(학생, 직장인, 자영업, 창업, 교수, 기타)
		blank = new JLabel("");
		JLabel jobersLabel = new JLabel("직업");
		String[] jobers1 = { "학생", "직장인", "자영업", "창업", "교수", "기타" };
		jobers1Box = new JComboBox<>(jobers1);
		
		southMembers.add(jobersLabel);
		JPanel btnGroupPanel10 = new JPanel(new GridLayout(1,1));
		btnGroupPanel10.add(jobers1Box);
		
		southMembers.add(btnGroupPanel10);
		southMembers.add(blank);
		
		// 결혼여부(미혼, 기혼)
		blank = new JLabel("");
		JLabel maritalStatusesLabel = new JLabel("결혼여부");
		maritalStatusesmanbtn = new JRadioButton("미혼");
		maritalStatuseswomanbtn = new JRadioButton("기혼");
		
		southMembers.add(maritalStatusesLabel);
		JPanel btnGroupPanel11 = new JPanel(new GridLayout(1,2));
		btnGroupPanel11.add(maritalStatusesmanbtn);
		btnGroupPanel11.add(maritalStatuseswomanbtn);
		
		southMembers.add(btnGroupPanel11);
		southMembers.add(blank);
		
		ButtonGroup btnGroup3 = new ButtonGroup();
		btnGroup3.add(maritalStatusesmanbtn); // btnGroup3
		btnGroup3.add(maritalStatuseswomanbtn);
		
		
		// 뉴스레터 수신 여부(수신, 수신하지않음)
		blank = new JLabel("");
		JLabel NewslettersLabel = new JLabel("뉴스레터 수신여부");
		Newsletters1 = new JRadioButton("수신");
		Newsletters2 = new JRadioButton("수신하지않음");
		
		southMembers.add(NewslettersLabel);
		JPanel btnGroupPanel12 = new JPanel(new GridLayout(1,2));
		btnGroupPanel12.add(Newsletters1);
		btnGroupPanel12.add(Newsletters2);
		
		southMembers.add(btnGroupPanel12);
		southMembers.add(blank);
		
		ButtonGroup btnGroup5 = new ButtonGroup();
		btnGroup5.add(Newsletters1); // btnGroup5
		btnGroup5.add(Newsletters2);
		
		
		// 버튼(가입완료, 취소, 회원가입약관)
		blank = new JLabel("");
		signedupbtn1 = new JButton();
		signedupbtn1.setText("가입완료");
		signedupbtn1.setForeground(Color.white);
		signedupbtn1.setBackground(new Color(0, 206, 209));
		cancebtn2 = new JButton();
		cancebtn2.setText("취소");
		cancebtn2.setForeground(Color.white);
		cancebtn2.setBackground(Color.LIGHT_GRAY);
		termsofMembershipbtn3 = new JButton();
		termsofMembershipbtn3.setText("회원가입약관");
		termsofMembershipbtn3.setForeground(Color.white);
		termsofMembershipbtn3.setBackground(new Color(51, 102, 204));
		

		southMembers.add(signedupbtn1);
		southMembers.add(cancebtn2);
		southMembers.add(termsofMembershipbtn3);

		manbtn.setSelected(true);
		members.add(northMembers, BorderLayout.NORTH);
		members.add(southMembers, BorderLayout.SOUTH);
		members.add(checkBoxPanel, BorderLayout.CENTER);
		add(scrollPane);
	}

	public static void main(String[] args) {
		new JoinMembershipFrame();

	}

}
