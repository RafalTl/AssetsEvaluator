package com.rafal.assetsevaluator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="months")
public class Months {
	
	@Id														//indicating the member field below is the primary key of current entity
	@GeneratedValue(strategy=GenerationType.IDENTITY)		//to configure the way of increment of the specified column(field). For example when using Mysql, you may specify auto_increment in the definition of table to make it self-incremental
	@Column(name="id")
	private int id;
	
	@Column(name="month")
	private String month;
	
	public Months() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "Months [id=" + id + ", month=" + month + "]";
	}
}
