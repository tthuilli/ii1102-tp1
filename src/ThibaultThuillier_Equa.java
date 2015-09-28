import java.util.Scanner;

public class Equa {
        public static void main (String[] arg){

        double a;
        double b;
        double c;
        double d;
        double x1;
        double x2;
        double racined;

        System.out.println("a*X^2+b*X+c");
        Scanner scan=new Scanner(System.in);
        System.out.println("a?");
        a=scan.nextDouble();

        System.out.println("b?");
        b=scan.nextDouble();

        System.out.println("c?");
        c=scan.nextDouble();

        d=b*b-4*a*c;
        System.out.println("Delta est égal à:"+d);

        if(d<0){
            System.out.println("Il n'y a aucune solution à cette équation");
        }
        else if(d==0){
            x1=(-b)/(2*a);
            System.out.println("Il y a une solution:");
            System.out.println("x="+x1);
        }
        else{
            racined=Math.pow(d,0.5);
            x1=(-b-racined)/(2*a);
            x2=(-b+racined)/(2*a);
            System.out.println("Il a deux solutions:");
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);

        }
       }
}                                                                                                                                                                     
