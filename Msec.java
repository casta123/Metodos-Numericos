/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package msec;

import java.text.DecimalFormat;

/**
 *
 * @author casta
 */
public class Msec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double xn0=-1,xn1=0,xn=1;
        int iteraciones=100,i=0;
        DecimalFormat df = new DecimalFormat("0.000000"); 
        System.out.println("n \t\txn \t\tf(xn) ");
        while(i!=iteraciones && f(xn)!=0){
            xn=(xn0*f(xn1)-xn1*f(xn0))/(f(xn1)-f(xn0));      
            System.out.println(i+" \t"+df.format(xn)+" \t"+df.format(f(xn))+" ");
            xn0=xn1;
            xn1=xn;
            i++;
        }
    }
    
    public static double f(double x){
        double r=3*x +Math.sin(x) - Math.exp(x);
        return r;
    }
}
