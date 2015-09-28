import java.util.Scanner;

public class Pave {
        public static void main (String[] arg){

        double x;
        double y;
        double z;
        double v;

        Scanner scan=new Scanner(System.in);
        
        System.out.println("x?");
        x=scan.nextDouble();
        while(x<0){
                System.out.println("Vérifier que x est positif");
                System.out.println("x?");
                x=scan.nextDouble();
        }
        System.out.println("y?");
        y=scan.nextDouble();
          while(y<0){
                System.out.println("Vérifier que y est positif");
                System.out.println("y?");
                y=scan.nextDouble();
        }
        System.out.println("z?");
        z=scan.nextDouble();
          while(z<0){
                System.out.println("Vérifier que z est positif");
                System.out.println("z?");
                z=scan.nextDouble();
        }
        

        v=x*y*z;
        System.out.println("Le Volume d'un cube tel que: x="+x+"y="+y+"z="+z+"est:"+v+"cm3");
                 

        }
       

}                                                                                                                                                                     
