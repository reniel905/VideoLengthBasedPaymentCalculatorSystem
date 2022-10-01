import java.util.Scanner;
public class VideoLengthBasedPaymentCalculatorSystem {
	public static void main(String[] args) {
		
		double Minute, minutes, seconds, price;
		double pricePerMinute;
		int i = 1, x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("No. of Videos: ");
		x = scan.nextInt();
		System.out.print("Price per Minute: $");
		pricePerMinute = scan.nextInt();


		
		while (i <= x){
		System.out.println("= Enter Video Length =");
		System.out.print("Minute/s: ");
		minutes = scan.nextDouble();
		System.out.print("Second/s: ");
		seconds = scan.nextDouble();
		
		Minute = minutes + (seconds / 60);
		
		price = Minute * pricePerMinute;
		
		
		System.out.println("======= Total ========");
		System.out.println("$" + price);
		
		--x;
		
		}
	}
}