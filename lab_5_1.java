import java.util.Scanner;

    public class lab_5_1 {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.areaOfCircle();
        c1.printDetail();
        Circle c2 = new Circle(20);
        c2.printDetail();
        Circle c3 = new Circle();
        c3.printDetail();
 
    }
}
class Circle{
    //properties
    int radius;
     
    //default constructor
    public Circle(){
        this.radius = 10;
    }
    
    //parameterised constructor
    public Circle(int radius){
        this.radius = radius;
    }

    //methods

    //find area 
    public double areaOfCircle(){
        return 3.14*radius*radius;
    }

    //get details from user
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        this.radius = sc.nextInt();
        sc.close();
    }

    //print details
    public void printDetail(){
        System.out.println("Radius : "+this.radius);
    }

}

