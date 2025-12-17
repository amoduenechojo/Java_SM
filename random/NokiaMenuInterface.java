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
                    case 7 ->{
                            System.out.println("Message settings");
                                String messageSettings = """
                                    Press 1 -> Set 1
                                    Press 2 -> Common
                   
                         """;

                        System.out.println(messageSettings);
                        System.out.println("Enter your choice: ");
                        int optionChoice = input.nextInt();

                        switch (optionChoice){
                            case 1 -> {
                                    System.out.println("Set 1");
                                    
                                    String setOneOptions = """
                                    Press 1 -> Message centre number
                                    Press 2 -> Message sent as
                                    Phase 3 -> Message validity
                                    """;

                                    System.out.println(setOneOptions);

                                    System.out.println("Enter your choice: ");
                                    int set1Choice = input.nextInt();

                                    switch (set1Choice){
                                        case 1 -> System.out.println("Message centre number");  
                                        case 2 -> System.out.println("Message sent as");
                                        case 3 -> System.out.println("Message validity");
                                    }
                                }
                             
                            case 2 -> {
                                    System.out.println("Common");

                                    String commonOptions = """
                                    Press 1 -> Delivery reports
                                    Press 2 -> Reply via same centre
                                    Phase 3 -> Character support
                                    """;

                                    System.out.println(commonOptions);


                                    System.out.println("Enter your choice: ");
                                    int commonChoice = input.nextInt();
                                    switch (commonChoice){
                                        case 1 -> System.out.println("Delivery Reports");  
                                        case 2 -> System.out.println("Reply via same centre");
                                        case 3 -> System.out.println("Character support");
                                    }
                                }
                           
                                    case 8 -> System.out.println ("Info service");
                    case 9 -> System.out. println ("Voice mailbox number");
                    case 10 -> System.out.println ("Service command editor");

                    }
               }

            }
        
           }  


            case 3 -> System.out.println("Chat");
            case 4 -> {

                System.out.println("Call register");
                
                    String callRegister = """
                        Call Register
                        Press 1 For Missed calls
                        Press 2 For Received calls
                        Press 3 For Dialed numbers
                        Press 4 For Erase recent call lists
                        Press 5 To Show call duration
                        Press 6 To Show call costs
                        Press 7 For Call cost settings
                        Press 8 For Prepaid credit 
                
                """;
                System.out.println(callRegister);
               
                 System.out.println("Enter your choice: ");
                 int callRegisterOPtion = input.nextInt();
                 switch (callRegisterOPtion){
                   case 1 -> System.out.println("Missed calls");
                   case 2 -> System.out.println("Received calls");
                   case 3 -> System.out.println("Dialled numbers");
                   case 4 -> System.out.println("Erase recent call lists");
                   case 5 -> {
                               System.out.println("Show call duration");
                               String showCallDurations = """ 
                               Show call durations
                               Press 1 Last call durations
                               Press 2 All calls' duration
                               Press 3 Received calls' duration
                               Press 4 Dialled calls' duration
                               Press 5 Clear timers
                              
                               """;    
                               System.out.println(showCallDurations);
                               
                               System.out.println("Enter your choice");                          
                                int showAllCallDurations = input.nextInt();
                                switch (showAllCallDurations){
                                   case 1 -> System.out.println("Last call duration");
                                   case 2 -> System.out.println("All calls' duration");
                                   case 3 -> System.out.println("Received calls' duration");
                                   case 4 -> System.out.println("Dialled calls' duration");
                                   case 5 -> System.out.println("Clear timers");
                                        }
                                     }
                 
                                  case 6 -> {
                                            System.out.print("Show call costs");
                                            String showCallCosts = """
                                            Show all costs
                                            Press 1 Last call cost
                                            Press 2 All calls' cost
                                            Press 3 Clear counters
                                            """;
                                            System.out.println(showCallCosts);
                                
                                            
                                            System.out.println("Enter your choice");
                                            int showAllCallCosts = input.nextInt();

                                            switch (showAllCallCosts){
                                               case 1 -> System.out.println("Last call costs");
                                               case 2 -> System.out.println("All calls");
                                               case 3 -> System.out.println("Clear counters");
                                    
                                     }
                                     

                                  }
                                  case 7 -> {
                                             System.out.print("Call cost settings");
                                             String callCostSettings = """
                                             Call costs settings
                                             Press 1 Call cost limit
                                             Press 2 Show costs in
                                              """;
                                             System.out.print(callCostSettings);

                                             System.out.println("Enter your choice");
                                             int listCallCostSettings = input.nextInt();

                                             switch (listCallCostSettings){
                                                case 1 -> System.out.println("call cost limit");
                                                case 2 -> System.out.println("show costs in");              
                                          } 
                                        }

                                  case 8 -> System.out.println("Prepaid credit");
                }
            }

            case 5 -> {
                       System.out.print("Tones");
                       String tones = """
                         Tones
                            Press 1 For Ringing tone
                            Press 2 For Ringing volume
                            Press 3 For Incoming call alert
                            Press 4 For Composer
                            Press 5 For Message alert tone
                            Press 6 For Keypad tones
                            Press 7 For Warning and game tones
                            Press 8 For Vibrating alert
                            Press 9 For Screen saver
                        """; 
                      System.out.print(tones);    
             
                      System.out.println("Enter your choice");
                      int chooseTones = input.nextInt();               
                      
                      switch (chooseTones){
                      case 1 -> System.out.println("Ringing tone");
                      case 2 -> System.out.println("Ringing volume");
                      case 3 -> System.out.println("Incoming call alert");
                      case 4 -> System.out.println("Composer");
                      case 5 -> System.out.println("Message alert tone");
                      case 6 -> System.out.println("Keypad tones");
                      case 7 -> System.out.println("Warning and game tone");
                      case 8 -> System.out.println("Vibrating alert");
                      case 9 -> System.out.println("Screen saver");
   
 
                    }
                }



                      case 6->{
                                System.out.print("Settings");
                                String settings = """
                                 Settings 
                                    Press 1 -> Call settings 
                                    Press 2 -> Phone settings   
                                    Press 3 -> Security settings
                                    Press 3 -> Restore factory settings
                                    
                                   """;
                                 System.out.print(settings);
                              
                                 System.out.println("Enter your choice");
                                 int chooseSettings = input.nextInt();

                                 switch (chooseSettings){
                                 case 1 -> {
                                           System.out.println("Call settings");
                           
                                           String callSettings = """
                                           Press 1 -> Automatic redial 
                                           Press 2 -> Speed dialling
                                           Press 3 -> Call waiting options
                                           Press 4 -> Own number ending
                                           Press 5 -> Phone line in use 
                                           Press 6 -> Automatic answer 
           
                                           """;
                                           System.out.println(callSettings);
                                           
                                           System.out.println("Enter your choice");
                                           int callSettingsChoice = input.nextInt();
                                           
                                          switch (callSettingsChoice){
                                            case 1 -> System.out.println("Automatic redial");
                                            case 2 -> System.out.println("Speed dialling");
                                            case 3 -> System.out.println("Call waiting options");
                                            case 4 -> System.out.println("Own number ending");
                                            case 5 -> System.out.println("Phone line in use");
                                            case 6 -> System.out.println ("Automatic answer");
                                  }
                              }
                                 case 2 -> {
                                             System.out.println("Phone settings");
                                             
                                             String phoneSettings = """
                                             Phone Settings
                                             Press 1 -> Language
                                             Press 2 -> Call info display
                                             Press 3 -> Welcome note
                                             Press 4-> Network selection 
                                             Press 5 -> Lights
                                             Press 6 -> Confirm SIM service actions
                                             
                                             """;     
 
                                            System.out.println(phoneSettings);
                                       
                                            System.out.println("Enter your choice");
                                            int phoneSettingsChoice = input.nextInt();

                                             switch (phoneSettingsChoice){
                                            case 1 -> System.out.println("Language");
                                            case 2 -> System.out.println("Cell info display");
                                            case 3 -> System.out.println("Welcome note");
                                            case 4 -> System.out.println("Network selection");
                                            case 5 -> System.out.println("Lights");
                                            case 6 -> System.out.println ("Confirm SIM service answer");
                                      }

                                           
                                            
                                 }
                                          case 3 -> {
                                                      System.out.println("Security settings");
  
                                             String securitySettings = """
                                             Security Settings
                                             Press 1 -> Pin code request
                                             Press 2 -> Cell barring service
                                             Press 3 -> Fixed dialling
                                             Press 4-> Closed user group 
                                             Press 5 -> Phone settings
                                             Press 6 -> Change access codes 
                                             
                                             """;


                                            System.out.println(securitySettings);
                                       
                                            System.out.println("Enter your choice");
                                            int securitySettingsChoice = input.nextInt();
                                            
                                            switch (securitySettingsChoice){
                                            case 1 -> System.out.println("PIN code request");
                                            case 2 -> System.out.println("Call barring service");
                                            case 3 -> System.out.println("Fixed dialling");
                                            case 4 -> System.out.println("Closed use group");
                                            case 5 -> System.out.println("Phone security");
                                            case 6 -> System.out.println ("Change access codes");
                                    }

                             }




                                       }





                          }           

                                          case 7 -> System.out.print("Call divert");
                                          case 8 -> System.out.print("Games");
                                          case 9 -> System.out.print("Calculator");
                                          case 10 -> System.out.print("Reminders");
                                          case 11 ->{
                                                      System.out.print("Clock");
                                                   
                                                    String clock = """
                                             Clock
                                             Press 1 -> Alarm clock
                                             Press 2 -> Clock settings
                                             Press 3 -> Date setting
                                             Press 4-> Stopwatch  
                                             Press 5 -> Countdown timer
                                             Press 6 -> Auto update of date and time     
                                                      """;
                                            
                                              System.out.print(clock);

                                                System.out.println ("Enter your choice");
                                                int clockSettings = input.nextInt();
                                                switch (clockSettings){
                                                    case 1 -> System.out.print ("Alarm clock");
                                                    case 2 -> System.out.print ("Clock settings");
                                                    case 3 -> System.out.print ("Stopwatch");
                                                    case 4 -> System.out.print ("Countdown timer");
                                                    case 5 -> System.out.print ("Auto update time and date");

                                      
                                              }

     
                   }

                    
                                case 12 -> System.out.println("Profiles");
                                case 13 -> System.out.println("SIM services");
            }
                            
        }

    }



                
                    








 


  
        
         


    
 

