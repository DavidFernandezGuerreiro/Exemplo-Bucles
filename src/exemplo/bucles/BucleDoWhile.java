
package exemplo.bucles;

import java.util.Scanner;
public class BucleDoWhile {
    int i=0, aSuma=0, aProducto=1, num;
    Scanner sc=new Scanner (System.in);
    public void calcularDoWhile(){
        do{
            System.out.println("Introducir numero : ");
            num=sc.nextInt();
            aSuma=aSuma+num;
            aProducto=aProducto*num;
            i++;
        }while(i<7);
        System.out.println(" Suma = "+aSuma+" Producto = "+aProducto);
   
    }
    
}
