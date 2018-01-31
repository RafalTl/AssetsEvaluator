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
				currentSession.createQuery("from Assets", Assets.class);
		
		// execute query and get result list
		System.out.println("APPLOG: theQuery.getResultList()");
		List<Assets> assets = theQuery.getResultList();
		
		System.out.println("APPLOG: Returning assets in getAssets");
		return assets;
	}

}
