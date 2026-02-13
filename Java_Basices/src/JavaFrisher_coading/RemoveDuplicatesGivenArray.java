package JavaFrisher_coading;

public class RemoveDuplicatesGivenArray {
	


	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5};
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!= visited) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]== arr[i]) {
						arr[j]=visited;
					}
				}
			}
		}

		for(int a:arr) {
			if(a!=visited) {
				System.out.println(a);
			}
		}
	}

}
