package metodosnumericos;

public class interpolacionLineal {
    
    public void calcularLineal(){
        int x=0;
        double f0, x0;
        double x1, x2, x3, x4;
        int[] numx = {10, 13, 16, 18, 20, 22};
        //int[] numx2 = {0, 0, 0, 0, 0, 0};
        int[] numy = {45, 0, 0, 0, 57, 0};
        double[] numy2 = {45, 0, 0, 0, 57, 0};
        System.out.println(" ");
        System.out.println("Encuentra la recta de interpolación lineal correspondiente a los datos (10, 45) y (20, 57).");
        System.out.println("Determina el valor correspondiente a estos valores");
        System.out.println("Utilizando los puntos iniciales de referencia y utilizando los valores más aproximados.");
        System.out.println(" ");
        System.out.println("X: ");
        for (int i = 0; i < numx.length; i++) {
            System.out.printf(numx[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Y: ");
        for (int z = 0; z < numy.length; z++) {
            System.out.printf(numy[z]+ " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Resultados obtenidos");
        System.out.println(" ");
        f0= numy[0];
        x0= numx[0];
        x1=(f0)+((57-f0)/(20-x0))*(13-10);
        x=numx[1];
        for (int i = 0; i < numy2.length; i++){
            if(numy2[i]==0){
                numy2[i]=x1;
                break;
            }
        }
        System.out.println("X: " + x);
        System.out.println("resultado: " + x1);
        System.out.println(" ");
        f0= numy[0];
        x0= numx[0];
        x2=(f0)+((57-f0)/(20-x0))*(16-10);
        x=numx[1];
        for (int i = 0; i < numy2.length; i++){
            if(numy2[i]==0){
                numy2[i]=x2;
                break;
            }
        }
        x=numx[2];
        System.out.println("X: " + x);
        System.out.println("resultado: " + x2);
        System.out.println(" ");
        f0= numy[0];
        x0= numx[0];
        x3=(f0)+((57-f0)/(20-x0))*(18-10);
        x=numx[3];
        for (int i = 0; i < numy2.length; i++){
            if(numy2[i]==0){
                numy2[i]=x3;
                break;
            }
        }
        System.out.println("X: " + x);
        System.out.println("resultado: " + x3);
        System.out.println(" ");
        f0= numy[0];
        x0= numx[0];
        x4=(f0)+((57-f0)/(20-x0))*(22-10);
        x=numx[4];
        for (int i = 0; i < numy2.length; i++){
            if(numy2[i]==0){
                numy2[i]=x4;
                break;
            }
        }
        System.out.println("X: " + x);
        System.out.println("resultado: " + x4);
        System.out.println(" ");
        System.out.println("Resultado final");
        for (int i = 0; i < numy2.length; i++) {
            System.out.printf(numy2[i] + " ");
        }
        System.out.println(" ");
    }
}
