import java.util.*;

public class Ej7 {
    public static void main(String[] args) {
        
        sdfsdhgfbfvgwdbxiuewgeywdiufbu
        erjhfgewfheywneifwbgsdk
        
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int[] numeros = new int[100];
        String[] numeros_res = new String[100];

        for (int index = 0; index < numeros.length; index++) {
            numeros[index]=rand.nextInt(20+1);
        }

        System.out.println(Arrays.toString(numeros));
        
        System.out.println("Introduce un numero este sera reemplazado");
        int n1  = entrada.nextInt();
        System.out.println("Introduce el numero por el cual se reemplazara el numero introducido anteriormente");
        int n2  = entrada.nextInt();

        for (int index = 0; index < numeros.length; index++) {
            if (numeros[index]==n1) {
                numeros_res[index]="'"+n2+"'";
            } else {
                numeros_res[index]=String.valueOf(numeros[index]);
            }
        }
        System.out.println(Arrays.toString(numeros_res));
    }
}
