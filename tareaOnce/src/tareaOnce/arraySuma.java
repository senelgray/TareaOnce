package tareaOnce;
import java.util.List;
import java.util.Scanner;
public class arraySuma {

	    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    	
	    	int  [] lista = new int [5];


	        for(int i=0; i<lista.length;i++) {
	        	
	        	 System.out.println("Introduce el valor de tu numero: ");
	        	lista [i] = input.nextInt();
	        	
	        }
	        
	        int suma=0;
	        for(int i=0; i<lista.length; i++) {
	        	suma = suma + lista[i];
	        	
	        }
	        System.out.println("El resultado de la suma es: "+ suma);

	    }
	}