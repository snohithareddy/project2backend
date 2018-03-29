package com.niit.dao;



import java.util.List;

import com.niit.model.Friend;
import com.niit.model.User;



public interface FriendDao {

List<User> suggestedUsers(String email);

void addFriend(Friend friend);

List<Friend> pendingRequests(String email);

void acceptRequest(Friend request);



void deleteRequest(Friend request);

public List<Friend> listOfFriends(String email);

}