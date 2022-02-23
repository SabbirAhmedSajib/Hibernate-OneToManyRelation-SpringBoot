package com.example.One.to.Many.Relation.Service.ServiceImpl;

import com.example.One.to.Many.Relation.DTO.ClassDto;
import com.example.One.to.Many.Relation.Entity.ClassInfoEntity;
import com.example.One.to.Many.Relation.Repository.ClassRepo;
import com.example.One.to.Many.Relation.ResponseModel.CommonResponseModel;
import com.example.One.to.Many.Relation.Service.ClassInfoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClassInfoServiceImpl implements ClassInfoService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ClassRepo classRepo;

    @Override
    public CommonResponseModel save(ClassDto classDto) {
        CommonResponseModel commonResponseModel = new CommonResponseModel();
        ClassInfoEntity classInfoEntity = classRepo.save(modelMapper.map(classDto, ClassInfoEntity.class));

        if (classInfoEntity.getClassID() > 0) {
            commonResponseModel.setResponseCode(1);
            commonResponseModel.setResponseMessage("Class & Student Info  Save Successfully");
            commonResponseModel.setId(classInfoEntity.getClassID());
        }

        return commonResponseModel;
    }

    @Override
    public List<ClassDto> getClasses() {
        List<ClassInfoEntity> list = classRepo.findAll();
        return list.stream().map(model ->
                entityToDto(model)).collect(Collectors.toList());

    }

    @Override
    public CommonResponseModel update(long id, ClassDto classDto) {
        return null;
    }

    @Override
    public CommonResponseModel delete(long id) {
        return null;
    }

    @Override
    public ClassDto getById(long id) {
        Optional<ClassInfoEntity> optionalClass = classRepo.findById(id);
        if (!optionalClass.isPresent()) {
            return new ClassDto();
        }
        ClassInfoEntity getClass = optionalClass.get();

        return entityToDto(getClass);
    }

    public ClassDto entityToDto(ClassInfoEntity entity) {
        ClassDto dto = modelMapper.map(entity, ClassDto.class);
        return dto;
    }

    public ClassInfoEntity dtoToEntity(ClassDto dto) {
        ClassInfoEntity entity = modelMapper.map(dto, ClassInfoEntity.class);
        return entity;
    }
}
