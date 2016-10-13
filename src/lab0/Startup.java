package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {
        Employee emp;
        try{
            emp = new Employee("Ja$cob","Smith","123%45-67%89",38);
            // Think about this code. It wouldn't work if lastName was null
            String fullNameInCaps = emp.fullNameInCaps();
            

        }catch (IllegalArgumentException iae){
            System.out.println(iae.toString());
            emp = new Employee();
        }
            System.out.println("First Name " + emp.getFirstName());
            System.out.println("Last Name " + emp.getLastName());
            System.out.println("SSN "  + emp.getSsn());
            System.out.println("Vacation Days " + emp.getDaysVacation());
        

        
    }
}
