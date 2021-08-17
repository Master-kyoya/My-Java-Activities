package gui;

import javax.swing.*;

public class JOptionPaneDemo {
	JOptionPane optionPane;

	void launchFrame() {
		optionPane = new JOptionPane();
		String name = optionPane.showInputDialog("Hi, what's your name?");
		optionPane.showMessageDialog(null, "Nice to meet you, " + name + ".", "Greeting...", optionPane.PLAIN_MESSAGE);
		System.exit(0);
	}

	public static void main(String[] args) {
		new JOptionPaneDemo().launchFrame();
	}

}
