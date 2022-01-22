package metodosnumericos;

import java.util.Scanner;

public class MetodosNumericos {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        
        int respuesta;
        double a=0, b=1.5;
        double c=0, d=1.5;
        double e=0, f=1;
        
        Trapecio obj = new Trapecio();
        Simpson obj2 = new Simpson();
        interpolacionLineal obj3 = new interpolacionLineal();
        interpolacionCuadratica obj4 = new interpolacionCuadratica();
        Jaobi obj5 = new Jaobi();
        Secante obj6 = new Secante();
        MinimosCuadrados obj7 = new MinimosCuadrados();
        SplineLineal obj8 = new SplineLineal();
        
        
        System.out.println(" ");
        System.out.println("********DIRACSPACE********");
        System.out.println("¿Qué algoritmo desea usar?");
        do{
            System.out.println("1- Método Trapecio");
            System.out.println("2- Método Simpson");
            System.out.println("3- Método de Interpolación Lineal");
            System.out.println("4- Metodo de Interpolacion Cuadratica");
            System.out.println("5- Método Jacobi");
            System.out.println("6- Método Secante");
            System.out.println("7- Método de Mínimos Cuadrados");
            System.out.println("8- Metodo de Lagrange");
            System.out.println("9- Metodo de Biseccion");
            System.out.println("10- Metodo de Spline Linea");
            
            respuesta=Leer.nextInt();
            
            switch(respuesta){
                case 1:
                    System.out.println(" ");
                    System.out.println("Método de Trapecio");
                    System.out.println("Su Límite Inferior (A) es: " + a);
                    System.out.println("Su Límite Superior (B) es: " + b);
                    obj.Calcular(a, b);
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Método de Simpson");
                    int respuesta2;
                    System.out.println("1- (1/3)");
                    System.out.println("2- (3/8)");
                    respuesta2=Leer.nextInt();
                    switch(respuesta2){
                        case 1:
                            System.out.println(" ");
                            System.out.println("1/3");
                            System.out.println("Su Límite Inferior (A) es: " + c);
                            System.out.println("Su Límite Superior (B) es: " + d);
                            obj2.UnTercio(c, d);
                            break;
                        case 2:
                            System.out.println(" ");
                            System.out.println("3/8");
                            System.out.println("Su Límite Inferior (A) es: " + e);
                            System.out.println("Su Límite Superior (B) es: " + f);
                            obj2.TresOctavos(e, f);
                            break;
                    }
                case 3:
                    System.out.println(" ");
                    System.out.println("Método de Interpolación Lineal");
                    obj3.calcularLineal();
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Metodo de Interpolacion Cuadratica");
                    obj4.IC();
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("Metodo Jacobi");
                    obj5.metodoJ();
                    break;
                case 6:
                    System.out.println(" ");
                    System.out.println("Metodo Secante");
                    obj6.main(args);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 7:
                    double x, y, xy, xcuadradoalv,numerodedatosalv;
                    System.out.println(" ");
                    System.out.println("Metodo de Minimos Cuadrados");
                    System.out.println(" ");
                    System.out.println("Ingrese su suma de X: ");
                    x=Leer.nextDouble();
                    System.out.println("Ingrese su suma de Y: ");
                    y=Leer.nextDouble();
                    System.out.println("Ingrese su suma de X por Y: ");
                    xy=Leer.nextDouble();
                    System.out.println("Ingres su suma de X al cuadrado: ");
                    xcuadradoalv=Leer.nextDouble();
                    System.out.println("Ingrese el numero de datos: ");
                    numerodedatosalv=Leer.nextDouble();
                    obj7.calcular(x, y, xy, xcuadradoalv, numerodedatosalv);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 8:
                    System.out.println(" ");
                    System.out.println("Metodo de Lagrange");
                    int arrayx[] = {5, 7, 11, 13, 17};
                    int arrayy[] = {150, 392, 1452, 2366, 5202};
                    LagrangeALV l = new LagrangeALV(arrayy, arrayx);
                    double res = l.getResultadoP(9);
                    System.out.println("Arreglo X: ");
                    for (int i = 0; i < arrayx.length; i++) {
                        System.out.printf(arrayx[i]+" ");
                    }
                    System.out.println(" ");
                    System.out.println("Arreglo Y: ");
                    for (int i = 0; i < arrayy.length; i++) {
                        System.out.printf(arrayy[i]+" ");
                    }
                    System.out.println("\nEl resultado es " + res);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 9:
                    System.out.println(" ");
                    int i,it;
                    i = 0;
                    it = 30;
                    float a1 = 0, b1 = 3, fa, fb, r, fr;
                    System.out.println("Metodo Biseccion");
                    Biseccion raiz = new Biseccion(a1, b1);
                    r = raiz.prom(a1, b1);
                    while (i < it) {
                        fa = raiz.f(a1);
                        fb = raiz.f(b1);
                        fr = raiz.f(r);
                        if ((fa * fr) < 0) {
                            raiz.b = r;
                        } else if ((fb * fr) < 0) {
                            raiz.a = r;
                        }
                        r = raiz.prom(raiz.a, raiz.b);
                        System.out.println("Nueva raiz Xm= " + r + "\tf(x)= " + raiz.f(r));
                        i++;
                    }
                    System.out.println("Solucion r=" + r);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 10:
                    System.out.println(" ");
                    System.out.println("Metodo de Spline Lineal");
                    obj8.calcular();
                    break;
            }
        }while(respuesta!=11);
    }
}

          