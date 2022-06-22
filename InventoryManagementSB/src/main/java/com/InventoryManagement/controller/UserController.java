package com.InventoryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.InventoryManagement.dao.BrandRepository;
import com.InventoryManagement.dao.ProductRepository;
import com.InventoryManagement.entities.Brand;
import com.InventoryManagement.entities.Product;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping("/index")
	public String dashboard() {
		return "normal/user_dashboard";
	}
	
	@RequestMapping(value = "/brandList", method = RequestMethod.GET)
	public String carsPage(Model model) {
		List<Brand> brands = brandRepository.getBrands();
		model.addAttribute("brands", brands);
		List<Product> products = productRepository.getProducts();
		model.addAttribute("products", products);
		return "normal/selectBrand";
	}
	
	@RequestMapping(value = "/brandcarslist", method = RequestMethod.GET)
	public String brandCarsPage(@RequestParam(name = "brand_name") String brand_name,
			Model model) {
		
		int id = brandRepository.getBrandId(brand_name);
		List<Product> products = productRepository.getProductInfoByBrandId(id);
		model.addAttribute(brand_name);
		model.addAttribute("products", products);
		return "normal/buyCarsList";
		
	}
}
