package com.example.One.to.Many.Relation.ResponseModel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponseModel {

    private long id;
    private int responseCode;
    private String responseMessage;

}
