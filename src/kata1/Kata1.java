package kata1;

import java.util.Date;

public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person pepe = new Person ("Pepe", new Date(86,5,2));
        System.out.println(pepe.getName()+" has "+pepe.getAge()+" años");
                
    }
}
