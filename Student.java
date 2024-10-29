import java.util.Scanner;

public class Student {
    String name;
    int age;
    char grade;
    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student :");
        name = sc.nextLine();
        System.out.println("Enter the age of the student :");
        age = sc.nextInt();
        System.out.println("Enter the grade of the student :");
        grade =sc.next().charAt(0);
        sc.close();
    }
    void displayData() {
        System.out.println("The name is - "+name);
        System.out.println("The age is - "+age);
        System.out.println("The grade is - "+grade);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.readData();
        s1.displayData();
    }
}
