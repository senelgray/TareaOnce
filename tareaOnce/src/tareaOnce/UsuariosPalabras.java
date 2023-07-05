package tareaOnce;
import java.util.ArrayList;
import java.util.Scanner;
public class UsuariosPalabras {

	public static void main(String[] args) {
        ArrayList<String> listaPalabras = new ArrayList<>(); //uso de arraylist 
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el numero de datos a ingresar: "); //cantidad de registros
        int numer = input.nextInt();

        for (int i=0; i<numer; i++ ) {
        System.out.print("Ingrese una palabra: "); //ingreso de palabras x cantidad de registros
        String palabra = input.next();
      
            if (!listaPalabras.contains(palabra)) {  //con contains verifica repetidos
                listaPalabras.add(palabra);
            }
        }

        System.out.println("Lista sin duplicados: "); //Imprimir lista final
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
    }
}