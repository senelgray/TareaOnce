package tareaOnce;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayDuplicados {
	public static int[] removeDuplicates(int[] lista) {
        return Arrays.stream(lista).distinct().toArray();
    }
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    	
    	int [] lista = new int [5];


        for(int i=0; i<lista.length;i++) {
        	
        	 System.out.println("Introduce el valor del arreglo: ");
        	 lista [i] = input.nextInt();
        	
        }
        
        int[] distinct = removeDuplicates(lista);
        System.out.println(Arrays.toString(distinct));

        	
       

    }
}
