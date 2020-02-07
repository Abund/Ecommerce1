package com.abundance.biosectest.service;

import java.util.Collection;

import com.abundance.biosectest.dto.ServerResponse;
import org.springframework.stereotype.Service;

import com.abundance.biosectest.model.Role;



@Service
public interface RoleService {
	
	 public Role findById(long id);

	    public Role findByName(String name);

	    public Collection<Role> getRoles();
	    
	    public ServerResponse findAllRole();

}
