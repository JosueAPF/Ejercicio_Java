/*
1. Desarrollar una clase que represente un empleado (ponerle de nombre Empleado). 
Definir como atributos su nombre y su sueldo mensual. 
Confeccionar los métodos para el ingreso de los datos, 
otro para imprimir sus datos, 
un tercero que calcule y muestre el sueldo anual 
y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000).
*/
import java.util.Scanner;

class Empleado{
     private Scanner in;
     private String Nombre;
     private int Sueldo;
     private int SueldoAnual;
     
     //constructor /inicializador de los atributos
     public Empleado(){
         in = new Scanner(System.in);
         Nombre = "";
         Sueldo = 0;
         SueldoAnual = 0;
     }
     //ingreso de los datos
     public void IngresoDatos(){
         System.out.println("Ingrese un Nombre : ");
         Nombre = in.nextLine();
         System.out.println("Ingrse El Sueldo : ");
         Sueldo = in.nextInt(); 
     }
     //retorna los datos en una cadena de texto
     public String MostrarDatos(){
         return "Nombre : "+Nombre+"\n"+"Salario : "+Sueldo;
     }
     public void Impuesto(){
     //si el sueldo supera a 3000
         if(Sueldo >3000){
            System.out.println("Debe pagar Impuestos");
         }
     }
     //calculo del sueldo anual y retorno de dato SueldoAnual
     public int SueldoAnual(){
         SueldoAnual = Sueldo*12;
         return SueldoAnual;
     }
}
public class Tarea_2{
   public static void main(String[] args){
      //instancia de clase y declaracion del objeto empleado
      Empleado empleado = new Empleado();
      //llamadas a los metodos
      empleado.IngresoDatos();
      //llama a los metodos que retornan datos
      System.out.println(empleado.MostrarDatos()+"\n"+"Salario Anual :"+empleado.SueldoAnual());
      empleado.Impuesto();
   }
}
