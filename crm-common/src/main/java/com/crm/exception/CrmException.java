package com.crm.exception;

import com.crm.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrmException extends RuntimeException{
    private ExceptionEnums exceptionEnums;
    private int code; // 状态码
    private  String msg;
}
