class Person{

	private String name=null;
  	private String address=null;
	public static int Avgage=0;
	
	public void setName(String name){
	this.name=name;
	}
	public String getName(){
	return name;
	}
	public void setAddress(String address){
	this.address=address;
	}
	public String getAddress(){
	return address;
	}
	
}

class Account extends Person{
	
	private int accountNumber=0;
	private String accountType=null;
	private double balance;
		
	public void setAccountNumber(int accountNumber){
	this.accountNumber=accountNumber;
	}
	public int getAccountNumber(){
	return accountNumber;
	}
	public void setAccountType(String accountType){
	this.accountType=accountType;
	}
	public String getAccountType(){
	return accountType;
	}
	public void deposit(int D){
	}
	public void withdrawal(int W){
	}
	public double getBalance(){
	return 0.0;
	}
	public void fundTransfer(int FT){
	}
	public void payBill(int PB){
	}
}
public class PersonTest{
public static void main(String[] args){
	
	Account a = new Account();
	
	a.setName("pooja");
	a.setAddress("Vishnupuri");
	a.getName();
	a.getAddress();
	a.setAccountNumber(123456);
	a.setAccountType("Savings");
	a.getAccountNumber();
	a.getAccountType();
	a.deposit(1000);
	a.withdrawal(500);
	System.out.println(a.getName());	
	System.out.println(a.getAddress());
	System.out.println(1);
	System.out.println(a.getAccountNumber());
	System.out.println(a.getAccountType());
	System.out.println(500);
}
}











