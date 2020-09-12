import java.util.ArrayList;

public class Person  {
    private String firstName;
    private String lastName;
    private String cpr;

    public Person(String firstName, String lastName, String cpr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpr = cpr;
    }


    public static void printAll(ArrayList<Person> arrayList){
        System.out.println("EMPLOYEES & MEMBERS");
        System.out.println("Name\t \t CPR");
        System.out.println("********************");
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).firstName + " " + arrayList.get(i).lastName + "\t \t" + arrayList.get(i).cpr);
        }
        System.out.printf("%n%n");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCpr() {
        return cpr;
    }
}
