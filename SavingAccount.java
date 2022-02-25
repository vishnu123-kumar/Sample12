package Banking;

public class SavingAccount extends Bank {
	int Accountnum=334289;
	String name="Vishnu Kumar Guriginjakunta";
	double amount=1000000;
	void saving() {
		System.out.println("Hi,"+name+" Your account is successfully created ");

		System.out.println(Accountnum+" "+name+" ");
		System.out.println("Current Balance:"+amount);
		
			}
	/*public static void main(String[] args) {
		SavingAccount s =new SavingAccount();
		s.saving();
	}*/
}
