package com.example.demo.service.Impl;

import com.example.demo.model.Subject;
import com.example.demo.repository.SubjectRepository;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectImpl implements SubjectService {


    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Iterable<Subject> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject findById(Long id) {
        return subjectRepository.findById(id).get();
    }

    @Override
    public void save(Subject subject) {
        subjectRepository.save(subject);

    }

    @Override
    public void delete(Long id) {
        subjectRepository.deleteById(id);

    }
}
