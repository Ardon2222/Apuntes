import javax.swing.*;

public class Swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad");
		
		int edad_int=Integer.parseInt(edad);
		
		System.out.println("Te llamas "+nombre+" y tu edad es de "+edad+ " por ende en 5 años tendras " +(edad_int+5)+ " años");
		
	}

}

