package com.rafal.assetsevaluator.mvc;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("showAddAssetForm")
	public String showAddAssetForm(Model theModel) {
		
		Assets theAsset = new Assets();
		
		theModel.addAttribute("asset", theAsset);
		
		return "asset-form";
	}
	
	@PostMapping("/saveAsset")
	public String saveCustomer(@ModelAttribute("asset") Assets theAsset) {
		
		assetsService.saveAsset(theAsset);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam("assetId") int theId,
									Model theModel) {
		
		Assets theAsset = assetsService.getAsset(theId);
		theModel.addAttribute("asset", theAsset);
		
		return "asset-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteAsset(@RequestParam("assetId") int theId) {
		assetsService.deleteAsset(theId);
		
		return "redirect:/";
		
	}
	
	
}
