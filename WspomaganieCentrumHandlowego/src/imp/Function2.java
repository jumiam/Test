package imp;

import interfaces.IUserFunction;

import java.awt.Container;

import javax.swing.JTextArea;

public class Function2 implements IUserFunction {

	
	
	public Function2() {
		super();
		setTextArea();
	}

	private JTextArea textArea;
	@Override
	public Container getContainer(int userID) {
		return textArea;

	}

	@Override
	public void update(int userID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		System.out.println("Funkcja 2 zostala usunieta");

	}
	
	private void setTextArea(){
		textArea = new JTextArea("asdfasdfafjasdjf jkasdjfka j;fej as;d kfja;e  \njfasd lkjas;df aowej fasd j;asdf\n aiojwes flkasdjf ;ialjf a;leji fasd;l fj");
	}

}
