package com.youtube.coutryEJB.Service;

import javax.ejb.Local;
import javax.ejb.Remote;



@Remote
public interface LocalFinder {
	
	public String find(String word);
	

}
