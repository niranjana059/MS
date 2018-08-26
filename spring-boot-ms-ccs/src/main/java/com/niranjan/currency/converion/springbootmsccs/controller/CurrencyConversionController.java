package com.niranjan.currency.converion.springbootmsccs.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.niranjan.currency.converion.springbootmsccs.entity.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	public static Logger logger = LoggerFactory.getLogger(CurrencyConversionController.class);
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getConversion(@PathVariable String from, @PathVariable String to, @PathVariable Integer quantity) {

		Map<String ,Object> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8003/currency-exchang/from/{from}/to/{to}", 
				CurrencyConversionBean.class, uriVariables);
		CurrencyConversionBean currencyConversionBean =  responseEntity.getBody();
		return new CurrencyConversionBean(currencyConversionBean.getId(), currencyConversionBean.getFrom(), currencyConversionBean.getTo(), quantity,
				currencyConversionBean.getConversionMultiple(),currencyConversionBean.getConversionMultiple()*quantity , currencyConversionBean.getPort());
	}


}
