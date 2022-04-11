package com.tc.framework.entity.dto;

import com.tc.framework.service.impl.RecordServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 给getData专用的转换体
 *
 * @author hcy
 * 
 * @see RecordServiceImpl#getData(MergeCaseDto)
 */
@Data
@AllArgsConstructor
public class MergeCaseDto {

    private Long caseId;

    private String chooseContent;

    private String recordContent;

    private Integer env;

    private Long recordId;
}
