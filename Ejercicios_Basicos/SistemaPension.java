/*
 *Sistema de jubilación:
Crea un programa que determine si un empleado es elegible para jubilación y calcule su pensión.

La edad mínima para jubilarse es 65 años.
Se necesitan al menos 25 años de servicio para una pensión completa.
La pensión base es el 70% del último salario.
Por cada año adicional después de los 25, se añade un 1% extra, hasta un máximo del 90%.
Muestra si el empleado es elegible, y si lo es, cuál sería su pensión.
 *
 * */

import java.util.Scanner;

class Datos{
    private int JubiladoEdad;
    private int ServicioOld;
    private int UltimoSalario;
    public Scanner in;
    
    public Datos(){
        in = new Scanner(System.in);
    }
    
    public void IngresoDatos(){
        System.out.println("Ingrese la Edad del Participante a Jubilar :");
        JubiladoEdad = in.nextInt();
        System.out.println("Ingrese Anos de Servicio :");
        ServicioOld = in.nextInt();
        System.out.println("Ingrese El Ultimo Salario :");
        UltimoSalario = in.nextInt();
        in.nextLine();
    }
    public int GetEdad(){
        return JubiladoEdad;
    }
    public int GetServicio(){
        return  ServicioOld ;
    }
    public int GetUltiSalario(){
        return UltimoSalario;
    }
    
}

//sub class
class CalcularJubilacion extends Datos{
    public int EdadMinima;
    public int PensionServicio;//minimo 25 anos
    public int PensionBase;
    public float EdadPensionado;
    public int ServicioPensionado;
    public int UltimoSalarioPensionado;
    
    public CalcularJubilacion(){
        super();
        EdadMinima = 65;
        PensionServicio = 25;
    }
    public void miPension(){
        EdadPensionado = GetEdad();
        ServicioPensionado = GetServicio();
        UltimoSalarioPensionado = GetUltiSalario();
        
        if(EdadPensionado != EdadMinima && ServicioPensionado != PensionServicio){
            System.out.println("No con los requisitos minimos");
        }else if{
            
        }
    }
        
}

public class SistemaPension{
    public static void main(String[] args){
        Datos datosJubilado = new Datos();
        datosJubilado.IngresoDatos();
    }
}
