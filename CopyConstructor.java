/**                     
                               Copy Constructor
Whenever we pass object reference to the constructor then it io called copy constructor
Copy constructor copies all the contents of one object to another object with the help of reference variable
*/
class Constructor{
	int a;   String b;
	Constructor(int x, String y){
		a=x;
		b=y;
		System.out.println(a+" "+b);
	}
	Constructor(Constructor ref){
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
class CopyConstructor{
	public static void main(String[] args){
		Constructor r=new Constructor(10,"Nitesh");
		Constructor r2=new Constructor(r);
		
	}
	
}
