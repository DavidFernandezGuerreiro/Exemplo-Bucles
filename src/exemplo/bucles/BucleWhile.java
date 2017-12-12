
package exemplo.bucles;

import java.util.Scanner;
public class BucleWhile {
    
    public void calcularWhile(){
        int i=0, acuSuma=0, acuProducto=1, num;
        Scanner sc=new Scanner (System.in);
        while(i<7){
            System.out.println("Introducir numero : ");
            num=sc.nextInt();
            acuSuma=acuSuma+num;
            acuProducto=acuProducto*num;
            ++i;
        }
        System.out.println("Suma = "+acuSuma+" Producto= "+acuProducto);
        
    }
}
