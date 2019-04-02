package com.remile.chapter2.controller;

import com.remile.chapter2.model.TestModel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "chapter2/test/{value1}/process")
public class TestController {

    @RequestMapping(value = "/{value2}", method = RequestMethod.GET)
    public TestModel queryModel(@PathVariable("value2") long id) {
        TestModel model = new TestModel();
        model.setId(id);
        model.setM_iTest(520);
        model.setM_strTest("this is a test");
        return model;
    }
}