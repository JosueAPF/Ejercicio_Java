//utilizando composición

import java.util.Scanner;
import java.util.ArrayList;

class Factura{

   private String Nit,Cliente,Fecha; //porq que string? para usar numeros y letras
   private ArrayList<Productos> productos;//para que cada factura puede tener mas de un producto
   
   public Factura(){
      Nit = "";
      Fecha = "";
      Cliente =""; 
      productos = new ArrayList<>();
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
   //metodos para agregarle a el array los productos
   public void agregarProducto(Productos producto){
      productos.add(producto);
   }
   //mostrara los elementos del array
   public ArrayList<Productos> getProductos(){
         return productos;
   }
   
   @Override
   public String toString(){
      return "\n\t\t\t"+"Nit :"+Nit+
             "\n\t\t\t"+"Cliente :"+Cliente+
             "\n\t\t\t"+"Fecha :"+Fecha;                                   
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
    public double SubTotalProducto(){
         return PrecioUnit*Cantidad;
    }
    public double ImpuestoProducto(){
         double iva = 0.12;
         return PrecioUnit*iva;
    }
    public double Total(){
         //subtotal_con_impuesto_producto = (precio_unitario + impuesto_producto) * cantidad
         double impuestoAplicado = ImpuestoProducto();
         return (PrecioUnit+impuestoAplicado)*Cantidad;
    }
    @Override
    public String toString(){
      return  "\n"+"Codigo :"+Codigo+
              "\n"+"Producto :"+Producto+
              "\n"+"Cantidad :"+Cantidad+                                   
              "\n"+"Precio Unitario :"+PrecioUnit;   
    }
}


class adminFacturas{
    //instancia de las clases 
    private Factura myFactura;
    //control del ciclo while y salida del menu
    private boolean Opcion;
    private int opcSalir;
    //instancia de Scanner
    private Scanner in;  
    //instancia del  ArrayList de tipo Object para Captura cualquier Tipo de Dato
    private ArrayList<Object> ListaFactura; 
   
   
   public adminFacturas(){
       Opcion = true;
       opcSalir=1;
       in = new Scanner(System.in);
       myFactura = new Factura();
       ListaFactura = new ArrayList<>();
   }
   public void MostrarTitulo(){
         System.out.println("\n========Systema de Facturacion========");
         System.out.println("=====Josue Abraham Porras Figuero=====");
         System.out.println("================Menu=======================");
   }
   public void IngresoDatos(){
       //para que se ingrese mas de un producto
       char continuar;
       
       //datos de ingreso para la class Factura
       System.out.println("Ingrese Nit :");
       myFactura.setNit(in.nextLine());
       System.out.println("Ingrese Cliente :");
       myFactura.setCliente(in.nextLine());
       System.out.println("Ingrese Fecha :");
       myFactura.setFecha(in.nextLine());
       ListaFactura.add(myFactura);
             
      
       do{
         Productos myProducts = new Productos();
        //datos de ingreso para la class Producto
         System.out.println("Ingrese Codigo :");
         myProducts.setCodigo(in.nextLine());
         System.out.println("Ingrese Producto :");
         myProducts.setProducto(in.nextLine());
         System.out.println("Ingrese Cantidad :");
         myProducts.setCantidad(in.nextInt());
         in.nextLine();
         System.out.println("Ingrese precio por Unidad :");
         myProducts.setPreicoUnitario(in.nextDouble());
         in.nextLine();
         myFactura.agregarProducto(myProducts);
         
         
         System.out.println("Desea Continuar :(S/N):");
         continuar = in.nextLine().charAt(0);
       }while(continuar == 's');
   }
   public void Procedimientos(){
         double subtotal = 0;
         double totalImpuestos = 0;
         double totalPagar = 0;
         
         
        for (int i = 0; i < myFactura.getProductos().size(); i++) {
            Productos producto = myFactura.getProductos().get(i);//pararecupera un objeto Productos del ArrayList<Productos> 
            subtotal += producto.SubTotalProducto();
            totalImpuestos += producto.ImpuestoProducto() * producto.getCantidad();
            totalPagar += producto.Total();
        }
        //totales acomulados
        System.out.println("\nSubtotal: " + subtotal);
        System.out.println("Total Impuestos: " + totalImpuestos);
        System.out.println("Total a Pagar: " + totalPagar);
   }
   public void Factura(){     
        System.out.println("Datos de la Factura");
        for(int i=0;i<ListaFactura.size();i++){
            System.out.println("Factura no :"+(i+1));
            System.out.println(ListaFactura.get(i));
        }
        System.out.println("Datos Producto");
        for (int i = 0; i < myFactura.getProductos().size(); i++) {
             System.out.println(myFactura.getProductos().get(i));
         }
        
        
   }
   public void MenuFacturas(){
       
       while(Opcion){
            MostrarTitulo();
            System.out.println("1. Nueva Factura Factura ");
            System.out.println("2. Mostrar factura");
            System.out.println("3. Calcular totales");
            System.out.println("4 Salir\n");
            System.out.print("Seleccione una opcion: ");
            opcSalir = in.nextInt();
            in.nextLine();
            System.out.print("\n");
           
           switch(opcSalir){
               case 1:
                    System.out.println("Ingreso Datos Factura Y Producto");
                    IngresoDatos();
                    break;
               case 2:
                    System.out.println("Mostrar factura");
                    Factura();
                break;
                case 3:
                     System.out.println("Calcular totales");
                     Procedimientos();
                     break;
                 case 4:
                     System.out.println("Salida");
                     Opcion = false;
                     break;  
               default:
                    System.out.println("Opcion no valida");
                    break;
           }
      }  
   }
}

public class ProyectoFactura{
	public static void main(String[] args){    
      System.out.println("\n");
      adminFacturas myGestor = new adminFacturas();
	   myGestor.MenuFacturas();        
	}
}

