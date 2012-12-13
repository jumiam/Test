package interfaces;

public interface IUserManager {

	/**
	 * 
	 * @param userID
	 *            Tworzy i wyswietla okno komponentu menadzera uzytkownika
	 */
	public void createWin(int userID);

	/**
	 * 
	 * @param winWidth
	 * @param winHight
	 * @param userID
	 *            Tworzy i wyswietla okno komponentu menadzera uzytkownika o
	 *            okreslonej wielkosci
	 */
	public void createWin(int winWidth, int winHight, int userID);

}
