package com.cydeo.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy {

//interface because there might be more than 1 implementations based on our business requirements


void sendComment(Comment comment);









}
