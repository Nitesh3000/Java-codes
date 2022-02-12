public class Circle{
        //Point centre; 
        double radius;     //attributes of class Circle
        static int numberOfCircles;
		
Circle(){ numberOfCircles++; } 
                                    
Circle( double radius){            //Constructor  
//this.centre=centre;
this.radius=radius;
numberOfCircles++;
}

double getArea(){ return Math.PI*this.radius*this.radius; }    //method

double getPerimeter(){ return 2*Math.PI*this.radius; }

/*void setCentre(Point centre){ this.centre=centre;  }*/

void setRadius(double radius){ this.radius=radius; }

static int getNumberOfCircles(){	return numberOfCircles;  }

public static void main(String[] args){
	System.out.println(Circle.numberOfCircles);     //static variable belongs to class but not to an object but are shared among all objects
	System.out.println(Circle.getNumberOfCircles());
	
Circle c1=new Circle(3);                 //object c1 of class Circle
	System.out.println(c1.numberOfCircles);
	System.out.println(c1.getNumberOfCircles());
	
Circle c2=new Circle(5);
	System.out.println(c1.numberOfCircles);
	System.out.println(Circle.getNumberOfCircles());
	
	Circle.numberOfCircles=10;
	
	Circle c3=new Circle(10);
	System.out.println(c1.numberOfCircles);
	System.out.println(Circle.getNumberOfCircles());
	

System.out.println(c1.getArea());
System.out.println(c2.getArea());
System.out.println(c3.getArea());

}
}