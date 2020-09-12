import java.util.ArrayList;

public class Member extends Person {
    private String type;


    public Member(String firstName, String lastName, String cpr, String type) {
        super(firstName, lastName, cpr);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static void printAll(ArrayList<Person> arrayList){
        System.out.println("FITNESS MEMBERS");
        System.out.println("Name\t \t CPR\t \t Member type\t \t Fee");
        System.out.println("********************");
        for(Person e : arrayList){
            if(e.getClass().getTypeName().equals("Member")){
                System.out.println(e.toString());
            }
        }
        System.out.printf("%n%n");
    }

    @Override
    public String toString() {
        if(getType().equals("Basic")){
            return (getFirstName() + " " + getLastName() + "\t \t" + getCpr() + "\t \t" + "Basic\t \t 199");
        }

        return (getFirstName() + " " + getLastName() + "\t \t" + getCpr() + "\t \tFull\t \t 299");
    }
}
