package com.youtube.coutryEJB.Service;

import java.util.Set;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless(name="CapitalFinder")
public class CapitalFinder implements LocalFinder {
	
	
	@EJB
	CountryDB countries;


	public String find(String word) {
		
		
		Set<String>keys=countries.getCountries().keySet();
		for(String k:keys)
		{
			String val=countries.getCountries().get(k);
			if (val.equals(word))
				return k;
		}
		return null;
	}

}
