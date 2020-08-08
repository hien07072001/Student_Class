package com.example.demo.Controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")

public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
   public ResponseEntity<List<Student>> getList(){
    List<Student> students = (List<Student>) studentService.findAll();
    return  new ResponseEntity<>(students, HttpStatus.OK);
}

    @PostMapping("/student /create")
    public ResponseEntity<Void> addStudent(@RequestBody Student student){
        studentService.save(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/student/update")
    public ResponseEntity<Student> updateObjective(@RequestBody Student student){
        studentService.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
