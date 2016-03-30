
package biseccion;
import java.math.*;
import java.text.DecimalFormat;

/**
 *
 * @author casta
 */
public class Biseccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double an=-2,bn=2,xn=1;
        int iteraciones=100,i=0;
        DecimalFormat df = new DecimalFormat("0.000000"); 
        System.out.println("n \tan \t\tf(an) \t\tbn \t\tf(bn) \t\txn \t\tf(xn) ");
        while(i!=iteraciones && funcion(xn)!=0){
            xn=(an+bn)/2;        
            System.out.println(i+" \t"+df.format(an)+"\t"+df.format(funcion(an))+" \t"+df.format(bn)+" \t"+df.format(funcion(bn))+" \t"+df.format(xn)+" \t"+df.format(funcion(xn))+" ");
            if((funcion(an)*funcion(xn))<0){
                bn=xn;
            }else{
                an=xn;
            }
                  
            i++;
        }
        
    }
    
    public static double funcion(double x){
        double r=3*x +Math.sin(x) - Math.exp(x);
        return r;
    }
}
