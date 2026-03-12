//import java.util.Scanner;
//
//public class SalesCommissionCalculator {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        double totalSales = 0.0;
//        double itemPrice;
//
//        System.out.println("Enter the price of each item sold.");
//        System.out.println("Enter -1 to finish.");
//
//        // Loop with no limit to number of items
//        while (true) {
//            System.out.print("Enter item price: ");
//            itemPrice = input.nextDouble();
//
//            if (itemPrice == -1)
//                break;
//
//            totalSales += itemPrice;
//        }
//
//        double earnings = 200 + (0.09 * totalSales);
//
//        System.out.println("\nTotal Sales: $" + totalSales);
//        System.out.println("Total Earnings: $" + earnings);
//
//    }
//}


A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or a total of $650. 
You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.






//
//import java.util.Scanner;
//
//public class SalesCommissionCalculator {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        double totalSales = 0.0;
//        double itemPrice;
//
//        System.out.print("Enter number of items sold: ");
//        int numberOfItems = input.nextInt();
//
//        for (int index = 1; index <= numberOfItems; index++) {
//
//            System.out.print("Enter price of item " + index + ": ");
//            double itemPrice = input.nextDouble();
//
//            double totalSales = totalSales + itemPrice;
//        }
//
//        System.out.println("\nTotal Sales: $" + totalSales);
//
//        double earnings = 200 + (0.09 * totalSales);
//        System.out.println("Total Earnings: $" + earnings);
//
//    }
//}
