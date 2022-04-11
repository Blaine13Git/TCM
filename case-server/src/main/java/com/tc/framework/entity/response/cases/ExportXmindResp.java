package com.tc.framework.entity.response.cases;

import lombok.Data;

/**
 * 导出的xmind所含有的内容
 *
 * @author hcy
 * 
 */
@Data
public class ExportXmindResp {

    private String fileName;

    private byte[] data;
}
