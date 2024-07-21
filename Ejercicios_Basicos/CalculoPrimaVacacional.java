/*
Menos de 1 año: 25% del salario por 6 días
1 a 5 años: 25% del salario por 12 días
Más de 5 años: 25% del salario por 20 días
Si el empleado no ha tomado días de incapacidad en el año, añade un bono del 5%

Fórmulas:

Prima base = (Salario / 30) * Días correspondientes * 0.25
Bono por no incapacidad = Prima base * 0.05 (si aplica)
Prima total = Prima base + Bono por no incapacidad

*/

import java.util.Scanner;

class DatosEmpleado{
   public Scanner in;
   public String Nombre;
   public int Salario;
   public int Old_Company;
   public int DiasIncapaz;//dias de incapacidad
   
   public DatosEmpleado(){
      in = new Scanner(System.in);
   }
   
   public void IngresoDatos(){
      System.out.println("---Ingreso de los Datos---");
      System.out.println("Nombre Empleado :");
      Nombre = in.nextLine();
      System.out.println("Salario Empleado :");
      Salario = in.nextInt();
      System.out.println("Dias de incapacidad :");
      DiasIncapaz = in.nextInt();
      System.out.println("Antiguedad en La Empresa en años");
      Old_Company = in.nextInt();
      in.nextLine();
      
      if(!Nombre.isEmpty()){
         System.out.println("###Entrada Valida###");
      }else{
         System.out.println("---Error---");
      }
      
   }
   
   public int getSalario(){
       return Salario;
   }
   public int getIncapacidad(){
      return DiasIncapaz;
   }
   public int getAnosCompany(){
      return Old_Company;
   }
   
}

class CalculoPrima extends DatosEmpleado{
   private double Prima_base;
   private double BonoNoincapacidad;
   private double PrimaTotal;
   private int ObtenerSalario;
   private int ObtenerOld;
   private int ObtenerIncapaz;
   private Scanner in;
   
   public CalculoPrima(){
      super();
      in = new Scanner(System.in);
   }
   public void Prima(){
      ObtenerSalario = getSalario();
      ObtenerOld = getAnosCompany();
      ObtenerIncapaz = getIncapacidad();

      if(ObtenerOld<1){
         Prima_base = (((ObtenerSalario/30)*6)*0.25);
      }else if(ObtenerOld>=1&&ObtenerOld<=5){
         Prima_base = (((ObtenerSalario/30)*12)*0.25);
      }else if(ObtenerOld >5){
         Prima_base = (((ObtenerSalario/30)*20)*0.25);
      }else if(ObtenerIncapaz == 0){
         BonoNoincapacidad = Prima_base *0;
      }else{
         BonoNoincapacidad = Prima_base *0.05;
      }
      
      PrimaTotal = Prima_base + BonoNoincapacidad;
      System.out.println("---Datos de La Prima---");
      System.out.println("De salario : "+ObtenerSalario);
      System.out.println("Dias de Incapacidad : "+ObtenerIncapaz);
      System.out.println("Prima Base : "+Prima_base);
      System.out.println("Prima Total : "+PrimaTotal);
   }  
}


public class CalculoPrimaVacacional{
   public static void main(String[] args){
      CalculoPrima miPrima = new CalculoPrima();
      miPrima.IngresoDatos();
      miPrima.Prima();
   }
}