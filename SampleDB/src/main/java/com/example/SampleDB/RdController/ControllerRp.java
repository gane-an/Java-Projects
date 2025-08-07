package com.example.SampleDB.RdController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.example.SampleDB.Entity.stdData;
import com.example.SampleDB.RdController.RpService.ServicesRp;

@RequestMapping("/main")
@RestController("/rpcollege")
public class ControllerRp {
	@GetMapping("/sample1")
	public String method1() {
		return "Hello World";
	}
	@GetMapping("/home/{datas}")
	public String method2(@PathVariable (value="datas") String name) {
		return "Hello "+name;
	}
	
	@Autowired
	ServicesRp service;
	@PostMapping("/postData")
	public stdData method3(@RequestBody stdData st ) {
		return this.service.postData(st);
}
}