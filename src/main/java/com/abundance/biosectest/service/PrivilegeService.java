package com.abundance.biosectest.service;

import java.util.Collection;

import com.abundance.biosectest.dto.ServerResponse;
import org.springframework.stereotype.Service;

import com.abundance.biosectest.model.Privilege;


@Service
public interface PrivilegeService {
	
	 	public Privilege findById(long id);

	    public Privilege findByName(String name);

	    public ServerResponse update(Privilege privilege);

	    public ServerResponse create(Privilege privilege);

	    public ServerResponse delete(Privilege role);

	    public ServerResponse getPrivileges();
	    
	    public ServerResponse getPrivilegesByRole(String name);

	    public Collection<Privilege> findAll();
	    
	 

}
