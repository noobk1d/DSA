class JavaBasics {
    public static void main(String[] args) {
        // greaterNumber(3,2,1); 
        //Unary Operator
        int a = 5;
        int b = ~a;
        System.out.println(b);
        
        // Bitwise Operator
        int c = a << 1;
         System.out.println(c);
    }
    
    static void greaterNumber(int a,int b,int c){
    	if(a > b){
    		if(a > c){
    			System.out.println("A is Greatest.");
    		}else{
    			System.out.println("B is Greatest.");
    		}
    	}else{
    		if(b > c){
    			System.out.println("B is Greatest.");
    		}else{
    			System.out.println("C is Greatest.");
    		}
    	}
    }
    
    
}