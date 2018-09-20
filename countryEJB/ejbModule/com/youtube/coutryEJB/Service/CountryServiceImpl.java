package com.youtube.coutryEJB.Service;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(CountryService.class)
public class CountryServiceImpl implements CountryService{

	
	
	@EJB
	CountryDB countries;
	
	@EJB(beanName="CountryFinder")
	LocalFinder CountryFinder;
	
	@EJB(beanName="CapitalFinder")
	LocalFinder CapitalFinder;
	
	
	public String checkAndFind(String word) {
		LocalFinder finder=null;
		if(countries.getCountries().containsKey(word))
			finder=CountryFinder;
		
		if(countries.getCountries().containsValue(word))
			finder=CapitalFinder;
		
		
		
		
		return finder.find(word);
	}
	
	

}
