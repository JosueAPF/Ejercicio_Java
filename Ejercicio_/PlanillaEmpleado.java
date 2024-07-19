import java.util.Scanner;

class Planilla{
	private int SueldoBase;
	private int TiempoEnEmpresa;
	private double SueldoFinal;
	private double SueldoAnual;
	public Scanner in;
	
	Planilla(){
		in = new Scanner(System.in);
	}
	
	public void IngresoDatos(){
		System.out.println("Ingrese El Sueldo :");
		SueldoBase = in.nextInt();
		System.out.println("Ingrese en años su antiguedad en la Empresa :");
		TiempoEnEmpresa = in.nextInt();
	}
	
	public void CalcularAumento(){
		if(SueldoBase <5000 && TiempoEnEmpresa >=10){
			SueldoFinal = SueldoBase + (SueldoBase*0.20);
			System.out.println("Sueldo a Pagar : "+SueldoFinal);
		}else if(SueldoBase < 5000 && TiempoEnEmpresa < 10) {
				SueldoFinal = SueldoBase + (SueldoBase*0.05);
				System.out.println("Sueldo a Pagar : "+SueldoFinal);
		}else{
				System.out.println("Sueldo a Pagar : "+SueldoBase);
		}
		//sueldo anual del empleado con el aumento aplicado
		SueldoAnual = SueldoFinal *12;
		System.out.println("Sueldo Anual :"+SueldoAnual);
	}
		
}

public class PlanillaEmpleado {
	public static void main(String[] args) {
		Planilla MyPlanilla = new Planilla();
		MyPlanilla.IngresoDatos();
		MyPlanilla.CalcularAumento();
	}

}
