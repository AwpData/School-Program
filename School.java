import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice = "HI", title = "";
		List<Class> ListOfClasses = new ArrayList<Class>();
		System.out.println("Welcome to your school!");
		while (!choice.equals("5")) {
			System.out.println("What do you want to do?");
			System.out.println("1. Make a new class");
			System.out.println("2. Add a student");
			System.out.println("3. Get Info On a Class");
			System.out.println("4. Total Courses");
			System.out.println("5. Quit Program");
			choice = input.nextLine();
			if (choice.equals("1")) {
				Class course = new Class();
				ListOfClasses.add(course);
			} else if (choice.equals("2")) {
				System.out.println("Which course?");
				System.out.println();
				for (int i = 0; i < ListOfClasses.size(); i++) {
					ListOfClasses.get(i).printClassName();
				}
				choice = input.nextLine();
				for (int i = 0; i < ListOfClasses.size(); i++) {
					title = ListOfClasses.get(i).getClassName();
					if (title.equals(choice)) {
						ListOfClasses.get(i).addStudent();
						break;
					}
				}
			} else if (choice.equals("3")) {
				for (int i = 0; i < ListOfClasses.size(); i++) {
					ListOfClasses.get(i).getInfo();
					System.out.println();
				}
			} else if (choice.equals("4")) {
				Class.getTotalCourses();
				System.out.println();
				for (int i = 0; i < ListOfClasses.size(); i++) {
					ListOfClasses.get(i).printClassName();
				}
			}
			System.out.println();
		}
		System.out.println("Quitting");
	}
}
