import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("Enter a price");
		double price = in.nextDouble();
		//Read in the amount paid
		System.out.println("How much was paid?");
		double paid = in.nextDouble();
		//Print out the amount of change
		double change = paid - price;
		System.out.println("Your change is $"+change);
		//Break the change into all denominations:
		//how many 100s in the change
		int num100 = (int)( change/100);
		System.out.println("You get "+num100+" x $100");
		change = change-num100*100;
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
	}

}
