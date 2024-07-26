/*

Ejercicio do while: Preguntar el nombre del empleado, 
el puesto y su profesión, preguntar si se desea ingresar otro empleado.


*/
import java.util.Scanner;

class datos{
    private String Nombre;
    private String Puesto;
    private String Profesion;
    private int valor,x;
    private Scanner in;
    
    public datos(){
        in = new Scanner(System.in);
        Nombre ="";
        Puesto ="";
        Profesion ="";
        valor = 0;
        x=0;
    }
    public void Empleado(){
        do{
            System.out.println("Desea seguir ingresando valores 1:si 0:no :");
            valor = in.nextInt();
            in.nextLine();
            
            if(valor !=0){
                System.out.println("Ingrese un Nombre :");
                Nombre = in.nextLine();
                System.out.println("Ingrese un Puesto :");
                Puesto = in.nextLine();
                System.out.println("Ingrese una Profesion :");
                Profesion = in.nextLine();
                MostrarDatos(Nombre,Puesto,Profesion);
            }else{
                System.out.println("Saliendo");
            }
        }while(valor !=0);
        
    }
    
    public void MostrarDatos(String Nombre,String Puesto,String Profesion){
            System.out.println("--------Datos :");
            System.out.println("Ingrese un Nombre :"+Nombre);
            System.out.println("Ingrese un Puesto :"+Puesto);
            System.out.println("Ingrese una Profesion :"+Profesion);
        }
}

public class do_while {
    public static void main(String[] args) {
        datos d = new datos();
        d.Empleado();
    }
    
}