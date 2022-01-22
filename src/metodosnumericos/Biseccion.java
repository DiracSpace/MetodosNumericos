/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;


public class Biseccion {

    public float a, xm, b;

    public Biseccion(float a1, float b1) {
        a = a1;
        b = b1;
    }

    public float f(float x) {
        float y;
        y = (x * x) - 5;
        return (y);
    }

    public float prom(float a, float b) {
        xm = (a + b) / 2;
        return (xm);
    }
}
