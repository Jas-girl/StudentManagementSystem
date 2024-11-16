package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
private int id;
private String name;
private ArrayList<Course> course;
Scanner sc=new Scanner(System.in);
public Student() {
	// TODO Auto-generated constructor stub
}

public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	this.course = new ArrayList<Course>();
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Course> getCourse() {
	return course;
}
//public void setCourse(Course course) {
//	this.course = course;
//}
void addCourse(Course courses) {
	
	course.add(courses);
}


@Override
public String toString() {
	return "Student\n [id=" + id + ", name=" + name + ", course=" + course + "]";
}


}
