/**                Static Block
Static block is such kind of block in java which gets executed at the time of loading the .class file in JVM memory
*/
 class StaticBlock{
	 public static void main(String[] args){  //compulsorily we have to write main method otherwise 
	                                          //the compiler will give an error but a class file will be created
StaticBlock ref=new StaticBlock();
	 }  	 //output = Nitesh /n Nit
	 StaticBlock(){
		 System.out.println("Nit");
	 }
	 {                                  //then instance block is executed
		 System.out.println("N");
	 }
	 static{
		 System.out.println("Nitesh");//first static block is executed then only main
	 }
 }