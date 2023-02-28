package com.example.rentacar.webApi.controllers;

import kodlama.io.rentACar.busines.abstracts.BrandService;
import kodlama.io.rentACar.busines.requests.CreateBrandRequest;
import kodlama.io.rentACar.busines.responses.GetAllBrandResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;


import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

	private BrandService brandService;

	@GetMapping("/getall")
	public List<GetAllBrandResponse> getAll(){
		return brandService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest){
		this.brandService.add(createBrandRequest);
	}

}
