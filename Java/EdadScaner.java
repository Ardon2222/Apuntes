import java.util.*;
public class Scaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		if(edad>48) {
		
			System.out.println("Te llamas "+nombre+" y tu edad es de "+edad+ " por ende ya estas VIEJITO y en 5 años tendras " +(edad+5)+ " años");
		}
		else if(edad>=18){
			System.out.println("Te llamas "+nombre+" y tu edad es de "+edad+ " por ende ahora eres MAYOR de edad y en 5 años tendras " +(edad+5)+ " años");
		}
		else {
			System.out.println("Te llamas "+nombre+" y tu edad es de "+edad+ " por ende ahora eres MENOR de edad y en 5 años tendras " +(edad+5)+ " años");
		}
	}

}
