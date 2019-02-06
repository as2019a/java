package com.inc.indiveproject;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class TermsofMembership extends JFrame {

	/*
	 * 회원가입 약관 구조(메뉴바는 그대로 복사 적용) 
	 * 1. HKE Homepage 이용약관 프레임안에 약관 내용 적용 
	 * 체크박스 : 이용약관에 동의 합니다(라디오체크박스 적용)
	 * 
	 * 2. 개인정보 수집 및 이용 프레임 안에 약관 내용 적용 
	 * 체크박스 : 개인정보 수집 및 이용에 동의합니다(체크박스 적용)
	 * 
	 * 동의, 취소 클릭박스 적용(버튼박스 2개 적용)
	 * 
	 */
	
	//패널 선언
	JPanel JFPanel;
	
	//JPanel mainsPanel;
	
	JLabel blanks;
	
	// 약관 동의 패널
	JPanel AccepttermsPanel;
	
	// 1. HKE Homepage 이용약관 패널
	JPanel mains1Panel;
	JPanel north1Panel;
	JPanel center1Panel;
	JPanel south1Panel;
	
	// 2. 개인정보 수집 및 이용 페널
	JPanel mains2Panel;
	JPanel north2Panel;
	JPanel center2Panel;
	JPanel south2Panel;
	
	// 3. 버튼 패널
	JPanel bthsPanel;
	
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
	
	// 약관 동의
	JLabel AccepttermsLabel;
	
	// 1. HKE Homepage 이용약관
	JLabel HKEHomepageLabel;
	JTextArea HKEHomepageTextArea;
	JRadioButton Iagreebtn;
	
	// 2. 개인정보 수집 및 이용
	JLabel CollectionanduseofpersonalinformationLabel;
	JTextArea CollectionanduseofpersonalinformationTextArea;

	//private AbstractButton dbtn;

	//private AbstractButton hbtn;
	
	public TermsofMembership() {
		setTitle("Terms of Membership(회원 가입 약관 동의)");
		setBounds(300, 300, 900, 900);
		setResizable(true);
		setLayout(new BorderLayout());
		initMenu();
		initComponent();	
		initEvent();
		setVisible(true);
		//dispose();
	}

	private void initEvent() {
		//메뉴 이벤트
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
				//Hws.create();
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
		//동의 버튼 누르면 다시 회원가입으로 이동하는 이벤트 리스너
		/*dbtn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				if ("동의".equals(((AbstractButton) dbtn).getText())) {
					JOptionPane.showMessageDialog(getContentPane(), "동의하였습니다. 회원가입으로 이동합니다");
				}
				JoinMembershipFrame jbf = new JoinMembershipFrame();
			}
		});*/
		
		
		//취소 -> 창 닫기(X로 닫는 것과 같은 리스너)
		/*hbtn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				if ("동의".equals(((AbstractButton) dbtn).getText())) {
					JOptionPane.showMessageDialog(getContentPane(), "창을 닫습니다");
				}
				dispose();
			}
		});*/
		
		
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
		
		JFPanel = new JPanel(new GridLayout(3, 1));
		
		
		JScrollPane scrollPane = new JScrollPane(JFPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
				, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		// 약관 동의
		/*AccepttermsPanel = new JPanel(new BorderLayout());
		AccepttermsLabel = new JLabel("약관 동의");
		
		AccepttermsPanel.add(AccepttermsLabel, "North");
		JFPanel.add(AccepttermsPanel);*/
		
		// 1. HKE Homepage 이용약관
		mains1Panel = new JPanel(new BorderLayout());
		north1Panel = new JPanel(new FlowLayout());
		south1Panel = new JPanel(new FlowLayout());
		
		HKEHomepageLabel = new JLabel("HKE Homepage 이용약관");
		HKEHomepageTextArea = new JTextArea(35, 200);
		HKEHomepageTextArea.setText("HKE 홈페이지 이용 약관\r\n" + 
				"\r\n" + 
				"[2017. 11. 13., 제정]\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"제1장 총칙\r\n" + 
				"\r\n" + 
				"제1조(목적)\r\n" + 
				"\r\n" + 
				"이본 약관은 HKE 주식회사(이하 ‘회사’라 합니다)가 HKE 홈페이지 국문본(이하 ‘HKE 홈페이지’라 합니다) 및 이를 지원하기 위한 서버를 통하여 회원에게 제공하는 용역과 관련하여 회사와 회원과의 권리, 의무, 기타 필요한 사항을 규정함을 목적으로 합니다.\r\n" + 
				"\r\n" + 
				"제2조(용어의 정의)\r\n" + 
				"\r\n" + 
				"이본 약관에서 사용하는 용어의 정의는 다음과 같습니다.\r\n" + 
				"\r\n" + 
				"“서비스”란 구현되는 단말기와 무관하게 회사가 HKE 홈페이지 및 이를 지원하기 위한 서버를 통하여 제공하는 용역을 말합니다.\r\n" + 
				"“HKE 홈페이지”란 회사를 대표하는 홈페이지로서 회사의 관리하에 동일한 도메인네임 및 폴더구조(www.hyundai.com/kr)를 사용하면서 체계적인 구조에 따라 조직되어 통일된 디자인 구성요소를 공유하는 웹페이지의 집합을 말합니다.\r\n" + 
				"“회원”이란 이본 약관에 따라 이용계약이 체결되어 회사가 제공하는 서비스를 이용할 수 있는 고객을 말합니다.\r\n" + 
				"“법인회원”이란 법인인 회원을 말합니다.\r\n" + 
				"“개인회원”이란 자연인인 회원을 말합니다.\r\n" + 
				"“프리미엄회원”이란 연간결제를 이용하는 프리미엄회원을 말합니다.\r\n"+
				"“정회원”이란 법인회원과 본인인증을 한 개인회원을 말합니다.\r\n" + 
				"“준회원”이란 SNS 계정과 연동하여 가입하였거나 최소한의 정보로 간편한 절차에 따라 가입하는 등 본인인증을 하지 않은 개인회원을 말합니다.\r\n" + 
				"“아이디(ID)”란 회원의 식별과 서비스의 이용을 위하여 회사가 정한 정책에 따라 회원이 정하고 회사가 승인하는 숫자·부호 또는 문자의 조합을 말합니다.\r\n" + 
				"“비밀번호”란 부여 받은 아이디와 일치하는 회원임을 확인하기 위하여 회사가 정한 정책에 따라 회원 자신이 정한 숫자·부호 또는 문자의 조합을 말합니다.\r\n" + 
				"“회원 작성 자료”란 서비스를 통하여 회원이 작성한 자료로서 공개∙비공개 여부와 무관하게 HKE 홈페이지 및 이를 지원하기 위한 서버에 등록된 자료 일체를 말합니다. 회원이 명시적으로 동의한 경우(스스로 본인의 개인정보가 기재된 자료를 공개적으로 게시하는 경우는 동의가 있는 것으로 간주합니다)를 제외하면, 회원 작성 자료의 범위에는 개인정보 보호법상 개인정보에 해당하는 자료를 포함하지 않습니다.\r\n" + 
				"제3조(약관의 적용범위)\r\n" + 
				"\r\n" + 
				"① 이본 약관은 서비스를 이용하는 모든 회원에게 적용됩니다. 비회원에게는 회사가 별도로 정한 정책이 적용됩니다.\r\n" + 
				"② VIP멤버스 서비스, 골드링크 서비스, 프리미엄 서비스 등 다른 서비스의 일부 기능이 HKE 홈페이지에서 직접 제공되는 경우에도 해당 기능에 대하여는 이본 약관이 적용되지 않습니다.\r\n" + 
				"제4조(약관의 개정)\r\n" + 
				"\r\n" + 
				"① 회사는 개정된 약관을 시행일 14일 전까지 시행일자, 개정내용, 개정사유 등을 명시하여 HKE 홈페이지에 공지하는 방법으로 약관을 개정할 수 있습니다.\r\n" + 
				"② 제1항에도 불구하고, 회원에게 불리한 약관 개정의 경우 회사는 시행일 14일 전까지 회원에게 전자적 전송매체를 이용하여 개별 통지하는 방법으로 약관을 개정할 수 있습니다. 다만, 연락처 미기재 등 부득이한 사유로 인하여 개별 통지가 어려운 회원에 한하여 회사는 개별 통지에 갈음하여 HKE 홈페이지에 공지할 수 있습니다.\r\n" + 
				"③ 회원이본 약관 개정에 부동의 하지 아니하고 시행일 이후에도 서비스를 이용한 경우, 회사는 회원이본 약관 개정에 동의한 것으로 간주합니다. 회원이본 약관 개정에 부동의 한 경우, 회사 또는 회원은 이용계약을 해지할 수 있습니다.\r\n" + 
				"④ 약관 개정을 위하여 공지 또는 통지하는 경우 회사는 제3항의 내용을 명확하게 따로 고지할 예정입니다.\r\n" + 
				"제5조(약관 외 준칙)\r\n" + 
				"\r\n" + 
				"① 이본 약관에 명시되지 않은 사항과 이본 약관의 해석에 관하여는 관련 법령 또는 상관례에 따릅니다.\r\n" + 
				"② 회원의 개인정보에 관한 사항은 개인정보 처리방침에서 별도로 정합니다.\r\n" + 
				"제2장 이용계약\r\n" + 
				"\r\n" + 
				"제6조(이용계약의 성립)\r\n" + 
				"\r\n" + 
				"① 이용계약은 회원이 되고자 하는 자가 이본 약관의 내용에 동의한 다음 회원가입 신청을 하고 회사가 위 신청에 대하여 승인함으로써 성립합니다.\r\n" + 
				"② 회원은 이본 약관에 대하여 전자적 방법으로 동의할 수 있습니다.\r\n" + 
				"③ 회사는 회원의 자격에 따라 서비스 제공 범위를 제한할 수 있습니다.\r\n" + 
				"④ 회사는 다음 각 호의 경우 회원가입 신청을 승인하지 않을 수 있습니다.\r\n" + 
				"기술상 서비스 제공이 불가능한 경우\r\n" + 
				"회원정보를 누락하거나 사실과 다르게 기재한 경우\r\n" + 
				"개인정보 처리방침에 동의하지 아니한 경우\r\n" + 
				"정당한 접근권한 없이 또는 허용된 접근권한을 넘어 정보통신망에 침입하기 위한 시도가 확인된 경우\r\n" + 
				"회원의 의무위반으로 인하여 이용계약이 해지된 적이 있는 경우\r\n" + 
				"선량한 풍속 기타 사회 질서에 위반되는 경우\r\n" + 
				"기타 관련 법령 및 회사의 공개∙비공개된 정책 등에 부합하지 아니한 경우\r\n" + 
				"제7조(이용계약의 내용)\r\n" + 
				"\r\n" + 
				"① 이용계약은 회사가 회원에게 서비스를 제공하는 것을 내용으로 합니다.\r\n" + 
				"② 회사는 회원임을 확인하기 위하여 일정한 인증 절차를 요구할 수 있으며, 이러한 절차에 응하지 아니하는 경우 회사는 회원으로서의 서비스를 제공할 수 없습니다.\r\n" + 
				"제8조(회원의 의무)\r\n" + 
				"\r\n" + 
				"회원은 서비스를 이용할 때 다음 각 호의 행위를 하지 않아야 합니다.\r\n" + 
				"\r\n" + 
				"회사 또는 제3자의 권리를 침해하거나 침해할 우려가 있는 행위(공연성 없는 모욕∙명예훼손, 업무방해미수, 회사 또는 제3자에 대한 무권대리 등을 포함합니다)\r\n" + 
				"회원정보를 사실과 다르게 기재하는 행위\r\n" + 
				"회사의 승인 없이 서비스를 통하여 얻은 정보를 영리목적으로 이용하는 행위\r\n" + 
				"회사의 승인 없이 서비스를 자신 또는 제3자를 위한 영리목적으로 이용하는 행위\r\n" + 
				"선량한 풍속 기타 사회 질서에 위반되는 행위\r\n" + 
				"기타 관련 법령 및 회사의 공개된 정책 등에 위반되는 행위\r\n" + 
				"제9조(아이디와 비밀번호 관리)\r\n" + 
				"\r\n" + 
				"① 회원의 비밀번호는 회사를 포함한 제3자로부터 복호화 되지 아니하도록 일방향 암호화하여 저장되므로, 아이디와 비밀번호의 관리의무는 회원 본인에게 있습니다.\r\n" + 
				"② 회사는 회원의 개인정보를 보호하기 위하여 일정 주기로 비밀번호를 변경하도록 권고할 수 있습니다.\r\n" + 
				"③ 회사는 서비스에 1년간 접속 기록이 없는 아이디에 대하여 일정한 본인인증 절차를 수행한 후 서비스를 이용하도록 접속을 제한할 수 있습니다.\r\n" + 
				"④ 회사는 아이디와 비밀번호 관리에 관한 정책을 별도로 정할 수 있습니다.\r\n" + 
				"제10조(회원정보의 수정)\r\n" + 
				"\r\n" + 
				"① 회원은 회원가입 신청 시 기재한 회원정보가 변경되었을 경우 회사가 정한 양식 및 방법에 의하여 회원정보를 수정하여야 합니다.\r\n" + 
				"② 회사는 회원이 회원정보를 적시에 수정하지 않음으로 인하여 발생한 손해에 대해서는 책임을 지지 않습니다.\r\n" + 
				"제11조(기존 회원의 전환)\r\n" + 
				"\r\n" + 
				"① 회사가 제공하는 기존 서비스의 운영이 종료되어 그 내용 중 일부 또는 전부를 본 서비스에서 제공하게 된 경우, 회사는 해당 서비스의 기존 회원을 이본 약관의 적용을 받는 회원으로 전환하여 가입하도록 할 수 있습니다.\r\n" + 
				"② 제1항의 경우 기존 서비스에서 정한 약관의 내용은 효력이 없습니다.\r\n" + 
				"제12조(회원에 대한 통지)\r\n" + 
				"\r\n" + 
				"① 이본 약관에서 별도로 정하지 아니하는 한, 회사는 회원이 등록한 회원정보를 바탕으로 전자적 전송매체를 이용하여 회원에 대하여 통지할 수 있습니다.\r\n" + 
				"② 제1항에도 불구하고, 회사는 현대자동차 홈페이지에 공지함으로써 불특정 다수 회원에 대한 통지에 갈음할 수 있습니다.\r\n" + 
				"제13조(이용계약의 해지)\r\n" + 
				"\r\n" + 
				"① 회원은 이용계약을 해지하고자 할 경우 언제든지 서비스상에서 또는 회사가 정한 별도의 방법으로 회사에 회원탈퇴 신청을 하여야 합니다.\r\n" + 
				"② 회사는 다음 각 호의 경우 통지 없이 이용계약을 해지할 수 있습니다.\r\n" + 
				"회원이 제8조에서 정한 회원의 의무를 이행하지 않은 경우\r\n" + 
				"회원이본 약관 개정에 부동의 한 경우\r\n" + 
				"③ 회사는 다음 각 호의 경우 14일 이상의 상당한 기간을 정하여 회원에게 통지하고 그 기간 내에 회원이 회신하지 아니한 때에는 이용계약을 해지할 수 있습니다.\r\n" + 
				"회원이 일정 기간 동안 접속 기록이 없는 경우\r\n" + 
				"회원이 회원정보를 사실과 다르게 기재한 것으로 의심되는 경우\r\n" + 
				"④ 이용계약 해지 시 회사는 관련 법령 등에 의하여 보존할 의무가 있는 정보를 제외한 나머지 정보를 즉시 삭제합니다.\r\n" + 
				"⑤ 회사는 본 조에서 정한 해지 사유가 발생한 경우 해지에 갈음하여 접속을 제한하는 등의 상당한 조치를 취할 수 있습니다.\r\n" + 
				"제14조(양도 금지) \r\n" + 
				"\r\n" + 
				"회원은 회사의 승인 없이 이용계약상 지위 및 그로부터 발생하는 권리와 의무를 제3자에게 양도, 증여할 수 없습니다.\r\n" + 
				"\r\n" + 
				"제3장 서비스\r\n" + 
				"\r\n" + 
				"제15조(서비스의 내용)\r\n" + 
				"\r\n" + 
				"① 서비스는 회사 및 회사가 제공하는 재화와 용역의 소개를 내용으로 합니다.\r\n" + 
				"② 제1항에도 불구하고, 회사는 서비스에서 제공한 정보의 정확성에 대하여 보증하지 않습니다. 회원은 서비스에서 취득한 정보를 의사결정에 이용하기 전 해당 정보를 신뢰할 수 있는지 여부에 대하여 회사에 문의하여야 할 의무가 있으며, 회사는 회원이 이러한 의무를 해태하고 서비스상의 정보를 신뢰함으로써 발생한 손해에 대하여 책임을 지지 않습니다.\r\n" + 
				"③ 회사는 회원에게 특정한 내용의 서비스를 제공하여야 할 의무를 부담하지 않으며, 기존에 제공된 서비스의 내용은 회사가 미래에 제공할 서비스의 내용을 보장하지 않습니다.\r\n" + 
				"④ HKE 홈페이지에서 서비스 외의 외부 웹페이지로의 링크를 직접 제공하더라도, 회사는 외부 웹페이지와 무관하며 이에 대한 관리∙감독 의무를 부담하지 않습니다. 회사는 회원이 외부 웹페이지를 이용하면서 형성한 법률관계에 있어서 어떠한 책임도 부담하지 않습니다.\r\n" + 
				"제16조(서비스의 개시)\r\n" + 
				"\r\n" + 
				"다른 특별한 사정이 없는 한, 회사는 회원의 회원가입 신청을 승인한 때부터 서비스를 개시합니다. 단, 서비스 중 일부는 지정된 때부터 개시할 수 있습니다.\r\n" + 
				"\r\n" + 
				"제17조(서비스의 이용시간)\r\n" + 
				"\r\n" + 
				"서비스의 이용시간은 연중무휴 1일 24시간을 원칙으로 합니다.\r\n" + 
				"회사는 서비스를 일정범위로 분할하여 각 범위 별로 이용 가능한 시간을 별도로 정할 수 있습니다.\r\n" + 
				"제18조(서비스의 중지)\r\n" + 
				"\r\n" + 
				"① 회사는 업무상 필요한 경우 서비스의 전부 또는 일부를 일정 기간 동안 중지할 수 있습니다.\r\n" + 
				"② 회사는 서비스를 중지할 경우 해당 내용을 사전 또는 사후에 현대자동차 홈페이지에 공지하거나 회원에게 통지합니다.\r\n" + 
				"제19조(서비스의 변경)\r\n" + 
				"\r\n" + 
				"회사는 서비스의 향상을 위하여 별도의 통지 없이 서비스의 전부 또는 일부를 변경할 수 있습니다.\r\n" + 
				"\r\n" + 
				"제20조(서비스상 정보의 제공)\r\n" + 
				"\r\n" + 
				"① 회사는 서비스를 운영하며 제공하고자 하는 각종 정보를 현대자동차 홈페이지에 게재하거나 우편 및 전자적 전송매체를 이용하여 회원에게 전송할 수 있습니다.\r\n" + 
				"② 제1항에도 불구하고, 회사가 전자적 전송매체를 이용하여 영리목적의 광고성 정보를 전송하고자 하는 경우 회원은 수신거부의사를 표시하거나 사전 동의를 철회할 수 있습니다. 이 경우 회사는 정보통신망 이용촉진 및 정보보호 등에 관한 법률에서 정하는 내용을 준수합니다.\r\n" + 
				"제21조(회원 작성 자료)\r\n" + 
				"\r\n" + 
				"① 회원 작성 자료에 대한 권리와 의무는 해당 회원에게 있습니다. 회사는 관련 법령에서 정한 사유가 아닌 한 회원 작성 자료에 관한 회원과 제3자 사이의 법률관계에 개입하지 않습니다.\r\n" + 
				"② 회사는 마케팅 등을 위하여 필요한 최소한의 범위 내에서 회원 작성 자료에 대하여 복제, 공연, 공중송신, 전시, 배포, 대여하거나 2차적저작물을 작성할 수 있습니다. 이러한 범위 안에서 회원은 저작권법에 따라 회사 및 그 계열회사에 회원 작성 자료의 이용을 무상으로 허락한 것으로 간주합니다.\r\n" + 
				"③ 회원은 각자의 회원 작성 자료가 제3자의 권리를 침해하지 않도록 하여야 합니다. 회사는 회원 작성 자료의 제3자 권리 침해 여부에 대해서는 어떠한 적극적∙실질적 조사도 수행하지 아니하므로, 회원은 회원 작성 자료가 회사의 승인 절차를 거쳤다거나 일정 기간 동안 회사에 의하여 삭제되지 않았다는 등의 이유로 회사가 제3자에 대한 권리 침해에 기여한 것이라 주장할 수 없습니다.\r\n" + 
				"④ 회사가 회원으로부터 서비스 이용에 대한 대가를 지급받지 않는 한, 회사는 회원 작성 자료를 안전하게 보관할 의무를 부담하지 아니하며, 정책에 따라 회원 작성 자료를 삭제함으로써 발생하는 어떠한 책임도 부담하지 않습니다. 개별 회원은 필요 시 각자의 회원 작성 자료를 복제하여 별도의 장치에 안전하게 보관하여야 합니다.\r\n" + 
				"⑤ 회사는 회원 작성 자료가 다음 각 호의 경우에 해당한다고 판단되는 경우 사전 통지 없이 삭제할 수 있습니다.\r\n" + 
				"회사 또는 제3자의 권리를 침해하거나 침해할 우려가 있는 경우(공연성 없는 모욕∙명예훼손, 업무방해미수, 회사 또는 제3자에 대한 무권대리 등을 포함합니다)\r\n" + 
				"회사가 정한 게시기간을 초과한 경우\r\n" + 
				"회사에서 제공하는 서비스와 관련 없는 경우\r\n" + 
				"회사의 사전 승인 없이 광고성 정보를 게시하는 경우\r\n" + 
				"선량한 풍속 기타 사회 질서에 위반되는 경우\r\n" + 
				"기타 관련 법령 및 회사의 공개∙비공개된 정책 등에 위반되는 경우\r\n" + 
				"⑥ 서비스상 일반에게 공개를 목적으로 제공된 정보로 사생활 침해나 명예훼손 등 회원의 권리가 침해된 경우 그 침해를 받은 회원은 고객센터에 침해사실을 소명하여 정보통신망 이용촉진 및 정보보호 등에 관한 법률에 따라 해당 정보의 삭제 또는 반박내용의 게재를 요청할 수 있습니다.\r\n" + 
				"⑦ 회사는 회원 작성 자료에 관한 정책을 별도로 정할 수 있습니다.\r\n" + 
				"제5장 기타사항\r\n" + 
				"\r\n" + 
				"제22조(방어의무)\r\n" + 
				"\r\n" + 
				"① 회원의 행위로 인하여 제3자가 권리 침해를 이유로 회사에 소송이나 이의를 제기하는 경우, 해당 회원은 자신의 비용으로 회사를 방어하고 제3자에게 손해를 배상하여야 합니다.\r\n" + 
				"② 회사의 최고에도 불구하고 해당 회원이 상당한 기간 내에 제1항의 방어의무를 이행하지 않는 경우, 회사는 자신의 비용으로 제3자의 청구를 방어할 수 있으며 이를 방어하기 위하여 지출한 재판상 또는 재판 외의 비용(변호사보수 등 사건 수행과 관련된 제반 비용을 포함합니다)을 해당 회원에게 구상할 수 있습니다. 이 경우 회사는 해당 회원에 대하여 그 비용의 선급을 청구할 수 있습니다.\r\n" + 
				"제23조(면책사항)\r\n" + 
				"\r\n" + 
				"회사가 제공하는 서비스로 인하여 회원에게 손해가 발생한 경우 그러한 손해가 회사의 고의나 중과실에 기해 발생한 경우에 한하여 회사가 책임을 부담하며, 그 책임의 범위는 통상손해에 한합니다.\r\n" + 
				"\r\n" + 
				"제24조(준거법)\r\n" + 
				"\r\n" + 
				"이본 약관의 준거법은 대한민국법으로 합니다.\r\n" + 
				"\r\n" + 
				"제25조(관할법원)\r\n" + 
				"\r\n" + 
				"① 서비스 이용과 관련하여 회사와 회원 사이에 분쟁이 발생한 경우, 회사와 회원은 분쟁의 해결을 위해 1개월의 협의기간을 두어 성실히 협의합니다.\r\n" + 
				"② 제1항의 협의에도 불구하고 분쟁이 해결되지 않을 경우, 양 당사자는 제1항의 협의기간이 도과한 후 대한민국 내의 법정 관할법원에 소를 제기할 수 있습니다.\r\n" + 
				"부칙 <2017. 11. 13., 제정>\r\n" + 
				"\r\n" + 
				"제1조(시행일) 이본 약관은 2017년 11월 13일 월요일부터 시행합니다.\r\n" + 
				"\r\n" + 
				"");
		HKEHomepageTextArea.setEditable(false);
		JScrollPane jhs = new JScrollPane(HKEHomepageTextArea, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		Iagreebtn = new JRadioButton("이용약관에 동의 합니다");
		
		north1Panel.add(HKEHomepageLabel);
		south1Panel.add(Iagreebtn);
		mains1Panel.add(north1Panel, "North");
		mains1Panel.add(jhs);
		mains1Panel.add(south1Panel, "South");
		JFPanel.add(mains1Panel);
		
		// 2. 개인정보 수집 및 이용
		mains2Panel = new JPanel(new BorderLayout());
		north2Panel = new JPanel(new FlowLayout());
		south2Panel = new JPanel(new FlowLayout());
		
		CollectionanduseofpersonalinformationLabel = new JLabel("개인정보 수집 및 이용");
		CollectionanduseofpersonalinformationTextArea = new JTextArea(35, 200);
		CollectionanduseofpersonalinformationTextArea.setText("통합 HKE닷컴 개인정보 처리방침\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"1. 총칙\r\n" + 
				"HKE(주)는 (이하 '회사'는) 개인정보보호법 등 관련 법령상의 개인정보보호 규정을 준수하여 고객의 개인정보 및 권익을 보호하고 개인정보와 관련한 고객의 고충을 원활하게 처리할 수 있도록 다음과 같은 개인정보 처리방침을 두고 있습니다.\r\n" + 
				"\r\n" + 
				"2. 개인정보의 수집 및 이용목적\r\n" + 
				"1) 마케팅 및 광고에 활용\r\n" + 
				"신규 서비스(제품포함) 및 이벤트 정보 안내, 웹진 및 최신기업정보 안내, DM, SMS, 우편, 경품 배송 및 행사 안내, 고객별 통계분석자료 활용, 시장조사\r\n" + 
				"2) 고객관리\r\n" + 
				"카탈로그 신청 및 배송, 구매상담 신청 및 상담, 시승서비스 예약 및 이용, 이벤트 참여 및 경품/DM 배송, 회원제 서비스의 본인 확인, 서비스에 대한 만족도 조사\r\n" + 
				"\r\n" + 
				"3. 수집하는 개인정보의 항목 및 수집 방법\r\n" + 
				"\r\n" + 
				"1) 수집항목\r\n" + 
				"\r\n" + 
				"채널별 구분\r\n" + 
				"필수 수집 항목\r\n" + 
				"추가 수집 항목\r\n" + 
				"홈페이지 회원\r\n" + 
				"e-mail(ID로 사용), 이름, 휴대전화 번호, 본인인증값, 성별, 생년월일, 내/외국인 구별, 서비스 이용기록, 접속로그, 쿠키, 접속 IP정보, 만 14세 미만 아동의 경우 법정대리인 정보(법정대리인의 이름, 생년월일, 성별, 국적, 본인인증값)\r\n" + 
				"주소\r\n" + 
				"이벤트 및 추가적인 개인정보를 수집하는 경우, 수집항목에 대해 필수/선택에 대해 구분하며 해당 페이지 및 서면 등에서 개인정보의 수집 목적 보유 기간 등을 고객에게 고지하고 추가적인 동의를 받겠습니다.\r\n" + 
				"\r\n" + 
				"2) 개인정보 수집방법\r\n" + 
				"\r\n" + 
				"홈페이지(www.hyundai.com) 회원가입 및 서비스 이용, 서면, 전자우편, 전화, 이벤트 응모 등\r\n" + 
				"\r\n" + 
				"※ 위 개인정보는 수집 당시 개인정보의 내용은 물론 사후 변경된 개인정보의 내용을 보유하는 경우도 포함합니다.\r\n" + 
				"\r\n" + 
				"4. 개인정보의 보유 및 이용기간\r\n" + 
				"1) 회사는 고객의 개인정보를 수집한 때로부터 개인정보의 수집 및 이용에 관한 동의 목적을 달성할 때까지 고객의 개인정보를 보유 및 이용하며, 개인정보 수집 및 이용목적이 달성된 경우에는 해당 정보를 지체 없이 파기합니다.\r\n" + 
				"2) 단, 상법 등 관련법령의 규정에 의하여 보존할 의무가 있는 경우 회사는 고객의 개인정보를 보관합니다. 이 경우 회사는 보관하는 정보를 그 보관의 목적으로만 이용하며 보존기간은 다음과 같습니다.\r\n" + 
				"① 회사의 상업장부와 영업에 관한 중요서류 및 전표 등에 관련된 정보 : 10년 - 중요서류 / 5년 - 전표(상법)\r\n" + 
				"② 모든 거래에 관한 장부 및 증빙서류와 관련된 정보 : 5년 (국세기본법, 법인세법)\r\n" + 
				"③ 계약 또는 청약철회 등에 관한 기록, 대금결제 및 재화 등의 공급에 관한 기록 : 5년 (전자상거래 등에서의 소비자보호에 관한 법률)\r\n" + 
				"④ 소비자의 불만 또는 분쟁처리에 관한 기록 : 3년 (전자상거래 등에서의 소비자보호에 관한 법률)\r\n" + 
				"⑤ 장부와 교부한 세금계산서 또는 영수증 : 5년 (부가가치세법)\r\n" + 
				"⑥ 「통신비밀보호법」에 따른 서비스이용기록, 접속로그, 접속IP정보 : 3개월\r\n" + 
				"※ '개인정보 유효기간제’에 따라 1년간 서비스를 이용하지 않은 회원의 개인정보를 별도로 분리 보관하여 관리하고 있습니다.\r\n" + 
				"\r\n" + 
				"5. 개인정보의 처리위탁\r\n" + 
				"\r\n" + 
				"회사는 서비스 제공을 위하여 필요한 업무 중 일부를 외부 업체에 위탁하고 있으며, 위탁업무계약서 등을 통하여 개인정보보호 관련 법규의 준수, 개인정보에 관한 비밀유지, 제 3 자 제공에 대한 금지, 사고시의 책임부담, 위탁기간, 처리 종료 후의 개인정보의 반환 또는 파기 의무 등을 규정하고, 이를 준수하도록 관리하고 있습니다.\r\n" + 
				"\r\n" + 
				"※ 위탁 업체 리스트는 해당 서비스 변경 및 계약기간에 따라 변경될 수 있으며 변경 시 공지사항을 통해 사전 공지합니다.\r\n" + 
				"\r\n" + 
				"홈페이지 회원의 개인정보\r\n" + 
				"\r\n" + 
				"개인정보 위탁업무내용, 수탁업체 정보 안내 표\r\n" + 
				"위탁업무내용\r\n" + 
				"수탁업체\r\n" + 
				"휴대폰 본인 인증\r\n" + 
				"나이스평가정보㈜\r\n" + 
				"시스템 유지/보수\r\n" + 
				"HKE오토에버㈜, ㈜에어파트너즈\r\n" + 
				"고객 상담\r\n" + 
				"㈜에어서브\r\n" + 
				"카탈로그 배송\r\n" + 
				"㈜HKE커뮤니케이션, ㈜HCK, 우체국\r\n" + 
				"제품 구매 상담\r\n" + 
				"HKE (개인정보처리방침 참고)\r\n" + 
				"6. 개인정보의 파기절차 및 방법\r\n" + 
				"회사는 다른 법률에 따라 개인정보를 보존하여야 하는 경우가 아닌 한, 개인정보 수집 및 이용목적이 달성된 후에는 해당 정보를 지체 없이 파기하는 것을 원칙으로 합니다.\r\n" + 
				"파기절차 및 방법은 다음과 같습니다.\r\n" + 
				"1) 파기절차\r\n" + 
				"고객이 회사에 제공한 개인 정보는 수집 · 이용 목적이 달성된 후에는 별도의 DB로 옮겨져(종이의 경우 별도의 서류함) 내부 방침 및 기타 관련 법령에 의한 정보보호 사유에 따라(보유 및 이용기간 참조) 일정 기간 저장된 후 파기됩니다. 별도 DB로 옮겨진 개인정보는 법률에 의한 경우가 아니고서는 보유되는 목적 이외의 다른 목적으로 이용되지 않습니다.\r\n" + 
				"2) 파기방법\r\n" + 
				"전자적 파일형태로 저장된 개인정보는 기록을 재생할 수 없는 기술적 방법을 사용하여 삭제합니다.\r\n" + 
				"종이에 출력된 개인정보는 분쇄기로 분쇄하거나 소각을 통하여 파기합니다.\r\n" + 
				"\r\n" + 
				"7. 고객 및 법정대리인의 권리와 그 행사방법\r\n" + 
				"1) 고객 또는 법정대리인(만 14세 미만의 아동인 경우)은 회사에 대하여 언제든지 개인정보 수집 · 이용 · 제공 등의 동의를 철회(가입해지)할 수 있습니다.\r\n" + 
				"2) 회사에 대하여, 고객은 자신의 개인정보를, 법정대리인은 만 14세 미만의 아동의 개인정보를 각 열람 · 제공 및 오류를 정정하도록 요구할 수 있습니다.\r\n" + 
				"3) 고객은 위와 같은 권리를 온라인에서는 회사 홈페이지에 접속하여 본인 확인 절차를 거친 후 개인정보관리 메뉴에서 행사가능하며, 오프라인에서는 서면, 전화 또는  이메일을 통해 고객센터 또는 회사 개인정보관리책임자에게 연락하는 방법으로 행사할 수 있습니다.\r\n" + 
				"4) 고객이 개인정보 오류정정을 요구하신 경우, 회사는 오류정정을 완료하기 전까지 당해 개인정보를 이용 · 제공하지 않으며, 이미 제3자에게 당해 개인정보를 제공한 경우에는 제3자에게 지체없이 통지하여 오류 정정이 이루어지도록 하고 있습니다.\r\n" + 
				"5) 고객 또는 법정 대리인이 동의철회(가입해지)한 경우, 회사는 지체없이 파기하는 것을 원칙으로 하나 관계법령에서 의무적으로 보유하도록 한 경우에는 개인정보 처리방침 '4. 개인정보의 보유 및 이용기간'에 따라 처리하고, 반드시 필요한 경우에만 열람 또는 이용이 가능하도록 조치하고 있습니다.\r\n" + 
				"\r\n" + 
				"8. 개인정보의 안전성 확보 조치에 관한 사항\r\n" + 
				"※ 개인정보의 기술적/관리적 보호 대책\r\n" + 
				"회사는 고객의 개인정보를 처리함에 있어 개인정보의 분실, 도난, 누출, 변조 또는 훼손되지 않도록 안전성 확보를 위하여 아래와 같은 기술적/관리적 대책을 적용하고 있습니다.\r\n" + 
				"1) 기술적 조치\r\n" + 
				"① 고객정보의 암호화\r\n" + 
				"소중한 고객의 개인정보는 DB내에 암호화되어 저장되어 외부 침입에 의해 유출되더라도 고객의 개인정보를 활용할수 없도록 하고 있습니다.\r\n" + 
				"② 통신 구간 암호화\r\n" + 
				"고객이 홈페이지를 통한 회원가입 및 로그인시 고객정보를 입력하여 전달하는 구간에 대해 SSL을 통해 고객의 정보가 안전하게 전송되도록 조치하고 있습니다.\r\n" + 
				"③ 보안솔루션의 설치\r\n" + 
				"서비스 제공 및 고객의 정보를 안전하게 관리하기 위하여 개인정보처리시스템에 대해 백신프로그램의 설치, 주기적인 업데이트 및 정기점검을 수행하고 있으며, DB암호화 솔루션 및 화면캡처방지 솔루션을 적용하고 있습니다. 또한 해킹 등의 외부침입을 대비하여 침입차단/탐지시스템을 설치하고 통합보안관재센터를 통해 해킹 및 외부침입에 대비하여 계속적으로 모니터링을 수행하고 있습니다.\r\n" + 
				"2) 관리적 조치\r\n" + 
				"① 개인정보관리체계 수립\r\n" + 
				"개인정보를 안전하게 관리하기위하여 회사 내부적으로 개인정보 관리체계를 수립하여 운영하고 있습니다.\r\n" + 
				"② 개인정보보호 위원회 운영\r\n" + 
				"회사의 개인정보보호를 위한 위원회를 구성하여 연2회 이상 위원회 회의를 개최하고 개인정보관리체계의 운영 및 개인정보보호 이슈 등의 사항에 대하여 개선하고 바로잡기 위한 노력을 기울이고 있습니다.\r\n" + 
				"③ 개인정보 취급자 관리\r\n" + 
				"고객의 개인정보를 처리하는 개인정보처리자를 대상으로 개인정보보호 서약서를 제출받고, 연2회 이상의 개인정보보호 교육을 수행하여 고객정보의 중요성과 안전하게 관리하도록 하고 있습니다. 또한 개인정보처리자의 권한 관리를 통하여 불필요한 고객의 개인정보에 대한 접근과 노출을 최소화하고 있습니다.\r\n" + 
				"\r\n" + 
				"9. 개인정보의 자동 수집장치의 설치 · 운영 및 그거부에 관한 사항\r\n" + 
				"회사는 고객의 정보를 수시로 저장하고 찾아내는 '쿠키(cookie)' 등을 운용합니다. 쿠키란 회사의 웹사이트를 운영하는데 이용되는 서버가 고객의 브라우저에 보내는 아주 작은 텍스트 파일로서 고객의 컴퓨터 하드디스크에 저장됩니다. 회사는 다음과 같은 목적을 위해 쿠키를 사용합니다.\r\n" + 
				"1) 쿠키 등 사용 목적\r\n" + 
				"홈페이지 접속빈도 및 방문시간 분석, 고객의 관심분야 파악 및 분석, 각종 이벤트 참여 및 방문횟수 파악 등을 통한 타겟 마케팅 및 개인 맞춤 서비스 제공을 위해 쿠키 등을 사용합니다. 고객은 쿠키 설치에 대한 선택권을 가지고 있습니다. 따라서, 고객은 웹브라우저에서 옵션을 설정함으로써 모든 쿠키를 허용하거나, 쿠키가 저장될 때마다 확인을 거치거나, 아니면 모든 쿠키의 저장을 거부할 수도 있습니다.\r\n" + 
				"2) 쿠키 설정 거부 방법\r\n" + 
				"쿠키 설정을 거부하는 방법으로는 고객이 사용하는 웹 브라우저의 옵션을 선택함으로써 모든 쿠키를 허용하거나 쿠키를 저장할 때마다 확인을 거치거나, 모든 쿠키의 저장을 거부할 수 있습니다.\r\n" + 
				"다만, 쿠키의 저장을 거부할 경우에는 로그인이 필요한 일부 서비스는 이용에 어려움이 있을 수 있습니다.\r\n" + 
				"※ 설정방법 예(인터넷 익스플로어의 경우) : 웹 브라우저 상단의도구 > 인터넷옵션 > 개인정보 > 고급 > 설정방법 선택\r\n" + 
				"\r\n" + 
				"10. 개인정보 보호책임자 및 개인정보관련 불만처리에 관한 사항\r\n" + 
				"1) 회사는 고객의 개인정보를 보호하고, 개인정보와 관련한 불만을 처리하기 위하여 아래와 같이 담당 부서 및 개인정보 보호책임자를 지정하고 있습니다.\r\n" + 
				"- 개인정보 보호 책임자 이름: OOO\r\n" + 
				"- 소속: 국내영업전략실장\r\n" + 
				"-직위: 상무\r\n" + 
				"-전화: 080-000-0000\r\n" + 
				"\r\n" + 
				"-개인정보 보호 담당자  이름: OOO\r\n" + 
				"-소속: 고객지원실\r\n" + 
				"-직위: 대리\r\n" + 
				"-전화: 080-000-0000\r\n" + 
				"-이메일: kjs@hkemail.com\r\n" + 
				"\r\n" + 
				"2) 고객이 위 고객서비스 담당부서 또는 개인정보 보호책임자에게 회사의 개인정보 처리 사항에 관한 의견 또는 불만을 제기하실 경우, 회사는 신속하고 성실하게 조치하여 문제가 해결될 수 있도록 노력하겠습니다.\r\n" + 
				"3) 기타 개인정보침해에 대한 신고나 상담이 필요하신 경우에는 아래 기관에 문의하시기 바랍니다.\r\n" + 
				"개인정보 침해신고센터(한국인터넷진흥원 운영) : privacy.kisa.or.kr / (국번없이)118\r\n" + 
				"대검찰청 인터넷범죄수사센터 : www.spo.go.kr / 02-3480-3573\r\n" + 
				"경찰청 사이버테러대응센터 : www.netan.go.kr / 1566-0112\r\n" + 
				"\r\n" + 
				"11. 개인정보 처리방침의 변경에 관한 사항\r\n" + 
				"회사는 본 개인정보처리방침을 변경하는 경우에는 그 이유 및 변경 내용을 인터넷 홈페이지 첫 화면의 공지사항란 또는 별도의 창을 통하는 등의 방법으로 최소 7일 이전에 공지할 것입니다.\r\n" + 
				"본 방침은 2017년 11월 01일 부터 시행됩니다.");
		CollectionanduseofpersonalinformationTextArea.setEditable(false);
		JScrollPane jhf = new JScrollPane(CollectionanduseofpersonalinformationTextArea, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		JCheckBox agreecBox = new JCheckBox("개인정보 수집 및 이용에 동의합니다");
		
		north2Panel.add(CollectionanduseofpersonalinformationLabel);
		south2Panel.add(agreecBox);
		mains2Panel.add(north2Panel, "North");
		mains2Panel.add(jhf);
		mains2Panel.add(south2Panel, "South");
		JFPanel.add(mains2Panel);
		
		
		// 3. 동의, 취소 버튼
		bthsPanel = new JPanel(new GridLayout(1, 1));
		JButton dbtn = new JButton();
		JButton hbtn = new JButton();
		
		dbtn.setText("동의");
		hbtn.setText("취소");
		
		dbtn.setPreferredSize(new Dimension(50, 10));
		hbtn.setPreferredSize(new Dimension(50, 10));
		
		bthsPanel.add(dbtn);
		bthsPanel.add(hbtn);
		JFPanel.add(bthsPanel);
		
		//add
		add(scrollPane);
	}

	public static void main(String[] args) {
		new TermsofMembership();
	}


}
