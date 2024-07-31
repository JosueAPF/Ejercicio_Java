import java.util.Scanner;

class myarrg{
  private String[] arrg;
  private int[] edad;
  private String dato;
  private int datoE;
  private Scanner in;

  public myarrg(){
	arrg = new String[5];
	edad = new int[5];
	in = new Scanner(System.in);
  }
  public void Insercion(){
	for(int i=0;i<5;i++){
		System.out.println("Ingrese el dato :");
		dato = in.nextLine();
		
		System.out.println("ingrese una edad ");
		datoE = in.nextInt();
		in.nextLine();
        	
		//insercion de los datos a sus arrays
		arrg[i]=dato;
		edad[i]=datoE;
			
	}
  }
  public void Recorrido(){
	for(int i=0;i<5;i++){
		System.out.println("Dato no.["+(i+1)+"]: "+arrg[i]+" "+"Edad : "+edad[i]);
		System.out.println(" ");
	}
  }
	
	
}

public class ArrayBasico{
	public static void main(String[] args){
		myarrg arrg = new myarrg();
		arrg.Insercion();
		arrg.Recorrido();
	}
	
}
