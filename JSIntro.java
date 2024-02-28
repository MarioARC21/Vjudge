import java.util.Scanner;

public class JSIntro{

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        int a = s1.length() + s2.length();
        
        String output1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String output2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);

        System.out.println(a);
        System.out.println(output1 + " " + output2);
        
        
    }
}
