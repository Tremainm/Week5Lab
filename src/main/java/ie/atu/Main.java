package ie.atu;

public class Main {
    public static void main(String[] args) {
        Person student1 = new Person("Paul","Lennon",18);
        System.out.println("Details are: " + student1.getFirstName());
        student1.displayInfo();

        Person student2 = new Person();

        student2.getUserInput();

        student2.displayInfo();
    }
}