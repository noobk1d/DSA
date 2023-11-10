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
}

