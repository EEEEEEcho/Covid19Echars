package com.echo.controller;

import com.echo.domain.Country;
import com.echo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService service;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ResponseBody
    public List<Country> findAll(Model model){
        List<Country> list  = service.findAll();
        return list;
    }
}
