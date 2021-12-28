package com.salesmanager.shop.admin.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;

public class UserAuthenticationSuccessHandler extends AbstractAuthenticatinSuccessHandler {
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	    
	    @Override
	    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
	        this.redirectStrategy = redirectStrategy;
	    }
	    @Override
	    protected RedirectStrategy getRedirectStrategy() {
	        return redirectStrategy;
	    }

		@Override
		protected void redirectAfterSuccess(HttpServletRequest request, HttpServletResponse response) throws IOException {
			redirectStrategy.sendRedirect(request, response, "/admin/home.html");
			
		}

}
