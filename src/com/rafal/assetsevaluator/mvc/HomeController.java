package com.rafal.assetsevaluator.mvc;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rafal.assetsevaluator.DAO.AssetsDAO;
import com.rafal.assetsevaluator.entity.Assets;
import com.rafal.assetsevaluator.service.AssetsService;


@Controller
public class HomeController {
	
	@Autowired
	private AssetsService assetsService;

	@RequestMapping("/")
	public String showHomePage(Model theModel) {
		
		// get assets from the DAO
		List<Assets> theAssets = assetsService.getAssets();
		System.out.println("APPLOG: " + theAssets.toString());
		
		theModel.addAttribute("assets", theAssets);
		
		return "main-menu";
	}
}
