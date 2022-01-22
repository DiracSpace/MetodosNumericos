package metodosnumericos;

public class Jaobi {
    public void metodoJ(){
        
        int x1= 17, x2=-2, x3=-3;
        int x4=-5, x5=21, x6=-2;
        int x7=-5, x8=-5, x9=22;
        int a=500, b=200, c=30;
        double resultado1=0, resultado2=0, resultado3=0;
        double resultado1a=0, resultado2a=0, resultado3a=0;
        double porcentual1=0, porcentual2=0, porcentual3=0;
        double aux=0, aux2=0, aux3=0;
        System.out.println("Resultados: ");
        System.out.println(" ");
        for (int i = 1; i < 17; i++) {
            resultado1=((a-(x2*resultado2)-(x3*resultado3))/17);
            System.out.println("X1 de la iteración "+i+": "+resultado1);
            resultado2=((b-(x4*resultado1)-(x6*resultado3))/21);
            System.out.println("X2 de la iteración "+i+": "+resultado2);
            resultado3=((c-(x7*resultado1)-(x8*resultado2))/22);
            System.out.println("X3 de la iteración "+i+": "+resultado3);
            if(i%3==1){
                aux=resultado1;
                aux2=resultado2;
                aux3=resultado3;
            }
            if(i%2==0){
                resultado1a = resultado1;
                resultado2a=resultado2;
                resultado3a=resultado3;
                porcentual1 = ((resultado1a-aux)/resultado1a)*100;
                porcentual2 = ((resultado2a-aux2)/resultado2a)*100;
                porcentual3 = ((resultado3a-aux3)/resultado3a)*100;
                System.out.println("Porcentaje de error X1 en iteración" + i + " es: " + porcentual1);
                System.out.println("Porcentaje de error X2 en iteración " + i + " es: " + porcentual2);
                System.out.println("Porcentaje de error X3 en iteración " + i + " es: " + porcentual3);
                System.out.println(" ");
            }
        }
    }
}
