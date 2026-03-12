public class BackToSender{


     public static int calculateWage(int deliveries){

            int amountParcel = 0;


            if(deliveries < 50){
                amountParcel = 160;
            }

                else if(deliveries >= 50 && deliveries <= 59){
                    amountParcel = 200;
                }

                else if(deliveries >= 60 && deliveries <= 69){
                    amountParcel = 250;
                }

                else if (deliveries >= 70){
                    amountParcel = 500;
                }

            else{
                System.out.print("Invalid delivery rate.");
            }      

        
            int wageForTheDay = deliveries * amountParcel + 5000;

            return wageForTheDay;
        }
}

