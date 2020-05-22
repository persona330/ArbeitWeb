package com.example.demo.controller;

import com.example.demo.entity.Phone;
import com.example.demo.repository.MenschRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private MenschRepository menschRepository;

	@RequestMapping("/save")
	public String process(){
		//DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		//Date d1 = df.parse("1980-12-20");
		//Date d2 = df.parse("1980-18-20");
		//Date d3 = df.parse("1970-12-20");

		menschRepository.save(new Phone("JD", "454545656"));
		menschRepository.save(new Phone("John", "5652122121"));
		menschRepository.save(new Phone("Simon", "25668868"));
		return "Done";
	}
	@RequestMapping("/findall")
	public String findAll()
	{
		String result = "";
		for(Phone cust : menschRepository.findAll()){
			result += cust.toString() + "</br>";
		}
		return result;
	}
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = menschRepository.findById(id).toString();
		return result;
	}

	@RequestMapping("/findbylastname")
	public String fetchDataByName(@RequestParam("name") String lastName){
		String result = "";

		for(Phone cust: menschRepository.findByName(lastName)){
			result += cust.toString() + "</br>";
		}
		return result;
	}


}
