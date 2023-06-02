package com.transdyne.demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.transdyne.demo1.services.demoservices;

@Controller
public class demoController {
    @Autowired
    demoservices service;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String showTodos(ModelMap model){
        model.put("demos", service.retrieveTodos());
        return "list";
    }
} 

