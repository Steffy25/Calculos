/*2.Leer 50 calificaciones de un grupo de alumnos. Calcule y escriba el porcentaje 
de reprobados. Tomando en cuenta que la calificación mínima aprobatoria es de 70.*/
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos= new Scanner (System.in);
		int ind=0, acum=0;
		float porcent=0.0f;
		int alumnos[]= new int [50]; 
		int suma=0;
		
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println("  ***BIENVENIDO AL SISTEMA*** ");
        System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        
        for ( ind=0; ind<50; ind++){
        	System.out.println("INGRESE CALIFICACIÓN:");
		    alumnos[ind]= datos.nextInt();
		    suma= suma+alumnos[ind];
		}
        
        for (ind=0; ind<50; ind++){
        	if ((alumnos[ind]>=0) && (alumnos[ind]<70)){
        		acum=acum+1;
				porcent=((100 * acum)/50);
			}
        }	
        System.out.println("EL PORCENTAJE DE REPROBADOS ES: " +porcent);
	}

}


