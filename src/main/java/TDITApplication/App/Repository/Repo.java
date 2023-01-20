package TDITApplication.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import TDITApplication.App.Entity.Student;

public interface Repo extends JpaRepository<Student, Integer>{

}