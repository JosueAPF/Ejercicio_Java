/*
 *si empleado gana  <5000 quetzales  y tiene mas de 2 anos en la empresa darle una bonificacion del 5%
 *si empleado gana 5000 y tine antiguedad de 2 anos darle bonificacion del 10%
 *si gana mas de 5000 bonificacion = 0;
 *
 *mostrar:
 	nombre
	edad
	profesion
	puesto
	salario
	bonificacion
	salariototal

	el importe de la empresa
	que es la suma de todos los salario
 *
 * */


import java.util.Scanner;
import java.util.ArrayList;

class Empleado{
	private String Nombre,profesion;
	private int edad,salario,antiguedad;
   private Scanner in;

	public Empleado(){
		Nombre = "";
		profesion ="";
		edad=0;
		salario =0;
      antiguedad = 0;
      in = new Scanner(System.in);
	}
   public void IngresoDatos(){
       System.out.println("Ingrese Nombre :");
       Nombre = in.nextLine();
       System.out.println("Ingrese Prosecion :");
       profesion = in.nextLine();
       System.out.println("Ingrese Edad :");
       edad = in.nextInt();
       System.out.println("Ingrese Salario :");
       salario = in.nextInt();
       System.out.println("Ingrese la antiguedad :");
       antiguedad = in.nextInt();
       in.nextLine();  
      
   }
	public int getSalario(){
		return salario;
	}
   public int getAntiguedad(){
      return antiguedad;
   }

}

class CalculosBoni extends Empleado{
	private double boni,SalTotal,importe,sum;
	public CalculosBoni(){
		super();
		boni = 0.0;
		SalTotal = 0.0;
      importe = 0.0;
	}
	public void calc(){
      IngresoDatos();
		if(getSalario()<5000 && getAntiguedad()<2){
         boni = getSalario()*0.05;
      }else if(getSalario()==5000 && getAntiguedad()>2){
         boni = getSalario()*0.10;
      }else if(getSalario()>5000){
         boni = getSalario();
      }
      sum +=getSalario();
      SalTotal = getSalario()+boni;
      importe = sum;
      //System.out.println("Salario Total :"+SalTotal);  
      //System.out.println("Importe Total :"+importe);    	
	}
   public void TotalEmpleado(){
      System.out.println("Salario base :"+getSalario());
      System.out.println("Bonificacion :"+boni);
      System.out.println("Salario Total :"+SalTotal);  
      System.out.println("Importe Total :"+importe); 
   }

}


public class ArrayListEmpleados{
	public static void main(String[] args){   
      ArrayList<String> list = new ArrayList<>();
      Scanner in = new Scanner(System.in);
      boolean opcbool = true;
      int opcSalida;
      while(opcbool){
         CalculosBoni empleado = new CalculosBoni();
         empleado.calc(); 
         empleado.TotalEmpleado();
         
         System.out.println("Desea Seguir 1:si 0:no");
         opcSalida = in.nextInt();
         if(opcSalida != 1){
            System.out.println("salir");
            opcbool = false;
         } 
         
         }
         
	}
}
