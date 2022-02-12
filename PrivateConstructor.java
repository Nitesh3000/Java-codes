/**                              Private Constructor

In java , it is possible to write a constructor as a private
but according to rule we cant acces private members outside the class.
*/
class PrivateConstructor
{
	int a;
	double b;
	String c;
	private PrivateConstructor(){
		a=10;
		b=30.83;
		c="Nitesh";
		System.out.println(a + " " + b + " " + c);
	}
	public static void main(String[] args){
		PrivateConstructor ref =new PrivateConstructor();
	}
	
}