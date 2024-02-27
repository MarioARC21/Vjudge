import java.util.Scanner;

public class JavaLoops {

    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();

            for (int i = 1; i <= 10; i++) {
            int b = a * i;
            System.out.println(a + " x " + i + " = " + b);
            
        }
    }

}
