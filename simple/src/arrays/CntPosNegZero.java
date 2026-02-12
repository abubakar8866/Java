package arrays;

public class CntPosNegZero {

	public static void main(String[] args) {
		
		// Count positive, negative, and zero elements.
		int[] arr = {1,2,3,0,0,-7};
		int posCnt=0,negCnt=0,zerCnt=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				posCnt++;
			}else if(arr[i] < 0) {
				negCnt++;
			}else {
				zerCnt++;
			}
		}
		
		System.out.println("Positive count = "+posCnt+",Negative count = "+negCnt+",Zero count = "+zerCnt);

	}

}
