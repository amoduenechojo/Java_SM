public class AirConditioner{

    boolean isOn;   
    boolean ACStatus = false;
    int temperature =  16;


    public void turnOff(){
       ACStatus = false;
       temperature = 0;
    }

    public boolean turnOn(){
        isOn = true; 
    }



    public int increaseInTemperature(){
        if(isOn == true && temperatue < 30){
            temperature = temperature + 1;
    }
        return temperature;
        }

    public int decreaseInTemperature(){
        if(isOn == true && temperature > 16){
            temperature = temperature - 1;
        }
            return temperature;

    }


    public int fixedIncreaseInTemperature(){
        (if temperature > 30){
            final temperature == 30;
        }

    }

    public int fixedDecreaseInTemperature(){
        (if temperature < 16){
            final temperature == 16;
        }
        

    }


}





















