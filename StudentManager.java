package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	Student student;
	Student st[];
	Course course[];
	Course corse;
	int n;
	Course course1 = new Course( 101,"Mathematics",67.7f);
    Course course2 = new Course( 102,"Physics",56f);
    Course course3 = new Course( 103,"Chemistry",78f);
    Course course4 = new Course( 104,"Biology",89f);
    Course course5 = new Course( 105,"Computer Science",77f);
   
    ArrayList<Student> students=new ArrayList<Student>();
    ArrayList<Course> courses=new ArrayList<Course>();
    
	public StudentManager() {
		student=new Student(1,"Alice");
	    student.addCourse(course5);
	    student.addCourse(course4);
	    students.add(student);
	    
	    student=new Student(2,"Bob");
	    student.addCourse(course1);
	    students.add(student);
	    
	    student=new Student(3,"Charlie");
	    student.addCourse(course2);
	    students.add(student);
	    
	    student=new Student(4,"Ivan");
	    student.addCourse(course1);
	    student.addCourse(course4);
	    students.add(student);
	    
	    student=new Student(5,"Grace");
	    student.addCourse(course1);
	    student.addCourse(course3);
	    students.add(student);
//		Student[] st = new Student[n];

	}

	Scanner sc = new Scanner(System.in);

	 void displaystudent() {
		 for (Student student : students) {
				System.out.println(student.toString());
			}
     }
	void displaycourse() {
		System.out.println("Course Code"+"\t"+ " Course Name");
		System.out.println(course1.getCourseCode() +"\t\t"+course1.getCourseName());
		System.out.println(course2.getCourseCode() +"\t\t"+course2.getCourseName());
		System.out.println(course3.getCourseCode() +"\t\t"+course3.getCourseName());
		System.out.println(course4.getCourseCode() +"\t\t"+course4.getCourseName());
		System.out.println(course5.getCourseCode() +"\t\t"+course5.getCourseName());
	}

	public void removeStudent() {
		boolean flag=false;
      System.out.println("Enter the id of the student");
      int id=sc.nextInt();
     for (int i = 0; i < students.size(); i++) {
		if(students.get(i).getId()==id) {
			students.remove(i);
			flag=true;
			break;
			
		}
		else {
			flag=false;
		}
	}
     System.out.println(flag==true?"successfully removed":"not removed");
	
     
	}

	void findStudent() {
		boolean flag=false;
     System.out.println("Enter the name of the student");
     String name=sc.next();
    for (int i = 0; i < students.size(); i++) {
		if(students.get(i).getName().equalsIgnoreCase(name)) {
			System.out.println(students.get(i));
			flag=true;	
			break;
		}
		else {
			flag=false;
		}
	}
    if(flag==true) {
    	
    	System.out.println("Successfully found");
    }
    else {
    	System.out.println("not found");
    }
   
	}
	void avgGrades() {
		boolean studentfound=false;
		 System.out.println("Enter the id of the student");
	      int id=sc.nextInt();
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getId()==id) {
				studentfound=true;
				ArrayList<Course> enroll=(ArrayList<Course>) student.getCourse();
				if(enroll.isEmpty()) {
					System.out.println("list is empty");
					return;
				}
				float total=0;
				for (Course course : enroll) {
					total+=course.getGrades();
				}
				float avg=total/enroll.size();
				System.out.println("Avg:"+avg);
				break;
			}
			else {
				
				studentfound=false;
			}
		}
		System.out.println(studentfound==true?"found":"not found");
		
	}
	void sortid() {
	Collections.sort(students,new IdComparatable());
		System.out.println(students);
	}
	void sortname() {
		Collections.sort(students, new NameComparable());
		System.out.println(students);
	}
	
}
