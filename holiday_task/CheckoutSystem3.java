import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate.time;

public class CheckoutSystem2{

    static Scanner input = new Scanner (System.in);
        public static void main (String [] args){

        ArrayList <String> items = new ArrayList <>();
//        String [] itemsBought = new String[3];

        LocalDateTime localDateTime = LocalDateTime.now();


        System.out.println("What did the customer buy? ");
//        input.(itemsBought.add(0));
        itemsBought = input.nextLine();

        items.add(itemsBought);

        System.out.println("How many peces did the customer buy? ");
//        input.(piecesOfItemsBought.add(1));
        piecesOfItemsBought = input.nextLine();

        items.add(piecesOfItemsBought);


        System.out.println("How many peces did the customer buy? ");
//        input.(priceOfItemsBought.add(2)); 
        pricesOfItemsBought = input.nextLine();

        items.add(pricesOfItemsBought);

        
        System.out.println("Do you want to add more items? yes/no");
        String response = input.nextLine();

        System.out.println("What is your name? ");
        String cashierName = input.nextLine();

        System.out.println("How much discount will the customer get?");
		double discount = input.nextDouble();

        double total = 0.0;

        for (int firstCounter = 0; firstCounter < units.size(); firstCounter++){

        total = total + (piece.get(firstCounter) * price.get(firstCounter));
        }

        double totalDiscount = total * (discount/100);
	    double VAT = total * 0.175;
	    double billTotal = total - totalDiscount + VAT;

        System.out.println("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 08161750122");
        System.out.println("Date: " + LocalDateTime.now());
        System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashierName, customerName);
        System.out.println("=============================================================");
		System.out.printf("%15s%7s%16s%20s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println("-------------------------------------------------------------");
		
		for (int counter = 0; counter < items.size(); counter++){

			System.out.printf("%16s%8d%16f%20f%n", items.get(counter), units.get(counter), price.get(counter), (units.get(counter) * price.get(counter)));

		}

		System.out.println("-------------------------------------------------------------");
		System.out.printf("%36s%20f%n", "Sub Total:", total);
		System.out.printf("%36s%20f%n", "Discount:", (totalDiscount));
		System.out.printf("%36s%20f%n", "VAT @ 17.50%:", VAT);
		System.out.println("=============================================================");
		System.out.printf("%%36s%20f%n", "Bill Total:", billTotal);
		System.out.println("=============================================================");
		System.out.printf("%3%36s%20f%n", "THIS IS NOT A RECEIPT, KINDLY PAY", billTotal);
		System.out.println("=============================================================");
} 

        System.out.println("How much did the customer give to you? ");
	    double amount = input.nextDouble();

        if (amount >= totalBill){

        System.out.println("\n\nSEMICOLON STORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 08161750122");
        System.out.println("Date: " + LocalDateTime.now());
        System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashierName, customerName);

        System.out.println("=============================================================");
        System.out.printf("%13s%5s%15s%21s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("-------------------------------------------------------------");

        for (int counter = 0; counter < items.size(); counter++){

        System.out.printf("%13s%5d%14.2f%20.2f%n", items.get(counter), pieces.get(counter), price.get(counter), (total = (pieces.get(counter) * price.get(counter))));
        }
//        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%34s%18.2f%n", "Sub Total:", total);
        System.out.printf("%34s%18.2f%n", "Discount:", (totalDiscount));
        System.out.printf("%34s%18.2f%n", "VAT @ 17.50%:", VAT);
        System.out.println("=============================================================");
        System.out.printf("%34s%18.2f%n", "Bill Total:", billTotal);
        System.out.printf("%34s%18.2f%n", "Amount Paid:", payment);
        System.out.printf("%34s%18.2f%n", "Balance:", (payment - billTotal));
        System.out.println("=============================================================");
        System.out.printf("%36s%n", "THANK YOU FOR YOUR PATRONAGE");
        System.out.println("=============================================================");

        else{

	        System.out.println("Insufficient Funds!");
        }

    }

}

        
