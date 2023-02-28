package com.skills421.dataservice.controller;

import com.skills421.dataservice.DummyDate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DataController
{
    @GetMapping("/data")
    public List<Object> getAllData() throws Exception {
        return DummyDate.getDummyData();
    }
}
