package kata1;

import java.time.LocalDate;

public class Kata1 {
    
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(2000, 10, 24);
        Person holbey = new Person("Holbey", nacimiento);
        System.out.println(holbey.getName() + " tiene " + holbey.getAge() + " años");
    }
    
}