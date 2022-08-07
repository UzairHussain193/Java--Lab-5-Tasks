// Lab 5  Task 01
//01.	Create a class having 4 functions, add, sub, mul and div. Each function accepts 2 parameters 
// and returns the sum, difference, multiplication and division of these numbers.
// Create a main class having main function that uses the above class.

public class calculator{
	float x,y;
	public float add(float a, float b){
		x=a;
		y=b;
		return (a+b);
	}
    public float diff(float a, float b){
		x=a;
		y=b;
		return (a-b);
	}
    public float product(float a, float b){
		x=a;
		y=b;
		return (a*b);
	}
    public float div(float a, float b){
		x=a;
		y=b;
		return (a/b);
	}
}
class main{
public static void main(String[] args) {
	calculator c1= new calculator();
	System.out.println(c1.add(7f,9f) ); 
    System.out.println(c1.diff(7f,9f) ); 
    System.out.println(c1.product(7f,9f) ); 
    System.out.println(c1.div(7f,9f) ); 
}
}