package com.example.demo.repository;

import com.example.demo.model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository  extends JpaRepository< ClassRoom,Long> {
}
