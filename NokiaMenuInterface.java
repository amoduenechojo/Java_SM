import java.util.Scanner;
public class NokiaMenuInterface{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

    String appMenu = """

        NOKIA,MAKING LIFE EASIER - EAT NG
        Press 1:For Phonebook 
        Press 2:For Messages
        Press 3:For Chat
        Press 4:For Call registers
        Press 5:For Tones
        Press 6:For Settings
        Press 7:For Call divert
        Press 8:For Games
        Press 9:For Calculator
        Press 10:For Reminders
        Press 11:For Clock
        Press 12:For Profiles
        Press 13:For Sim services
        """;

    System.out.println(appMenu);
    System.out.println("Enter your choice: ");
    int menuFunction = input.nextInt();

        switch(menuFunction){
            case 1-> {
                System.out.println("phonebook");

                 String phoneBook = """
                            PHONEBOOK
                            Press 1 For Search
                            Press 2 For Service Nos
                            Press 3 For Add name
                            Press 4 For Erase
                            Press 5 For Edit
                            Press 6 For Assign tone
                            Press 7 For Send b'card
                            Press 8 For Options
                            Press 9 For Speed dial
                            Press 10 For Voice tags
                """;

                System.out.println(phoneBook);
                System.out.println("Enter your choice: ");
                int phonebookoption = input.nextInt();

                    switch (phonebookoption){
                        case 1 -> System.out.println("Search");
                        case 2 -> System.out.println("Service Nos");
                        case 3 -> System.out.println("Add name");
                        case 4 -> System.out.println("Erase");
                        case 5 -> System.out.println("Edit");
                        case 6 -> System.out.println("Assign tone");
                        case 7 -> System.out.println("Send b'card'");
                        case 8 -> {
                                    System.out.println("Options");
                                  String options = """
                                        Press 1 -> For Type view    
                                        Press 2 -> For Memory status
                                    """;
                                    System.out.println(options);
                                    int optionChoice = input.nextInt();

                                    switch(optionChoice){
                                        case 1 -> System.out.println("For Type view");
                                        case 2 ->System.out.println("ForMemorystatus");
                                    }
                                }
                        case 9 -> System.out.println("Speed tags");
                        case 10 -> System.out.println("Voice tags");
                    }
                      
              }

            case 2 -> {
                System.out.print("Messages");

                String messages = """
                Messages
                Press 1 To write messages
                Press 2 Inbox
                Press 3 Outbox
                Press 4 Picture meesages
                Press 5 Templates
                Press 6 Smileys
                Press 7 Message settings
                Press 8 Info Service
                Press 9 Voice mailbox number
                Press 10 Service command editor
                """;

                System.out.println(messages);
                System.out.println("Enter your choice: ");
                int phonebookoption = input.nextInt();

                switch (phonebookoption){
                    case 1 -> System.out.println("To write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                            System.out.println("Message settings");
                                String messageSettings = """
                                    Press 1 -> Set 1
                                    Press 2 -> Common
                   
                         """;
                        System.out.println(messageSettings);
                        System.out.println("Enter your choice: ");
                        int OptionChoice = input.nextInt();
                    switch (messageSettings){
                        case 1 -> System.out.println("Message centre number");
                        case 2 -> System.out.println("Message sent as");
                        case 3 -> System.out.println("Message validity");
                      }
                }

            }

        }

  
        
         


    }
 
}
