package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {
        Employee emp;
        try{
            emp = new Employee("","Smith","123%45-67%89",38);
            // Think about this code. It wouldn't work if lastName was null
            String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
            
            System.out.println("First Name " + emp.getFirstName());
            System.out.println("Last Name " + emp.getLastName());
            System.out.println("SSN "  + emp.getSsn());
            System.out.println("Vacation Days " + emp.getDaysVacation());
        }catch (IllegalArgumentException iae){
            System.out.println(iae.toString());
        }
        
        

        
    }
}
