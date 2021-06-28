import java.*;
public class prac_6_20 {
//		메서드명 	: shuffle
//		기 능		:주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 
//				 처리한 배열을 반환한다.
//		반환타입 	: int[]
//		매개변수	: int[] arr  - 정수가  담긴 배열
//		
//		
//		int[]
//		int[] arr - 정수값이 담긴 배열
	public static int [] shuffle(int [] original) {
		int [] arr = new int[9];
		for(int  i = 0; i < 9; i++) {
			int r = (int)(Math.random()*8+1);
			
			/*
			 * 기존값을 보관함에 넣고
			 * 기존값에 랜덤값  넣고
			 * 랜덤값에 보관값을 넣는다
			 */
			
			arr[0]  = original[i];
			original[i] = original[r];
			original[r] = arr[0];
			
			
		} 	//for
		return original;
	} //suffle()
	
	
	public static void main(String[] args) {
		System.out.println();
		int [] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original); 
		System.out.println(java.util.Arrays.toString(result));
	}//main()

}
