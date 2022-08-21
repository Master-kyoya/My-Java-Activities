package MachineProblems;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MachineProblemsCOMP {

	MachineProblemsCOMP() {
		JFrame frame = new JFrame("MACHINE PROBLEM COMPILATIONS");

		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel heading = new JLabel("CRUD OPERATIONS");
		heading.setBounds(160, 2, 300, 100);

		panel.add(heading);
		heading.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		heading.setForeground(Color.BLACK);
		
		JLabel studentName = new JLabel("By: Michael Jan R. Tangalin");
		panel.add(studentName);
		studentName.setBounds(200, 22, 300, 100);
		studentName.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		studentName.setForeground(Color.BLACK);
		

		// FRAME SETTINGS
		panel.setBackground(new Color(190, 207, 235));
		frame.add(panel);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(600, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// BUTTONS

		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

		JButton Insert = new JButton("Insert");
		Insert.setBounds(230, 100, 100, 30);
		panel.add(Insert);
		Insert.setBackground(new Color(17, 189, 40));
		Insert.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		Insert.setForeground(Color.BLACK);
		Insert.setCursor(cursor);
		Insert.setVisible(true);

		JButton Update = new JButton("Update");
		Update.setBounds(230, 140, 100, 30);
		panel.add(Update);
		Update.setBackground(Color.WHITE);
		Update.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		Update.setForeground(Color.BLACK);
		Update.setCursor(cursor);
		Update.setVisible(true);

		JButton Delete = new JButton("Delete");
		Delete.setBounds(230, 180, 100, 30);
		panel.add(Delete);
		Delete.setBackground(new Color(189, 21, 21));
		Delete.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		Delete.setForeground(Color.WHITE);
		Delete.setCursor(cursor);
		Delete.setVisible(true);

		JButton Exit = new JButton("Exit");
		Exit.setBounds(230, 220, 100, 30);
		panel.add(Exit);
		Exit.setBackground(new Color(250, 121, 22));
		Exit.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		Exit.setForeground(Color.WHITE);
		Exit.setCursor(cursor);
		Exit.setVisible(true);

		Insert.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menu) {
				new MachineProblem3();
				frame.setVisible(false);
			}

		});

		Update.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent menu) {
				new MachineProblem5();
				frame.setVisible(false);
			}

		});

		Delete.addActionListener(new ActionListener() {

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

		Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent exit) {
				System.exit(0);

			}

		});

	}

}
