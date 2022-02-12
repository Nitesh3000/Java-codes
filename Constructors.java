class Test{
	int a;
	String b;
	/*Test(){         //constructor name should be same as class name and it should not have any return type
	   a=0;           //constructor initializes the instatnce variable which is a part of object of the class
	   b=null;        //without this constructor also the compiler itself gives the initializing  or default values
	}*/
	void show(){
		System.out.println(a+" "+b);
	}
}
class Constructors{
	public static void main(String args[]){
		Test obj=new Test();
		obj.show();
	}
}