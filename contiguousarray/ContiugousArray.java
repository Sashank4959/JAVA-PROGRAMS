package contiguousarray;
import java.util.*;
import java.io.*;

public class ContiugousArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the binary values i.e,'0' & '1' :- ");
		String [] s=sc.nextLine().split("\\s+");
		int [] nums=new int[s.length];
		//now we want only integers so we converting it into int from string arrays
		for(int i = 0;i<s.length;i++) {
			nums[i]=Integer.parseInt(s[i]);
		}
		int MaxLen=FindMaxLen(nums);
		System.out.println("max length of contigous of array is : "+MaxLen);
		
	}
	private static int FindMaxLen(int []nums) {
		int MaxLen=0;
		int sum=0;
		HashMap<Integer,Integer> SumMap= new HashMap<>();
		SumMap.put(0,-1);
		
		for(int i=0;i<nums.length;i++) {
			int num=(nums[i]==0)? -1:1;
			sum+=num;
			if(SumMap.containsKey(sum)) {
				MaxLen=Math.max(MaxLen,i-SumMap.get(sum));
			}else {
				SumMap.put(sum,i);
				
			}
		}
		return MaxLen;
	}

}
