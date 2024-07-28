/*

tarea no1: 1. IF; De un operario se conoce su sueldo y los años de antigüedad. 
Se pide confeccionar un programa que lea los datos de entrada e informe:

a) Pedir el sueldo y los años de antiguedad
b) Si el sueldo es inferior a 5000 y su antigüedad es igual o superior a 10 años,
otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
c) Si el sueldo es inferior a 5000 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
d) Si el sueldo es mayor o igual a 5000 mostrar el sueldo en pantalla sin cambios. 
e) Muestre el sueldo anual.

____________#1:entradas>sueldo,anosAntiguedad
______________:Proceso> 
                    si--> sueldo < 500 && antiguedad >=10
                            bonificacion:20%
                    si--> sueldo < 500 && antiguedad < 10
                            bonificacion:5%
                    si--> sueldo >= 500
                            bonificacion:no cambios
                    sueldo Total = sueldo+(sueldo*bonificacion); 
_____________:salida>
                    Sueldo Total
                    sueldo anual


2. WHILE: En una empresa trabajan n empleados cuyos sueldos oscilan entre Q1000 y Q7500. 
Realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran
entre Q1000 y Q4000 y cuántos cobran más de Q4000. Además, 
el programa deberá informar el importe que gasta la empresa en sueldos al personal.



3. FOR: Desarrollar un programa que permita la carga de las horas extras trabajadas por n empleados
y nos muestre posteriormente el promedio de horas trabajadas y la cantidad de empleados 
que trabajaron más de 10 horas extras.

4. DO WHILE: Preguntar el nombre del empleado, el puesto y su profesión, 
preguntar si se desea ingresar otro empleado.

5. CASE: Desarrollar un programa que pregunte la opción de la jornada laboral
1.Matutino
2.Vespertino
3.Nocturno

De acuerdo a la opción seleccionada mostrar el horario correspondiente:
Matutino: 5:00 a 13:00 horas
Vespertino: 13:00 a 20:00 horas
Nocturno: 20:00 a 5:00 horas


6. Hacer un programa que integre todos los programas realizados anteriormente y que presente
un menú para ingresar a cada uno de ellos.
*/
import java.util.Scanner;

class Planilla {
    private int sueldoBase;
    private int tiempoEnEmpresa;
    private double sueldoFinal;
    private double sueldoAnual;
    private Scanner in;

    // Constructor que inicializa el Scanner
    public Planilla() {
        in = new Scanner(System.in);
    }

    // Método para ingresar datos
    public void ingresoDatos() {
        System.out.println("Ingrese el sueldo:");
        sueldoBase = in.nextInt();
        System.out.println("Ingrese en años su antigüedad en la empresa:");
        tiempoEnEmpresa = in.nextInt();
    }

    // Método para calcular el aumento y el sueldo anual
    public void calcularAumento() {
        if (sueldoBase < 5000 && tiempoEnEmpresa >= 10) {
            sueldoFinal = sueldoBase + (sueldoBase * 0.20);
            System.out.println("Sueldo a pagar: " + sueldoFinal);
        } else if (sueldoBase < 5000 && tiempoEnEmpresa < 10) {
            sueldoFinal = sueldoBase + (sueldoBase * 0.05);
            System.out.println("Sueldo a pagar: " + sueldoFinal);
        } else {
            sueldoFinal = sueldoBase;
            System.out.println("Sueldo a pagar: " + sueldoFinal);
        }

        // Calcular sueldo anual
        sueldoAnual = sueldoFinal * 12;
        System.out.println("Sueldo anual: " + sueldoAnual);
    }
}

class InformeSueldos{
        private int ImporteTotal;    
        private int x1,x2;//contador para x1(1000 y 4000) y x2(>400)
        private int x,n,sueldo;
        private Scanner in;
        public InformeSueldos(){
            ImporteTotal = 0;
            x=1;
            n=0;
            sueldo = 0;
            in = new Scanner(System.in);
        }
    
