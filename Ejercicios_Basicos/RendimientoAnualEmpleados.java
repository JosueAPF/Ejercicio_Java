import java.util.Scanner;

//Super Clase 
class DatosEmpleados{
    private int Salario;
    private int Rendimiento;
    public Scanner in;
    
    public DatosEmpleados(){
        Salario = 0;
        Rendimiento =0;
        in = new Scanner(System.in);
    }
    public void addData(){
        System.out.println("Ingrese el Salario ");
        Salario = in.nextInt();
        System.out.println("Rendimeinto del Empleado");
        Rendimiento = in.nextInt();
        in.nextLine();        
    }
    public int getSalario(){
        return Salario;
    }
    public int getRendimiento(){
        return Rendimiento;
    }
}


class AumentoSueldo extends DatosEmpleados{
    private double Bonificacion;
    private double SalarioTotal;
    private double Importe;
    private int ESalario;
    private int ERendimiento;
    private int NumEmp,x;
    private Scanner in;
    
    public AumentoSueldo(){
        super();
        in = new Scanner(System.in);
        x=1;
    }
    public void CalculoAumento(){
        System.out.println("Ingrese una cantidad De Empleados :");
        NumEmp = in.nextInt();
        
        while(x<=NumEmp){
            addData();
            ESalario = getSalario();
            ERendimiento = getRendimiento();
            
            if(ERendimiento >=1 && ERendimiento <=2){
                Bonificacion = 0;
            }else if(ERendimiento == 3){
                Bonificacion = 0.05;
            }else if(ERendimiento == 4){
                Bonificacion = 0.10;
            }else if(ERendimiento == 5){
                Bonificacion = 0.15;
            }
                
            SalarioTotal = ESalario +(ESalario * Bonificacion);
            Importe +=SalarioTotal;
            //mostrando el resultado
            DatosEmpleados(ESalario,ERendimiento,Bonificacion,SalarioTotal);                
        }
        System.out.println("Importe Total :"+Importe);
    }

    public void DatosEmpleados(int salario,int rendi,double Boni,double salTotal){
        System.out.println("Salario Base :"+salario);
        System.out.println("Rendimiento  :"+rendi);
        System.out.println("Bonificacion :"+Boni);
        System.out.println("Salario Total :"+salTotal);

    }
}
public class RendimientoAnualEmpleados {
    public static void main(String[] args) {
        AumentoSueldo BoniEmpleado = new AumentoSueldo();
        BoniEmpleado.CalculoAumento();    
    }
    
}