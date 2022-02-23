package com.example.One.to.Many.Relation.Controller;


import com.example.One.to.Many.Relation.DTO.ClassDto;
import com.example.One.to.Many.Relation.ResponseModel.CommonResponseModel;
import com.example.One.to.Many.Relation.Service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Classes")
public class ClassInfoController {

    @Autowired
    private ClassInfoService classInfoService;


    @PostMapping("/add-class")
    public CommonResponseModel addLocation(@RequestBody ClassDto dto) {
        return classInfoService.save(dto);
    }

    @GetMapping("/Get")
    public List<ClassDto> getLocations() {
        return classInfoService.getClasses();
    }

    @GetMapping("/Get/{id}")
    public ClassDto getLocation(@PathVariable long id) {
        return classInfoService.getById(id);
    }

}
