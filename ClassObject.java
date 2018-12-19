import java.util.Arrays;
import java.util.Scanner;

public class Class {
	private String courseTitle;
	private String teacher;
	private String roomnumber;
	private String period;
	private String[] students;
	private static int courses;
	private final int MAX_STUDENTS = 31; // max 30 students

	public Class() {
		this.courseTitle = Class.setCourseTitle();
		this.teacher = Class.setTeacher();
		this.roomnumber = Class.setRoomNumber();
		this.period = Class.setPeriod();
		this.students = setStudents();
		courses++;
	}

	public Class(String courseTitle, String teacher, String roomnumber, String period, String[] students) {
		this.courseTitle = courseTitle;
		this.teacher = teacher;
		this.roomnumber = roomnumber;
		this.period = period;
		this.students = students;
	}

	public static String setCourseTitle() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of the course? ");
		String title = input.nextLine();
		return title;
	}

	public static String setTeacher() {
		Scanner input = new Scanner(System.in);
		System.out.println("Who teaches this class? ");
		String teacher = input.nextLine();
		return teacher;
	}

	public static String setRoomNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("What room does this class meet in? ");
		String room = input.nextLine();
		return room;
	}

	public static String setPeriod() {
		Scanner input = new Scanner(System.in);
		System.out.println("What period will this class be? ");
		String period = input.nextLine();
		return period;
	}

	private String[] setStudents() {
		String[] students = { "Students:" };
		return students;
	}

	public void getInfo() {
		System.out.println("Course Name: " + courseTitle);
		System.out.println("Teacher: " + teacher);
		System.out.println("Room Number: " + roomnumber);
		System.out.println("Period: " + period);
		System.out.println("Students Enrolled: " + Arrays.toString(students).replaceFirst(",", ""));
		System.out.printf("Total students: %d",students.length-1);
		System.out.println();
	}

	public void printClassName() {
		System.out.println(courseTitle);
	}

	public String getClassName() {
		return courseTitle;
	}

	public void getStudents() { // Test method
		System.out.println(Arrays.toString(students));
	}

	public static void getTotalCourses() {
		System.out.println("Total courses: " + courses);
	}

	public String[] addStudent() {
		// System.out.println(students.length); //Gets number of students (Subtract 1)
		// System.out.println(MAX_STUDENTS); //Max 30 Students
		if (students.length > MAX_STUDENTS) {
			System.out.println("Class full. Cannot add student.");
			return students;
		}
		String[] studentscopy = Arrays.copyOf(students, students.length + 1);
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of the student? ");
		String name = input.nextLine();
		studentscopy[studentscopy.length - 1] = name;
		System.out.println("Adding " + name + " to class");
		students = studentscopy;
		return students;
	}
}
