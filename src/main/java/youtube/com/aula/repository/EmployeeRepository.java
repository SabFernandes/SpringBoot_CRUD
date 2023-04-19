package youtube.com.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import youtube.com.aula.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all crud database methods
}
