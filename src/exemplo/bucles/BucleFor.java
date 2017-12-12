
package exemplo.bucles;

import java.util.Scanner;
public class BucleFor {
    int aSum=0, aPro=1, num;
    Scanner sc=new Scanner (System.in);
    
    public void calcularFor(){
        System.out.println(" TECLEA 7 NUMEROS :");
        for(int i=0; i<7;i++){
            System.out.println("Introducir numero : ");
            num=sc.nextInt();
            aSum+=num;
            aPro*=num;
        }
        System.out.println(" Suma..."+aSum+" Producto..."+aPro);
    }
    
}
