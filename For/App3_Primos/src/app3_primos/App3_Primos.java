/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app3_primos;

/**
 *
 * @author Daniel C
 */
public class App3_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new ventana().setVisible(true);

        int i, j;
        boolean esPrimo;
        int rInicial = 2;//Rango inicial, este debe ser mayor de 1.
        int rFinal = 200;//Rango final.
        for (i = rInicial; i <= rFinal; i++) {
            //recorro ciclo tantas veces como necesite(<= es para incluir el valor de rFinal).
            esPrimo = true;// i es primo hasta que se demuestre lo contrario, jejejejeje.
            for (j = 2; j < i; j++) {
                //no coloque j = 1 porque ya sabemos que todo numero es divisible por 1.
                /*j < i es para no incluir el numero a evaluar, pues todo numero es divisible
       por si mismo.*/
                if (i % j == 0) {//Si además del 1 y el mismo hay otro divisor, ya no es primo.
                    //% devuelve el residuo de i/j
                    esPrimo = false;//se demostró que i no es primo.
                }
            }
            if (esPrimo) {//Si es primo lo imprimo.
                System.out.println(i + "\n");
            }
        }
    }
}

