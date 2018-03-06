package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.NotificationDao;
import com.niit.model.ErrorClass;
import com.niit.model.Notification;

@Controller
public class NotificationController {
@Autowired
private NotificationDao notificationDao;
public NotificationController() {
	System.out.println("NotificationController bean is created ");
}
@RequestMapping(value="/getnotifications",method=RequestMethod.GET)
public ResponseEntity<?>getNotificationsNotViewed(HttpSession session){
	String email=(String)session.getAttribute("loginId");
	if(email==null) {
		ErrorClass error=new ErrorClass(5,"Unauthorized access...");
		return new ResponseEntity<ErrorClass>(error,HttpStatus.UNAUTHORIZED);	
	}
	List<Notification> notificationsNotViewed=notificationDao.getNotificationNotViewed(email);
	return new ResponseEntity<List<Notification>>(notificationsNotViewed,HttpStatus.OK);
}
}
