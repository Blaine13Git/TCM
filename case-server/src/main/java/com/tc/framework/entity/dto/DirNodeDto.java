package com.tc.framework.entity.dto;

import com.tc.framework.service.impl.RecordServiceImpl;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 文件夹节点转换体
 *
 * @see RecordServiceImpl#getData(MergeCaseDto)
 */
@Data
public class DirNodeDto {

    private String id;
    private String text;
    private String parentId;
    private Set<String> caseIds = new HashSet<>();

    private List<DirNodeDto> children = new ArrayList<>();
}
