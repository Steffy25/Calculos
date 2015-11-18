/*3.En una tienda de descuento las personas que van a pagar el importe de su compra 
llegan a la caja y sacan una bolita de color, que les dirá que descuento tendrán 
sobre el total de su compra.Determinar la cantidad que pagara cada cliente desde que 
la tienda abre hasta que cierra. Se sabe que si el color de la bolita es roja el 
cliente obtendrá un 40% de descuento; si es amarilla un 25% y si es blanca no 
obtendrá descuento.*/
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos= new Scanner (System.in);
		float compra, desc, total,acum1=0,acum2=0,acum3=0,tp1,tp2,tp3,sum;
		int opcion,resp=0;
		do{
			System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
			System.out.println("     BIENVENIDO AL SISTEMA     ");
			System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦");
			System.out.println("INGRESE EL IMPORTE DE SU COMPRA:");
			compra = datos.nextFloat();
			System.out.println("COLORES DE LA BOLITA");
			System.out.println("1. Bolita Roja");
			System.out.println("2. Bolita Amarilla");
			System.out.println("3. Bolita Blanca");
				
			do{
				System.out.println("POR FAVOR ESCOJA UNA OPCIÓN:");
				opcion = datos.nextInt(); 
			}while (!(opcion >=1 && opcion<=4));
			switch (opcion)
			{
			case 1 : 
				desc=(compra* 0.40f);
				total =(compra-desc);
				System.out.println("EL TOTAL DE SU COMPRA ES:" +total);
				System.out.println("\nDESEA SEGUIR EN EL SISTEMA:");
				System.out.println("1.SI");
				System.out.println("2.NO");
				System.out.println("POR FAVOR ESCOJA UNA OPCIÓN:");
				resp= datos.nextInt();
				
				acum1=total+0;
				tp1=acum1;
				break;
				
			case 2 :
				desc= (compra*0.25f);
				total=(compra-desc);
				System.out.println("EL TOTAL DE SU COMPRA ES:" +total);
				System.out.println("\nDESEA SEGUIR EN EL SISTEMA:");
				System.out.println("1.SI");
				System.out.println("2.NO");
				System.out.println("POR FAVOR ESCOJA UNA OPCIÓN:");
				resp= datos.nextInt();
				
				acum2=total+0;
				tp2=acum2;
				break;
				
			case 3 :	
				System.out.println("USTED NO OBTUVO DESCUENTO");
				System.out.println("EL TOTAL DE SU COMPRA ES:" +compra);
				System.out.println("\nDESEA SEGUIR EN EL SISTEMA:");
				System.out.println("1.SI");
				System.out.println("2.NO");
				System.out.println("POR FAVOR ESCOJA UNA OPCIÓN:");
				resp= datos.nextInt();
				
				acum3=compra+0;
				tp3=acum3;
				
			 break;
			}
		}while (resp==1);
	
	   System.out.println("¡GRACIAS POR USAR EL SISTEMA! :)");	
	   }

}


