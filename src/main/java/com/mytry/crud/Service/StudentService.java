package com.mytry.crud.Service;

import com.mytry.crud.Entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {


    List<StudentEntity> getStudent();


    StudentEntity insertStudent(StudentEntity studentEntity);

    StudentEntity getByid(int id);

    List<Integer> total(int register_number);



}
