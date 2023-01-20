package TDITApplication.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import TDITApplication.App.Entity.Student;
import TDITApplication.App.Repository.Repo;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(AppApplication.class, args);
		Repo repo=context.getBean(Repo.class);
		
		Student student=new Student();
		student.setId(11);
		student.setName("pradip Sir");
		student.setCity("Pune");
		Student student1=repo.save(student);
		System.out.println(student1);
	}

}
