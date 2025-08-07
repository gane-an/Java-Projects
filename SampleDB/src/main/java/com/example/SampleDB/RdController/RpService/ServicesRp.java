package com.example.SampleDB.RdController.RpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.SampleDB.RpRepository.Repo;
import com.example.SampleDB.Entity.stdData;

@Service
public class ServicesRp {
	@Autowired
	Repo rp;
	
	@PostMapping
	public stdData postData(@RequestBody stdData st) {
		return this.rp.save(st);
	}
}
