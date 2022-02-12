class Test{             //A class does not have any storage in memory
	int a=10;
	String s="Nitesh";
	
	void show(){
		
		System.out.println(a+ " " +s);
	}
	
}
class ClassObject{
	public static void main(String args[]){
		Test obj=new Test();                 //after an object of the class is created , it will have some storage in memory
		obj.show();                          //calling a method of different class from another class
	}
	
}