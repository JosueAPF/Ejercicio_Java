/*
Ejercicio Propuesto
--------Sistema de bonificación por ventas--------
Crea un programa que calcule la bonificación de un vendedor basado en sus ventas mensuales y años de experiencia.

Si las ventas son mayores a 1000 y tiene más de 5 años de experiencia, recibe un 5% de bonificación.
Si las ventas son mayores a 5,000 pero menores o iguales a 10,000, recibe un 15% de bonificación.
Si las ventas son menores a 5,000, recibe un 8% de bonificación.
Si tiene menos de 5 años de experiencia, su bonificación se reduce a la mitad.
Muestra el salario base, la bonificación y el salario total.

*/
import java.util.Scanner;
class MiBonificacion{
   private int VentasMensuales;
   private int Experiencia;
   private double Bonificacion;
   private double SalarioFinal;
   private double MontoBonificacion;
   private Scanner in;
   
   public MiBonificacion(){
      in = new Scanner(System.in);
   }
   public void IngresoDatos(){
      System.out.println("---Ingrese los Solicictado---");
      System.out.println("Ingrese las Ventas Mensuales :");
      VentasMensuales = in.nextInt();
      System.out.println("Ingrese los años de Experiencia :");
      Experiencia = in.nextInt();
   }
   public void CalcularBonif(){
      IngresoDatos();
      if(VentasMensuales > 1000 && Experiencia >= 5){
         Bonificacion = 0.05;
      }else if(VentasMensuales > 5000 && VentasMensuales <=10000){
         Bonificacion = 0.15;
      }else if(VentasMensuales < 5000){
         Bonificacion = 0.08;
      }else if(Experiencia < 5){
         Bonificacion/=2;
      }
      
       MontoBonificacion = VentasMensuales * Bonificacion;
       SalarioFinal = VentasMensuales+MontoBonificacion;
       System.out.println("Salario :"+VentasMensuales);
       System.out.println("Bonificacion :"+MontoBonificacion);
       System.out.println("Salario Final :"+SalarioFinal);

   }
}
public class BonFicacionVentas{
   public static void main(String[] args){
      //instanciar
      MiBonificacion EmpleadoBonific = new MiBonificacion();
      
      //llamada a los metodos
      EmpleadoBonific.CalcularBonif();
   }
}