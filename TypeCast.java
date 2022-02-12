class TypeCast{
	public static void main(String args[]){
		int a=10;  //4 bytes
		double b=a;  //8 bytes    //implicit typecasting..automatically done by the compiler
		double c=10.5;
		int d=(int)c;            //explicit typecasting..chance of loss of data
		System.out.println(a+" "+b);
		System.out.println(c+" "+d);
	}	
}