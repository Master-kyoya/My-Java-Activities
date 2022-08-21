package MachineProblems;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;

public class MachineProblem3 {

	MachineProblem3() {
		// Michael Jan R. Tangalin
		// 2BSIT-1

		JFrame frame = new JFrame("Machine Problem 3");

		JMenuBar JMB = new JMenuBar();

		JMenu menu = new JMenu("File");
		JMenuItem item1 = new JMenuItem("Home");
		JMenuItem item2 = new JMenuItem("Insert");
		JMenuItem item3 = new JMenuItem("Update");
		JMenuItem item4 = new JMenuItem("Delete");
		frame.setJMenuBar(JMB);
		JMB.add(menu);

		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel heading = new JLabel("Insert Student Records");
		heading.setBounds(150, 10, 300, 100);

		panel.add(heading);
		heading.setFont(new Font("Segoe Script", Font.BOLD, 25));
		heading.setForeground(Color.BLACK);

		// FRAME SETTINGS
		panel.setBackground(new Color(255, 205, 54));
		frame.add(panel);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(600, 450);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Cursor TXTcursor = new Cursor(Cursor.TEXT_CURSOR);

		// STUDENT FIELDS

		JLabel studentNo = new JLabel("Student No: ");
		panel.add(studentNo);
		studentNo.setBounds(89, 95, 300, 100);
		studentNo.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		studentNo.setForeground(Color.BLACK);

		JTextField studentNoTxt = new JTextField();
		studentNoTxt.setBounds(230, 130, 250, 30);
		panel.add(studentNoTxt);
		studentNoTxt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		studentNoTxt.requestFocusInWindow();
		studentNoTxt.setCursor(TXTcursor);

		JLabel studentName = new JLabel("Name: ");
		panel.add(studentName);
		studentName.setBounds(145, 140, 300, 100);
		studentName.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		studentName.setForeground(Color.BLACK);

		JTextField studentNameTxt = new JTextField();
		studentNameTxt.setBounds(230, 175, 250, 30);
		panel.add(studentNameTxt);
		studentNameTxt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		studentNameTxt.requestFocusInWindow();
		studentNameTxt.setCursor(TXTcursor);

		JLabel address = new JLabel("Address: ");
		panel.add(address);
		address.setBounds(124, 185, 300, 100);
		address.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		address.setForeground(Color.BLACK);

		JTextField addressTxt = new JTextField();
		addressTxt.setBounds(230, 220, 250, 30);
		panel.add(addressTxt);
		addressTxt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		addressTxt.requestFocusInWindow();
		addressTxt.setCursor(TXTcursor);

		// BUTTONS

		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

		JButton Insert = new JButton("Insert");
		Insert.setBounds(120, 320, 100, 30);
		panel.add(Insert);
		Insert.setBackground(new Color(17, 189, 40));
		Insert.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		Insert.setForeground(Color.BLACK);
		Insert.setCursor(cursor);
		Insert.setVisible(true);

		JButton clear = new JButton("Clear");
		clear.setBounds(250, 320, 100, 30);
		panel.add(clear);
		clear.setBackground(Color.WHITE);
		clear.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		clear.setForeground(Color.BLACK);
		clear.setCursor(cursor);
		clear.setVisible(true);

		JButton Exit = new JButton("Exit");
		Exit.setBounds(380, 320, 100, 30);
		panel.add(Exit);
		Exit.setBackground(new Color(189, 21, 21));
		Exit.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		Exit.setForeground(Color.WHITE);
		Exit.setCursor(cursor);
		Exit.setVisible(true);

		Insert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent insert) {
				String studentNum = studentNoTxt.getText();
				String SName = studentNameTxt.getText();
				String Saddress = addressTxt.getText();

				// CONNECTION
				try {
					// Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neu_db", "root", "");
					String sql = "INSERT INTO students (student_ID, student_Name, address) VALUES(?, ?, ?)";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setInt(1, Integer.parseInt(studentNum));
					stmt.setString(2, SName);
					stmt.setString(3, Saddress);
					stmt.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Successfully Inserted!");
					con.close();
					studentNoTxt.setText(null);
					studentNameTxt.setText(null);
					addressTxt.setText(null);

				} catch (Exception error) {
					JOptionPane.showMessageDialog(null, error.getMessage());
				}

			}

		});

		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent clear) {
				studentNoTxt.setText(null);
				studentNameTxt.setText(null);
				addressTxt.setText(null);
			}

		});

		Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent exit) {
				System.exit(0);

			}

		});

		item1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menu) {
				new MachineProblemsCOMP();
				frame.setVisible(false);
			}

		});

		item3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menu) {
				new MachineProblem5();
				frame.setVisible(false);
			}

		});

		item4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menu) {
				try {
					new MachineProblem4();
					frame.setVisible(false);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

	}

}
