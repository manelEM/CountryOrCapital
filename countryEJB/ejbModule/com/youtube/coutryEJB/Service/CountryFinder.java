package com.youtube.coutryEJB.Service;

import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless(name="CountryFinder")
public class CountryFinder implements LocalFinder {
	
	
	@EJB
	CountryDB countries;
	


	public String find(String word) {
		
		return countries.getCountries().get(word);
	}

}
