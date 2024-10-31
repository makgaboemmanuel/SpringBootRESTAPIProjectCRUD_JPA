package com.phorscode.restapipringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.phorscode.restapipringproject.entity.Student;
import com.phorscode.restapipringproject.repository.StudentRepository;


@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	public StudentController() {
		// this.studentRepository = new StudentRepository();
	}
	
	// get all students data from the table
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		List<Student> students = studentRepository.findAll();
		return students;
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id ) {
		Student student = studentRepository.findById(id).get();
		return student;
	}
	 
	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String addStudent(@RequestBody Student student) {
		
		if(studentRepository.save( student ).getRollNo() > 0) {
			return "Student Successfully Saved";
		}else {
			return "Please check the data provided and retry";
		}
	}
	
	@PutMapping("/student/update/{id}")
	public Student updateStudent(@PathVariable int id) {
		Student student = studentRepository.findById(id).get();
		student.setName("Krim Cheese");
		student.setName("Westchester");
		studentRepository.save(student);
		return student;
	}
	
	@DeleteMapping("/student/delete/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public String deleteStudent(@PathVariable int id) {
		Student student = studentRepository.findById(id).get();
		studentRepository.delete(student);
		
		return "Student deleted";
	}
	
}
