package com.fetchrewards;

import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MyErrorController implements ErrorController {

	private static final Logger LOGGER = LogManager.getLogger(MyErrorController.class);

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/error")
	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "No word is supplied in the path")
	public String handleError(HttpServletRequest request) {
		LOGGER.error("Path variable not supplied");
		return "error";
	}

}
