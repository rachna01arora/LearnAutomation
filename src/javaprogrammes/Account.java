package javaprogrammes;

public class Account {
	double accountno;
	int amount;
	String name;
	
	public void insertrecord(double acc, int amt, String nam){
		accountno=acc;
		amount=amt;
		name=nam;
	}
	
	public void depositeamount(int amt){
		amount=amount+amt;
		System.out.println("amount  after deposite" + +amount);
	}
	
	public void withdrawamount(int amt){
		
		if(amount<amt){
			System.out.println("Balance is not sufficient");
		}
		else{
			amount=amount-amt;
			System.out.println("amount left after withdrawal" +" "+amount);
		}
	}

}
