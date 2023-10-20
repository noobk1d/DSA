class JavaBasics2{
    public static void main(String[] args) {
    
        int []arr = {1,2,1};
        // findMinMax(arr);
        // printFibonacci(5);
        factorial(5);
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