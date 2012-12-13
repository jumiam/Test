package classes;

public class Hall {

	private int id;
	private int size;
	private boolean isForRent;
	private int investorID; // numer id investora ktory wynajol hale (jesli w
							// ogole)
	private int rentCost;
	private String rentToDate; // do kiedy wynajete
	private String rentFromDate; // od kiedy wynajete

	public Hall(int id, int size, boolean isForRent, int investorID,
			int rentCost, String rentToDate, String rentFromDate) {
		super();
		this.id = id;
		this.size = size;
		this.isForRent = isForRent;
		this.investorID = investorID;
		this.rentCost = rentCost;
		this.rentToDate = rentToDate;
		this.rentFromDate = rentFromDate;
	}

	public int getID() {
		return id;
	}

	public int getinvestorID() {
		return investorID;
	}

	public int getRentCost() {
		return rentCost;
	}

	public String getRentFromDate() {
		return rentFromDate;
	}

	public String getRentToDate() {
		return rentToDate;
	}

	public int getSize() {
		return size;
	}

	public boolean isForRent() {
		return isForRent;
	}

	public void setForRent(boolean isForRent) {
		this.isForRent = isForRent;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setinvestorID(int investorID) {
		this.investorID = investorID;
	}

	public void setRentCost(int rentCost) {
		this.rentCost = rentCost;
	}

	public void setRentFromDate(String rentFromDate) {
		this.rentFromDate = rentFromDate;
	}

	public void setRentToDate(String rentToDate) {
		this.rentToDate = rentToDate;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
