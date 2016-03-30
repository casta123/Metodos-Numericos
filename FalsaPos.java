/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package falsapos;

import java.text.DecimalFormat;

/**
 *
 * @author casta
 */
public class FalsaPos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double an=-2,bn=0,xn=1;
        int iteraciones=100,i=0;
        DecimalFormat df = new DecimalFormat("0.000000"); 
        System.out.println("n \tan \t\tbn \t\txn \t\tf(xn) ");
        while(i!=iteraciones ){
            xn=(an*f(bn)-bn*f(an))/(f(bn)-f(an));        
            System.out.println(i+" \t"+df.format(an)+" \t"+df.format(bn)+" \t"+df.format(xn)+" \t"+df.format(f(xn))+" ");
            if((f(an)*f(xn))<0){
                bn=xn;
            }else{
                an=xn;
            }
                  
            i++;
        }
    }
    
        public static double f(double x){
        double r=3*x +Math.sin(x) - Math.exp(x);
        return r;
    }
}


