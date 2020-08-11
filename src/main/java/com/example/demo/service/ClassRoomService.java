package com.example.demo.service;
import com.example.demo.model.ClassRoom;


public interface ClassRoomService extends GeneralService<ClassRoom>{

    ClassRoom findById(Long id);
}
