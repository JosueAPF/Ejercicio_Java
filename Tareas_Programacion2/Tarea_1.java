/*  */
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
