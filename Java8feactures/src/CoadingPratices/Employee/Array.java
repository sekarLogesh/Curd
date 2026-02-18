package CoadingPratices.Employee;

public class Array {

	public static void main(String[] args) {
		
		int[] arr = {1,0,2,3,0,5,6};
//		int[] arr2 = new int[arr.length];
//		int index=0;
//		for(int a:arr) {
//			if(a!=0)
//			arr2[index++]= a;
//		}
//		
//		
//		for(int aa2:arr2) {
//			System.out.println(aa2);
//			
//		}
		
		
		int index =0;
		for(int a:arr) {
			if(a!=0)
			arr[index++] =a;
		}
		while(index<arr.length) {
			arr[index++]=0;
		}
for(int aaa:arr) {
	System.out.println(aaa);
}
	}

}
