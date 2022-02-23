package com.example.One.to.Many.Relation.DTO;

import com.example.One.to.Many.Relation.Entity.ClassInfoEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentInfoDto {
    private long SerialId;
    private String StudentName;
    private String Gender;
    private long RoleNumber;
    private String Department;
    private ClassInfoEntity classInfoEntity;
}
