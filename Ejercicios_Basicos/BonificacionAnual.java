/*
 *
 *En una empresa, cada empleado recibe una bonificación anual basada en sus años de servicio.
Realiza un programa que:

Lea el número de empleados.
Lea el sueldo de cada empleado y los años de servicio.
Calcule y muestre la bonificación basada en la siguiente escala:
1-5 años: 5% del sueldo.
6-10 años: 10% del sueldo.
Más de 10 años: 15% del sueldo.
Informe el importe total que la empresa gasta en bonificaciones.
 *
 *
 *
 *
 * */

import java.util.Scanner;
//super clase Empleados
class Empleado{
    private int Sueldo;
    private int Servicio;
    private Scanner in;
    
    public Empleado(){
        in = new Scanner(System.in);
        Sueldo = 0;
        Servicio = 0;        
    }
    
    public void IngresoDatos(){
        System.out.println("-------Ingreso Datos-------");
        
        System.out.println("sueldo : ");
        Sueldo = in.nextInt();
        System.out.println("Anos de servicio : ");
        Servicio = in.nextInt();
        in.nextLine();
    }
    //metodos geters
    public int getSalario(){
        return Sueldo;
    }
    public int getServicio(){
        return Servicio;
    }
}

//sub clase Bonificacion
class Bonificacion extends Empleado{
    private double Bonificacion;
    private double SalarioTotal;
    private int Importe;    
    private int CantidadEmpleados;    
    private int ObtenerSalario;    
    private int ObtenerServicio;
    private Scanner in;

    //control del ciclo
    private int x;
    public Bonificacion(){
        super();
        CantidadEmpleados = 0;
        Bonificacion = 0.0;
        SalarioTotal = 0.0;
        Importe = 0;
        x=1;
        in = new Scanner(System.in);
    }

    public void CalcularBonificacion(){
        
        System.out.println("Ingrese la cantidad de empleados");
        CantidadEmpleados = in.nextInt();
        
        //ObtenerSalario = getSalario();    
        //ObtenerServicio = getServicio();
        
        //proceso de calculo de bonificacion
        while(x<=CantidadEmpleados){
            IngresoDatos();
            
            //deben estar adentro del bucle 
            ObtenerSalario = getSalario();    
            ObtenerServicio = getServicio();
        
            if(ObtenerServicio >=1 && ObtenerServicio <=5){
                Bonificacion = 0.05;
            }else if(ObtenerServicio >= 6 && ObtenerServicio<=10){
                Bonificacion = 0.10;
            }else if(ObtenerServicio>10){
                Bonificacion = 0.15;
            }
            SalarioTotal = ObtenerSalario +(ObtenerSalario*Bonificacion);
            Importe += SalarioTotal;
            DatosFinales(x,ObtenerSalario,SalarioTotal);    
            x++;
        }
        System.out.println("");
        System.out.println("Importe :"+Importe);        
    }
    public void DatosFinales(int x,int salario,double salariofinal){
        System.out.println("---------Datos--------- :"+x);
        System.out.println("Salario :"+salario);
        System.out.println("Salario Total :"+salariofinal);
        
    }
    
}


public class BonificacionAnual{
    public static void main(String[] args){
        Bonificacion CalcularBoni = new Bonificacion();
        CalcularBoni.CalcularBonificacion();    
    }
}