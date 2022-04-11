package com.tc.framework.entity.xmind;

import lombok.Data;

import java.util.List;

/**
 * 用例的json单元
 *
 * @author hcy
 * 
 */
@Data
public class RootData {

    private DataObj data;

    private List<RootData> children;

}
