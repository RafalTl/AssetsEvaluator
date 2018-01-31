package com.rafal.assetsevaluator.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rafal.assetsevaluator.entity.Months;

@Repository
public class MonthsDAOImpl implements MonthsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Months> getMonths() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Months> theQuery = 
				currentSession.createQuery("from Months", Months.class);
		
		// execute query and get result list
		System.out.println("APPLOG: theQuery.getResultList()");
		List<Months> months = theQuery.getResultList();
		
		System.out.println("APPLOG: Returning months in getMonths");
		return months;
	}

}
