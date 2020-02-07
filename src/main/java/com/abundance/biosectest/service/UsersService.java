package com.abundance.biosectest.service;

import java.util.Collection;

import com.abundance.biosectest.model.Users;
import org.springframework.stereotype.Service;

import com.abundance.biosectest.dto.ActivateUserRequest;
import com.abundance.biosectest.dto.PasswordResetDto;
import com.abundance.biosectest.dto.ResendUserActivationCodeDto;
import com.abundance.biosectest.dto.ResendUserPasswordDto;
import com.abundance.biosectest.dto.ServerResponse;
import com.abundance.biosectest.dto.SignInRequest;
import com.abundance.biosectest.dto.SignUpRequest;
import com.abundance.biosectest.dto.UpdateUserRequestDto;


@Service
public interface UsersService {
	
	public Collection<Users> findAll();
	
	public Users findById(long usersId);
	
	public Users findByEmail(String emailAddress);
	
	public Users findByPhone(String phoneNumber);
	
	public Users findByEmailOrPhone(String emailAddress, String phoneNumber);

	public ServerResponse create(SignUpRequest request);
	
	public ServerResponse userActivation(ActivateUserRequest request);
	
	public ServerResponse reSendUserActivation(ResendUserActivationCodeDto request);
	
	public ServerResponse reSendUserPassword(ResendUserPasswordDto request);
	
	public ServerResponse passwordReset(PasswordResetDto request);
	
	public ServerResponse updateUser(UpdateUserRequestDto request);
	
	public ServerResponse login(SignInRequest request);
	
	public ServerResponse viewAll();
	
	public ServerResponse delete(long usersId);
	

}
