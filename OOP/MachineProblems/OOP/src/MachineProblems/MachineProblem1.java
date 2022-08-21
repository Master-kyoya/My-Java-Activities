package MachineProblems;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;


public class MachineProblem1 {
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		JFrame frame = new JFrame("Machine Problem 1");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel heading = new JLabel("<html>WANBOL UNIVERSITY"
				+ "<br/>***Grading Systems***");
		heading.setBounds(220,10,300,100);
		
		panel.add(heading);
		heading.setFont(new Font("Arial",Font.BOLD,20));
		heading.setForeground(Color.BLACK);
		
		//FRAME SETTINGS
		panel.setBackground(new Color(84, 192, 255));
		frame.add(panel);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(670, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//QUIZZES
	
		JLabel quiz1 = new JLabel("Quiz 1: ");
		panel.add(quiz1);
		quiz1.setBounds(80,100,300,100);
		quiz1.setFont(new Font("Arial",Font.PLAIN,15));
		quiz1.setForeground(Color.BLACK);

		JTextField q1 = new JTextField();
		q1.setBounds(160,140,120,20);
		panel.add(q1);
		q1.setFont(new Font("Arial",Font.PLAIN,15));
		
		JLabel quiz2 = new JLabel("Quiz 2: ");
		panel.add(quiz2);
		quiz2.setBounds(80,130,300,100);
		quiz2.setFont(new Font("Arial",Font.PLAIN,15));
		quiz2.setForeground(Color.BLACK);

		JTextField q2 = new JTextField();
		q2.setBounds(160,170,120,20);
		panel.add(q2);
		q2.setFont(new Font("Arial",Font.PLAIN,15));
		
		
		JLabel quiz3 = new JLabel("Quiz 3: ");
		panel.add(quiz3);
		quiz3.setBounds(80,160,300,100);
		quiz3.setFont(new Font("Arial",Font.PLAIN,15));
		quiz3.setForeground(Color.BLACK);
		
		JTextField q3 = new JTextField();
		q3.setBounds(160,200,120,20);
		panel.add(q3);
		q3.setFont(new Font("Arial",Font.PLAIN,15));
		
		
		//SEMESTER
		
		JLabel prelim = new JLabel("Prelim Exam: ");
		panel.add(prelim);
		prelim.setBounds(350,100,300,100);
		prelim.setFont(new Font("Arial",Font.PLAIN,15));
		prelim.setForeground(Color.BLACK);
		
		JTextField pr = new JTextField();
		pr.setBounds(460,140,120,20);
		panel.add(pr);
		pr.setFont(new Font("Arial",Font.PLAIN,15));
		
		
		JLabel midterm = new JLabel("Midterm Exam: ");
		panel.add(midterm);
		midterm.setBounds(350,130,300,100);
		midterm.setFont(new Font("Arial",Font.PLAIN,15));
		midterm.setForeground(Color.BLACK);
		
		JTextField mt = new JTextField();
		mt.setBounds(460,170,120,20);
		panel.add(mt);
		mt.setFont(new Font("Arial",Font.PLAIN,15));
		
		
		JLabel finals = new JLabel("Final Exam: ");
		panel.add(finals);
		finals.setBounds(350,160,300,100);
		finals.setFont(new Font("Arial",Font.PLAIN,15));
		finals.setForeground(Color.BLACK);
		
		JTextField fl = new JTextField();
		fl.setBounds(460,200,120,20);
		panel.add(fl);
		fl.setFont(new Font("Arial",Font.PLAIN,15));
		
		
		//AVERAGE GRADES
		
		JLabel AQ = new JLabel("Average Quiz: ");
		panel.add(AQ);
		AQ.setBounds(80,200,300,100);
		AQ.setFont(new Font("Arial",Font.BOLD,15));
		AQ.setForeground(Color.BLACK);
		
		JTextField taq = new JTextField();
		taq.setBounds(190,240,90,20);
		panel.add(taq);
		taq.setFont(new Font("Arial",Font.BOLD,15));
		
		
		
		JLabel FG = new JLabel("Final Grade: ");
		panel.add(FG);
		FG.setBounds(80,230,300,100);
		FG.setFont(new Font("Arial",Font.BOLD,15));
		FG.setForeground(Color.BLACK);
		
		JTextField fg = new JTextField();
		fg.setBounds(190,270,90,20);
		panel.add(fg);
		fg.setFont(new Font("Arial",Font.BOLD,15));
		
		
		
		//Transmuted Grade
		
		JLabel TG = new JLabel("Transmuted Grade: ");
		panel.add(TG);
		TG.setBounds(350,230,300,100);
		TG.setFont(new Font("Arial",Font.BOLD,15));
		TG.setForeground(Color.BLACK);
		
		JTextField tg = new JTextField();
		tg.setBounds(490,270,90,20);
		panel.add(tg);
		tg.setFont(new Font("Arial",Font.BOLD,15));
		
		
		//Remarks
		JLabel Remarks = new JLabel("Remarks: ");
		panel.add(Remarks);
		Remarks.setBounds(150,270,300,100);
		Remarks.setFont(new Font("Arial",Font.BOLD,15));
		Remarks.setForeground(Color.BLACK);
		
		JTextField RM = new JTextField();
		RM.setBounds(220,310,260,20);
		panel.add(RM);
		RM.setFont(new Font("Arial",Font.BOLD,15));
		
		
		
		//BUTTONS
		
		JButton compute = new JButton("Compute");
		compute.setBounds(150,360,100,30);
		panel.add(compute);
		compute.setBackground(new Color(17, 189, 40));
		compute.setForeground(Color.BLACK);
		
		JButton clear = new JButton("Clear");
		clear.setBounds(280,360,100,30);
		panel.add(clear);
		clear.setBackground(Color.WHITE);
		clear.setForeground(Color.BLACK);
		
		JButton Exit = new JButton("Exit");
		Exit.setBounds(410,360,100,30);
		panel.add(Exit);
		Exit.setBackground(new Color(189, 21, 21));
		Exit.setForeground(Color.WHITE);
		
		compute.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent compute) {
				String sQ1 = q1.getText();
				double Quiz1 = Double.parseDouble(sQ1);
				
				String sQ2 = q2.getText();
				double Quiz2 = Double.parseDouble(sQ2);
				
				String sQ3 = q3.getText();
				double Quiz3 = Double.parseDouble(sQ3);
				
				double average = (Quiz1 + Quiz2 + Quiz3) / 3;
				
				String ave = String.valueOf(df.format(average));
				
				taq.setText(ave);
				
				String prel = pr.getText();
				double Prelims = Double.parseDouble(prel);
				
				String mid = mt.getText();
				double Midterms = Double.parseDouble(mid);
				
				String fin = fl.getText();
				double Finals = Double.parseDouble(fin);
				
				double computeSem = (0.1 * Prelims) + (0.2 * Midterms) + (0.4 * Finals) + (0.3 * average);
				
				String finalGrade = String.valueOf(df.format(computeSem));
				
				fg.setText(finalGrade);
				
				String RemarksResult = "";
				double Transmutedvalue = 0.0;
				
				double TransGrade = Double.parseDouble(fg.getText());
				
				if(TransGrade <= 74.99) {
					Transmutedvalue = 5.0;
					RemarksResult = "Failed";
				}else if(TransGrade >= 75 && TransGrade <= 75.99) {
					RemarksResult = "Passing Mercy";
					Transmutedvalue = 3.0;
				}else if(TransGrade >= 76 && TransGrade <= 78.99) {
					RemarksResult = "Satisfactory";
					Transmutedvalue = 2.75;
				}else if(TransGrade >= 79 && TransGrade <= 81.99) {
					RemarksResult = "Very Satisfactory";
					Transmutedvalue = 2.50;
				}else if(TransGrade >= 82 && TransGrade <= 84.99) {
					RemarksResult = "Very Satisfactory";
					Transmutedvalue = 2.25;
				}else if(TransGrade >= 85 && TransGrade <= 87.99) {
					RemarksResult = "Very Satisfactory";
					Transmutedvalue = 2.0;
				}else if(TransGrade >= 88 && TransGrade <= 90.99) {
					RemarksResult = "Very Good";
					Transmutedvalue = 1.75;
				}else if (TransGrade >= 91 && TransGrade <= 93.99) {
					RemarksResult = "Very Good";
					Transmutedvalue = 1.50;
				}else if(TransGrade >= 94 && TransGrade <= 96.99) {
					RemarksResult = "Excellent";
					Transmutedvalue = 1.25;
				}
				
				else {
					if (TransGrade >= 97 && TransGrade <= 100) {
						RemarksResult = "Excellent";
						Transmutedvalue = 1.0;
					}
				}
				
				String trans = String.valueOf(df.format(Transmutedvalue));
				tg.setText(trans);
				RM.setText(RemarksResult);
			}
			
		});
		
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent clear) {
				//Quizzes
				q1.setText(null);
				q2.setText(null);
				q3.setText(null);
				taq.setText(null);
				
				//Final Grade
				pr.setText(null);
				mt.setText(null);
				fl.setText(null);
				fg.setText(null);
				
				//Transmuted Grade & Remarks
				tg.setText(null);
				RM.setText(null);
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
