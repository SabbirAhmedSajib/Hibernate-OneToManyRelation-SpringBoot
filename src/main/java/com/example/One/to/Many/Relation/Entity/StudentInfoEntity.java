package com.example.One.to.Many.Relation.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
@Table(name = "StudentInfo")
public class StudentInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long SerialId;
    private String StudentName;
    private String Gender;
    private long RoleNumber;
    private String Department;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ClassID",nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private ClassInfoEntity classInfoEntity;

    public long getSerialId() {
        return SerialId;
    }

    public void setSerialId(long serialId) {
        SerialId = serialId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public long getRoleNumber() {
        return RoleNumber;
    }

    public void setRoleNumber(long roleNumber) {
        RoleNumber = roleNumber;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public ClassInfoEntity getClassInfoEntity() {
        return classInfoEntity;
    }

    public void setClassInfoEntity(ClassInfoEntity classInfoEntity) {
        this.classInfoEntity = classInfoEntity;
    }
}
