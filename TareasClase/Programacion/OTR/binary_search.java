import java.util.*;

public class binari_search {
    public static void main(String[] args) {

        Random rand = new Random();
        
        // Generamos un numero random
        int n=rand.nextInt(1000000)+1;
        int min=0;
        int max=n;
        boolean ganado = false;

        // Encontramos la media y el logaritmo del numero
        double logaritmo = Math.log(n) / Math.log(2);
        int logaritmoInt = (int) logaritmo;
        double media = (min + max) / 2;
        int mediaInt = (int) media;
        
        // Array para almacenar los numeros por los que hemos pasado
        int[] numeros_elejidos = new int[logaritmoInt+1];

        System.out.println("------------------ ");
        System.out.println("Logaritmo en base 2 de " + n + " es: " + (logaritmoInt+1));

        // Creamos un indice para contar e incrementar asi pudiendo añadir valores al array sin solaparlo
        int i=0;
        // Un bucle que sigue mientras no hayamos ganado
        do {
            // Si la media es mayor al numero actualizamos el maximo
            if (mediaInt>n) {
                max = mediaInt;
                //Añadimos el numero que hemos usado al array e incrementamos el indice
                numeros_elejidos[i]=mediaInt;
                i++;
            }
            // Si la media es menor al numero actualizamos el minimo
            if (mediaInt<n) {
                min = mediaInt;
                //Añadimos el numero que hemos usado al array e incrementamos el indice
                numeros_elejidos[i]=mediaInt;
                i++;
            }
            // Si es correcto ganamos
            if (mediaInt==n) {
                numeros_elejidos[i]=mediaInt-1;
                System.out.println("------------------ ");
                System.out.println("Ganaste el numero es "+mediaInt);
                System.out.println("El proceso fue:");
                System.out.println(Arrays.toString(numeros_elejidos));
                System.out.println("------------------ ");
                ganado = true;
            }
            // Actualizamos la media tras actualizar el minimo y el maximo
            media = (min + max) / 2;
            mediaInt = (int) media;
            
            // Hacemos que si coincide justo con el anterior se incremente en 1 ya que no lo hara solo porque no aproxima hacia arriba
            // y ya coincidira con el numero en la siguiente vuelta
            if (mediaInt==(n-1)) {
                mediaInt++;
            }
        } while (!ganado);
    }
}
