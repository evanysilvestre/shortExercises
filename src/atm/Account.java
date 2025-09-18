package atm;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
	private int id;
	private String firstName;
	private String lastName;
	private String ssn; // Social Security Number = It's the same as CPF in Brazil.
	private BigDecimal balance;
	
	
	public Account(int id, String firstName, String lastName, String ssn, BigDecimal balance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", balance=" + balance + "]";
	}
	
	public void createAccount(int id, String firstName, String lastName, String ssn, BigDecimal balance) {
		Account account = new Account(id, firstName, lastName, ssn, balance);
	}
}


