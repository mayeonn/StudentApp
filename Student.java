import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public static void main(String args[]) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(1,"김하연",25);
		al.add(s1);
		Student s2 = new Student(2,"기마연",22);
		al.add(s2);
		Student s3 = new Student(3,"김이름",99);
		al.add(s3);
		Student s4 = new Student(4,"나천재",17);
		al.add(s4);
		Student s5 = new Student(5,"바나나",5);
		al.add(s5);
		Student s6 = new Student(6,"아이유",32);
		al.add(s6);
		Student s7 = new Student(7,"마싫어",9);
		al.add(s7);
		Student s8 = new Student(8,"다롱이",3);
		al.add(s8);
		Student s9 = new Student(9,"사비나",28);
		al.add(s9);
		Student s10 = new Student(10,"라디옹",29);
		al.add(s10);
		
		 
		Collections.sort(al);
		for(Student s : al) {
			System.out.println(s.toString());
		}
		
	}
	
	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.no = i;
		this.name = string;
		this.age = j;
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
