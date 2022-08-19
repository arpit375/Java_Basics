import java.util.Scanner;

public class PrintfFormatting {
    public static void main(String[] args) {
        System.out.println("Enter your name, age, salary and initials");
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        int age= sc.nextInt();
        double salary= sc.nextDouble();
        char initial= sc.next().charAt(0);

        System.out.printf("%s is the name, ", name);
        System.out.printf("%d is years old, ", age);
        System.out.printf("%,.2f$ is the salary and ",salary);
        System.out.printf("%c is his first name initial",initial);
    }
}
