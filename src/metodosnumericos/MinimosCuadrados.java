package metodosnumericos;

import java.text.DecimalFormat;

public class MinimosCuadrados {
    static DecimalFormat df = new DecimalFormat(".##");
    static DecimalFormat df2 = new DecimalFormat(".##");
    static DecimalFormat df3 = new DecimalFormat(".##");
    
    public void calcular(double x, double y, double xy, double xcuadradoalv, double numerodedatosalv){
        double m, b, xtotal;
        m=((xy-((x*y)/8))/(xcuadradoalv-((Math.pow(x, 2))/numerodedatosalv)));
        b=((y/numerodedatosalv)-(m*(x/numerodedatosalv)));
        xtotal=b/m;
        
        System.out.println("**Datos obtenidos**");
        System.out.println("Suma de X: " + x);
        System.out.println("Suma de Y: " + y);
        System.out.println("Suma de X por Y: " + xy);
        System.out.println("Suma de X al cuadrado: " + xcuadradoalv);
        System.out.println("**Resultados**");
        System.out.println("Su M es: " + df.format(m));
        System.out.println("Su B es: " + df2.format(b));
        System.out.println("Su X es: " + df3.format(xtotal));
    }
}
