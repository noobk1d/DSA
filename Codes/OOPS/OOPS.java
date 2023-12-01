 public class OOPS{
 	
     public static void main(String[] args) {
     	//Constructor
     	 demoConstructor dc = new demoConstructor();
     	 
     	 //Static keyword
     	 //using static variable without creating object
     	 System.out.println(demoStatic.a);	
       
       //this keyword
       //Ambiguity in variable name
       demoThis dt = new demoThis("John",20);
      	System.out.println(dt.name+" "+dt.count); 
      	
      	//Inheritance
      	Child c1 = new Child("Cherry",10);
      	// c1.name = "Cherry";
      	// c1.age = 10;
      	c1.info(); 
      	
      	//Polymorphism
      	//Method Overloading
      	demoPolymorphismMethodOverloading p1 = new demoPolymorphismMethodOverloading();
      	p1.sum(10,20);
      	p1.sum(10.10,20.20);  
      	
      	//Method Overriding
      	Car c = new Audi();
      	c.run();    
   }
}
 class demoConstructor{
 	
 	//Constructor for Above class
 	demoConstructor(){
 		System.out.println("demoConstructor");
 	}
 }
 
 class demoStatic{
 	 static int a = 10;
 }
 
 class demoThis{
 	 String name;
 	 int age;
 	 int count = 1;
 	 demoThis(){
 	 	count++;
 	 }
 	 demoThis(String name,int age){
 	 	//Contructor overloading
 	 	this();
 	 	this.name = name;
 	 	this.age = age;
 	 	walking(this);
 	 }
 	 
 	 void walking(demoThis dt){
 	 	System.out.println("Walking increased persons age to:"+(dt.age+10));
 	 }
 }
 
 //Inheritance
 
 class Parent{
 	String name;
 	Parent(String name){
 		this.name = name;
 	}
 }
 
 class Child extends Parent{
 	int age;
 	Child(String name,int age){
 		//Super refers to parent class
 		super(name);
 		this.age = age;
 	}
 	
 	void info(){
 		System.out.println("My name is "+name+" and my age is "+age);
 	}
 }
 //Polymorphism
 
 //Method Overloading(Compile Time)
 //Multiple functions with same name but with with different parameters 
 //then these functions are overloaded
 
 class demoPolymorphismMethodOverloading{
 	int a;
 	int b;
 	
 	static void sum(int a,int b){
 		System.out.println("SUM:"+(a+b));
 	}
 	
 	static void sum(double a,double b){
 		System.out.println("SUM:"+(a+b));
 		
 	}
 }
 
 //Method Overriding
 class Car{
 	void run(){
 		System.out.println("Running");
 	}
 }
 
 class Audi extends Car{
 	void run(){
 		System.out.println("Running inside Audi");
 	}
 }
 
 
 //Inner Class