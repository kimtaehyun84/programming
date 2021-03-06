package com.kimtaehyun84.test.business.error.controller;


import com.kimtaehyun84.test.business.common.vo.GlobalVO;
import com.kimtaehyun84.test.business.common.dto.ResponseResultDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Package : com.common.system
 * @FileName : ErrorController
 * @Version : 1.0
 * @Date : 2019-04-08
 * @Author : Taehyun Kim
 * @Description : Excepction 처리하는 공통 모듈
 */
@Controller
public class ErrorController {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @Name: error
     * @Type : Function
     * @Version : 1.0
     * @Date : 2019-04-08
     * @Author : Taehyun Kim
     * @Description : Java Exception 처리
     */

    @RequestMapping(value = "/error")
    public @ResponseBody
    ResponseResultDTO error(HttpServletRequest request, Exception ex) {
        ResponseResultDTO responseResult = new ResponseResultDTO();
        responseResult.setStatus(GlobalVO.RESULT_FAIL);
        responseResult.setMsg(GlobalVO.ERROR_MSG);
        return responseResult;
    }
}
