
import java.util.Scanner;

class Datos{
	private int[][] matriz;
	private int dato;
	private Scanner in;

	public Datos(){
		matriz = new int[3][2];//array de 3x2
		in = new Scanner(System.in);
	}
	public void Insercion(){
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.println("Ingrese un valor para la matriz 3x2");
				dato = in.nextInt();
				matriz[i][j]=dato;
			}
		}
	
	}
	public void Recorrido(){
		for(int i=0;i<3;i++){
                	for(int j=0;j<2;j++){
				System.out.println(matriz[i][j]+"\t");
                          }                 
		}
		
		System.out.println( );

	}

}

public class ArrayBidimencional{
	public static void main(String[] args){
		Datos mymatriz = new Datos();
		mymatriz.Insercion();
		mymatriz.Recorrido();
	}
}
