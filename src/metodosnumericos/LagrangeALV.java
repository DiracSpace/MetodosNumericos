package metodosnumericos;

public class LagrangeALV {

    private int y[];
    private int x[];
    private int a[];

    public LagrangeALV(int y[], int x[]) {
        this.x = x;
        this.y = y;
        a = new int[x.length];
    }
    private void getPolinomios_a() {
        int mult;
        
        for (int i = 0; i < y.length; i++) {
            mult = 1;
            for (int j = 0; j < x.length; j++) {
                if (i == j) {
                    continue;
                }
                mult = (x[i] - x[j]) * mult;
            }
            a[i] = y[i] / mult;
        }
    }
    public double getResultadoP(int p) {
        getPolinomios_a();

        int mult = 1;
        int valores[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            mult = 1;
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    continue;
                }
                mult = (p - x[j]) * mult;
            }
            valores[i] = a[i] * mult;
        }
        int resultado = 0;
        for (int k = 0; k < valores.length; k++) {
            resultado = resultado + valores[k];
        }
        return resultado;
    }
}