/*josue Abraham Porras Figueroa 0901-15-18671*/

package com.PacketeProyectos;

import java.util.ArrayList;//para el manejo de arrays pero en este caso de objetos
import java.util.Scanner;//para las entradas de usuario
import java.time.LocalDate;//uso de localdate para obtener la fecha actual


//con sus respectivos metodos getters y setters,toString generados con la ide de eclipse y metodos para insercion de datos y iterar el array
class Facturas {
    private String Nit;// debe ser strign para aceptar los caracters de una factura real
    private String Cliente;
    private ArrayList<Producto> Listaproductos;//aqui vine a parar los productos

    public Facturas() {
        Listaproductos = new ArrayList<>();
        Nit = "";
        Cliente = "";
    }

    public void setNit(String nit) {
        this.Nit = nit;
    }

    public String getNit() {
        return Nit;
    }

    public void setCliente(String cliente) {
        this.Cliente = cliente;
    }

    public String getCliente() {
        return Cliente;
    }

    public LocalDate ObtenerFecha() {
        return LocalDate.now();
    }

    public void agregarProducto(Producto producto) {
        Listaproductos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return Listaproductos;
    }
    
    //
    public double calcularTotalFactura() {
        double total = 0;
        for (Producto producto : Listaproductos) {
            total += producto.calcularPrecioTotal(0.12);
        }
        return total;
    }

    public String toString() {
        return "Nit: " + Nit + " Cliente: " + Cliente + " de Fecha: " + ObtenerFecha();
    }
}


class Producto {
    private int codigo;
    private String nombreProducto;
    private double precioUnitario;
    private int cantidad;
    private double subTotal;
    private double impuesto;
    private double descuento;
    private double precioTotal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularSubTotal() {
        subTotal = precioUnitario * cantidad;
        return subTotal;
    }
    
    //descuento aplicado dependiendo de la cantidad a llevar por el usuario
    public double calcularDescuento() {
        if (cantidad >= 3 && cantidad <=5) {
            descuento = 0.05; // 5% de descuento para 3-5 unidades
        } else if (cantidad >= 5 && cantidad <=10) {
            descuento = 0.10; // 10% de descuento para >5-10 unidades
        } else if (cantidad > 10) {
            descuento = 0.15; // 15% de descuento para 10 o más unidades
        } else {
            descuento = 0;
        }
        return subTotal * descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public double calcularImpuesto(double tasaImpuesto) {
        impuesto = calcularSubTotal() * tasaImpuesto;
        return impuesto;
    }

    public double calcularPrecioTotal(double tasaImpuesto) {
        subTotal = calcularSubTotal();
        double montoDescuento = calcularDescuento();
        impuesto = (subTotal - montoDescuento) * tasaImpuesto;
        precioTotal = subTotal - montoDescuento + impuesto;
        return precioTotal;
    }
}

class miFactura {
    private ArrayList<Facturas> listaFacturas;//un nuevo array lamacenara los datos de la factura
    private Scanner in;

    public miFactura() {
        listaFacturas = new ArrayList<>();
        in = new Scanner(System.in);
    }
    
    //0901-15-18671 josue abraham porras figuroa
    public void mostrarTitulo() {
        System.out.println("\n========Sistema de Facturacion========");
        System.out.println("=====Josue Abraham Porras Figueroa=====");
        System.out.println("==============Menu=====================");
    }

    public void CrearFactura() {
        Facturas factura = new Facturas();
        System.out.println("Ingrese un Nit :");
        factura.setNit(in.nextLine());
        System.out.println("Ingrese el Nombre del Cliente :");
        factura.setCliente(in.nextLine());
        System.out.println("de Fecha : " + factura.ObtenerFecha());
        
        char continuar;
        do {
            Producto producto = new Producto();
            System.out.println("Codigo de Producto (solo numeros):");
            producto.setCodigo(in.nextInt());
            in.nextLine();
            System.out.println("Nombre del Producto :");
            producto.setNombreProducto(in.nextLine());
            System.out.println("Precio Unitario :");
            producto.setPrecioUnitario(in.nextDouble());
            System.out.println("Cantidad a llevar :");
            producto.setCantidad(in.nextInt());
            in.nextLine();

            factura.agregarProducto(producto);

            System.out.println("Seguir ingresando productos (s/n)");
            continuar = in.nextLine().toLowerCase().charAt(0);
        } while (continuar == 's');

        listaFacturas.add(factura);
    }

