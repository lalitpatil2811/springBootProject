package com.itshaala.dao;

import com.itshaala.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface
StudentDao extends JpaRepository<Student, Integer> {


}
