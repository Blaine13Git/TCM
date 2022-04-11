package com.tc.framework.entity.response.dir;

import com.tc.framework.entity.dto.DirNodeDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 树结构
 *
 * @author hcy
 * 
 */
@Data
public class DirTreeResp {

    private List<DirNodeDto> children = new ArrayList<>();
}
