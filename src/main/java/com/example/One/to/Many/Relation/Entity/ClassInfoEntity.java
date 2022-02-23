package com.example.One.to.Many.Relation.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "ClassInfo")
public class ClassInfoEntity {
    @Id
    @SequenceGenerator(
            name = "ClassID",
            sequenceName = "sq_ClassID",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "ClassID")
    private long ClassID;
    private long TotalBoys;
    private long TotalGirls;
    private long TotalTeachers;

    @OneToMany(mappedBy = "classInfoEntity", cascade = CascadeType.ALL)
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Set<StudentInfoEntity> studentInfoEntitySet = new HashSet<>();

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
        for(StudentInfoEntity a : studentInfoEntitySet){
            a.setClassInfoEntity(this);
        }
    }
}
