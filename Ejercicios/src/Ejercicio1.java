//1.Obtener el promedio de calificaciones de un grupo de n alumnos.
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos= new Scanner (System.in);
		int cant=0, cont=0; 
		float cal=0.0f, prom;
		
		System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
		System.out.println("  ***BIENVENIDO AL SISTEMA*** ");
		System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
		System.out.println("INGRESE LA CANTIDAD DE ALUMNOS:");
		cant = datos.nextInt();
		
		while (cont < cant)
		{
			System.out.print("INGRESE CALIFICACIÓN:");
			cal += datos.nextFloat();
			
			cont++;
		}
		
		prom = (cal / cant);
				
		System.out.println("");	
		System.out.println("EL PROMEDIO ES:" +prom);
	
		
	}
}
		
		
				
	