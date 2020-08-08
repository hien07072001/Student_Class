package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table
//@NamedStoredProcedureQuery(name = "")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String code_SV;

    @Column
    private String name_SV;

    @Column
    private Integer age;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String note;

    @Column
    private String address;

    @ManyToMany
    @JoinTable(
            name = "Sut_Sub",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private Collection<Subject> subjects;

    @ManyToMany
    @JoinTable(
            name = "Sut_class",
            joinColumns = @JoinColumn(name = "classRoom_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Collection<ClassRoom> classRooms;

    public Collection<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(Collection<ClassRoom> classRooms) {
        this.classRooms = classRooms;
    }

    public Collection<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Collection<Subject> subjects) {
        this.subjects = subjects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode_SV() {
        return code_SV;
    }

    public void setCode_SV(String code_SV) {
        this.code_SV = code_SV;
    }

    public String getName_SV() {
        return name_SV;
    }

    public void setName_SV(String name_SV) {
        this.name_SV = name_SV;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
