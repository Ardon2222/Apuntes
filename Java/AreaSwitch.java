import java.util.*;
import javax.swing.*;

public class AreaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Este ejemplo se ha de ver junto a AreaIf
		
		//Aqui los condicionales se hacen con "case" ya que se usa Switch
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elije una opcion: \n1.Cuadrado\n2.Rectangulo\n3.Triangulo\n4.Circulo");
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			
			//Usamos el JOptionPane generando un panel con el titulo que agarrara como variable lo que el usuario introduzca
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			//Para conseguir las variables se puede usar una inizalizacion de variable envez del JOptionPane 
			//Se haria como se ve justo debajo sin usar el Switch
			
			//int lado=Integer.parseInt(entrada.nextLine());		
			
			System.out.println("El area del cuadrado es "+Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del rectangulo es "+base*altura);
			
			break;
			
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del triangulo es "+(base*altura)/2);
			
			break;
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.println("El area del circulo es");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			
			
			System.out.println("La opcion no es correcta");
		}

	}

}
