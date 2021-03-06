package hrapp.app.server.service.aaaboundedcontext.authentication;
import hrapp.app.server.businessservice.aaaboundedcontext.authentication.AuthenticateBusinessService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.server.businessservice.aaaboundedcontext.authentication.AuthenticateBusinessService;
import com.athena.framework.server.bean.ResponseBean;
import com.spartan.server.authenticate.bean.LoginCredentialsBean;
import com.spartan.server.authenticate.bean.TokenCredentialBean;

@RestController
@RequestMapping(value = "/Authentication", method = RequestMethod.POST/*, consumes = { "application/json"}*/ )
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AuthenticateService {

	@Autowired
	private AuthenticateBusinessService authenticateBizService;
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public HttpEntity<ResponseBean> authenticate(@RequestBody LoginCredentialsBean loginBean, HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		return authenticateBizService.authenticate(loginBean, request, response, session);
	}
	
	@RequestMapping(value = "/reauthenticate", method = RequestMethod.POST) 
	public HttpEntity<ResponseBean> reauthenticate(@RequestBody TokenCredentialBean toknBean, HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return authenticateBizService.reauthenticate(toknBean, request, response, session);
	}
	
	@RequestMapping(value = "checkLoginStatus", method = RequestMethod.POST) 
	public HttpEntity<ResponseBean> checkLoginStatus(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return authenticateBizService.checkLoginStatus(request, response, session);
	}
	
}
