/*
Cálculo de la Media y Desviación Estándar de Notas:
Desarrollar un programa que permita ingresar las notas de n estudiantes y 
calcule la media y la desviación estándar de las notas. 
La media es la suma de todas las notas dividida por el número de estudiantes. 
La desviación estándar mide la dispersión de las notas respecto a la media.

Fórmulas:

Media (M) = (Suma de todas las notas) / n

Desviación Estándar (σ) = sqrt((Σ (nota - M)^2) / n)

n=cantidad
M = Promedio
σ = representa la desviacion estandar
*/
import java.util.Scanner;
import java.lang.Math;

class Estudiantes{
   private String NombreE;
   private int NotaE;
   private Scanner in;
   
   public Estudiantes(){
      NombreE = "";
      NotaE = 0;
      in = new Scanner(System.in);   
   }
   public void IngresoDatos(){
      System.out.println("Nombre del estudiante ");
      NombreE = in.nextLine();
      System.out.println("Nota del Estudiante ");
      NotaE = in.nextInt();
      in.nextLine();
   }
   public int getNota(){
      return NotaE;
   }
   
}

//proceso calculo de la Media y Desciacion Estandar
class MediaDesviacionE extends Estudiantes{
   private double Media;
   private double Estandar,sumaCuadrados;
   private String Mensaje;
   private int cantidad,suma;
   private Scanner in;
   
   public MediaDesviacionE(){
      super();
      cantidad = 0;
      Mensaje = "";
      Media = 0;
      Estandar =0;
      in = new Scanner(System.in);
   }
   
   public double MediaE(int n){
       //Media (M) = (Suma de todas las notas) / n
       //suma += getNota();
       Media = (double) suma/n;
       return Media;
   }
   public double DEstandar(int n){
      //Desviación Estándar (σ) = sqrt((Σ (nota - M)^2) / n)
      //double resta =  (getNota() - Media);
      //double cuadradoRest = Math.pow(resta,2);
      //double sumaCuadrado = cuadradoRest;
      double varianza = sumaCuadrados/n;
      Estandar = Math.sqrt(varianza);
      return Estandar;
      
   }
   
   public void cantidadEstudiantes(){
      int i=0;
      sumaCuadrados = 0;
      System.out.println("Ingrese una cantidad de estudiantes :");
      cantidad = in.nextInt();
      while(i<cantidad){
         IngresoDatos();
         int notaActual = getNota();
         suma += notaActual;
         double resta = notaActual - MediaE(i + 1); // Calculamos la media en cada iteración
         sumaCuadrados += Math.pow(resta, 2);
         i++;
      }
      double mediaFinal = MediaE(cantidad);
      double desviacionEstandar = DEstandar(cantidad);
      System.out.println("Media :"+mediaFinal);
      System.out.println("Desviacion Estandar :"+desviacionEstandar);

   }
}

public class MediaDesviacionEstandar_Notas{
   public static void main(String[] args){
      MediaDesviacionE estudiantes = new MediaDesviacionE();
      //estudiantes.IngresoDatos();
      //System.out.println(estudiantes.getNota());
      estudiantes.cantidadEstudiantes();
   }
}