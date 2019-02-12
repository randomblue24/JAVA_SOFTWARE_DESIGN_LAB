import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class HeartRates {

    String firstname;
    String lastname;
    int age;
    int month;
    int day;
    int year;
    double maxheartrate;

    HeartRates(String first, String last, int birthmonth, int birthday, int birthyear){


        if((Calendar.getInstance().get(Calendar.YEAR)-birthyear)>150){
            System.out.println("The oldest person lived 122 years. You're not older than 150 years!");
            return;
        } else {
            year = birthyear;
        }

        firstname=first;
        lastname=last;

        month=birthmonth;
        day=birthday;
        year = birthyear;

    }

    //Setters
    public void setFirstname(String first){
        firstname=first;
    }
    public void setLastname(String last){
        lastname=last;
    }

    public void setMonth(int birthmonth){
        month=birthmonth;
    }

    public void setDay(int birthday){
        day=birthday;
    }

    public void setYear(int birthyear){
        if((Calendar.getInstance().get(Calendar.YEAR)-birthyear)>150){
            System.out.println("The oldest person lived 122 years. You're not older than 150 years!");
            return;
        } else {
            year = birthyear;
        }
    }

    //Getters
    public void getFirstname(){
        System.out.println("The firstname is: "+firstname);
    }
    public void getLastname (){
        System.out.println("The firstname is: "+lastname);
    }

    public void getAge(){
        //Today's date
        /*
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);  //Birth date
        Period p = Period.between(birthday, today); */

/*
        //Alternate working code for calculating years. the code after this is test code using teh Calendar and Time functions of Java
        //+1 because Calendar.MONTH is zero indexed. So adding one will account for zero index.
        int curmonth= Calendar.getInstance().get(Calendar.MONTH)+1;
        int curyear= Calendar.getInstance().get(Calendar.YEAR);
        int temp=curyear-year;
        if(month>curmonth){
            temp--;
        } else {
            age=temp;
        }
*/

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate current = LocalDate.of(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH)+1, Calendar.getInstance().get(Calendar.DAY_OF_MONTH));

        if ((birthDate != null) && (current != null)) {
            age=Period.between(birthDate, current).getYears();
            System.out.println("Age: "+ Period.between(birthDate, current).getYears());
        }

       // System.out.println("The age is: "+age);
    }

    public void getMonth(){
        System.out.println("Birth month is: "+month);
    }
    public void getDay(){
        System.out.println("Birth day is: "+day);
    }
    public void getYear(){
        System.out.println("Birth year is: "+year);
    }

    public void MaxHeartRates(){
        maxheartrate=220-age;
        System.out.println("Max heart rate is: "+maxheartrate);
    }

    public void TargetHeartRate(){
        double target1, target2;
        target1=0.5*maxheartrate;
        target2=0.85*maxheartrate;
        System.out.println("The target heart rate is between: "+target1+" - "+target2);
    }
    public static void main(String[] args){

        //initializing the Scanner!
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstname=input.next();

        System.out.println("Enter your Last Name: ");
        String lastname=input.next();

        System.out.println("Enter your Birth Month: ");
        int month=input.nextInt();

        System.out.println("Enter your Birth Day: ");
        int day=input.nextInt();

        System.out.println("Enter your Birth Year: ");
        int year=input.nextInt();

        HeartRates person1=new HeartRates(firstname,lastname,month,day,year);

        person1.getMonth();
        person1.getDay();
        person1.getYear();
        person1.getAge();
        person1.MaxHeartRates();
        person1.TargetHeartRate();

    }
}