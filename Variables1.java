class Variables1{
	static int a=3;   //static variable..
	int b=5;          //instance variable..declared outside method
	
	public static void main(String[] args){
		int c=7;       //local variable...declared inside method
		Variables1 ref=new Variables1();
		System.out.println(c);
		System.out.println(Variables1.a);
		System.out.println(ref.b);
	}
	
}