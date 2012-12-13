package imp;

import interfaces.IUserFunction;

import java.awt.Container;

import javax.swing.JFrame;

public class Function1 implements IUserFunction {
	
	private JFrame frame;

	@Override
	public Container getContainer(int userID) {
		setFrame();
		return frame;
	}

	@Override
	public void update(int userID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}
	
	private void setFrame(){
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 200, 200);
	}

}
