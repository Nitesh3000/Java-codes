class Variables2{
	static int a=10;
	
	void fun(){
		int b=10;
		System.out.println(a + "  " + b);
		++a; b++;
	}
	
	public static void main(String[] args){
		Variables2 ref=new Variables2();
		ref.fun();
		ref.fun();
	}
}