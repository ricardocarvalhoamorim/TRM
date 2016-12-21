package com.adneom.trm.web.rest;

//import java.util.concurrent.Callable;
//
//import javax.inject.Inject;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.adneom.trm.domain.BusinessManager;
//import com.adneom.trm.service.*;
////import com.codahale.metrics.annotation.Timed;
//
////@RestController
////@RequestMapping("/api")
//public class AuthenticatieResource {
//	
//	private final Logger log = LoggerFactory.getLogger(AuthenticatieResource.class);
//
//	
//	@Inject
//	private UserService userService;
//
//	@RequestMapping(value = "/authenticate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
////	@Timed
//	public ResponseEntity<HttpStatus> isAuthenticated(@RequestBody BusinessManager user) {
//		log.debug("REST request to check if the current user is authenticated");
//		System.out.println("resource"+ user.getName());
//		if(userService.getAuthenticate(user.getName(),user.getPassword())){
//           return new ResponseEntity<>(HttpStatus.ACCEPTED);
//		}
//       return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
//	}
public class AuthenticatieResource {
}
