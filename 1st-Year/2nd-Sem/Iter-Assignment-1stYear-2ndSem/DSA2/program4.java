import java.util.Scanner;
class product{
	int pid;//product id
	double price;//product price
	static double tot_price=0;
	product(int pid, double price){
		this.pid=pid;
		this.price=price;
		tot_price +=price;
	}
	void display() {
		System.out.println("Product ID: "+pid);
		System.out.println("price = "+ price);
		//System.out.println("totprice="+ tot_price);
	}
	public static double getTotalPrice() {
        return tot_price;
	}
	
}
public class program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		product[] ob =new product[5];
		for(int i=0; i<ob.length;i++) 
		{
			System.out.println("enter the details of the prod");
			System.out.print("Product ID:");
			int pid=sc.nextInt();
			System.out.println("price= ");
			double price=sc.nextDouble();
			ob[i]=new product(pid,price);	
		}
		System.out.println("Details of product purchased: ");
		for(int i=0;i<ob.length;i++)
		{
			ob[i].display();
			//tot_price=ob[i].price;
		}
		System.out.println("total amount= "+product.getTotalPrice());
		// TODO Auto-generated method stub

	}

}
