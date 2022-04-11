package com.tc.framework.entity.response;

import lombok.Data;

/**
 * 返回的人员
 *
 */
@Data
public class PersonResp {

    /**
     * 前缀
     */
    private String staffNamePY;

    /**
     * 中文名
     */
    private String staffNameCN;
}
