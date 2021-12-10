package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2000, 6, 21);
        Person holbey = new Person("Holbey", date);
        System.out.println(holbey.getName() + " tiene " + holbey.getAge() + " años");
    }
    
}