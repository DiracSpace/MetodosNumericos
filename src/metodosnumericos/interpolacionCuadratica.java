package metodosnumericos;

public class interpolacionCuadratica {
    public void IC(){
        System.out.println(" ");
        double[] tiempo={3, 5, 6.5, 8};
        double peso[]={8, 22, 0, 73};
        double x=tiempo[2];
        double x1, x0, divisionx;
        double f1, f0, divisiony;
        double funciontotal;
        double p2, resultado;
        System.out.println("Tablas: ");
        System.out.println(" ");
        System.out.println("Tiempo");
        for (int i = 0; i < tiempo.length; i++) {
            System.out.printf(tiempo[i]+ " ");
        }
        System.out.println(" ");
        System.out.println("Peso");
        for (int i = 0; i < peso.length; i++) {
            System.out.printf(peso[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Resultados: ");
        System.out.println("X: " + x);
        f1=peso[1];
        f0=peso[0];
        x1=tiempo[1];
        x0=tiempo[0];
        divisionx= ((f1-f0)/(x1-x0));
        f0=peso[3];
        x0=tiempo[3];
        divisiony= ((f0-f1)/(x0-x1));
        funciontotal=((divisiony-divisionx)/(8-3));
        p2=8+(divisionx)*(6.5-3)+2*(6.5-3)*(6.5-5);
        System.out.println(" ");
        System.out.println("F[X0,X1]: " + divisionx);
        System.out.println("F[X1,X2]: " + divisiony);
        System.out.println("Función P2: " + p2);
        System.out.println(" ");
        System.out.println("Tabla Peso final: ");
        for (int i = 0; i < peso.length; i++) {
            if(peso[i]==0){
                peso[i]=p2;
            }
        }
        for (int i = 0; i < peso.length; i++) {
            System.out.printf(peso[i]+" ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
