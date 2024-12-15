/**4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;
        int a[]=new int[m+n];
        int i=0, j=0, k=0;  
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                a[k]=nums1[i];
                i++;
            }else{
                a[k]=nums2[j];
                j++;
            }
            k++;
        }
        
        while(i<m){
                a[k]=nums1[i];
                i++;
                k++;
        }
        while(j<n){
                a[k]=nums2[j];
                j++;
                k++;
        }

        if((m+n)%2==1){
            return a[(m+n)/2];
        }else{
            
           int s=(m+n)/2;
            double t=a[s-1];
            double r=a[s];
        
            return (double) (t+r)/2;
        }

    }
}


//main class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            nums2[i] = scanner.nextInt();
        }

        // Creating an instance of the Solution class
        Solution solution = new Solution();

        // Calculating the median of the two sorted arrays
        double median = solution.findMedianSortedArrays(nums1, nums2);

        // Printing the result
        System.out.println("The median of the two sorted arrays is: " + median);

        scanner.close();
    }
}


