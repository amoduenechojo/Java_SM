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
    return true;
    }


    public int increaseInTemperature(){
        if(isOn == true && temperature < 30){
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
        if (temperature > 30){
            temperature = 30;
        }
        return temperature;
    }

    public int fixedDecreaseInTemperature(){
        if (temperature < 16){
            temperature = 16;
        }
        return temperature;
    }

    
//    public int getTemperatureValue(){
//        if()}

}





















