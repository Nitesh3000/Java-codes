/*           Constructor Overloading
whenever we have more than one constructor in a class the it is called Constructor Overloading
*/
class Overloading{
	int a;
	double b;
	String c;
	Overloading(){
		a=10;
		b=10.10;
		c="Nitesh";
	}
	Overloading(int x){
		a=x;
	}
	Overloading(double y, String z){
		b=y;
		c=z;
	}
} 
class ConstructorOverloading{
	public static void main(String[] args){
		Overloading r1=new Overloading();
		Overloading r2=new Overloading(20);
		Overloading r3=new Overloading(20.20,"Nitz");
		System.out.println(r1.b+" "+r2.a+" "+r3.c);
	}
}