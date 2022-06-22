package com.mohan.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.mohan.student.dal.entities.Student;

public interface StudentRepos extends CrudRepository<Student, Long> {

}
