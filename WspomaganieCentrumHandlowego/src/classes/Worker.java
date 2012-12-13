package classes;

public class Worker extends User {

	private int workerID;
	private int bossID;
	private int workplaceID;
	private String hiredTo;

	public Worker(int id, Status status, String name, String surname,
			String login, String password, int workerID, int bossID,
			int workplaceID, String hiredTo) {
		super(id, status, name, surname, login, password);
		this.workerID = workerID;
		this.bossID = bossID;
		this.workplaceID = workplaceID;
		this.hiredTo = hiredTo;
	}

	public int getbossID() {
		return bossID;
	}

	public String getHiredTo() {
		return hiredTo;
	}

	public int getworkerID() {
		return workerID;
	}

	public int getworkplaceID() {
		return workplaceID;
	}

	public void setbossID(int bossID) {
		this.bossID = bossID;
	}

	public void setHiredTo(String hiredTo) {
		this.hiredTo = hiredTo;
	}

	public void setworkerID(int workerID) {
		this.workerID = workerID;
	}

	public void setworkplaceID(int workplaceID) {
		this.workplaceID = workplaceID;
	}

}
