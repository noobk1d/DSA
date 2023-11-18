import java.util.Arrays;  
class Array1{
    public static void main(String[] args) {
    
        int []a1 = {1,2,5,4,6};
        //Find an element
        int result = findElement(a1,3);
        if(result == -1){
        	System.out.println("Not Found");
        }else{
        	System.out.println("Element Found at Index :"+result);
        }
        //Delete an element
        System.out.println("Delete an element:");
        int eles = deleteElement(a1,2);
        for(int i=0;i<eles;i++){
        	System.out.println(a1[i]);
        }
        //Largest Number
        System.out.println("Largest Number:"+largestNumber(a1));
        //Second Largest 
        System.out.println("Second Largest Number:"+secondLargest(a1));
        
        //Remove Duplicates
        int []a2 = {1,1,2,3,3,4};
        int ans = removeDuplicates(a2);
        System.out.println("By Removing Duplicates:");
        for(int i=0;i<ans;i++){
        	System.out.println(a2[i]);
        }
        
        //Smallest Number
        int smallest = smallestNumber(a1);
        System.out.println("Smallest No:"+smallest);
        
        //Third Largest Number
        System.out.println("Third Largest Number:"+thirdLargest(a1));
        
        //Array Sorted
        int []a3 = {1,2,6,4,5};
        System.out.println("Array is Sorted:"+isArraySorted(a3));
        
        //Reverse an array
        System.out.println("Reversed array");
        // int []reverseArray = reverseArray[a3];
        reverseArray(a3);
        for (int i=0; i<a3.length; i++) {
        	System.out.print(a3[i]+" ");
        }
        
        //Greatest Element on Right Side
        System.out.println();
        System.out.println("Greatest On Right:");
        int []greatestOnRight = greatestElementOnRight(a3);
        for(int i=0;i<greatestOnRight.length;i++){
        	System.out.print(greatestOnRight[i]+" ");
        }
    }
    
    public static int deleteElement(int []a,int n){
    	int len = a.length;
    	int i=0;
    	for(; i < len; i++){
    		if(a[i] == n){
    			break;
    		}
    	}
    	if(i == n) return n;
    	for(int j=i; j<len-1; j++){
    		a[j] = a[j+1];
    	}
    	return len-1;
    }
    
    public static int findElement(int []a,int key){
 		int res = -1;
 		int i=0;
 		int n = a.length;
 		for(; i<n; i++){
 			if(a[i] == key){
 				res = i;
 				break;
 			}
 		}
 		return res;
 }
 
 	public static int largestNumber(int []a){
 		int res = a[0];
 		int length = a.length;
 		for(int i=1; i<length; i++){
 			if(a[i] > res){
 				res = a[i];
 			}
 		}
 		return res;
 	}
 	
 	public static int secondLargest(int []a){
 		int result = -1;
 		int length = a.length;
 		//O(2n) approach
 		// int largestNumber = largestNumber(a);
 		// for(int i=0; i<length; i++){
 		// 	if(a[i] < largestNumber && (a[i] > result || result == -1){
 		// 		result = a[i];
 		// 	}
 		// }
 		// return result;
 		
 		//Approach 2 Sort array O(nlogn) Solution not appropriate Ex : 1 4 5 6 6 
 		// 5 is the ans as 6 repeats 2 times which is highest.Ans according to this is 6.
 		//Solution for unique elements.
 		// Arrays.sort(a);
 		// for(int i=0;i<length;i++){
   //      	System.out.println(a[i]);
   //      }
 		// return a[length-2];
 		
 		//O(n) Two variable
 		int largestNumber = a[0];
 		for(int i=1; i<length;i++){
 			if(a[i] > largestNumber){
 				result = largestNumber;
 				largestNumber = a[i];
 			}else if(a[i] < largestNumber){
 				if(result == -1 || a[i] > result){
 						result = a[i];
 				}
 			}
 		}
 		return  result;
 	}
 	
