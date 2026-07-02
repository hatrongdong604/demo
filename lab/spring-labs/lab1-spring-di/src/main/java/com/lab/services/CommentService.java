package com.lab.services;

import com.lab.model.Comment;
import com.lab.proxies.CommentNotificationProxy;
import com.lab.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy notificationProxy;

    // Buoc 6: @Qualifier chi dinh bean nao duoc inject khi co nhieu impl.
    // Thu doi "DBCommentRepository" -> "fileCommentRepository" de thay output thay doi.
    public CommentService(
            @Qualifier("DBCommentRepository") CommentRepository commentRepository,
            CommentNotificationProxy notificationProxy) {
        this.commentRepository = commentRepository;
        this.notificationProxy = notificationProxy;
        System.out.println("[INIT] CommentService created!");
    }

    public void publishComment(Comment comment) {
        System.out.println("\n>> Publishing: " + comment);
        commentRepository.storeComment(comment);
        notificationProxy.sendNotification(comment);
        System.out.println(">> Done!\n");
    }
}
