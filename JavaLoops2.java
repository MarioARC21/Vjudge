import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
            
            int q = scan.nextInt();//Numero de querys
            
            for(int i = 1 ; i <= q ; i++ ){
                int a = scan.nextInt();//Numero de a
                int b = scan.nextInt();//Numero de b
                int n = scan.nextInt();//Numero de repeticiones
                
                int valorInicial=a;
                String sumatoria = "";
                
                for(int i2 = 0;i2 < n; i2++){
                    int valorPotencia = 0;
                    valorPotencia = (int) Math.pow(2, i2) * b;
                    valorInicial+=valorPotencia;
                    sumatoria += (valorInicial + " ");
                }
                System.out.println(sumatoria);
            }
            
            
        }
		
    }


