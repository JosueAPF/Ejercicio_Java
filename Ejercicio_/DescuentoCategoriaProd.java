/*
    para cada categoria de productos exite un descuennto diferente
    1.ropa 20%
    2.Electrodomesticos 10%
    3.Alimentos 5%
    4.Deportes 30%
    :)
*/
import java.util.Scanner;

//superClass Productos
class Productos{
    private String Nombre;
    private int precio;
    private String Categoria;
    private Scanner in;    
    
    public Productos(){
        Nombre = "";
        precio = 0;
        Categoria = "";
        in = new Scanner(System.in);
    }
    public void IngesoDatos(){
        System.out.println("Ingresse el Nombre del Producto :");
        Nombre = in.nextLine();
        System.out.println("Ingresse el Precio del Producto :");
        precio = in.nextInt();
        in.nextLine();
        System.out.println("Ingresse la Categoria del Producto :");
        Categoria = in.nextLine();
    }
    //metodo que retona la entrada del usuario Categoria
    public String getCategoria(){
        return Categoria;
    }
    //metodo que retorna la entrada del usuario Precio
    public int getPrecio(){
        return precio;
    }
}


//clase hija o subClass Descuentos
class Descuentos extends Productos{
    private double descuento;
    public String categorias;
    public double miPrecio;
    public double PrecioFinal;
    public Descuentos(){
        super();//hereda todo de la superClass
        descuento = 0.0;
    }
    public void CalcularDescuento(){
        //neseario llamar los metodos en donde los vamos a usar
        categorias = getCategoria();
        miPrecio = getPrecio();
        switch(categorias){
            case "ropa":
                System.out.println("Categoria Ropa");
                descuento = 0.20;
                break;
            case "electrodomesticos":
                System.out.println("Categoria Electrodomesticos");
                descuento = 0.10;
                break;
            case "alimentos":
                System.out.println("Categoria Alimentos");
                descuento = 0.05;
                break;
            case "deportes":
                System.out.println("Categoria Deportes");
                descuento = 0.30;
                break;
            default:
                System.out.println("---------");
                break;
        }
        PrecioFinal = miPrecio -(miPrecio * descuento);
    }
    public void aplicandoDescuento(){
            System.out.printf("Descuento Aplicado: %.2f", PrecioFinal);
    }
    
}
public class DescuentoCategoriaProd {
    public static void main(String[] args) {
        //instanciar
        Descuentos ProducDescuent = new Descuentos();
        //llamada de uno de los metodos de la superClass
        ProducDescuent.IngesoDatos();
        //metodos de la clase Descuentos
        ProducDescuent.CalcularDescuento();
        ProducDescuent.aplicandoDescuento();
    }
    
}