        public void Informe(){
            System.out.println("Para cuantos empleados :");
            n = in.nextInt();
            while(n>=x){
                System.out.println("Ingrese el Sueldo");
                sueldo = in.nextInt();
                in.nextLine();

                ImporteTotal += sueldo;    
                if(sueldo >=1000 && sueldo <=4000){
                    x1++;
                }else if(sueldo >4000){
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


class Datos{
    private String Nombre;
    private String Puesto;
    private String Profesion;
    private int valor,x;
    private Scanner in;
    
    public Datos(){
        in = new Scanner(System.in);
        Nombre ="";
        Puesto ="";
        Profesion ="";
        valor = 0;
        x=0;
    }
    public void Empleado(){
        do{
            System.out.println("Desea seguir ingresando valores 1:si 0:no : ");
            valor = in.nextInt();
            in.nextLine();
            
            if(valor ==1){
                System.out.println("Ingrese un Nombre :");
                Nombre = in.nextLine();
                System.out.println("Ingrese un Puesto :");
                Puesto = in.nextLine();
                System.out.println("Ingrese una Profesion :");
                Profesion = in.nextLine();
                MostrarDatos(Nombre,Puesto,Profesion);
            }else if(valor !=1 && valor !=0){
                System.out.println("esta entrada es invalida");
                break;
            }else{
                System.out.println("Saliendo");
            }
        }while(valor !=0);
        
    }
    
    public void MostrarDatos(String Nombre,String Puesto,String Profesion){
            System.out.println("--------Datos :");
            System.out.println("Ingrese un Nombre :"+Nombre);
            System.out.println("Ingrese un Puesto :"+Puesto);
            System.out.println("Ingrese una Profesion :"+Profesion);
        }
}




class JornadaL{
	
	private Scanner in;
	private int opc;
	private String mensaje;
	
	public JornadaL() {
		in = new Scanner(System.in);
		opc = 0;
		mensaje = "";
	}
	
	public void Menu_Opc(){
		System.out.println("------MENU Horaros-------:");
		System.out.println("Ingrese una opcion :");
		System.out.println("1. Matutina ");
		System.out.println("2. Vespertina ");
		System.out.println("3. Nocturna");
		System.out.println("4. salir ");
		opc = in.nextInt();
		switch(opc){
		case 1: 
			mensaje = "Matutino: 5:00 a 13:00 horas"; 
			System.out.println(mensaje);
			break;
		case 2:
			mensaje = "Vespertino: 13:00 a 20:00 horas";
			System.out.println(mensaje);	 
			break;
		case 3: 
			mensaje = "Nocturno: 20:00 a 5:00 horas"; 
			System.out.println(mensaje);
			break;
		case 4: 
			mensaje = "adios"; 
			System.out.println(mensaje);
			break;
		default:
			mensaje = "no existe esa opcion";
			break;
		}
		
	}
}


class Menu{
    private int opc;
    private Scanner in;
    public Menu(){
        opc = 0;
        in = new Scanner(System.in);
    }
    public void MostrarMenu(){
        do{ 
            //opciones
            System.out.println(" ");
            System.out.println("---Ingrese Una Opcion---");
            System.out.println("1. Planilla (if's anidados)");
            System.out.println("2. Informe Sueldos (while)");
            System.out.println("3. Horas Extras (For)");
            System.out.println("4. Datos Empleado (Do-while)");
            System.out.println("5. Jornada Laboral (Switch-case)");
            System.out.println("6. SALIR");
            //System.out.println(" ");
            opc = in.nextInt();
            in.nextLine();
            switchMmenu(opc);
        }while(opc !=6);    
    }
    public void switchMmenu(int opc){
        switch(opc){
            case 1:
                System.out.println("Planilla");
                Planilla miPlanilla = new Planilla();
                miPlanilla.ingresoDatos();
                miPlanilla.calcularAumento();
                break;
            case 2:
                System.out.println("Informe de Sueldos");
                InformeSueldos informeSueldo = new InformeSueldos();
                informeSueldo.Informe();
                informeSueldo.MostrarDatos();                    
                break;
            case 3:
                System.out.println("Horas Extras (For)");
                HorasExtras Hextras = new HorasExtras();
                Hextras.CalcHoras();    
                break;
            case 4:
                //pedir datos del empleado y mostrar usando do-while
                System.out.println("do-while");
                Datos DatosEmpleado = new Datos();
                DatosEmpleado.Empleado();
                break;
            case 5:
                System.out.println("Switch");
                JornadaL EJornada = new JornadaL();
                EJornada.Menu_Opc();
                break;
            case 6:
                System.out.println("Salida, adios :)");
                break;
            default :
                System.out.println("Esta opcion es invalida");//en dado caso de que usuario ingrese una opcion mayor a 6 o menor que 1
                break;
        }
    }
}

public class Tarea_1 {
    public static void main(String[] args) {
        Menu miMenu = new Menu();
        miMenu.MostrarMenu();
    }
    
}