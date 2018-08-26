package com.niranjan.currency.converion.springbootmsccs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

public class CurrencyConversionBean {

	private Long id;
	private String from;
	private String to;
	private Integer conversionMultiple;
	private Integer quantity;
	private Integer calculatedAmout ;
	private Integer port;
	
	public CurrencyConversionBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public CurrencyConversionBean(Long id, String from, String to, Integer quantity, Integer conversionMultiple,
			Integer calculatedAmout, Integer port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.calculatedAmout = calculatedAmout;
		this.port = port;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(Integer conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getCalculatedAmout() {
		return calculatedAmout;
	}
	public void setCalculatedAmout(Integer calculatedAmout) {
		this.calculatedAmout = calculatedAmout;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
	

}
