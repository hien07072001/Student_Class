package com.example.demo.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class ClassRoom  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name_Cl;

    @Column
    private String code_Cl;

    @Column
    private Double hours;

    @Column
    private String note;

     @ManyToMany(mappedBy = "classRooms")

    private Collection<Student> student;

    public Collection<Student> getStudent() {
        return student;
    }

//    public void setStudent(Collection<Student> student) {
//        this.student = student;
//    }
//
//    public void setStudent(List<Student> student) {
//        this.student = stu

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode_Cl() {
        return code_Cl;
    }

    public void setCode_Cl(String code_Cl) {
        this.code_Cl = code_Cl;
    }

    public String getName_Cl() {
        return name_Cl;
    }

    public void setName_Cl(String name_Cl) {
        this.name_Cl = name_Cl;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }


}
