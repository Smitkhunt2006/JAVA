import java.util.Scanner;

public class lab_2_4 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        double area,radius;
        radius = input.nextDouble();
        area = 3.14 * radius * radius;
        System.out.println("Area of Circle is :" + area);

    }
    
}