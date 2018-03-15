package com.niit.dao;



import java.util.List;

import com.niit.model.Friend;
import com.niit.model.User;



public interface FriendDao {

List<User> suggestedUsers(String email);

void addFriend(Friend friend);

List<Friend> pendingRequests(String email);



}