package com.mytry.crud.Service.Impl;

import com.mytry.crud.Entity.StudentEntity;
import com.mytry.crud.Repository.StudentRepo;
import com.mytry.crud.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<StudentEntity> getStudent() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity insertStudent(StudentEntity studentEntity) {
        return studentRepo.save(studentEntity);
    }

    @Override
    public StudentEntity getByid(int id) {
        return studentRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Integer> total(int register_number) {
        List<Integer> total = studentRepo.findByregister_number(register_number);
        List<Integer> requiredTechSize = total;
        return  requiredTechSize;
    }



}
