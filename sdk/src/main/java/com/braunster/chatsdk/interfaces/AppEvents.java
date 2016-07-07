/*
 * Created by Itzik Braun on 12/3/2015.
 * Copyright (c) 2015 deluge. All rights reserved.
 *
 * Last Modification at: 3/12/15 4:27 PM
 */

package com.braunster.chatsdk.interfaces;

import com.braunster.chatsdk.dao.BFollower;
import com.braunster.chatsdk.dao.BMessage;
import com.braunster.chatsdk.dao.BUser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by braunster on 30/06/14.
 */

public interface AppEvents {

    public static final int USER_DETAILS_CHANGED = 0;
    public static final int MESSAGE_RECEIVED = 1;
    public static final int THREAD_DETAILS_CHANGED = 2;
    public static final int USER_ADDED_TO_THREAD = 3;
    public static final int FOLLOWER_ADDED = 4;
    public static final int USER_TO_FOLLOW_ADDED = 5;
    public static final int FOLLOWER_REMOVED = 6;
    public static final int USER_TO_FOLLOW_REMOVED = 7;
    public static final int THREAD_USERS_TYPING_CHANGED = 8;



    public boolean onUserDetailsChange(BUser user);

    public boolean onMessageReceived(BMessage message);

    public boolean onThreadIsAdded(String threadId);
    public boolean onThreadDetailsChanged(String threadId);
    public boolean onThreadUsersTypingChanged(String threadId, Map<String,String> usersTyping);
    public boolean onUserAddedToThread(String threadId, String userId);


    public boolean onFollowerAdded(BFollower follower);
    public boolean onFollowerRemoved();
    public boolean onUserToFollowAdded(BFollower follower);
    public boolean onUserToFollowRemoved();
}
