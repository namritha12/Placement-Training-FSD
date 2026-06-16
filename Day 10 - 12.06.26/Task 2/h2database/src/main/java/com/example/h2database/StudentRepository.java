package com.example.h2database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}



/*1.JpaRepository<Student,Long>
*  JpaRespository is a Spring Data JPA interface that already has all the common CRUD methods built in.
*  By extending it,your StudentRepository automatically gets methods like:
*  save(Student s)->insert/update a student
*  findAll()->get all students
*  findById(Long id)->get one student
*  deleteById(Long id)->delete a student
*  you dont need to write SQL or implement these methods yourself-Spring generates them at runtime



* 2.<Student,Long>
the first type parameter (Student) tells JPA which entity this repository manages
* ->Its tied to your Student table
* the second type paramter (Long) tells JPA the type of the primary key(id)
* ->Since your entity has  private Long id; you specify Long



* 3.public interface StudentRepository -Its an interface ,not a class..
* you dont write any code inside-Spring Boot automatically creates a working implementation at runtime
*/