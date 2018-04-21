package com.yingcai;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * Title:com.yingcai
 * </p>
 * <p/>
 * <p>
 * Description: 描述【Spring MVC 基本控制器】
 * </p>
 * <p/>
 * <p>
 * Copyright: Copyright (c) 2018
 * </p>
 * <p/>
 * <p>
 * Company: 英才汇硕信息技术有限公司
 * </p>
 *
 * @author zhoujy
 * @version 1.0
 * @created 2018/4/18 13:56
 */
public class LoginOneController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String param = httpServletRequest.getParameter("name");

        System.out.println("-----zhoujy---");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", param);
        modelAndView.setViewName("/WEB-INF/jsp/login/login.jsp");
        return modelAndView;
    }
}
