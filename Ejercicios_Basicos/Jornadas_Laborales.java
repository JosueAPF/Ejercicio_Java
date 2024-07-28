/*
 * 
CASE: Desarrollar un programa que pregunte la opción de la jornada laboral:
1.Matutino
2.Vespertino
3.Nocturno
De acuerdo a la opción seleccionada mostrar el horario correspondiente:
Matutino: 5:00 a 13:00 horas

Vespertino: 13:00 a 20:00 horas

Nocturno: 20:00 a 5:00 horas
 * 
 * 
 * 
 * */


import java.util.Scanner;



class MenuOpc{
	
	private Scanner in;
	private int opc;
	private String mensaje;
	
	public MenuOpc() {
		in = new Scanner(System.in);
		opc = 0;
		mensaje = "";
	}
	
	public void Menu_Opc(){
		System.out.println("------MENU Horaros-------:");
		System.out.println("Ingrese una opcion :");
		System.out.println("1. Matutina :");
		System.out.println("2. Vespertina:");
		System.out.println("3. Nocturna:");
		System.out.println("4. salir:");
		opc = in.nextInt();
		switch(opc){
		case 1: 
			mensaje = "Matutino: 5:00 a 13:00 horas"; 
			System.out.println(mensaje);
			break;
		case 2:
			mensaje = "Vespertino: 13:00 a 20:00 horas";
			System.out.println(mensaje);	 
			break;
		case 3: 
			mensaje = "Nocturno: 20:00 a 5:00 horas"; 
			System.out.println(mensaje);
			break;
		case 4: 
			mensaje = "adios"; 
			System.out.println(mensaje);
			break;
		default:
			mensaje = "no existe esa opcion";
			break;
		}
		
	}
}

public class Jornadas_Laborales {
	public static void main(String[] args) {
		MenuOpc obj = new MenuOpc();
		obj.Menu_Opc();
	}

}
