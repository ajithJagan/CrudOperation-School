package com.mytry.crud;

import com.mytry.crud.Entity.StudentEntity;
import com.mytry.crud.Repository.StudentRepo;
import com.mytry.crud.Service.Impl.StudentImpl;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class JunitTest {

    @Mock
    StudentRepo studentRepo;

    @InjectMocks
    StudentImpl studentimpl;

    @Test
    public void insertData(){
        StudentEntity student=new StudentEntity(1,"Ajith",23,67,78,98,76,98,450,89);
        when(studentRepo.save(student)).thenReturn(student);
        assertEquals(student,studentimpl.insertStudent(student));
    };
}
