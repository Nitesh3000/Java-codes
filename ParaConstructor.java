                         /* Parameterized constructor */
class Constructor{
	/**
	A constructor through which we can pass one or more
	parameters is called parametrized constructor
	*/
	int x,y;
	Constructor(int a,int b){           //Parameterized
		x=a; y=b;
	}
	Constructor(int a,String b){           //Parameterized
	System.out.println(a+ " " +b);
	}
	void show(){
		System.out.println(x+ " " +y);
	}
	
}
class ParaConstructor{
	
	public static void main(String[] args){
		Constructor obj= new Constructor(100,200);
		Constructor ob= new Constructor(10,"Nitesh");
		obj.show();
	}
}