import java.util.Scanner;
    public class BookingSystem{
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);

//    menu();   
        

    System.out.print("Welcome to the Book Suggestion System!");       
    String Suggestion = input.nextLine();


    String bookSystem = """
        Tap 1: To Get Suggestions
        Tap 2: To Add book
        Tap 3: To Remove book
        Tap 4: To Update book
        Tap 5: To Show all books
        """;


         System.out.println(bookSystem);
                System.out.println("Enter your choice: ");
                int bookSystemOption = input.nextInt();

                    
    switch (bookSystemOption) {
        case 1 -> {
                System.out.println("To Get Suggestions");
                String options = """
                        Book of the Day:
                            Book Title: Hafastu Bebi
                            Page: 47
                            """;
                System.out.println(options);
                
                System.out.print("Enter a number to see details (1-3): ");
                int suggestionsChoice = input.nextInt();

                switch (suggestionsChoice) {
                    case 1 -> System.out.println("Book of the Day: ");
                    case 2 -> System.out.println("Book Title: Hafastu Bebi");
                    case 3 -> System.out.println("Page: 47 ");
                } 
              
                System.out.println("Would you like another book suggestion? (yes/no): ");
                String response = input.next(); 
                System.out.println("Book Title: Broken");
                System.out.println("Page 12");
        }
    }
     
System.out.println("Enter book title to add:");
int addBookOption = input.nextInt(); 
    switch (addBookOption) {                  
        case 2 -> {
                    System.out.println("To Add book");
                    String addOption = """
                           Enter the book title: The Chosen;
                           Book added successfully!
                        """;
                     System.out.println(addOption);
                    }

           case 1-> System.out.println("Enter the book title: The Chosen");
           case 3-> System.out.println("Book added successfully!");
    }
  
  

System.out.println("Enter your choice:");
int removeBookOption = input.nextInt(); 
    switch (removeBookOption){
        case 3 ->{
                    System.out.println("To Remove book");
                    String removeOption = """
                           Enter the book title to remove:The Chosen;
                           Book removed successfully! 
                        """;
                    System.out.println(removeOption);    
               }
                     }

            
    
System.out.println("Enter your choice:");
int updateBookOption = input.nextInt(); 
    switch (updateBookOption){
        case 4 -> {
                    System.out.println("To Update book");
                    String updateOption = """
                            Enter the old title: Chi kind
                            Enter the latest title: Chicken kingdom
                            Book updated successfully!
                        """;
                    System.out.println(updateOption);
                }
                        }
                          
     
System.out.println("Enter your choice:");
int showAllBooksOptions = input.nextInt();    
    switch (showAllBooksOptions){
        case 5 -> {
                   System.out.println("To Show all books");
                   String allOptions = """        
                           All Books
                            1. Hafastu Bebi
                            2. Broken
                            3. The Chosen
                            4. Unchained
                    """;
                    System.out.print(allOptions);
                        }
                    }

      
}
}        



























    
