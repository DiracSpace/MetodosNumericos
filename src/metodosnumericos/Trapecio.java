package metodosnumericos;


public class Trapecio {
    int n=3;
    double increx, multi=0, funcion, x=0, resultado=0;
    double res1=0, res2=0, res3=0, res4=0;
    
    public void Calcular(double a, double b){
        increx =((b-a)/n);
        multi = ((b-a)/(2*n));
        System.out.println(" ");
        System.out.println("∆x: " + increx);
        System.out.println("Resultado a multiplicar: " + multi);
        System.out.println(" ");
        for (int i = 0; i <= n; i++) {
            funcion=((Math.pow(x, 2))-3);
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
            x=x+increx;   
        }
        resultado=((res1)+((2*res2)+2*(res3))+(res4));
        resultado=multi*resultado;
        System.out.println(" ");
        System.out.println("El resultado es: " + resultado);
        System.out.println(" ");
        System.out.println("***********DIRACSPACE***************");
    }
}
