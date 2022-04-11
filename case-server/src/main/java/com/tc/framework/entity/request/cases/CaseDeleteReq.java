package com.tc.framework.entity.request.cases;

import com.tc.framework.entity.request.ParamValidate;
import lombok.Data;

/**
 * 用例 逻辑删除
 *
 * @author hcy
 * 
 */
@Data
public class CaseDeleteReq implements ParamValidate {

    private Long id;

    @Override
    public void validate() {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("用例id为空");
        }
    }
}
