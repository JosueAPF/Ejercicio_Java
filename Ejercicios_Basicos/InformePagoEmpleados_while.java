/*
Ejercicio para realizar:
Ejercicio con While: En una empresa trabajan n empleados cuyos 
sueldos oscilan entre Q1000 y Q7500. Realizar un programa 
que lea los sueldos que cobra cada empleado e informe cuántos 
empleados cobran entre Q1000 y Q4000 y cuántos cobran más de Q4000. 
Además, el programa deberá informar el importe que gasta la empresa 
en sueldos al personal.

entrada salarios:
salida: el programa deberá informar el importe que gasta la empresa 
en sueldos al personal.


*/

import java.util.Scanner;
class Empleado{
    
    private int sueldo;
    public Scanner in;
    
    public Empleado(){
        sueldo = 0;
        in = new Scanner(System.in);
    }
    
    public void IngresoSueldo(){
        System.out.println("Ingreso sueldo :");
        sueldo = in.nextInt();
    }
    public int getSueldo(){
        return sueldo;
    }
}


class InformeSueldos extends Empleado{
    
        private int SueldoEmpleado;
        private int ImporteTotal;    
        private int x1,x2;//contador para x1(1000 y 4000) y x2(>400)
        private int x;
        
        public InformeSueldos(){
            super();
            ImporteTotal = 0;
            x=1;
        }
    
        public void Informe(int n){
            while(n>=x){
                IngresoSueldo();
                SueldoEmpleado = getSueldo();
                ImporteTotal += SueldoEmpleado;    
                if(SueldoEmpleado >=1000 && SueldoEmpleado <=4000){
                    x1++;
                }else if(SueldoEmpleado >4000){
                    x2++;
                }
                x++;                    
         }
    }
    public void MostrarDatos(){
        System.out.println("Empleados que ganan de 1000 a 4000 :"+x1);
        System.out.println("Empleados que ganan mas 4000 :"+x2);
        System.out.println("Importe sueldos del personal :"+ImporteTotal);
    }
}

public class InformePagoEmpleados_while {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);  
      InformeSueldos miInforme = new InformeSueldos();
      int nEmpleado;    
      System.out.println("Para cuantos Empleados");
      nEmpleado = in.nextInt();    
      miInforme.Informe(nEmpleado);
      miInforme.MostrarDatos();    
    }
    
}