package project;

import java.util.Comparator;

public class IdComparatable implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getId()==o2.getId()) {
			return 0;
		}
		else if(o1.getId()>o2.getId()) {
			return 1;
		}
		else if(o1.getId()<o2.getId()) {
			return -1;
		}
		return 0;
		
	}

}
