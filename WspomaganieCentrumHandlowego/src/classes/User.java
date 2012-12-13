package classes;

public class User {

	public enum Status {
		admin, investor, worker
	}

	protected int id;
	protected Status status;
	protected String name;
	protected String surname;
	protected String login;
	protected String password;

	public User(int id, Status status, String name, String surename,
			String login, String password) {
		super();
		this.id = id;
		this.status = status;
		this.name = name;
		this.surname = surename;
		this.login = login;
		this.password = password;
	}

	public int getID() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public Status getStatus() {
		return status;
	}

	public String getSurname() {
		return surname;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
