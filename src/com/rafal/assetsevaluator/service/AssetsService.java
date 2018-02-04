package com.rafal.assetsevaluator.service;

import java.util.List;

import com.rafal.assetsevaluator.entity.Assets;

public interface AssetsService {

	public List<Assets> getAssets();

	public void saveAsset(Assets theAsset);
	
	public void deleteAsset(int theId);

	public Assets getAsset(int theId);

	public List<Assets> getAssetsByMonth(String month);
	
}
