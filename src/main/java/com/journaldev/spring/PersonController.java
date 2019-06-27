package com.journaldev.spring;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class PersonController {
	
	@RequestMapping("/")
	public String welcome() throws Exception {
		InetAddress ip = InetAddress.getLocalHost();
        String hostname = ip.getHostName();
		return "IP : "+ ip +", HOSTNAME : "+hostname;
	}
	
}
