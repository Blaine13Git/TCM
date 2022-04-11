package com.tc.framework.entity.xmind;

import lombok.Data;

/**
 * 用例实际在websocket中传递的内容
 *
 */
@Data
public class CaseContent {

    private String template;

    private RootData root;

}


