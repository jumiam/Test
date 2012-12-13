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

public class AdminManager implements IUserManager {

	private JFrame frame;
	private int userID;
	private List<IUserFunction> userFunctionlist;

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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setButtons() {
		// List<JButton> list = new ArrayList<JButton>();
		JButton button1 = new JButton("Przegl¹daj hale");
		JButton button2 = new JButton("Przegl¹daj managerów");
		JButton button3 = new JButton("SprawdŸ finanse");
		JButton button4 = new JButton("Wyloguj siê");

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				HallManager hallWindow = new HallManager();
				hallWindow.createWin(userID);
			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				userFunctionlist.get(0).getContainer(userID).setVisible(true);
			}
		});
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		JPanel buttony = new JPanel();
		buttony.setLayout(new GridLayout(6, 2));
		buttony.add(button1);
		buttony.add(button2);
		buttony.add(button3);
		buttony.add(button4);

		frame.add(buttony, BorderLayout.WEST);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		Font font1 = new Font("Verdana", Font.PLAIN, 20);
		editorPane.setFont(font1);
		editorPane
				.setText("Jesteœ zalogowany jako administrator\n\nStan konta: 1000 z³\n\nBilans: +30 z³\n\nZajêtych hal: 3\n\nWolnych hal: 7");

		frame.add(editorPane, BorderLayout.CENTER);

	}

	private void setUserFunctionList() {
		userFunctionlist = new ArrayList<IUserFunction>();

		userFunctionlist.add(new Function1());
		userFunctionlist.add(new Function2());

	}

}
