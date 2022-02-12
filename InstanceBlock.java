/**
                       Instance Block
Instance block is similar to method which has no name,
 it can be written inside a class only but not inside a method 
 
 1. It is always executed befor the constructor
 2. we can use variable only inside the instance block not method
 3.we write time consuming code inside a instance block - JDBC connectivity
*/
class Block{
	int a,b;
	static void display(){         //displayed at starting        
	System.out.println("Nitesh");

	}
	 void show(){     //3rd executed
		a=50;b=60;
		System.out.println(a+" "+b);

	}
	Block(){  //2nd executed
	a=10;b=20;	
	System.out.println(a+" "+b);
	}
	{              //1st executed
		a=30;b=40;
		System.out.println(a+" "+b);
	}
}
class InstanceBlock{
	public static void main(String[] args){
		Block.display();
		Block ref=new Block();
		ref.show(); 
	}
}
