package com.tc.framework.entity.dto;

import lombok.Data;

import java.util.Date;

/**
 * 任务的一个简单转换体
 *
 * @author hcy
 * 
 */
@Data
public class RecordWsDto {

    private Date updateTime;

    private String executors;

    private Integer env;

    private String caseContent;

    private String chooseContent;
}
