package Banking;

public class Rof extends CurrentAccount {
	double rate=amount*5*4/100;                  //Simple Interset=PTR/100;
	double total=amount+rate;
	void interset() {
		System.out.println("Deposited amount:"+amount);
		System.out.println("Interset amount: "+rate);
		System.out.println("-------------------------");
		System.out.println("Total Amount   :"+total);
		System.out.println("-----------------------");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.bank();
		CurrentAccount ca=new CurrentAccount();
		ca.current();
		Rof r=new Rof();
		r.interset();
		

	}

}
