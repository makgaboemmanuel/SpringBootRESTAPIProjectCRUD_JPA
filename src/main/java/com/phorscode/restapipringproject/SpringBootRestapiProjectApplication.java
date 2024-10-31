package com.phorscode.restapipringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestapiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestapiProjectApplication.class, args);
	}

}

/* 
 * 
 *   please run the following scripts inside the DB: 
    INSERT INTO `student` (`roll_no`, `student_percentage`, `student_branch`, `student_name`) 
    	VALUES (NULL, '58', 'Motetema', 'Kudu Kudu'), (NULL, '63', 'Mashobohleng', 'Kgalaka Monama');
    INSERT INTO `student` (`roll_no`, `student_percentage`, `student_branch`, `student_name`) 
    	VALUES (NULL, '55', 'Hudson City', 'Tom Ford'), (NULL, '58', 'Elington', 'Charlse Charelse ');
    INSERT INTO `student` (`roll_no`, `student_percentage`, `student_branch`, `student_name`) 
    	VALUES (NULL, '60', 'Pinetown', 'Peter Peters'), (NULL, '71', 'Jericho', 'John Thompson');
 *   
 *   
 *   */
 