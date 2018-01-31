package com.rafal.assetsevaluator.mvc;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rafal.assetsevaluator.DAO.AssetsDAO;
import com.rafal.assetsevaluator.entity.Assets;


@Controller
public class HomeController {
	
	// need to inject the assets DAO
	@Autowired
	private AssetsDAO assetsDAO;

	@RequestMapping("/")
	public String showHomePage(Model theModel) {
		
		// get assets from the DAO
		List<Assets> theAssets = assetsDAO.getAssets();
		System.out.println("APPLOG: " + theAssets.toString());
		
		theModel.addAttribute("assets", theAssets);
		
		return "main-menu";
	}
}
