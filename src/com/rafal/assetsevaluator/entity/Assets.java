package com.rafal.assetsevaluator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assets")
public class Assets {

	@Id														//indicating the member field below is the primary key of current entity
	@GeneratedValue(strategy=GenerationType.IDENTITY)		//to configure the way of increment of the specified column(field). For example when using Mysql, you may specify auto_increment in the definition of table to make it self-incremental
	@Column(name="id")
	private int id;
	
	@Column(name="date")	
	private String date;
	
	@Column(name="asset_name")	
	private String asset_name;
	
	@Column(name="amount")	
	private double amount;
	
	@Column(name="currency")	
	private String currency;
	
	@Column(name="asset_description")	
	private String asset_description;
	
	@Column(name="user_id")
	private int user_id;
	
//	Getters And Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAsset_name() {
		return asset_name;
	}

	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAsset_description() {
		return asset_description;
	}

	public void setAsset_description(String asset_description) {
		this.asset_description = asset_description;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

//	toString implmentation
	
	@Override
	public String toString() {
		return "Assets [id=" + id + ", date=" + date + ", asset_name=" + asset_name + ", amount=" + amount
				+ ", currency=" + currency + ", asset_description=" + asset_description + ", user_id=" + user_id + "]";
	}



	
	
	
	
}
