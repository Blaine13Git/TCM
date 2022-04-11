package com.tc.framework.entity.response.cases;

import com.tc.framework.entity.response.dir.BizListResp;
import lombok.Data;

import java.util.List;

/**
 * 用例详情
 *
 * @author hcy
 * 
 */
@Data
public class CaseDetailResp {

    private Integer caseType;

    private String description;

    private Long id;

    private String modifier;

    private String requirementId;

    private String title;

    private Long productLineId;

    private List<BizListResp> biz;

    private Long groupId;

}
