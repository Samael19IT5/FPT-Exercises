import java.util.Scanner;

public class Person implements PersonExample {
    protected String id;
    protected String name;
    protected int age;

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void input() {
        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        setId(scanner.nextLine());
        System.out.print("Name: ");
        setName(scanner.nextLine());
        System.out.print("Age: ");
        setAge(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public void display() {
        System.out.println("Display: ");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}
