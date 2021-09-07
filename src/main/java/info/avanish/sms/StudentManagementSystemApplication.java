package info.avanish.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import info.avanish.sms.entity.Student;
import info.avanish.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Avanish", "Singh", "avanishinfo@gmail.com");
		 * studentRepository.save(student1); Student student2 = new Student("Deep",
		 * "Prakash", "deepak043@gmail.com"); studentRepository.save(student2); Student
		 * student3 = new Student("Mayank", "Gupta", "mayankgupta@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
