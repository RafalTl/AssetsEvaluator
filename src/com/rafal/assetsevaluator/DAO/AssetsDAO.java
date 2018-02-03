package com.rafal.assetsevaluator.DAO;

import java.util.List;

import com.rafal.assetsevaluator.entity.Assets;

public interface AssetsDAO {

	public List<Assets> getAssets();	
	
	public void saveAsset(Assets theAsset);
	
	public void deleteAsset(int theId);

	public Assets getAsset(int theId);
}
