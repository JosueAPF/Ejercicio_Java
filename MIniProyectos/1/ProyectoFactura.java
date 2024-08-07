//utilizando composición

import java.util.Scanner;

class Factura{

   private String Nit;
   private String Cliente;
   private String Fecha; //porq que string? para usar numeros y letras
   
   public Factura(String nit,String cliente,String fecha){
      this.Nit = nit;
      this.Fecha = fecha;
      this.Cliente = cliente; 
   } 
   //Metodos Getters() - asi obtendre a los atributos
   public String getNit(){
        return Nit;
   }
   public String getCliente(){
        return Cliente;
   }
   public String getFecha(){
        return Fecha;
   }
   
  //  public String toString(){
//         return "---Datos Factura---"+"\n"+" Nit: "+Nit+"\n"+" Cliente : "+Cliente+"\n"+" Fecha Factura: "+Fecha;              
//    }
}


class Productos{
     //código,producto,cantidad,precio unitario
     private String Codigo,Producto;
     private int Cantidad;
     private double PrecioUnit;
     
     public Productos(String code,String prod,int cantidad,double precioU){
         this.Codigo = code;
         this.Producto = prod;
         this.Cantidad = cantidad;
         this.PrecioUnit = precioU;
     }
     public double getPreicoUnitario(){
         return PrecioUnit;
     }
     
    //  public String toString(){
//         return "---Datos Producto---"+"\n"+" Codigo : "+Codigo+"\n"+" Producto : "+Producto+"\n"+" Cantidad : "+Cantidad+"\n"+" Precio Unitario :"+PrecioUnit;              
//    }


}

class GestorFacturas{
   private double impuestoIva,SubTotal,TotalPagar;
   private int Suma;
   private Factura myFactura;
   private Productos myProducts;
   
   
   public GestorFacturas(Factura fact,Productos produc){
      impuestoIva = 0.12;
      Suma = 0;
      SubTotal = 0.0;
      TotalPagar = 0.0;
      this.myFactura = fact;
      this.myProducts = produc;
   }
   public void Calculos(){
        System.out.println(myProducts.getPreicoUnitario());
        double precio = getPreicoUnitario();
   }
   public MenuFacturas(){
      Syste.out.println("Desplege del menu facturas");
      
   }
   

}

public class ProyectoFactura{
	public static void main(String[] args){
      //Facturas
		Factura factura = new Factura("4792-9","el pepe","09-08-24");
      //código,producto,cantidad,precio unitario
      Productos productos = new Productos("00A1","Galletas",12,2.50);
      System.out.println(productos);
      System.out.println("Precio Unitario :"+productos.getPreicoUnitario());
      
      System.out.println("\n");
      GestorFacturas prod = new GestorFacturas(factura,productos);
      prod.Calculos();
	}
}

