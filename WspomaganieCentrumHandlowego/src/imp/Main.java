package imp;

import imp.menu.worker.WorkerManager;
import interfaces.IUserManager;

import java.awt.EventQueue;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					IUserManager window = new WorkerManager();
					window.createWin(123);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
