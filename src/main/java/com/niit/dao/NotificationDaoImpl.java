package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.model.Notification;
@Repository
@Transactional
public class NotificationDaoImpl implements NotificationDao {
private SessionFactory sessionFactory;
	public List<Notification> getNotificationNotViewed(String email) {
		Session session=sessionFactory.getCurrentSession();// TODO Auto-generated method stub
		Query query=session.createQuery("from Notification where email=? and viewed=0");
		query.setString(0,email);
		List<Notification> notificationsNotViewed=query.list();
		return notificationsNotViewed;
	}

}
