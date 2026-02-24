import java.time.LocalDate;
//import java.time.Period;

public class HeartRates {

    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

   
    public HeartRates(String firstName, String lastName,
                      int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

   



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

   

    public int getAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

  

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

  

    public String getTargetHeartRate() {
        int maxRate = getMaximumHeartRate();
        double lower = 0.50 * maxRate;
        double upper = 0.85 * maxRate;
        return String.format("%.1f - %.1f beats per minute", lower, upper);
    }
}

