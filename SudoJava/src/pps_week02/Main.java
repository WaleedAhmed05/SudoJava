package pps_week02;

public class Main {
	
	public static void main(String[] args) {
		
		
		Card crd = new Card("Luncinda","Holiday");
		crd.greeting();
		//Happy Holiday
		Valentine crd2 = new Valentine("Walter", 7);
		crd2.greeting();
		
		//Dear Walter
		//Happy Valentine
		//XXXXXXX  
		
		
		
	//	DogeCoin dc= new DogeCoin();
	//	Bitcoin bc= new Bitcoin();
		
	//	System.out.println(dc);
	//	System.out.println(bc);
		//args=new String[5];
		//args[0]="hellow";
		//System.out.println(args.length);
	//	Child baby = new Child();
	//	baby.printer();
		
	//	Automatic auto = new Automatic();
		//System.out.println(Rectangle(10,10));
		//Rectange r= new Rectange(10,10);
		//System.out.println(r.toString());
		
	} 
	
	public void mymethod() {
		//TODO
	}
	
	public static int Rectangle(int a, int b) {
		//int var1=a;
		//int var2=b;
		
		return a*b;
	}

}


class Parent {
public void hello() {
//System.out.println(“Hello from parent”);
	System.out.println("Hello Fron Parent");

}

protected int balance() {
	return 100;
}
}

 class Child extends Parent {
public void hello() {
//System.out.println(“Hello from Child”);
	//System.out.println("Hello from Child");
	
}
protected int balance() {
	//super.balance();
	return 10;
	
}
public void printer() {
	System.out.println("Child class "+balance());
	System.out.println("Parent Class "+super.balance());
}
}