    public void DatosFactura() {
        if (listaFacturas.isEmpty()) {
            System.out.println("No hay facturas registradas.");
            return;
        }
        
        //visualizando los datos ingresados por el usurio 
        for (Facturas factura : listaFacturas) {
        	System.out.println("-----------------------------------------------------------------");
            System.out.println("Factura para: " + factura.getCliente());
            System.out.println("NIT: " + factura.getNit());
            System.out.println("Fecha: " + factura.ObtenerFecha());
            System.out.println("Productos:");
            for (Producto producto : factura.getProductos()) {
                System.out.println("  - " + producto.getNombreProducto() + 
                                   " (Cantidad: " + producto.getCantidad() + 
                                   ", Precio unitario: Q" + producto.getPrecioUnitario() + 
                                   ", Subtotal: Q" + producto.calcularSubTotal() + 
                                   ", Descuento: Q" + producto.calcularDescuento() + 
                                   ", Precio con descuento: Q" + (producto.calcularSubTotal() - producto.calcularDescuento()) + ")");
            }
            System.out.println("Total de la factura (con descuentos e IVA): Q" + factura.calcularTotalFactura());
            System.out.println("--------------------");
        }
    }
    
    //aplicando el iva a listaFacturas
    public void mostrarProductosConIVA() {
        if (listaFacturas.isEmpty()) {
            System.out.println("No hay facturas registradas.");
            return;
        }
        
        for (Facturas factura : listaFacturas) {
            System.out.println("Factura para: " + factura.getCliente());
            System.out.println("Productos con IVA:");
            for (Producto producto : factura.getProductos()) {
                System.out.println("  - " + producto.getNombreProducto() + 
                                   " (Precio con IVA: Q" + producto.calcularPrecioTotal(0.12) + ")");
            }
            System.out.println("-------------------------------");
        }
    }

    //valores totales acomulados por cada factura acomulara el precio total final y lo almacenar
    public void calcularTotales() {
    	//si el array esta vacio para desplegar que no tiene elementos actualmente
        if (listaFacturas.isEmpty()) {
            System.out.println("No hay facturas registradas.");
            return;
        }
        
        
        double totalGeneral = 0;
        for (Facturas factura : listaFacturas) {
            double totalFactura = factura.calcularTotalFactura();
            System.out.println("Total de la factura para " + factura.getCliente() + ": Q" + totalFactura);
            totalGeneral += totalFactura;
        }
        System.out.println("Total general de todas las facturas: Q" + totalGeneral);
    }
    
    public void DescuentosDelDia(){
    	System.out.println("\nDescuetnto para : "+LocalDate.now());
    	
    	System.out.println("\n al llevar de 3 a 5 productos");
    	System.out.println("5% de descuento ");
    	
    	System.out.println("\n al llevar mas de 5 a 10 productos");
    	System.out.println("10% de descuento ");
    	
    	System.out.println("\n al llevar 10 productos");
    	System.out.println("15% de descuento ");

	}
    //menu opciones
    public void menuFacturas() {
        boolean opcion = true;
        while (opcion) {
            mostrarTitulo();
            System.out.println("1. Nueva Factura ");
            System.out.println("2. Mostrar facturas Emitidas");
            System.out.println("3. Listado de Productos vendidos");
            System.out.println("4. Calcular totales acomulados");
            System.out.println("5. Ver descuentos del dia ");
            System.out.println("6. Salir\n");
            System.out.print("Seleccione una opción: ");
            int opcSalir = in.nextInt();
            in.nextLine();
            System.out.print("\n");

            switch (opcSalir) {
                case 1:
                    CrearFactura();
                    break;
                case 2:
                    DatosFactura();
                    break;
                case 3:
                    mostrarProductosConIVA();
                    break;
                case 4:
                    calcularTotales();
                    break;
                case 5:
                	DescuentosDelDia();
                    break;
                case 6:
                	//opcion de salida 
                    System.out.println("Gracias por su compra :)");
                    opcion = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}


//main
public class PrimerProyecto {
    public static void main(String[] args) {
        miFactura EmitirFactura = new miFactura();
        EmitirFactura.menuFacturas();
    }
}