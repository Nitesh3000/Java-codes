import java.util.Scanner;
class Input{
	public static void main(String args[]){
		int a,i;
		System.out.println("Enter the data: ");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt(); 
		i=obj.nextInt();                              //integer input
		System.out.println("Entered data = "+ a+   +i);
		
		String b;
		System.out.println("Enter the data: ");
		Scanner ob=new Scanner(System.in);
		b=ob.nextLine();                              //String Input
		System.out.println("Entered data = "+ b);
		
		float c;
		System.out.println("Enter the data: ");
		Scanner o=new Scanner(System.in);            //float Input
		c=o.nextFloat();
		System.out.println("The entered data ="+c); 
		
		double d;
		System.out.println("Enter the data: ");
		Scanner op=new Scanner(System.in);            //double Input
		d=op.nextDouble();
		System.out.println("The entered data ="+d);  
	}
	
}