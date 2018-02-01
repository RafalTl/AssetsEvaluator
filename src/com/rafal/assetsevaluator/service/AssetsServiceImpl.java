package com.rafal.assetsevaluator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafal.assetsevaluator.DAO.AssetsDAO;
import com.rafal.assetsevaluator.entity.Assets;


//The @Service annotation is also a specialization of the component annotation. 
//It doesn’t currently provide any additional behavior over the @Component annotation, 
//but it’s a good idea to use @Service over @Component in service-layer classes 
//because it specifies intent better.

@Service
public class AssetsServiceImpl implements AssetsService {

	@Autowired
	private AssetsDAO assetsDAO;
	
	@Override
	public List<Assets> getAssets() {
		return assetsDAO.getAssets();
	}

}
