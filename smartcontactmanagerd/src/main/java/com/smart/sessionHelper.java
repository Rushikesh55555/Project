package com.smart;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;




@Component
public class sessionHelper {

	public void removeMessageFromSession()
	{
		try {
			HttpSession session=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
			
			session.removeAttribute("message");
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
