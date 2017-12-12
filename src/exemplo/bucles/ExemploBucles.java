
package exemplo.bucles;

/**
 *
 * @author dfernandezguerreiro
 */
import java.util.Scanner;
public class ExemploBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op;
        System.out.println("****MENU****\n 1.-BucleWhile  2.-BucleDoWhile  3.-BucleFor");
        op=sc.nextInt();
        switch(op){
            case 1: BucleWhile obxWhile=new BucleWhile();
                    obxWhile.calcularWhile();
                    break;
            case 2: BucleDoWhile obxDoWhile=new BucleDoWhile();
                    obxDoWhile.calcularDoWhile();
                    break;
            case 3: BucleFor obxFor=new BucleFor();
                    obxFor.calcularFor();
                    break;
            default: System.out.println("* OPCIÓN INCORRECTA *");
        }


        //while
        //BucleWhile obxWhile=new BucleWhile();
        //obxWhile.calcularWhile();
        
        //do while
        //BucleDoWhile obxDoWhile=new BucleDoWhile();
        //obxDoWhile.calcularDoWhile();
        
        //for
        //BucleFor obxFor=new BucleFor();
        //obxFor.calcularFor();
    }
    
}
