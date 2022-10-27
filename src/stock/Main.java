package stock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTextField textField_1;
	private JTable table_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_3;
	private JTable table_4;
	

	/** 프로그램 실행 **/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/** 프로그램 만들기 **/
	public Main() {
		initialize();
	}

	/** 프레임 초기화 **/
	 private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel type_panel = new JPanel();
		 type_panel.setBounds(0, 36, 834, 455);
		 frame.getContentPane().add(type_panel);
		 type_panel.setLayout(null);
		
		 textField = new JTextField();
		 textField.setHorizontalAlignment(SwingConstants.CENTER);
		 textField.setText("삼성전자");
		 textField.setBounds(12, 10, 116, 21);
		 type_panel.add(textField);
		 textField.setColumns(10);
		
		 JButton btnNewButton_4 = new JButton("검색");
		
		 btnNewButton_4.setBounds(140, 9, 66, 23);
		 type_panel.add(btnNewButton_4);
		 
		 
		
		 table = new JTable();
		 table.setModel(new DefaultTableModel(
			new Object[][] {
				{"회사명", "코드번호", "주가(원)", "시가총액(억)"},
				{null, null, null, null},
				{"PER", "PBR", "ROE", "PCR"},
				{null, null, null, null},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		 ));
		 table.setBounds(12, 49, 236, 64);
		 type_panel.add(table);
		
		 table_1 = new JTable();
		 table_1.setColumnSelectionAllowed(true);
		 table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"연간손익요약", "15년", "16년", "17년", "18년", "19년", "20년", "21년", "22년(E)", "23년(E)"},
				{"매출액", null, null, null, null, null, null, null, null, null},
				{"지배주주순이익", null, null, null, null, null, null, null, null, null},
				{"매출총이익율(%)", null, null, null, null, null, null, null, null, null},
				{"판관비율(%)", null, null, null, null, null, null, null, null, null},
				{"영업이익율(%)", null, null, null, null, null, null, null, null, null},
				{"매출액", null, null, null, null, null, null, null, null, null},
				{"영업이익", null, null, null, null, null, null, null, null, null},
				{"순이익", null, null, null, null, null, null, null, null, null},
				{"영업이익율(%)", null, null, null, null, null, null, null, null, null},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		 ));
		 table_1.setBounds(12, 123, 810, 160);
		 type_panel.add(table_1);
		
		JPanel chart_panel = new JPanel();
		 chart_panel.setBounds(0, 36, 834, 455);
		 frame.getContentPane().add(chart_panel);
		 chart_panel.setLayout(null);
		
		 textField_2 = new JTextField();
		 textField_2.setText("");
		 textField_2.setBounds(12, 10, 116, 21);
		 chart_panel.add(textField_2);
		 textField_2.setColumns(10);
		
		 JButton btnNewButton_6 = new JButton("검색");
		 btnNewButton_6.setBounds(142, 9, 97, 23);
		 chart_panel.add(btnNewButton_6);
		
		JPanel mychart_panel = new JPanel();
		 mychart_panel.setBounds(0, 36, 834, 455);
		 frame.getContentPane().add(mychart_panel);
		 mychart_panel.setLayout(null);
		
		 textField_3 = new JTextField();
		 textField_3.setBounds(12, 10, 116, 21);
		 mychart_panel.add(textField_3);
		 textField_3.setColumns(10);
		
		 JButton btnNewButton_7 = new JButton("추가");
		 btnNewButton_7.setBounds(140, 9, 97, 23);
		 mychart_panel.add(btnNewButton_7);
		
		 table_3 = new JTable();
		 table_3.setModel(new DefaultTableModel(
			 new Object[][] {
				{"총자산", null, "평가손익", null},
				{"주식매입", null, "수익율", null},
				{"주식평가", null, "보유종목수", null},
				{"현금(입력값)", null, "현금비중", null},
			
		 	 },
			 new String[] {
				"New column", "New column", "New column", "New column"
			}
		 ));
		 table_3.setBounds(12, 61, 323, 64);
	   	 mychart_panel.add(table_3);
		
		 table_4 = new JTable();
		 table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC0AD\uC81C", "\uC885\uBAA9\uBA85", "\uC2DC\uAC00\uCD1D\uC561(\uC5B5)", "\uC8FC\uAC00", "\uB4F1\uB77D\uB960", "\uB9E4\uC218\uAC00(\uC785\uB825)", "\uC218\uB7C9(\uC785\uB825)", "\uB9E4\uC218\uAE08\uC561", "\uD3C9\uAC00\uAE08\uC561", "PER", "PBR", "PCR"},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		 ));
		 table_4.setBounds(12, 168, 810, 160);
		 mychart_panel.add(table_4);
		
		JPanel price_panel = new JPanel();
		 price_panel.setBounds(0, 36, 834, 455);
		 frame.getContentPane().add(price_panel);
		 price_panel.setLayout(null);
		
		 textField_1 = new JTextField();
		 textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		 textField_1.setText("삼성전자");
		 textField_1.setBounds(12, 10, 116, 21);
		 price_panel.add(textField_1);
		 textField_1.setColumns(10);
		
	 	 JButton btnNewButton_5 = new JButton("검색");
		 btnNewButton_5.setBounds(140, 9, 97, 23);
		 price_panel.add(btnNewButton_5);
		
		 table_2 = new JTable();
		 table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"초과이익가정", "적정주주가치", "적정주가", "현재주가"},
				{"지속", null, null, null},
				{"10%씩 감소", null, null, null},
				{"20%씩 감소", null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		 ));
		 table_2.setBounds(12, 53, 491, 64);
		 price_panel.add(table_2);
		
		JPanel menu_panel = new JPanel();
		 menu_panel.setBounds(0, 0, 834, 36);
		 frame.getContentPane().add(menu_panel);
		
		 JButton btnNewButton = new JButton("종목현황");
		 btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				type_panel.setVisible(true);
				chart_panel.setVisible(false);
				mychart_panel.setVisible(false);
				price_panel.setVisible(false);
			}
		 });
		 menu_panel.add(btnNewButton);
		 
		 JButton btnNewButton_1 = new JButton("재무차트");
		 btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chart_panel.setVisible(true);
				mychart_panel.setVisible(false);
				price_panel.setVisible(false);
				type_panel.setVisible(false);
			}
		 });
		
		 menu_panel.add(btnNewButton_1);
		 
		 JButton btnNewButton_2 = new JButton("나만의종목");
		 btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mychart_panel.setVisible(true);
				type_panel.setVisible(false);
				price_panel.setVisible(false);
				chart_panel.setVisible(false);
			}
		 });
		menu_panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("적정주가산출");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				price_panel.setVisible(true);
				type_panel.setVisible(false);
				chart_panel.setVisible(false);
				mychart_panel.setVisible(false);
			}
		});
		menu_panel.add(btnNewButton_3);
	}
}
