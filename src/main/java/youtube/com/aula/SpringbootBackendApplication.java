package youtube.com.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import youtube.com.aula.model.Employee;
import youtube.com.aula.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String ... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Doe");
		employee.setEmailId("Ramesh@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee.setFirstName("John");
		employee.setLastName("Cena");
		employee.setEmailId("John@gmail.com");
		employeeRepository.save(employee1);
	}
}
