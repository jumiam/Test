package classes;

public class Workplace {

	private int id;
	private int ownerID; // ID pracodawcy ktory stworzyl miejsce pracy
	private String name;
	private int payment;
	private String info;
	private int freeOffers;

	public Workplace(int id, int userID, String name, int payment, String info,
			int freeOffers) {
		super();
		this.id = id;
		this.ownerID = userID;
		this.name = name;
		this.payment = payment;
		this.info = info;
		this.freeOffers = freeOffers;
	}

	public int getFreeOffers() {
		return freeOffers;
	}

	public int getID() {
		return id;
	}

	public String getInfo() {
		return info;
	}

	public String getName() {
		return name;
	}

	public int getOwnerID() {
		return ownerID;
	}

	public int getPayment() {
		return payment;
	}

	public void setFreeOffers(int freeOffers) {
		this.freeOffers = freeOffers;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

}
