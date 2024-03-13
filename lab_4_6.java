import java.util.Scanner;

public class lab_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = args[0];
        char ch = 'A';
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
            System.out.println("The string is already in uppercase.");

        }
        else{
            System.out.println("Error 404 not found");
        }
    }
}
