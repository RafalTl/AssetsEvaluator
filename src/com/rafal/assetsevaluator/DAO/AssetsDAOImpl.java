package com.rafal.assetsevaluator.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rafal.assetsevaluator.entity.Assets;

@Repository						//an annotation that marks the specific class as a Data Access Object
public class AssetsDAOImpl implements AssetsDAO {

	@Autowired					//annotation allows you to skip configurations elsewhere of what to inject and just does it for you
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional				//a way to let Spring start and commit/rollback transactions for you
	public List<Assets> getAssets() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Assets> theQuery = 
				currentSession.createQuery("FROM Assets", Assets.class);
		
		// execute query and get result list
		List<Assets> assets = theQuery.getResultList();
		
		return assets;
	}

	@Override
	@Transactional
	public void saveAsset(Assets theAsset) {

		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theAsset);
		
	}
	

	@Override
	@Transactional
	public void deleteAsset(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = 
				currentSession.createQuery("DELETE FROM Assets WHERE id=:assetId");
		theQuery.setParameter("assetId", theId);
		
		theQuery.executeUpdate();
		
	}

	@Override
	@Transactional	
	public Assets getAsset(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Assets theAsset = currentSession.get(Assets.class, theId);
		
		return theAsset;
	}

	@Override
	@Transactional
	public List<Assets> getAssetsByMonth(String month) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Assets> theQuery = 
				currentSession.createQuery("FROM Assets WHERE date LIKE '%" + month + "%'", Assets.class);
		
		// execute query and get result list
		List<Assets> assetsSortedByMonth = theQuery.getResultList();
		
		return assetsSortedByMonth;
	}

}
