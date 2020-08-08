package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table
public class Subject  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name_MH;

    @Column
    private String code_MH;

    @Column
    private String note;

    @Column
    private Integer ScoreFactor;

    @ManyToMany(mappedBy = "subjects")
    private Collection<Student> students;

    public Collection<Student> getStudents() {
        return students;
    }

//    @OneToMany(mappedBy = "subject_id")
//    private List<Subject> subjects;


    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_MH() {
        return name_MH;
    }

    public void setName_MH(String name_MH) {
        this.name_MH = name_MH;
    }

    public String getCode_MH() {
        return code_MH;
    }

    public void setCode_MH(String code_MH) {
        this.code_MH = code_MH;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getScoreFactor() {
        return ScoreFactor;
    }

    public void setScoreFactor(Integer scoreFactor) {
        ScoreFactor = scoreFactor;
    }

//    public List<Subject> getSubjects() {
//        return subjects;
//    }
//
//    public void setSubjects(List<Subject> subjects) {
//        this.subjects = subjects;
//    }
}
