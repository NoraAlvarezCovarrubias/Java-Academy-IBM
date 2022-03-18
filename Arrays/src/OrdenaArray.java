import java.util.Arrays;

public class OrdenaArray {

	public static void main(String[] args) {
		int[] numbers= new int[] {6,3,1,2,7,5,4,8,9};
		
		odenaArrays(numbers);
		ordenaAMano(numbers);

	}
	
	public static void odenaArrays(int[] arrays) {
		Arrays.sort(arrays);
		for (int n : arrays) {
		       System.out.println(n);                                                                                     
		}
	}
	
	public static void ordenaAMano(int[] arrays){

			for(int i=0;i<arrays.length-1;i++) {

				int min=i;
				for(int j=i+1;j<arrays.length;j++) {
					if(arrays[j]<arrays[min]) {
						min=j;
					}
				}
				if(i!=min){
				int aux =arrays[i];
				arrays[i]=arrays[min];
				arrays[min] = aux;}
			}
			
			System.out.println("Los numeros de menor a mayor son :");
			for(int k=0; k<arrays.length;k++)
				System.out.println(arrays[k]);
			
	}

}