 	public static int removeDuplicates(int []a){
 		//By checking next element
 		//Using Extra Array
 		int length = a.length;
 		int []ans = new int[length];
 		int j = 0;
 		for(int i=0; i<length-1; i++){
 			if(a[i] != a[i+1]){
 				ans[j++] = a[i];	
 			}
 		}
 			ans[j++] = a[length-1];
 		for(int i=0;i<j;i++){
 			a[i] = ans[i];
 		}
 		return j;
 		
 		//Without Extra Array
 		// for(;i < length -1; i++){
 		// 	if(a[i] != a[i+1])
 		// 		a[j++] = a[i];
 		// }
 		// a[j++] = a[length-1];
 		// return j;
 		
 		//Using two pointer
 		// int length = a.length;
 		// int []ans = new int[length];
 		// int j=0;
 		// ans[j] = a[0];
 		// for(int i=1;i<length;i++){
 		// 	if(ans[j] != a[i]){
 		// 		ans[++j] = a[i];
 		// 	}
 		// }
 		// for(int i=0;i<=j;i++){
 		// 	a[i] = ans[i];
 		// }
 		
 		//Without using Extra Array
 		// for(int i=1;i<length;i++){
 		// 	if(a[j] != a[i]){
 		// 		a[++j] = a[i];
 		// 	}
 		// }
 		// return j+1;
 	}
 	
 	public static int smallestNumber(int []a){
 		int ans = a[0];
 		for(int i=0; i<a.length; i++){
 			if(a[i] < ans){
 				ans = i;
 			}
 		}
 		return ans;
 	}
 	
 	public static int thirdLargest(int []a){
 		int length =a.length;
 		//O(nlogn) approach doesnt work if elements arent unique
 		// Arrays.sort(a);
 		// return a[length-3];
 		
 		//Native approach Finding all L,Sl,TL O(3n)
 		//int largest = largestNumber(a);
 		// int secondLargest = secondLargest(a);
 		// int thirdLargest = -1;
 		// for(int i=0;i<a.length;i++){
 		// 	if(a[i] < secondLargest && (a[i] > thirdLargest || thirdLargest == -1)){
 		// 		thirdLargest = a[i];
 		// 	}
 		// }
 		int largest = a[0];
 		int secondLargest = -1;
 		int thirdLargest = -1;
 		for(int i=1;i<length;i++){
 			if(a[i] > largest){
 				thirdLargest = secondLargest;
 				secondLargest = largest;
 				largest = a[i];
 			}else if(a[i] < largest){
 				if(a[i] > secondLargest || secondLargest == -1){
 					thirdLargest = secondLargest;
 					secondLargest = a[i];
 				}
 			}else if(a[i] < secondLargest){
 				if(a[i] > thirdLargest){
 					thirdLargest = a[i];
 				}
 			}
 		}
 		return thirdLargest;
 	}
 	
 	public static boolean isArraySorted(int []a){
 		boolean ans = true;
 		for(int i=1;i<a.length-1;i++){
 			if(a[i] < a[i-1] || a[i] > a[i+1]){
 				ans = false;
 				break;
 			}
 		}
 		return ans;
 	}
 	
 	public static void reverseArray(int []a){
 		int l = 0;
 		int r = a.length-1;
 		System.out.println(r);
 		while(l < r){
 			int temp = a[l];
 			a[l] = a[r];
 			a[r] = temp;
 			l++;
 			r--;
 	 		}
 	}
 	
 	public static int[] greatestElementOnRight(int []a){
 		int []ans = new int[a.length];
 		//Brute Force O(n^2)
 		// for(int i=0;i<a.length;i++){
 		// 	int greatest = a[i];
 		// 	// System.out.println(greatest);
 		// 	for(int j=i+1;j<a.length;j++){
 		// 		if(a[j] > greatest){
 		// 			greatest = a[j];
 		// 		}
 		// 	}
 		// 	ans[i] = greatest;
 		// }
 		// ans[a.length-1] = 0;
 		
 		//Optimal Approach Traversing from right to left
 		int greatest = a[a.length-1];
 		for(int i=a.length-2;i>=0;i--){
 			if(a[i] > greatest){
 				greatest = a[i];
 				System.out.println(greatest);
 			}
 			ans[i] = greatest;
 		}
 		ans[a.length-1] = 0;
 		return ans;
 	}
}

