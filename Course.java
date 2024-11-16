package project;

public class Course {
private int courseCode;
private String courseName;
private float grades;
public Course() {
	// TODO Auto-generated constructor stub
}
public Course(int courseCode, String courseName, float grades) {
	super();
	this.courseCode = courseCode;
	this.courseName = courseName;
	this.grades = grades;
}



public int getCourseCode() {
	return courseCode;
}
public void setCourseCode(int courseCode) {
	this.courseCode = courseCode;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public float getGrades() {
	return grades;
}
public void setGrades(float grades) {
	this.grades = grades;
}
@Override
public String toString() {
	return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", grades=" + grades + "]";
}
}
