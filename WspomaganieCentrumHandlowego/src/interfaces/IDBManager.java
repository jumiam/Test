package interfaces;

import java.util.List;

import classes.Hall;
import classes.User;
import classes.Worker;
import classes.Workplace;

public interface IDBManager {

	// METODY OGOLE

	/**
	 * 
	 * @param user
	 *            Tworzy nowego uzytkownika w bazie
	 */
	void createUser(User user);

	/**
	 * 
	 * @param worker
	 *            Tworzy nowego pracownika w bazie
	 */
	void createWoker(Worker worker);

	/**
	 * 
	 * @param Workplace
	 *            - Tworzy nowe stanowisko pracy;
	 */
	void createWorkplace(Workplace Workplace);

	/**
	 * 
	 * @param id
	 *            - Usuwa miejsce pracy trzeba tez odrazu zwolnic pracownikow do
	 *            nich przypisanych albo zalozyc ze miejsce mozna usunac tylko
	 *            wtedy kiedy nikt na nim nie pracyje.
	 */
	void deleteWorkplace(int id);

	/**
	 * 
	 * @return Liste wszystkich hal
	 */
	List<Hall> getAllHalls();

	/**
	 * 
	 * @param id
	 * @return - Liste pracownikow pracujacych dla danego uzytkownika (po id)
	 */
	List<Worker> getAllMyWorkers(int id);

	// REGISTER:

	/**
	 * 
	 * @return - Liste wszystkich dostepnych hall.
	 */
	List<Hall> getAllRentableHall();

	/**
	 * 
	 * @param id
	 * @return - Liste wszystkich hal dla danego id.
	 */
	List<Hall> getAllRentedHalls(int id);

	// HALL MANAGER :

	/**
	 * 
	 * @param id
	 * @return Zwraca halle po id
	 */
	Hall getHall(int id);

	// WORKER VIEW:

	/**
	 * 
	 * @return - Liste dostepnych miejsc pracy;
	 */
	List<Workplace> getJobsOffer();

	// JOB OFFER MANAGER:

	/**
	 * 
	 * @param id
	 * @return Pracownika pod id
	 */
	Worker getWorker(int id);

	/**
	 * 
	 * @param id
	 * @return Zwraca miejsce pracy po id
	 */
	Workplace getWorkpace(int id);

	/**
	 * 
	 * @param idEmployer
	 * @return - Liste miejsc pracy stworzonych przez pracodawce;
	 */
	List<Workplace> getWorkplaces(int idEmployer);

	// RENT HALL MANAGER:

	/**
	 * 
	 * @param hall
	 *            Aktualizuje halle
	 */
	void updateHall(Hall hall);

	/**
	 * 
	 * @param woker
	 *            Aktualizuje pracownika w bazie
	 */
	void updateWorker(Worker woker);

	// JOB OFFER:

	/**
	 * 
	 * @param workplace
	 *            Aktualizuje miejsce pracy w bazie
	 */
	void updateWorkplace(Workplace workplace);

}
