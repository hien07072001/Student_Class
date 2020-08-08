package com.example.demo.service.Impl;

import com.example.demo.model.ClassRoom;
import com.example.demo.repository.ClassRoomRepository;
import com.example.demo.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClassRoomImpl implements ClassRoomService {
    @Autowired
    private ClassRoomRepository classRepository ;

    @Override
    public Iterable<ClassRoom> findAll() {
        return classRepository.findAll();
    }

    @Override
    public ClassRoom findById(Long id) {
        return classRepository.findById(id).get();
    }

    @Override
    public void save(ClassRoom classRoom) {
        classRepository.save(classRoom);

    }

    @Override
    public void delete(Long id) {
        classRepository.deleteById(id);

    }
}
