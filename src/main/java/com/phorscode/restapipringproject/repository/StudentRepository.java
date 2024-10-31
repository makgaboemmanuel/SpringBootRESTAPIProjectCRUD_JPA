package com.phorscode.restapipringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phorscode.restapipringproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
