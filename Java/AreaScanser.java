import java.util.*;

public class AreaIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Este ejemplo se ha de ver junto a AreaSwitch 
		
		//Aqui los condicionales se hacen con if
		
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("Elije una opcion: \n1.Cuadrado\n2.Rectangulo\n3.Triangulo\n4.Circulo");
		
		int opcion=entrada.nextInt();
		entrada.nextLine();
		
		if(opcion==1) {
			
			//Ponemos el texto
			System.out.println("Introduce el lado");

			//Inizializamos una nueva variable con el valor de nextLine
			int lado=Integer.parseInt(entrada.nextLine());
			
			//Para conseguir las variables se puede seguir usando el JOptionPane que es perteneciente al Switch
			//Se haria como se ve justo debajo 
			
			//int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

			System.out.println("El area del cuadrado es "+Math.pow(lado, 2));
			
		}
		else if(opcion==2){
			System.out.println("Introduce la base");
			int base=Integer.parseInt(entrada.nextLine());
			System.out.println("Introduce la altura");
			int altura=Integer.parseInt(entrada.nextLine());
			
			System.out.println("El area del rectangulo es "+base*altura);
			
		}
		else if(opcion==3){
			System.out.println("Introduce la base");
			int base=Integer.parseInt(entrada.nextLine());
			System.out.println("Introduce la altura");
			int altura=Integer.parseInt(entrada.nextLine());
			
			System.out.println("El area del triangulo es "+(base*altura)/2);
		}
		else if(opcion==4){
			System.out.println("Introduce el radio");
			int radio=Integer.parseInt(entrada.nextLine());
			
			System.out.println("El area del circulo es");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
		}
		else {
			System.out.println("Esa no es una de las opciones");
		}
	}

}
