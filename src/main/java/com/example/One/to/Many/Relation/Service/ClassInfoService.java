package com.example.One.to.Many.Relation.Service;


import com.example.One.to.Many.Relation.DTO.ClassDto;
import com.example.One.to.Many.Relation.ResponseModel.CommonResponseModel;

import java.util.List;

public interface ClassInfoService {

    CommonResponseModel save(ClassDto classDto );
    List<ClassDto> getClasses();
    CommonResponseModel update(long id,ClassDto classDto );
    CommonResponseModel delete(long id);
    ClassDto getById(long id);
}
