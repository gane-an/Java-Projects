package com.example.SampleDB.RpRepository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SampleDB.Entity.stdData;

public interface Repo extends JpaRepository<stdData, Integer>  {
	
}
