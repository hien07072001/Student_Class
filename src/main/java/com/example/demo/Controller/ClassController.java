package com.example.demo.Controller;

import com.example.demo.model.ClassRoom;
import com.example.demo.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ClassController {

    @Autowired
    private ClassRoomService classRoomService;

@GetMapping("/class")
public ResponseEntity<List<ClassRoom>> getList(){
    List<ClassRoom> classRooms = (List<ClassRoom>) classRoomService.findAll();
    return  new ResponseEntity<>(classRooms, HttpStatus.OK);
}

    @PostMapping("/class/create")
    public ResponseEntity<Void> addClass(@RequestBody ClassRoom classRoom){
        classRoomService.save(classRoom);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/class/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id){
        classRoomService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/class/update")
    public ResponseEntity<ClassRoom> updateClass(@RequestBody ClassRoom classRoom){
        classRoomService.save(classRoom);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
