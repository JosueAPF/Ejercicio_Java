/*

link: https://ejerciciosmesa.com/2022/07/01/ejercicios-resueltos-de-programacion-java/
ejercicio#1:
Se pide realizar una aplicación para una empresa que vende figuras de 
superhéroes. Para ello, tendrá que modelar todos los datos relativos a 
estas figuras. Así pues, se pide que programe las siguientes clases:

Clase Superhéroe – que define las características de un superhéroe
Clase Dimensión – que define unas dimensiones (alto, ancho y profundidad)
Clase Figura – que define una figura que representará un superhéroe
Clase Colección – que definirá una colección de figuras de superhéroe
Clase Colección - 
*/
class Superheroe{
   private String Nombre,Descripcion;
   private boolean capa;
   
   public Superheroe(String ENombre){
      Nombre = ENombre;
      Descripcion = "";
      capa = false;
   }
   
   //metodos set 
   public String setNombre(String ENombre){
         return this.Nombre = ENombre;
   }
   
   public String setDescrip(String Desc){
      return this.Descripcion = Desc;
   }
   
   public boolean setcapa(boolean Ecapa){
      return this.capa = Ecapa;
   }
   //metodos get
   public String getNombre(){
      return Nombre;
   }
   public String getDescrip(){
      return Descripcion;
   }
   public boolean getcapa(){
      return capa;
   }
   @Override
   public String toString(){
      return "Nombre :"+Nombre+" Descripcion :"+Descripcion+" Capa: "+capa;
   }

}

class Dimencion{
   private int alto,ancho,profundidad;
   
   public Dimencion(){
      alto=0;
      ancho=0;
      profundidad=0;
   }
   
   public Dimencion(int alto,int ancho,int profundidad){
      this.alto = alto;//this. para referirse al atributo de la clase
      this.ancho = ancho;
      this.profundidad = profundidad;
   }
   //metodos set()
   public int setalto(int alto){
      return this.alto = alto;
   }
   
   public int setancho(int ancho){
      return this.ancho = ancho;
   }
   public int setProfundo(int profundidad){
      return this.profundidad = profundidad;
   }
   
   //metodos get()
   public int getalto(){
      return alto;
   }
   public int getancho(){
      return ancho;
   }
   public int getProfundo(){
      return profundidad;
   }
   public int GetVolumen(){
      //retornara el volumen
      return alto*ancho*profundidad;
   }
   @Override
   public String toString(){
      int VolumenMaximo = GetVolumen();
      return "Nombre :"+alto+" Descripcion :"+ancho+" Capa: "+profundidad+" Volument Maximo : "+VolumenMaximo;
      }
}

class Figura{
   private String Codigo;
   private int Precio;
   private Superheroe SuperFigura;
   private Dimencion dimenciones;
   
   public Figura(String code,int precio,Superheroe superh,Dimencion dimh){
      this.Codigo = code;
      this.Precio = precio;
      this.SuperFigura = superh;
      this.dimenciones = dimh;
    }
    
    //getters
     public String getCodigo(){
      return Codigo;
    }
     public int getPrecio(){
      return Precio;
    }
    //para los objetos-
    public Superheroe getSuperFigura(){
      return SuperFigura;
    }
    public Dimencion getdimenciones(){
      return dimenciones;
    }
    //Setters
     public String setCodigo(String code){
      return this.Codigo = code;
    }
    public int setPrecio(int price){
      return this.Precio = price;
    }
    public void setSuperFigura(Superheroe superheroe) {
        SuperFigura = superheroe;
    }
    public void setDimenciones(Dimencion dim) {
        dimenciones = dim;
    }
    @Override
    public String toString() {
        return "Figura{" +
                "Codigo='" + Codigo + '\'' +
                ", Precio=" + Precio +
                ", SuperFigura=" + SuperFigura +
                ", Dimensiones=" + dimenciones +
                '}';
    } 
}


public class figuras{
   public static void main(String[] args){
      Superheroe obj1 = new Superheroe("pepe");
      obj1.setDescrip("Bueno,Durable");
      obj1.setcapa(true);

      Dimencion obj2 = new Dimencion(5,5,5);
      
      Figura myFigura = new Figura("0A1",100,obj1,obj2);
      System.out.println(myFigura);
   }
   
}
