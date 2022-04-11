package com.tc.framework.entity.response.cases;

import lombok.Data;

/**
 * 脑图-查看用例上方的概览信息(不包括content)
 *
 * @author hcy
 * 
 */
@Data
public class CaseGeneralInfoResp {

    private Long id;

    private String title;

    private String requirementId;

    private Long productLineId;
}
