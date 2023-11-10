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
 		// 	if(a[i] < largestNumber && a[i] > result){
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
}

