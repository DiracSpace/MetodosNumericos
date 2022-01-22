package metodosnumericos;

public class SplineLineal {
    int[] arrayi= {0,1};
    int[] arrayx= {9,8};
    int[] arrayy= {-9, -5};
    int soX=0, a, b;
    
    public void calcular(){
        soX= (-9+((-5-(-9))/(8-9))*(1-9));
        a=arrayx[0];
        b=arrayx[1];
        System.out.println(" ");
        System.out.println("Arreglo i");
        for (int i = 0; i < arrayi.length; i++) {
            System.out.printf(+arrayi[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Arreglo x");
        for (int i = 0; i < arrayx.length; i++) {
            System.out.printf(arrayx[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Arreglo y");
        for (int i = 0; i < arrayy.length; i++) {
            System.out.printf(arrayy[i]+" ");
        }
        System.out.println(" ");
        System.out.println("El valor es: " + soX + "x");
        System.out.println("X∈["+a+","+b+"]");
        System.out.println(" ");
    }
    
}
