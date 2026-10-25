/**
 * COMP 182 - Hashing
 * Slides 33, 36, 38
 * Classical estimates require 0 <= alpha < 1 and idealized assumptions; prefix counts are possibilities, not observed key counts.
 */
import java.util.Locale;
public class HashAnalysisExamples {
    static double successful(double alpha){return 0.5*(1+1/(1-alpha));}
    static double unsuccessful(double alpha){return 0.5*(1+1/((1-alpha)*(1-alpha)));}
    public static void main(String[] args) {
        for(double alpha:new double[]{0.50,0.75,0.90})
            System.out.printf(Locale.US,"%.2f %.2f %.2f%n",alpha,successful(alpha),unsuccessful(alpha));
        int[] counts=new int[40];
        for(int prefix=0;prefix<100;prefix++)counts[prefix%40]++;
        int first=0,second=0;
        for(int i=0;i<40;i++)if(i<20)first+=counts[i];else second+=counts[i];
        System.out.println("Possible prefixes: "+first+" / "+second);
    }
}
