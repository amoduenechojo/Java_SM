import java.util.Scanner;

public class ShuffleSnisle{

//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        ArrayList<String> participants = new ArrayList<>();
//
//        int maximumNumberOfUsers = 50;
//        int numberOfPeopleInAGroup = 8;
//
//        System.out.println("Welcome to Shuffle Snisle!");
//
//        System.out.print("Enter number of participants (1-50): ");
//        int totalNumberOfUsers = input.nextInt();
//
//
//        if (totalNumberOfUsers < 1 || totalNumberOfUsers > maximumNumberOfUsers) {
//            System.out.println("Number of participants must be between 1 and 50.");
//            return;
//        }
//
//
//        for (int collectionOfData = 0; collectionOfData < totalNumberOfUsers; collectionOfData++) {
//
//            System.out.print("Enter your name: ");
//            String nameOfTheUser = input.nextLine();
//
//            if (nameOfTheUser.startsWith(" ")) {
//                System.out.println("Name cannot start with a space.");
//                i--;
//                continue;
//            }
//
//            System.out.print("Enter your  age: ");
//            int ageOfTheUser = input.nextInt();
//  
//
//            participants.add(nameOfTheUser + " (" + ageOfTheUser + ")");
//        }
//
//        Collections.shuffle(participants);
//
//
//
//
//        ArrayList<String> participants = new ArrayList<>();
//
//        for (int creationOfGroups = 0; creationOfGroups < participants.size(); creationOfGroups += numberOfPeopleInAGroup) {
//            groups.add(participants.subList(creationOfGroups, Math.min(creationOfGroups + numberOfPeopleInAGroup, participants.size())));
//        }
//
//
//        System.out.println("\n=== Shuffle Snisle Groups ===");
//
//        for (int displayGroups = 0; displayGroups < groups.size(); displayGroups++) {
//            System.out.println("Group " + (displayGroups + 1));
//
//            for (String user : groups.get(displayGroups)) {
//                System.out.println(user);
//            }
//
//        }
//
//    }
//}























        public static void main(String [] args){

            Scanner input = new Scanner(System.in):
            ArrayList <String> supposedGroupMembers = ArrayList<>();


            System.out.print("WELCOME TO SHUFFLE SNISLE");

            int maximumNumberOfPersons = 50;
            int mininumNumberOfPersons = 1;



            System.out.println("Enter a number between 1 -50: ");
            int totalNumberOfUsers = input.nextInt();

                if(totalNumberOfUsers < 1 || totalNumberOfUsers > 50){
                    System.out.print("Invalid input, Re-enter a number: ")}

    }
