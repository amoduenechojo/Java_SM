public class Time{

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {

        if (hours < 0 || hours >= 24) {
            throw new IllegalArgumentException("Hours should be between 0 and 23");
        }

        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("minutes must be between 0 and 59.");
        }

        if (seconds < 0 || seconds >= 59) {
            throw new IllegalArgumentException("seconds must be between 0 and 59.");
        }

        this.hours = hours;
        this.seconds = seconds;
        this.minutes = minutes;
    }

    public void setHours(int hours){

        if (hours < 0 || hours >= 24) {
            throw new IllegalArgumentException("Hours should be between 0 and 23");
        }

        this.hours = hours;
    }

    public int getHours(){
        return hours;
    }

    public void setMinutes(int minutes){

        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("minutes must be between 0 and 59.");
        }

            this.minutes = minutes;
    }

    public int getMinutes(){
        return minutes;
    }

    public void setSeconds(int seconds){

        if (seconds < 0 || seconds >= 59) {
            throw new IllegalArgumentException("seconds must be between 0 and 59.");
        }

        this.seconds = seconds;
    }

    @Override
    public String toString(){
        return String.format("%d:%d:%d%n", hours, minutes, seconds);
    }


    public String toStandardFormat(){
        return String.format("%d:%d:%d %s%n", hours % 12 == 0?12:hours % 12, minutes, seconds, hours>=12? "PM": "AM");
    }

}