package hashcode2;//created package hashcode2
import hashcode.Student; //implementing the hash code using an object

public class StudentDemo {     //here we creating another class studentdemo and two objects to print the hash code 

	public static void main(String[] args) {  
		
		
		 //String[]args means arguments will be passed into main method and says that main() as parameter
  Student Vamshi = new Student();             // here we  the student objects,one object has Vamshi and the other has Krishna
  Student Krishna =new Student();
  
  System.out.println("Hash code =" +Vamshi.hashCode());  //here it prints the hashcodes of both of them
  System.out.println("Hash code =" +Krishna.hashCode());
	}

}
