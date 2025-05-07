class Deposit{
	long principal;
	int time;
	double rate;
	double total_amt;
	Deposit(){
		this.principal=0;
		this.rate=0;
		this.time=0;
		this.total_amt=0;
		
		
	}
	Deposit(long principal,int time,double rate){
		this.principal=principal;
		this.time=time;
		this.rate=rate;
		calc_amt();
	}
	Deposit(long principal, int time){
		this(principal,time,0.05);//default rate 5%
		
	}Deposit(long principal, double rate) {
        this(principal, 1, rate); // default time of 1 year
        
	
}
	void display() {
        System.out.println("Principal: $" + principal);
        System.out.println("Time (years): " + time);
        System.out.println("Rate: " + (rate * 100) + "%");
        System.out.println("Total Amount: $" + total_amt);
    }
	void calc_amt() {
        total_amt = principal * Math.pow(1 + rate, time);
    }

public class program5 {

	public static void main(String[] args) {
		Deposit deposit1 = new Deposit();
		deposit1.display(); // displays all zeros
		Deposit deposit2 = new Deposit(10000, 2);
		deposit2.display(); // displays principal, time, rate, and total_amt
		Deposit deposit3 = new Deposit(5000, 3, 0.06);
		deposit3.display(); // displays principal, time, rate, and total_amt


		
	}
		// TODO Auto-generated method stub

	}

}
