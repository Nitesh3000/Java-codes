/**
                 Inheritance
When we construct a new class from existing class 
in such a way that the new class access all the features  and 
properties of existing class called inheritance

1. in java, extends keyword is used to perform inheritance
2. it provides code reusibility
3. we cant access private members of class through inheritance
4. a sub class contains all features of super class. so, we should 
    create the object the subclass
5. method overriding nly possible through inheritance

4 types: simple inheritance,  multilevel inheritance,  multiple inheritance(not supported in java),
         Hierarchical inheritance 
		           
				   SIMPLE INHERITANCE
Simple inheritance is nothing but which contains only one super class and only
one subclass.
*/
 class Student{          //Superclass
	 protected int roll,marks;
	 String name;
	protected void input(){          //private method or variable cannot be invoked from subclass
		 System.out.println("Enter roll name and marks: ");
	 }
 }
 class SimpleInheritance extends Student{        //Subclass
	 void disp(){
		 roll=1;
		 marks=90;
		 name="Nitesh";
		 System.out.println(roll+" "+name+" "+marks);
	 }
	 public static void main(String[] args){
		 SimpleInheritance ref=new SimpleInheritance();
		 ref.input();
		 ref.disp();
	 }
 }
 