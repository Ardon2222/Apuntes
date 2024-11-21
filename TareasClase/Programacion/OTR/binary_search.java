import java.util.*;

public class binari_search {
    public static void main(String[] args) {

        Random rand = new Random();

        int n=rand.nextInt(1000000)+1;
        int min=0;
        int max=n;
        boolean ganado = false;

        double logaritmo = Math.log(n) / Math.log(2);
        int logaritmoInt = (int) logaritmo;
        double media = (min + max) / 2;
        int mediaInt = (int) media;
        
        int[] numeros_elejidos = new int[logaritmoInt+1];
        System.out.println("------------------ ");
        System.out.println("Logaritmo en base 2 de " + n + " es: " + (logaritmoInt+1));

        
        int i=0;
        do {
            
            if (mediaInt>n) {
                max = mediaInt;
                numeros_elejidos[i]=mediaInt;
                i++;
            }
            if (mediaInt<n) {
                min = mediaInt;
                numeros_elejidos[i]=mediaInt;
                i++;
            }
            if (mediaInt==n) {
                numeros_elejidos[i]=mediaInt-1;
                System.out.println("------------------ ");
                System.out.println("Ganaste el numero es "+mediaInt);
                System.out.println("El proceso fue:");
                System.out.println(Arrays.toString(numeros_elejidos));
                System.out.println("------------------ ");
                ganado = true;
            }
            media = (min + max) / 2;
            mediaInt = (int) media;
            

            if (mediaInt==(n-1)) {
                mediaInt++;
            }
        } while (!ganado);
    }
}
