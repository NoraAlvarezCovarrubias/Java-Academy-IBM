package challenges;

import java.util.Arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		int f;
		int[][] arr=new int[4][4];
		int left=0;// Dirección izquierda
		int right=arr[0].length-1;//Dirección derecha
		int top=0;//Hacia arriba
		int bottom=arr.length-1;//Hacia abajo
		
		String direction="right";// La dirección a recorrer
		int temp=1;
		while(left<=right&&top<=bottom){
			if(direction.equals("right")){
				for(int i=left;i<=right;i++){
					arr[top][i]=temp++;
				}
				// Atraviesa el límite de izquierda a derecha, listo para atravesar hacia abajo, lo anterior ha atravesado una línea, entonces arriba ++
				top++;
				direction="bottom";
			}else if(direction.equals("bottom")){
				for(int i=top;i<=bottom;i++){
					arr[i][right]=temp++;
				}
				// Atravesar desde el límite superior al inferior, listo para atravesar hacia la izquierda, una columna ha sido atravesada a la derecha, entonces a la derecha--
				right--;
				direction="left";
			}else if(direction.equals("left")){
				for(int i=right;i>=left;i--){
					arr[bottom][i]=temp++;
				}
				// Atraviesa el límite de derecha a izquierda, listo para atravesar hacia arriba, la siguiente línea ha sido atravesada, así que abajo ...
				bottom--;
				direction="top";
			}else if(direction.equals("top")){
				for(int i=bottom;i>=top;i--){
					arr[i][left]=temp++;
				}
				// Atravesar desde el límite inferior hacia el superior, listo para atravesar hacia la derecha, la izquierda ha atravesado una columna, entonces la izquierda ++
				left++;
				direction="right";
			}
		}
		
		//Muestro las filas de la matriz haciendo uso de la libreria "Arrays"
        for (f=0 ; f < arr.length ; f++){
            System.out.println(Arrays.toString(arr[f]));
        }
	}

}
