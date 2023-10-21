class JavaBasics2{
    public static void main(String[] args) {
    
        int []arr = {1,2,1};
        // findMinMax(arr);
        // printFibonacci(5);
        // factorial(5);
        int []array = {0,1,1,1,0,0};
        ZerosAndOnes(array);
    }
    
    static void findMinMax(int arr[]){
    	int min = arr[0];
    	int max = arr[0];
    	if(arr.length < 2){
    		System.out.println("Min is : "+min+".Max is :"+max);
    	}
    	for(int i=1;i<arr.length;i++){
    		if(arr[i] > max){
    			max = arr[i];
    		}else if(arr[i] < min){
    			min = arr[i];
    		}
    	}
    		System.out.println("Min is : "+min+".Max is :"+max);
    	
    }
    static void ZerosAndOnes(int arr[]){
        
        int length = arr.length;
    	// Approach 1 : O(n^2) Brute Force Checking for Each Element If there is an 
        // element smaller than the current element
        // for(int i = 0;i < length; i++)
        // {
        //     int ele = arr[i];
        //     for(int j = i; j<length; j++){
        //         if(arr[j] < ele){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        
        //Approach 2 : O(2n) Couting Zeros
        // int count = 0;
        // for(int i=0; i<length; i++){
        //     if(arr[i] == 0)
        //         count++;
        // }
        // for(int i=0; i<count; i++){
        //     arr[i] = 0;
        // }
        // for(int i=count; i<length; i++){
        //     arr[i] = 1;
        // }
        
        //Approach 3 : O(n) Two Pointer
        
        
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");    
        }
    }
    
    static void printFibonacci(int a){
    	int t1 =0;
    	int t2 = 1;
    	if(a < 1)
    		return;
    	System.out.print(t1);
    	for(int i=1;i<a;i++){
    	System.out.print(" "+t2);	
    	int next = t1 + t2;
    	t1 = t2;
    	t2 = next;
    	}
    }
    
    static void factorial(int a){
    	if(a <= 1){
    		System.out.println(a);
    		return;
    	}
    	int ans = 1;
    	for(int i =1;i<=a;i++){
    		ans *= i;
    	}
    		System.out.println(ans);
    	
    }
}