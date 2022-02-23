package com.example.One.to.Many.Relation.DTO;

import com.example.One.to.Many.Relation.Entity.StudentInfoEntity;


import java.util.Set;

public class ClassDto {
    private long ClassID;
    private long TotalBoys;
    private long TotalGirls;
    private long TotalTeachers;
    private Set<StudentInfoEntity> studentInfoEntitySet;

    public long getClassID() {
        return ClassID;
    }

    public void setClassID(long classID) {
        ClassID = classID;
    }

    public long getTotalBoys() {
        return TotalBoys;
    }

    public void setTotalBoys(long totalBoys) {
        TotalBoys = totalBoys;
    }

    public long getTotalGirls() {
        return TotalGirls;
    }

    public void setTotalGirls(long totalGirls) {
        TotalGirls = totalGirls;
    }

    public long getTotalTeachers() {
        return TotalTeachers;
    }

    public void setTotalTeachers(long totalTeachers) {
        TotalTeachers = totalTeachers;
    }

    public Set<StudentInfoEntity> getStudentInfoEntitySet() {
        return studentInfoEntitySet;
    }

    public void setStudentInfoEntitySet(Set<StudentInfoEntity> studentInfoEntitySet) {
        this.studentInfoEntitySet = studentInfoEntitySet;
    }
}
