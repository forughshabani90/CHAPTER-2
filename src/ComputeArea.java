import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inter a number for radius");
        double radius = scanner.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println(" the area for the circle of radius " + radius + "is" + area);


    }
}
