import java.util.ArrayList;

public class Employee extends Person{

    private String type;
    private int hours;


    public Employee(String firstName, String lastName, String cpr, String type) {
        super(firstName, lastName, cpr);
        this.type = type;
    }

    public Employee(String firstName, String lastName, String cpr, String type, int hours) {
        super(firstName, lastName, cpr);
        this.type = type;
        this.hours = hours;
    }

    public static void printAll(ArrayList<Person> arrayList){
        System.out.println("FITNESS EMPLOYEES");
        System.out.println("Name\t \t CPR\t \t Hours\t \t Salary\t \t Vacation ");
        System.out.println("********************");
        for(Person e : arrayList){

            if(e.getClass().getTypeName().equals("Employee")){
                System.out.println(e.toString());

            }
        }
        System.out.printf("%n%n");
    }

    @Override  //Her bestemmes timeløn
    public String toString() {
       if(getHours() > 1){
           return    (getFirstName() + " " + getLastName() + "\t \t" + getCpr() + "\t \t" + getHours() + "\t \t" + (getHours()*199) + "\t \t");
       }
       return    (getFirstName() + " " + getLastName() + "\t \t" + getCpr() + "\t \t37\t \t33000\t \t5");
    }


    public int getHours() {
        return hours;
    }
}
