package interfaces;

import java.awt.Container;

public interface IUserFunction {

	/**
	 * Metoda ktora powinna zostac wywala przez zamknieciem komponentu funkcji
	 * uzytkownika (jesli jest taka potrzeba)
	 */
	public void close();

	/**
	 * 
	 * @param userID
	 * @return - kontener w ktorym bede przechowywane cale komponenty funkcji
	 *         dla uzytkownika
	 */
	public Container getContainer(int userID);

	/**
	 * 
	 * @param userID
	 *            Odswierza, uaktualnie dana komponent funkcji uzytkownika jesli
	 */
	public void update(int userID);

}
