import java.util.Scanner;

public class CamputeArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inter tree numbers: " );
        double n1= scanner.nextDouble();
        double n2= scanner.nextDouble();
        double n3= scanner.nextDouble();
        double average=(n1+n2+n3) / 3;
        System.out.println("the average of " + average);

    }
}