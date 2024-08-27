/*
    Tienda online con carrito de compras:

Crea una clase Producto con atributos como nombre, precio y cantidad en stock.
Crea una clase Carrito con un atributo para almacenar los productos.
Asociación: Un carrito puede contener varios productos.
Arreglos y ordenamiento: Ordena los productos en un carrito por precio de
forma ascendente o descendente.
*/
import java.util.Scanner;
class Producto{
    private String Nombre;
    private int Precio,Stock;
    Producto(String nombre,int precio,int stock){
        this.Nombre = nombre;
        this.Precio =precio;
        this.Stock = stock;
    }
    public String getNombre(){
        return Nombre;
    }
    public int getPrecio(){
        return Precio;
    }
    public int getStock(){
        return Stock;
    }
    
    public String toString(){
        return "Nombre :"+Nombre+
                " Precio :"+Precio+
                " Stock"+Stock;
    }
}

class Carrito{
    private Producto[] productos;
    
    private Scanner in;
    private String Pnombres;
    private int CantProduct,i,Pprecio,Pstock;
    
    Carrito(){
        in = new Scanner(System.in);
        CantProduct = 0;        
    }
    
    public void addProductos(){
        System.out.println("cantidad de Productos");
        CantProduct = in.nextInt();
        in.nextLine();
        productos = new Producto[CantProduct];
        
        i=0;
        while(i<CantProduct){
            
            System.out.println("Nombre Producto :");
            Pnombres = in.nextLine();
            
            System.out.println("Precio  producto :");
            Pprecio = in.nextInt();
            
            System.out.println("Cantidad en Stock  :");
            Pstock = in.nextInt();
            in.nextLine();
            
            
            productos[i] = new Producto(Pnombres, Pprecio, Pstock);
            i++;
        }
    }
    public void OrdenarNombres(){
        for(int i=0;i<productos.length;i++){
            for(int j=i+1;j<productos.length;j++)
                if(productos[i].getNombre().compareTo(productos[j].getNombre())>0){
                  Producto temp = productos[i];
                  productos[i] = productos[j];
                  productos[j] = temp;
                }
        }
    }
    public void OrdenarPrecio(){
        for(int i=0;i<productos.length;i++){
            for(int j=i+1;j<productos.length;j++){
                if(productos[i].getPrecio() < productos[j].getPrecio()){
                    Producto temp = productos[i];
                    productos[i] = productos[j];
                    productos[j] = temp;
                }
            }
        }
    }
    public void Mostrardatos(){
        for(int i=0;i<productos.length;i++){
            System.out.println(productos[i]);
        }
    }
    
}

public class Productos_Vectores {
	public static void main(String[] args) {
		//Producto p = new Producto("caca",999,1000);
		//System.out.println(p);
		Carrito carrito = new Carrito();
		carrito.addProductos();
		System.out.println("\nOrdenando los nombre de mayor a menor");
		carrito.OrdenarNombres();
		carrito.Mostrardatos();
		System.out.println("\nOrdenando los precios de mayor a menor :");
		carrito.OrdenarPrecio();
		carrito.Mostrardatos();
	}
}
