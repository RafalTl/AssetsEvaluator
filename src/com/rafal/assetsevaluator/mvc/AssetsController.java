package com.rafal.assetsevaluator.mvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
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
public class AssetsController {

	@Autowired
	private AssetsService assetsService;

	@RequestMapping("/")
	public String showHomePage(Model theModel) {

		// get assets from the DAO
		List<Assets> theAssets = assetsService.getAssets();

		theModel.addAttribute("assets", theAssets);

		/*
		 * wyswietlic
		 */
		// For displaying list of months with added assets

		Set<String> dates = new HashSet<>();

		for (Assets tempAsset : theAssets) {
			// Add date to dates and cut last 3 characters 2010-02-02 to 2010-02
			dates.add(tempAsset.getDate().substring(0, tempAsset.getDate().length() - 3));
		}

		// Convert HashSet to List.
		// HashSet used to prevent adding duplicates.
		// Converted to list to allow ordering
		List<String> sortedDates = new ArrayList<String>(dates);

		// Sort dates in ascending order
		sortedDates.sort(String::compareTo);

		// Reverse the order - looks better
		Collections.reverse(sortedDates);

		System.out.println("--------------"); // just for debug
		for (String temp : sortedDates) {
			System.out.println(temp);
		}

		theModel.addAttribute("sortedDates", sortedDates);

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
	public String showUpdateForm(@RequestParam("assetId") int theId, Model theModel) {

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
