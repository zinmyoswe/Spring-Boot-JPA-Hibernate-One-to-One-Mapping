package net.codejava.SpringBootOneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.codejava.SpringBootOneToOne.model.Instructor;
import net.codejava.SpringBootOneToOne.model.InstructorDetail;
import net.codejava.SpringBootOneToOne.repository.InstructorRepository;

@SpringBootApplication
public class SpringBootOneToOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToOneApplication.class, args);
	}
	
	@Autowired
    private InstructorRepository instructorRepository;

    @Override
    public void run(String...args) throws Exception {

        Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@gmail.com");

        InstructorDetail instructorDetail = new InstructorDetail("Java Guides", "Cricket Playing");

        // associate the objects
        instructor.setInstructorDetail(instructorDetail);

        instructorRepository.save(instructor);
    }
}
