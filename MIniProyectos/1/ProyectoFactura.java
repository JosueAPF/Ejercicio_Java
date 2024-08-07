//utilizando composición

import java.util.Scanner;

class Factura{

   private String Nit,Cliente,Fecha; //porq que string? para usar numeros y letras
   
   public Factura(){
      Nit = "";
      Fecha = "";
      Cliente =""; 
   } 
   //Metodos Setter() insertar los datos mas adelant
   public String setNit(String nit){
        return this.Nit = nit;
   }
   public String setCliente(String cli){
        return this.Cliente = cli;
   }
   public String setFecha(String fh){
        return this.Fecha=fh;
   }
  
}


class Productos{
     //código,producto,cantidad,precio unitario
     private String Codigo,Producto;
     private int Cantidad;
     private double PrecioUnit;
     
     public Productos(){
         Codigo = "";
         Producto = "";
         Cantidad = 0;
         PrecioUnit = 0.0;
     }
    
    //Metodos Setter() 
    public String setCodigo(String code){
         return this.Codigo = code;
    }
    public String setProducto(String prd){
         return this.Producto = prd;
    }
    public int setCantidad(int Cant){
         return this.Cantidad = Cant;
    }
    //para obtener la cantidad en la clase adminFacturas
    public int getCantidad(){
        return Cantidad;
    }
    public double setPreicoUnitario(double Punitario){
         return this.PrecioUnit = Punitario;
    }
    public double getPresioUnitario(){
        return PrecioUnit;
    }
}

//falta logica de procediminetos agregar el array como rayos ingresar los datos si los tengo por separados
//probar usar toString

class adminFacturas{
    //instancia de las clases 
    private Factura myFactura;
    private Productos myProducts;
    //control del ciclo while y salida del menu
    private boolean Opcion;
    private int opcSalir;
    private int opcData;
    //instancia de Scanner
    private Scanner in;    
   
   
   public adminFacturas(){
       Opcion = true;
       opcSalir=1;
       in = new Scanner(System.in);
       myFactura = new Factura();
       myProducts = new Productos();
   }
   public void IngresoDatos(){
       
       //datos de ingreso para la class Factura
       System.out.println("Ingrese Nit :");
       myFactura.setNit(in.nextLine());
       System.out.println("Ingrese Cliente :");
       myFactura.setCliente(in.nextLine());
       System.out.println("Ingrese Fecha :");
       myFactura.setFecha(in.nextLine());
       
       //datos de ingreso para la class Producto
       System.out.println("Ingrese Codigo :");
       myProducts.setCodigo(in.nextLine());
       System.out.println("Ingrese Producto :");
       myProducts.setProducto(in.nextLine());
       System.out.println("Ingrese Cantidad :");
       myProducts.setCantidad(in.nextInt());
       System.out.println("Ingrese precio por Unidad :");
       myProducts.setPreicoUnitario(in.nextDouble());
       
   } 
   public void Procedimientos(){
       double Punitario = myProducts.getPresioUnitario();
       int CantidadP = myProducts.getCantidad();
       double SubTotal = Punitario*CantidadP;
       double impuestoAplicado = SubTotal*0.12;
           double TotalPagar = (SubTotal + impuestoAplicado);
               
               
               System.out.println("Subtotal: " + SubTotal);
       System.out.println("Impuesto aplicado: " + impuestoAplicado);
       System.out.println("Total a Pagar: " + TotalPagar);
       
       
   }
   public void MenuFacturas(){
       
       while(Opcion){
            System.out.println("-----Menu----");
            System.out.println("1 Ingreso Datos de Facturacion ");
            System.out.println("2 Mostrar Datos de Facturacion");
            System.out.println("3 Salir");
            opcSalir = in.nextInt();
           
           switch(opcSalir){
               case 1:
                    System.out.println("INGRESO DE DATOS");
                break;
               case 2:
                    System.out.println("MOSTRAR LOS DATOS");
                break;
               case 3:
                    System.out.println("Salida del Programa");
                break;
               default:
                    System.out.println("Opcion no valida");
                break;
           }
           System.out.println("Desea seguir ingresando datos si:1 no:0");
           opcData = in.nextInt();
           
           if(opcData !=1){
               System.out.println("Salir");
           }
       }
      
   }
   

}

public class ProyectoFactura{
	public static void main(String[] args){
		      
      System.out.println("\n");
      adminFacturas myGestor = new adminFacturas();
	      myGestor.IngresoDatos();
	      myGestor.Procedimientos();
	      //myGestor.Procedimientos();
	}
}

