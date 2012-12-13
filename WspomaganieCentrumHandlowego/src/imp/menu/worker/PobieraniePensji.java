package imp.menu.worker;

import interfaces.IDBManager;
import interfaces.IUserFunction;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JTextArea;

public class PobieraniePensji implements IUserFunction {
	
	private JTextArea textArea;
	private IDBManager db;
	
	@Override
	public Container getContainer(int userID) {
		setTextArea();
		return textArea;
	}

	@Override
	public void update(int userID) {
		// TODO Auto-generated method stub
	}

	@Override
	public void close() {}
	
	private void setTextArea(){
		textArea = new JTextArea("wystwietlam pensje");
		textArea.setBackground(new Color(63, 63, 63));
		textArea.setForeground(Color.WHITE);
	}

}
