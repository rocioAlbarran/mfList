package com.asea.mf.mfflujoslist;

import java.io.IOException;


import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/
@WebFilter("/*")
@Component
public class UserCheckFilter implements Filter {
	
  
    public static void forward(HttpServletRequest request, HttpServletResponse response, String page) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/user.check" + page)
            .forward(request, response);
    }
    
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filtrandoooooooooooooo--->>>>>> ");
        System.out.println("getServletContext------>>>>>>>> "+req.getServletContext());
        System.out.println("getLocalAddr---->>>>>>>>>>>>>>> "+req.getLocalAddr());
        System.out.println("getRemoteAddr----->>>>>>>>>>>>> "+req.getRemoteAddr());
        System.out.println("getRequestId---->>>>>>>>>>>>>> "+req.getRequestId());
        System.out.println("getServletContext-------->>>>>>>>> "+req.getServletContext().getContextPath());
        System.out.println("getServletContext.getServletContextName--------->>>>> "+req.getServletContext().getServletContextName());
        System.out.println("req---------------->>>>>>>>>>>>>>>>>>>>>>>> "+req.toString());
        String cadenaCIfrada="", cadenaDescifrada="";
        Cifrado cipherFilter= new Cifrado();
       try {
			cadenaCIfrada=cipherFilter.cifraPrivK("Hola Mundo");
			System.out.println("Cifrado---------------->>>>>>>>>>>>>>>>>>>>>>>> "+cadenaCIfrada);
			cadenaDescifrada=cipherFilter.descifraPubK(cadenaCIfrada);
			System.out.println("cadenaDescifrada---------------->>>>>>>>>>>>>>>>>>>>>>>>:"+cadenaDescifrada+".<<<<");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
        
    	if (!(req instanceof HttpServletRequest)) {
    		System.out.println("Filtro 39 ");
            throw new ServletException("Can only process HttpServletRequest");
        }

        if (!(res instanceof HttpServletResponse)) {
        	System.out.println("Filtro 44 ");
        	throw new ServletException("Can only process HttpServletResponse");
        }
        System.out.println("Filtro 47 ");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        System.out.println("Filtro 50 ");
        request.setAttribute("origin", request.getRequestURI());

        if (!request.getRequestURI()
            .contains("mf") && request.getSession(false) == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            forward(request, response, "/login.jsp");
            // we return here so the original servlet is not processed
            return;
        }

        chain.doFilter(request, response);
    }

    public void init(FilterConfig arg) throws ServletException {
    }
}