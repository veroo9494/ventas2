package com.automotora.ventas.DTO;

import com.automotora.ventas.ENUM.Result;

import java.util.ArrayList;
import java.util.List;

public class ResultDTO {
    private Result result;
    private String msg;
    List<FieldErrorDTO> fieldErrorDTOList;

    public ResultDTO() {
        this.fieldErrorDTOList = new ArrayList<FieldErrorDTO>();
    }

    public ResultDTO(Result result, String msg, List<FieldErrorDTO> fieldErrorDTOList) {
        this.result = result;
        this.msg = msg;
        this.fieldErrorDTOList = fieldErrorDTOList;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<FieldErrorDTO> getFieldErrorDTOList() {
        return fieldErrorDTOList;
    }

    public void setFieldErrorDTOList(List<FieldErrorDTO> fieldErrorDTOList) {
        this.fieldErrorDTOList = fieldErrorDTOList;
    }

    public void addError(FieldErrorDTO fieldErrorDTO){
        this.fieldErrorDTOList.add(fieldErrorDTO);
        this.result = Result.ERROR;
        this.msg = "ERROR TO VALIDATE";
    }


}
