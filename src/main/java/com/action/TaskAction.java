package com.action;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LK on 2016/8/21.
 */
@Controller
public class TaskAction {

    @RequestMapping("getTaskList")
    public String getTaskList(HttpServletRequest request, HttpServletResponse response, ModelMap model) {

//        User user = request.getSession().getAttribute();
        return "";
    }
}
