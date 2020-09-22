//the method sumOddLengthSubArray(int[]arr)  : returns the sum of odd length sub array

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SumofElem {

	
	/*public static int[] subArray(int[] arr, int beg, int end) {
		return Arrays.copyOfRange(arr, beg, end+1);
	}*/
	public static int sumOddLengthSubArray(int[]arr) {
		
		
		int sum=0;
		ArrayList<Integer> oddlist=new ArrayList<>();
		
		int i=1;
		while(i<=arr.length) {
			if(i%2!=0) {
				oddlist.add(i);
				//System.out.println("m : "+i);
			}
			i++;
		}
		//java.util.List<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
		int k= 0;
		int m=0;
		while(m<oddlist.size()) {
			//System.out.println("m : "+m);
			k= oddlist.get(m);
			//System.out.println("k : "+k);
			int in=0;
			for (int j2 = 0; j2 < arr.length; j2++) {
				//System.out.println("j2 : "+j2);
				int c=0;
			for (int j = j2; j < j2+k && j<arr.length ; j++) {
				if(j+k>arr.length && c==0) {
					break;
				}
				sum+=arr[j];
					c++;
				}	
			}
			m++;	
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,4,2,5,3};
		System.out.println(SumofElem.sumOddLengthSubArray(a));
	}

}
