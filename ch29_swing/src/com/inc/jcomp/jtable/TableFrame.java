package com.inc.jcomp.jtable;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class TableFrame extends JFrame{
	
	private JTable table;
	
	private TableFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,300,500,500);
		//setLayout(new FlowLayout());
		//initMenu();
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		String[] columns = {"성명","국어","수학","영어"};
		Object[][] data = {
				columns,
				{"철수", 100, 90, 80},
				{"민수", 50, 60, 30},
				{"영희", 70, 80, 90}
		};
		table = new JTable(data, columns);
		//수정 가능 여부
		table.setEnabled(false);
		//데이터 수정
		table.setValueAt(50, 2, 2);
		System.out.println(table.getValueAt(3, 3));
		System.out.println(table.getColumnCount());
		System.out.println(table.getRowCount());
		System.out.println(table.getColumnName(0));
		
		add(table);
	}

	public static void main(String[] args) {
		new TableFrame();

	}
}
