package Banking;

public class Details extends SavingAccount {
	double credit=400000;
	double total=amount+credit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		SavingAccount sb=new SavingAccount();
		Details d=new Details();
		
		b.bank();
		sb.saving();
		d.total();

	}

	 void total() {
		// TODO Auto-generated method stub
		 System.out.println("Deposited Amount:"+credit);
		 System.out.println("Total Balance:" +total);
		
	}

}
