package com.lab.repositories;

import com.lab.model.Comment;
import org.springframework.stereotype.Repository;

// Buoc 6: Dung @Qualifier("fileCommentRepository") trong CommentService de chon class nay
@Repository
public class FileCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("  [File] Storing: " + comment);
    }
}
