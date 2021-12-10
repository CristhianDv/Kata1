package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Person holbey = new Person("Holbey", new Date(99,5,21));
        System.out.println(holbey.getName() + " tiene " + holbey.getAge());
    }
    
}