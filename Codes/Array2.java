
import java.util.*;
class Array2{
    public static void main(String[] args) {
    
        //Leader in an array
        int []a = {2,7,6,1,4,3};
        int []leaderAnswer = leadersInAnArray(a);
        System.out.println("Leaders in an Array: ");
        for(int i=0;i<leaderAnswer.length;i++){
        	System.out.print(leaderAnswer[i]+" ");
        }
    		System.out.println();
        
        //Find all subarrays of an array
        int []test = {1,2,3,4};
        findAllSubarrays(test);
        
        //Maximum sum subarray
        int []a1 = {6,-7,4,-2,1,5,-4};
        int maxSumAns = maximumSumSubarray(a1);
        System.out.println("Maximum Sum Subarray:"+maxSumAns);
        
        //Container with most Water
        int []a2 = {1,8,6,2,5,4,8,3,7};
        int mostWater = containerWithMostWater(a2);
        
        //Print frequency of all Elements in a Sorted array
        int []a3 = {1,1,2,2,2,3};
        int []frequencyAns = printFrequency(a3);
        for(int i=0;i<frequencyAns.length;i++){
        	System.out.println((i+1) +":"+frequencyAns[i]);
        }
    }
    
    public static int[] leadersInAnArray(int []a){
    	//Brute force O(n^2)
    	int n = a.length;
    	int index = 0;
    	int []ans = new int[n];
    	// for(int i=0;i<n;i++){
    	// 	boolean isleader = true;
    	// 	for(int j=i+1;j<n;j++){
    	// 		if(a[i] < a[j]){
    	// 			isleader = false;
    	// 			break;
    	// 		}
    	// 	}
    	// 	if(isleader){
    	// 		ans[index++] = a[i];
    	// 	}
    	// }
    	// ans[index] = 0;
    	
    	//Optimal Apprach Traversing from right to left
    	int max = a[n-1];
    	 ans[index++] = 0;
    	//Below using collection
    	 // ArrayList<Integer> ans= new ArrayList<>();
    	for(int i=n-2;i>0;i--){
    		if(a[i] > max){
    			// ans.push = a[i];
    			ans[index++] = a[i];
    			max = a[i];
    		}
    	}
    	for(int i=0;i<n/2;i++){
    		int temp = ans[i];
    		ans[i] = ans[n-i-1];
    		ans[n-i-1] = temp;
    	}
    	return ans;
    }
    
    public static void findAllSubarrays(int []a){
    	int n = a.length;
    	 int []ans = new int[n];
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			for(int k=i;k<=j;k++){
    				System.out.print(a[k]+" ");
    			}
    		System.out.print("/");
    			
    		}
    		System.out.println();
    	}
    }
    
    public static int maximumSumSubarray(int []a){
    	int n = a.length;
    	int currMax = 0;
    	int max = Integer.MIN_VALUE;
    	for(int i=0;i<n;i++){
    		currMax += a[i];
    		max = Math.max(max,currMax);
    		if(currMax < 0) currMax = 0;
    	}
    	return max;
    }
    
    public static int containerWithMostWater(int []a){
    	int n = a.length;
    	return n;
    }
    
    public static int trappingRainWater(int []a){
    	int n = a.length;
    	return n;
    }
    
    public static int[] printFrequency(int []a){
    	int n = a.length;
    	int []ans = new int[n];
    	for(int i=0;i<n;i++){
    		ans[(a[i])-1]++;
    	}
    	return ans;
    }
    
    public static int lengthOfConsecutiveOnes(int []a){
    	int n = a.length;
    	int ans = 0;
    	return n;
    }
}