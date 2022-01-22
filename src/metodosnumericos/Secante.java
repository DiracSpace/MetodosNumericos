
package metodosnumericos;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Secante {
    
    static Scanner x=new Scanner(System.in);
    
    static DecimalFormat df = new DecimalFormat("####.####");
    static DecimalFormat df2 = new DecimalFormat("####.##%");
    
    static public double operacion(double x){
        return (x*x*x)-x-1;
    }
    public static void main(String[] args) 
    {
        double X0=0, X1=0, X2=0;
        System.out.println("Ingresa tu x0");
        X0=x.nextDouble();
        System.out.println("Ingresa tu x1");
        X1=x.nextDouble();
        X2= X1-(operacion(X1)*(X1-X0))/((operacion(X1)-operacion(X0))); //FORMULA DE LA SENCANTE
        System.out.println("Tu X0: " + X0);
        System.out.println("Tu X1: " + X1);
        System.out.println("El resultado es: " + df.format(X2));
    }
}
