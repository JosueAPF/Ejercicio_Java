/*
Ejercicio For: Desarrollar un programa que permita la carga de las horas extras trabajadas 
por n empleados y nos muestre posteriormente 
el promedio de horas trabajadas y la cantidad de empleados que trabajaron más de 10 horas extras.

entradas : n,promedio,suma
procesos: 10HorasExtras
salida : promedio, y cantidad de Personas que trabajaron mas de 10 hras
*/
import java.util.Scanner;

class HorasExtras{
    private double promedio,suma;
    private int n,HorasExtras_10,HorasNormales,horas;
    private Scanner in;
    
    public HorasExtras(){
        in = new Scanner(System.in);
        n=0;
        HorasExtras_10 = 0;
        HorasNormales = 0;
        horas = 0;
    }
    
    public void CalcHoras(){
        System.out.println("Para cuantos empleados Calcular Las Horas extras");
        n = in.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Ingrese las horas Extras Empleado no."+(i + 1)+" :");
            horas = in.nextInt();
            suma +=horas;
            if(horas >10){
                HorasExtras_10++;
            }else{
                HorasNormales++;
            }
            
            promedio = suma/n;
            
            
        }
        System.out.println("Empleados con mas de 10 horas :"+HorasExtras_10);
        System.out.println("Empleados con mesnos de 10 horas :"+HorasNormales++);
        System.out.printf("Promedio  : %.2f%n", promedio);
    } 
}

public class HorasExtrasFor {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HorasExtras misHoras = new HorasExtras();
        misHoras.CalcHoras();
    } 
}