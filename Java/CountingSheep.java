import java.util.*;;

class CountingSheep {
    public static void main(String[] args) {

      Scanner entrada=new Scanner(System.in);
		
      System.out.println("¿Cuantas ovejas hay?");
      
      int sheep=entrada.nextInt();
      entrada.nextLine();

      String frase="";

      if (sheep<0){
        System.out.println("¿Como que ovejas negativas? .-.");
      } else if (sheep==0) {
        System.out.println("No hay ovejas");
      } else {
        for (int i = 1; i <= sheep; i++) {
          if (i==1) {
            frase+=(i+" oveja ha saltado la valla... ");
            System.out.println();
            
          } else {
            frase+=(i+" ovejas ha saltado la valla... ");
            
          }
        }
        System.out.println(frase);
      }

      }
    }