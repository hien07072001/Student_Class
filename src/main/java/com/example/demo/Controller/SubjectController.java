package com.example.demo.Controller;
import com.example.demo.model.Subject;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")

public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @GetMapping("/subject")
public ResponseEntity<List<Subject>> getList(){
    List<Subject> subjects = (List<Subject>) subjectService.findAll();
    return  new ResponseEntity<>(subjects, HttpStatus.OK);
}

    @PostMapping("/subject/create")
    public ResponseEntity<Void> addSubject(@RequestBody Subject subject){
        subjectService.save(subject);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/subject/{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable Long id){
        subjectService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/subject/update")
    public ResponseEntity<Subject> updateSubject(@RequestBody Subject subject){
        subjectService.save(subject);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
