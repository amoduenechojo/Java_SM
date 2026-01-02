import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutSystem{

	public static void main (String [] args){

		ArrayList <String> items = new ArrayList <>();
		ArrayList <Integer> units = new ArrayList <>();
		ArrayList <Double> price = new ArrayList <>();

		Scanner input = new Scanner (System.in);


		System.out.println("What is the customer's name: ");
		String customerName = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy , HH:mm:ss");

        String dateTime = LocalDateTime.now().format(formatter);

		String item_purchased;
		int number_of_units;
		double price_per_unit;

		while (true){
	
			System.out.println("What did the user buy?");
			item_purchased = input.nextLine();

			if (items.contains(item_purchased)){
				int position = items.indexOf(item_purchased);
				
				System.out.println("How many pieces?");
				number_of_units = input.nextInt();

				input.nextLine();
				units.set(position, (units.get(position) + number_of_units));
			}

			else{

				items.add(item_purchased);

				System.out.println("How many pieces?");
				number_of_units = input.nextInt();
				units.add(number_of_units);

				System.out.println("How much per unit?");
				price_per_unit = input.nextDouble();
				price.add(price_per_unit);

				input.nextLine();

			}

			System.out.println("Add more items?(yes/no)");
			String keepGoing = input.nextLine().toUpperCase();

			if (keepGoing.equals("NO"))
				break;
		}

		System.out.println("What is your name?");
		String cashierName = input.nextLine();

		System.out.println("How much discount will customer get?");
		double discount = input.nextDouble();
		
		double total = 0.0;
		for (int EneCounter = 0; EneCounter < units.size(); EneCounter++){

			total += (units.get(EneCounter) * price.get(EneCounter));

		}

		double totalDiscount = total * (discount/100);
		double VAT = total * 0.175;
		double totalBill = total - totalDiscount + VAT;

		System.out.println("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 08161750122");
		System.out.println("Date: " + LocalDateTime.now());
		System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashierName, customerName);

		System.out.println("=============================================================");
		System.out.printf("%13s%5s%14s%20s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println("-------------------------------------------------------------");
		
		for (int counter = 0; counter < items.size(); counter++){

			System.out.printf("%15s%7d%16.2f%20.2f%n", items.get(counter), units.get(counter), price.get(counter), (units.get(counter) * price.get(counter)));

		}

		System.out.println("-------------------------------------------------------------");
		System.out.printf("%-34s%18.2f%n", "Sub Total:", total);
		System.out.printf("%-34s%18.2f%n", "Discount:", (discount*total));
		System.out.printf("%-34s%18.2f%n", "VAT @ 17.50%:", VAT);
		System.out.println("=============================================================");
		System.out.printf("%-34s%18.2f%n", "Bill Total:", totalBill);
		System.out.println("=============================================================");
		System.out.printf("%-36s %.2f%n", "THIS IS NOT A RECEIPT, KINDLY PAY", totalBill);
		System.out.println("=============================================================");

		System.out.println("\n\nHow much did the customer give to you?");
		double payment = input.nextDouble();

		if (payment >= totalBill){

		System.out.println("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 08161750122");
		System.out.println("Date: " + LocalDateTime.now());
		System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashierName, customerName);

		System.out.println("=============================================================");
		System.out.printf("%-13s%5s%15s%21s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println("-------------------------------------------------------------");
		
		for (int counter = 0; counter < items.size(); counter++){

			System.out.printf("%-13s%5d%14.2f%20.2f%n", items.get(counter), units.get(counter), price.get(counter), (units.get(counter) * price.get(counter)));

		}

		System.out.println("-------------------------------------------------------------");
		System.out.printf("%-34s%18.2f%n", "Sub Total:", total);
		System.out.printf("%-34s%18.2f%n", "Discount:", (totalDiscount));
		System.out.printf("%-34s%18.2f%n", "VAT @ 17.50%:", VAT);
		System.out.println("=============================================================");
		System.out.printf("%-34s%18.2f%n", "Bill Total:", totalBill);
		System.out.printf("%-34s%18.2f%n", "Amount Paid:", payment);
		System.out.printf("%-34s%18.2f%n", "Balance:", (payment - totalBill));
		System.out.println("=============================================================");
		System.out.printf("%-36s%n", "THANK YOU FOR YOUR PATRONAGE");
		System.out.println("=============================================================");


		}

		else{

			System.out.println("Insufficient Funds!");
		}

	}

}

