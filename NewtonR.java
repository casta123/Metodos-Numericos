/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newtonr;

import java.text.DecimalFormat;

/**
 *
 * @author casta
 */
public class NewtonR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double xn=1;
        int iteraciones=100,i=0;
        DecimalFormat df = new DecimalFormat("0.000000"); 
        System.out.println("n \t\txn \t\tf(xn) ");
        while(i!=iteraciones && f(xn)!=0){
            xn-= f(xn)/df(xn);       
            System.out.println(i+" \t"+df.format(xn)+" \t"+df.format(f(xn))+" ");
               
            i++;
        }
    }
    
    public static double f(double x){
        double r=3*x +Math.sin(x) - Math.exp(x);
        return r;
    }
    
    public static double df(double x){
        double r= 3+ Math.cos(x)-Math.exp(x);
        return r;
    }
    
}
