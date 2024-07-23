/*Pila estatica java
 *Operaciones:

 insercion,mostrar Datos y Eliminacion
 apilar,mostrar y desapilar
 *
 *
 * */
class Pila{
   private int tope;
   private int[] pila;
   private int size=5;
   
   public Pila(){
      tope = -1;
      pila = new int[size];//debe insertarce el tamaño antes
   } 
   //add data to stack
   public void Push(int x){
      if(tope>=(size -1)){
         System.out.println("la Pila esta llena");
      }else{
         System.out.println("Insercion");
         tope++;
         pila[tope]=x;
      }
      System.out.println("Se ha Insertado :"+x);
   }
   //show data
   public void MostrarDatos(){
      System.out.println("Mostrando los datos");
      for(int i=tope;i>=0;i--){
         System.out.println(pila[i]);
      }
   }
   //del data
   public int Pop(){
      System.out.println("Eliminar un dato");
     if(tope==-1){
      System.out.println("Nada que borrar, la pila esta vacia");
      return 0;
     }else{
      //para devolver el dato verdadero
      int DatoPila = pila[tope];
      tope--;
      return DatoPila;
     }
   }
}

//main
public class PilaEstatica{
   public static void main(String[] args){  
       Pila stack = new Pila();
       stack.Push(1);
       stack.Push(2);
       stack.Push(3);
       stack.Push(4);
       stack.Push(5);
       stack.MostrarDatos();
       System.out.println("Dato eliminado : "+stack.Pop());
       stack.MostrarDatos();
   }

}