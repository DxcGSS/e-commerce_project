package com.salesmanager.shop.admin.security;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.salesmanager.core.business.exception.ServiceException;

public interface WebUserServices extends UserDetailsService {

	void createDefaultAdmin() throws ServiceException;
}
