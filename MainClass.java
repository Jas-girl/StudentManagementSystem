// System.out.println("1.No. of courses in the institute 2. Add Student\n \n3. Assign Grade\n4. Display Student Info\n5. Exit");
//when student enter he asks how many courses he want to enroll
//if the course is multiple get the avg grades
package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	StudentManager sm=new StudentManager();
	Student st=new Student();
	
	int ch=0;
	 do{
		 System.out.println("Choose1: Display Courses  \nChoose2:Display Student"
					+ "\nChoose3:Remove Student \nChoose4:Find Student \nChoose5:Avg Grades \nChoose 6:"
					+ "Sorting By id \nChoose7:Sorting by name");
		 ch=sc.nextInt();
		 switch(ch) {
		 case 1: System.out.println("Display Course");
		 sm.displaycourse();
		 break;
		 case 2:System.out.println("Display Students");
		 sm.displaystudent();
		 break;
		 case 3:System.out.println("Remove Student");
		 sm.removeStudent();
		 break;
		 case 4:System.out.println("Find Student");
		 sm.findStudent();
		 break;
		 case 5:System.out.println("Avg Grades");
		 sm.avgGrades();
		 break;
		 case 6:System.out.println("Sorting by id");
		 sm.sortid(); 
		 break;
		 case 7:System.out.println("Sorting By Name");
		 sm.sortname();
		 break;
		 case 8:System.out.println("Exit operation");
		 }
		
		
	}while(ch<9);
	
}
}
