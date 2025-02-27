package com.codingNinjas.codingNinjasApp;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class CodingNinjasAppApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.codingNinjas.codingNinjasApp");
		Scanner scanner = new Scanner(System.in);
		User user = context.getBean(User.class);
		System.out.println("Please enter your name");
		String name = scanner.nextLine();
		System.out.println("Please enter your age");
		String age = scanner.nextLine();
		System.out.println("Please enter your College");
		String college = scanner.nextLine();
		System.out.println("Please enter your location");
		String location = scanner.nextLine();
		user.setUserDetails(name, age, location, college);

		Instructor javaInstructor = context.getBean(JavaInstructor.class);
		javaInstructor.setInstructorDetails("Rahul", "28");
		System.out.println(javaInstructor.takeClass());

		//DI
		PaidCourse paidCourse = context.getBean(PaidCourse.class);
		paidCourse.setCourseDetails("Test course");
		System.out.println(paidCourse.getCourseName());
	}
//		System.out.println("Welcome to the coding ninjas application");
//		// Getting context from XML
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		// configure the course and create a list of courses offered.
//		ArrayList<PaidCourse> paidCourses = new ArrayList<PaidCourse>();
//		PaidCourse javaCourse = (PaidCourse) context.getBean("javaCourse");
//		PaidCourse springCourse = (PaidCourse) context.getBean("springCourse");
//
//		// set java course instructor details and course name.
//		javaCourse.courseInstructor.setInstructorDetails("Rohan Singh", "26");
//		javaCourse.setCourseDetails("Basics of Java");
//
//		// set Spring course instructor details and course name.
//		springCourse.courseInstructor.setInstructorDetails("Rahul Mohan", "27");
//		springCourse.setCourseDetails("Spring and Spring boot");
//
//		// add the Java Course and Spring Course to the list of paid courses.
//		paidCourses.add(javaCourse);
//		paidCourses.add(springCourse);
//
//		Scanner scanner = new Scanner(System.in);
//
//		while (true) {
//
//			System.out.println("-----XXXXXX-----");
//			System.out.println("Please select from the following:");
//			System.out.println("1) Register a new user");
//			System.out.println("2) See course information");
//			System.out.println("3) To quit");
//			int option = scanner.nextInt();
//
//			// flush the scanner
//			scanner.nextLine();
//
//			switch (option) {
//			case 1: {
//				// get the user (prototype bean) and set the details.

//
//				// select the course for the list of paid courses we have configured.
//				int index = 0;
//				System.out.println("Please select a course");
//				for (Course course : paidCourses) {
//					System.out.println(index + ")" + course.getCourseName());
//					index++;
//				}
//				int courseId = scanner.nextInt();
//				if (courseId >= paidCourses.size()) {
//					System.out.println("Not a valid course");
//					break;
//				}
//				// get the selected course
//				PaidCourse selectedCourse = paidCourses.get(courseId);
//				// add user to the user list of the course.
//				selectedCourse.userList.addUser(user);
//				break;
//			}
//
//			case 2: {
//				// display details of paid courses.
//				for (Course course : paidCourses) {
//					System.out.println("-----XXXXXX-----");
//					System.out.println(course.getCourseName());
//					if (course.getUserList().getUserList().size() > 0) {
//						System.out.println("The students in the course:");
//						int index = 1;
//						// display all the students who have enrolled.
//						for (User user : course.getUserList().getUserList()) {
//							System.out.println(index + ") " + user.getUserDetails());
//							index++;
//						}
//					} else {
//						System.out.println("No students registerd for the course");
//					}
//				}
//				break;
//			}
//			case 3: {
//				break;
//			}
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + option);
//			}
//			if (option == 3) {
//				break;
//			}
//		}
//
//		System.out.println("program stopped");
//		scanner.close();
//		context.close();
//
//	}

}
