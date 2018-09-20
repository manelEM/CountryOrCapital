package com.youtube.coutryEJB.Service;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;





@LocalBean
@Singleton
public class CountryDB {
	
	private Map<String, String>countries=new HashMap<String, String>();
	
	
	public CountryDB() {
		countries.put("Canada", "Ottawa");
		countries.put("Japan", "Tokyo");
		countries.put("Peu", "Lima");
		countries.put("Brazil", "Brazilia");
		countries.put("France", "Paris");
	}
	
	
	public Map<String, String> getCountries() {
		return countries;
	}

}
