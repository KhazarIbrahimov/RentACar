package com.example.rentacar.dataAccess.concretes;//package kodlama.io.rentACar.dataAccess.concretes;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
//import kodlama.io.rentACar.entities.concretes.Brand;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public abstract class InMemoryBrandRepository implements BrandRepository {
//
//	List<Brand> brands;
//
//	public InMemoryBrandRepository() {
//		brands = new ArrayList<Brand>();
//		brands.add(new Brand(1,"KIA"));
//		brands.add(new Brand(2,"BMW"));
//		brands.add(new Brand(3,"Mercedes"));
//		brands.add(new Brand(4,"Hyundai"));
//		brands.add(new Brand(5,"Lada"));
//	}
//
//	@Override
//	public List<Brand> getAll() {
//
//		return brands;
//	}
//
//}
