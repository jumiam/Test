package imp.menu.admin;

import imp.Function1;
import imp.Function2;
import interfaces.IUserFunction;
import interfaces.IUserManager;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HallManager implements IUserManager {

	private JFrame frame;
	private int userID;
	private List<IUserFunction> userFunctionlist;
	JEditorPane editorPane = new JEditorPane();

	@Override
	public void createWin(int userID) {
		Point windowSize = new Point(600, 400);
		this.userID = userID;
		initialize(windowSize.x, windowSize.y);

		setUserFunctionList();
		setButtons();
		frame.setVisible(true);
	}

	@Override
	public void createWin(int winWidth, int winHight, int userID) {
		this.userID = userID;
		initialize(winWidth, winHight);
		setUserFunctionList();
		setButtons();

		frame.setVisible(true);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int winWidth, int winHight) {
		frame = new JFrame();
		frame.setBounds(0, 0, winWidth, winHight);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setButtons() {
		// List<JButton> list = new ArrayList<JButton>();
		JButton button1 = new JButton("Hala 1");
		JButton button2 = new JButton("Hala 2");
		JButton button3 = new JButton("Hala 3");
		JButton button4 = new JButton("Hala 4");
		JButton button5 = new JButton("Hala 5");
		JButton button6 = new JButton("Hala 6");
		JButton button7 = new JButton("Hala 7");
		JButton button8 = new JButton("Hala 8");
		JButton button9 = new JButton("Hala 9");
		JButton button10 = new JButton("Hala 10");

		JButton button11 = new JButton("Zmieñ status");
		JButton button12 = new JButton("Zmieñ cenê");

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				editorPane.setText("info o hali 1");
			}
		});

		JPanel buttony = new JPanel();
		buttony.setLayout(new GridLayout(5, 10));
		buttony.add(button1);
		buttony.add(button2);
		buttony.add(button3);
		buttony.add(button4);
		buttony.add(button5);
		buttony.add(button6);
		buttony.add(button7);
		buttony.add(button8);
		buttony.add(button9);
		buttony.add(button10);

		JPanel buttonydol = new JPanel();
		buttonydol.setLayout(new GridLayout(1, 2));
		buttonydol.add(button11);
		buttonydol.add(button12);

		frame.add(buttony, BorderLayout.NORTH);

		editorPane.setEditable(false);
		Font font1 = new Font("Verdana", Font.PLAIN, 20);
		editorPane.setFont(font1);
		editorPane.setText("wybierz numer hali aby zobaczyc informacje");

		frame.add(editorPane, BorderLayout.CENTER);
		frame.add(buttonydol, BorderLayout.SOUTH);
	}

	private void setUserFunctionList() {
		userFunctionlist = new ArrayList<IUserFunction>();

		userFunctionlist.add(new Function1());
		userFunctionlist.add(new Function2());

	}

}
