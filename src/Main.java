import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayList<Person> list = new ArrayList<Person>();

        Member mobj1 = new Member("Ole", "Raket", "2306925863", "Full");
        Member mobj2 = new Member("Rikke", "Holmesen", "1010201404", "Basic");
        Member mobj3 = new Member("Hans", "Ostesen", "0502205241", "Basic");
        Member mobj4 = new Member("Emil", "Ghidotti", "1005209343", "Full");

        Employee eobj1 = new Employee("Frank", "Hvam", "2412656833", "Instructor", 40);
        Employee eobj2 = new Employee("Jenny", "Hallo","0611789282", "Administrator");
        Employee eobj3 = new Employee("Lars", "Larsen", "3009905213", "Instructor", 15);
        Employee eobj4 = new Employee("Casper", "Christensen","2207655555", "Administrator");

        list.add(mobj1);
        list.add(mobj2);
        list.add(mobj3);
        list.add(mobj4);

        list.add(eobj1);
        list.add(eobj2);
        list.add(eobj3);
        list.add(eobj4);

        boolean running = true;

        while(running){
            System.out.printf("Press 1 to view employees %nPress 2 to view members %nPress 3 to view employees and members%n");
            int input = console.nextInt();
            switch(input){
                case 1:
                    Employee.printAll(list);
                    break;
                case 2:
                    Member.printAll(list);
                    break;
                case 3:
                    Person.printAll(list);
                    break;

            }
        }

    }
}
