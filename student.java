// Lab 5 Task 3
// Create a Student class that stores student data, provides methods for initializing and displaying student data. 
// Also provide a parameterized constructor for initializing student class data members.
public class student{
    String name;
    String roll;
    String batch;
    String dept;
    student(String n,String r,String b,String d){
        name=n;
        roll=r;
        batch=b;
        dept=d;
    }
    void initialize(String Name,String Roll,String Batch,String Dept){
        name=Name;
        roll=Roll;
        batch=Batch;
        dept=Dept;
    }
   String display(){
    return (name+"\n"+roll+"\n"+batch+"\n"+dept);
   }
}
class txt{
public static void main(String[] args) {
	student s1= new student("Uzair","21SW085","21SW","Software");
    System.out.println(s1.display());
}
}