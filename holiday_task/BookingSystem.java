import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

    public class BookingSystem {
        
        static ArrayList<String> books = new ArrayList<>();
        static Scanner input = new Scanner(System.in);
        static Random rand = new Random();

        public static void main(String[] args) {
            
            books.add("Hafastu Bebi");
            books.add("Broken");
            books.add("The Chosen");

            while (true) {
                System.out.println("\nWelcome to the Book Suggestion System!");
                System.out.println("1. Get Suggestions\n2. Add Book\n3. Remove Book\n4. Update Book\n5. Show All Books");
                

                System.out.println("Enter your choice: ");
                
                int choice = input.nextInt();
                input.nextLine(); 

                switch (choice) {
                    case 1 -> getSuggestions();
                    case 2 -> addBook();
                    case 3 -> removeBook();
                    case 4 -> updateBook();
                    case 5 -> showAllBooks();
                    default -> System.out.println("Invalid option.");
                }
            }
        }

       

        public static void getSuggestions() {
            String response;
            do {
                int index = rand.nextInt(books.size());
                int page = rand.nextInt(100) + 1; 
                System.out.println("Book for the Day: ");
                System.out.println("Book Title: " + books.get(index));
                System.out.println("Page: " + page);
                
                System.out.print("Would you like another suggestion? (yes/no): ");
                response = input.nextLine();
            } while (response.equalsIgnoreCase("yes"));
        }

        public static void addBook() {
            System.out.println("Enter the book title: ");
            String newBook = input.nextLine();
            if (!books.contains(newBook)) {
                books.add(newBook);
                System.out.println("Book added successfully!");
            } else {
                System.out.println("Book already exists.");
            }
        }

        public static void removeBook() {
            System.out.print("Enter the book title to remove: ");
            String toRemove = input.nextLine();
            if (books.remove(toRemove)) {
                System.out.println("Book removed successfully!");
            } else {
                System.out.println("Book not found.");
            }
        }

        public static void updateBook() {
            System.out.print("Enter the old title: ");
            String oldTitle = input.nextLine();
            int index = books.indexOf(oldTitle);
            
            if (index != -1) {
                System.out.print("Enter the new title: ");
                String newTitle = input.nextLine();
                books.set(index, newTitle);
                System.out.println("Book updated successfully!");
            } else {
                System.out.println("Old title not found.");
            }
        }

        public static void showAllBooks() {
            System.out.println("All Books:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }
