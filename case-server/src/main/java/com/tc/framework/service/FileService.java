package com.tc.framework.service;

import com.tc.framework.entity.request.cases.FileImportReq;
import com.tc.framework.entity.response.cases.ExportXmindResp;

import javax.servlet.http.HttpServletRequest;

/**
 * 文件上传与导出服务接口
 *
 */
public interface FileService {

    /**
     * 导入x-mind文件生成case
     *
     * @param req 请求体
     * @param request
     * @return 生成的case-id
     * @throws Exception 任何可能的异常
     */
    Long importXmindFile(FileImportReq req, HttpServletRequest request, String uploadPath) throws Exception;

    /**
     * 导出xmind内容
     *
     * @param id 用例id
     * @param userAgent http请求头表示来源
     * @return 响应体
     * @throws Exception 任何可能的异常
     */
    ExportXmindResp exportXmindFile(Long id, String userAgent) throws Exception;

    /**
     * 导入excel文件生成case
     *
     * @param req 请求体
     * @param request
     * @return 生成的case-id
     * @throws Exception 任何可能的异常
     */
    Long importExcelFile(FileImportReq req, HttpServletRequest request) throws Exception;
}
