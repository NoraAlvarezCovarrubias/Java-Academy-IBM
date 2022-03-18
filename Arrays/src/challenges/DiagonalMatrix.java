package challenges;

import java.util.Arrays;

public class DiagonalMatrix {

	 public static void main(String[] args) {
	        int[][] matriz = new int[5][5];
	        int f;
	    
	        for (f=0 ; f < matriz.length ; f++){
	        	//primera fila
	        	matriz[0][f]=1;
	        	//ultima fila
	        	matriz[matriz.length-1][f]=1;
	            //numero de fila igual que numero de columna
	        	matriz[f][f]=1;
	        	//ahora en el [0][4]---[1][3]--- [2][2]...
	        	matriz[f][matriz.length-(f+1)]=1;
	        }
	   
	        //Muestro las filas de la matriz haciendo uso de la libreria "Arrays"
	        for (f=0 ; f < matriz.length ; f++){
	            System.out.println(Arrays.toString(matriz[f]));
	        }
	    }
}
