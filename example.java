// Lab 5 Task 02
// Demonstrate the use of the following: 
// Constructor, Accessors and mutators, static class members.

import java.util.Scanner;
public class example{
    String model;
//    static int mno=0;
   int storage;
   String brand;
    example(String b,String m,int s){
        model=m;
        // mno++;
        storage=s;
        brand=b;
    }
   String display(){
    return (brand+"\n"+model+"\n"+storage);
   }
}
class text{
public static void main(String[] args) {
	example ex= new example("Samsung","S22 Ultra",256);
    // System.out.println("Modelno: "+ mno.example);
    // System.out.println(ex.display());
    example pet=new example("Apple", "13Pro max",128);
    System.out.println(ex.display());
    System.out.println(pet.display());
    // System.out.println("Modelno: "+ mno.example);
    // System.out.println(pet.display());
}
}