package imp.menu.worker;

import interfaces.IUserFunction;
import interfaces.IUserManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WorkerManager implements IUserManager {

	private JFrame frame;
	private int userID;
	private List<IUserFunction> userFunctionlist;
	private Container container;

	@Override
	public void createWin(int userID) {
		this.userID = userID;
		initialize();
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
		frame.setBackground(Color.DARK_GRAY);
	}
	
	
	private final int DEFAULT_WIN_WIDTH = 700;
	private final int DEFAULT_WIN_HIGHT = 400;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, DEFAULT_WIN_WIDTH, DEFAULT_WIN_HIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.DARK_GRAY);
	}
	
	private void setUserFunctionList() {
		userFunctionlist = new ArrayList<IUserFunction>();
		userFunctionlist.add(new Umowa());
		userFunctionlist.add(new BilansKosztow());
		userFunctionlist.add(new PobieraniePensji());

	}

	private void cleanCenter() {
		if (container != null) {
			frame.remove(container);
		}
	}

	private void setButtons() {

		Box info = Box.createHorizontalBox();
		info.setPreferredSize(new Dimension(700, 50));
		info.add(new JLabel("Zalogowano jako: Imie Nazwisko, ID: id"));
		info.add(Box.createHorizontalGlue());
		JButton wyloguj = new JButton("Wyloguj");
		wyloguj.setBackground(new Color(200, 63, 63));
		info.add(wyloguj);
		frame.add(info, BorderLayout.NORTH);
		
		
		//LISTA BUTTONOW PO LEWO - MENU
		JPanel listButton = new JPanel();
		listButton.setLayout(new BoxLayout(listButton, BoxLayout.PAGE_AXIS));
		listButton.setBackground(new Color(81, 81, 81));
		listButton.setBorder(BorderFactory.createEmptyBorder(70, 10, 10, 10));

			// TODO klasa ktora dziedziczy z JButton i jako domyslne  przyjmuje te kolory itp
		JButton button1 = new JButton("Wyœwietl umowê");
		button1.setBackground(new Color(105, 105, 105));
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cleanCenter();
				container = userFunctionlist.get(0).getContainer(userID);
				frame.add(container, BorderLayout.CENTER);
				frame.revalidate();
				frame.repaint();

			}
		});

		JButton button2 = new JButton("Wyœwietl pensjê");
		button2.setBackground(new Color(105, 105, 105));
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cleanCenter();
				container = userFunctionlist.get(2).getContainer(userID);
				frame.add(container, BorderLayout.CENTER);
				frame.revalidate();
				frame.repaint();
				
			}
		});

		JButton button3 = new JButton("Bilans kosztów");
		button3.setBackground(new Color(105, 105, 105));
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cleanCenter();
				container = userFunctionlist.get(1).getContainer(userID);
				frame.add(container, BorderLayout.CENTER);
				frame.revalidate();
				frame.repaint();
				
			}
		});

		listButton.add(button1);
		listButton.add(button2);
		listButton.add(button3);
		listButton.add(Box.createRigidArea(new Dimension(0, 5)));

		frame.add(listButton, BorderLayout.LINE_START);

	}

}
