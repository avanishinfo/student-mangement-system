package info.avanish.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.avanish.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
