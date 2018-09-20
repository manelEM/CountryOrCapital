package com.youtube.countryCltTest;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.youtube.coutryEJB.Service.CountryService;
import com.youtube.coutryEJB.Service.CountryServiceImpl;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		invoke();

	}

	private static void invoke() throws NamingException {
		// TODO Auto-generated method stub
		final CountryService countryService=lookUpCountryService();
		String word=countryService.checkAndFind("Japan");
		String word1=countryService.checkAndFind("Ottawa");
		System.out.println(word);
		System.out.println(word1);
		
	}

	private static CountryService lookUpCountryService() throws NamingException {
		final Hashtable jndiProperties=new Hashtable();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		final Context context=new InitialContext(jndiProperties);
		final String appName="";
		final String moduleName="countryEJB";
		final String distinctName="";
		final String beanName=CountryServiceImpl.class.getSimpleName();
		final String viewClassName=CountryService.class.getName();
		return (CountryService)context.lookup("ejb:"+appName+"/"+moduleName+"/"+distinctName+"/"+beanName +"!"+viewClassName);
	}

}
