package metodosnumericos;

import java.text.DecimalFormat;

public class Simpson {
    
    public void UnTercio(double c, double d){
        int n=3;
        double increx, multi=0, funcion, x=0, resultado=0;
        double res1=0, res2=0, res3=0, res4=0;
        System.out.println(" ");
        System.out.println("Método 1/3");
        increx =((d-c)/n);
        multi = ((d-c)/(3*n));
        DecimalFormat fc = new DecimalFormat("#.00");
        DecimalFormat fd = new DecimalFormat("#.000");
        System.out.println(" ");
        System.out.println("El ∆x es:"+fc.format(increx));
        System.out.println("El dígito a multiplicar es: "+fd.format(multi));
        System.out.println(" ");
        for (int i = 0; i <= n; i++) {
            funcion=((Math.pow(x, 2))-3);
            System.out.println("f("+x+")= " + funcion);
            if(i==1){
                res2=funcion;
            }
            if(i==2){
                res3=funcion;
            }
            if(i==3){
                res4=funcion;
            }
            x=x+increx;   
        }
        System.out.println(" ");
        System.out.println("Valores tomados en el cálculo");
        System.out.println("f(0.5)= " + res2);
        System.out.println("f(1.0)= " + res3);
        System.out.println("f(1.5)= " + res4);
        resultado=(res4+(2*res3)+(res2));
        resultado=multi*resultado;
        System.out.println(" ");
        DecimalFormat fr = new DecimalFormat("#.0");
        System.out.println("El resultado es: " + fr.format(resultado));
        System.out.println(" ");
        System.out.println("***********DIRACSPACE***************");
    }
    public void TresOctavos(double e, double f){
        int n=4;
        double increx, multi=0, funcion, x=0, resultado=0;
        double res1=0, res2=0, res3=0, res4=0, res5=0;
        DecimalFormat fn = new DecimalFormat("#.00");
        DecimalFormat fn2 = new DecimalFormat("#.000");
        System.out.println(" ");
        System.out.println("Método 3/8");
        increx =((f-e)/n);
        multi = ((3*increx)/(8*n));
        DecimalFormat fc = new DecimalFormat("#.00");
        DecimalFormat fd = new DecimalFormat("#.00");
        System.out.println(" ");
        System.out.println("El ∆x es: "+fc.format(increx));
        System.out.println("El dígito a multiplicar es: "+fd.format(multi));
        System.out.println(" ");
        for (int i = 0; i <= n; i++) {
            funcion=(1/(Math.sqrt(1+(Math.pow(x, 2)))));
            System.out.println("f("+x+")= " + funcion);
            if(i==0){
                res1=funcion;
            }
            if(i==1){
                res2=funcion;
            }
            if(i==2){
                res3=funcion;
            }
            if(i==3){
                res4=funcion;
            }
            if(i==4){
                res5=funcion;
            }
            x=x+increx;   
        }
        System.out.println(" ");
        System.out.println("Valores tomados en el cálculo");
        System.out.println("f(0.0)= " + fn.format(res1));
        System.out.println("f(0.25)= " + fn.format(res2));
        System.out.println("f(0.50)= " + fn.format(res3));
        System.out.println("f(0.75)= " + fn.format(res4));
        System.out.println("f(1.0)= " + fn2.format(res5));
        resultado=(res1+((3*res2)+(2*res3)+(3*res4))+res5);
        resultado=multi*resultado;
        System.out.println(" ");
        System.out.println("El resultado es: " + fn.format(resultado));
        System.out.println(" ");
        System.out.println("***********DIRACSPACE***************");
    }
}
