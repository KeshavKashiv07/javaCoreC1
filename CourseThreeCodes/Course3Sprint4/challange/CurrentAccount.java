package Course3Sprint4.challange;

public class CurrentAccount extends BankAccount {

private String accountType;
private boolean intrest = false;
private String numberOftransactions = "Unlimited transactions";
	

	public CurrentAccount(long accountNumber, String name, int age, String accountStatus,int totalAccountBalance , String accountType) {
		super(accountNumber, name, age, accountStatus, totalAccountBalance);
		this.accountType=accountType;
	}
	

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public int retrieveBalane() {
		// TODO Auto-generated method stub
		return getTotalAccountBalance();
	}
	
	@Override
	public int debitCash(int withdrawAmount) {
		  setTotalAccountBalance( getTotalAccountBalance()- withdrawAmount );
		  System.out.println("Amount debited with ruppes " + withdrawAmount);
		  return getTotalAccountBalance();
		}
	
	@Override	
	public int craditCash(int depositAmount) {
			setTotalAccountBalance( getTotalAccountBalance()+depositAmount );
			 System.out.println("Amount created with ruppes " + depositAmount);
			 return getTotalAccountBalance();
		}
	
	public void displayDetails() {
			System.out.println("------------------------------------------------------");
			System.out.println("Account Number : " + getAccountNumber());
			System.out.println("Name : " + getName());
			System.out.println("Age : " + getAge());
			System.out.println("Account status : " + getAccountStatus());
			System.out.println("Account type : " + getAccountType());
			System.out.println("Avelable balance : "  + getTotalAccountBalance());
			System.out.println("Intrest rate : " + intrest);
			System.out.println("Number Of transactions : " + numberOftransactions);
			System.out.println("------------------------------------------------------");
		}

}
