package com.tc.framework.entity.response.dir;

import lombok.Data;

/**
 * 返回给前端的所有文件夹的列表
 *
 * @author hcy
 * 
 */
@Data
public class BizListResp {

    private String bizId;

    private String text;

    private boolean select;
}
