package com.poly.myController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.entity.phim;
import com.poly.repository.phimRepo;

@Controller
public class homeController {
	
	@Autowired
	phimRepo phimRepo;
	@RequestMapping("/")
	public String index(
			Model model
			)
	{
		List<phim> ls_phim= this.phimRepo.findAll();
		model.addAttribute("ls_phim",ls_phim);
		return "home/index";
	}
	@RequestMapping("/home/detail/{maphim}")
	public String detail(
			Model model,
			@PathVariable("maphim") Integer maphim
			)
	{	
		phim phim=this.phimRepo.getById(maphim);
		model.addAttribute("phim",phim);
		return "home/detail";
	}
}
