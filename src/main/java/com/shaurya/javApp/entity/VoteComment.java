package com.shaurya.javApp.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "voteComments")
@IdClass(VoteCommentId.class)
public class VoteComment {

    @Id
    @ManyToOne
    @JoinColumn(name = "commentId", referencedColumnName = "commentId")
    private Comment comment;

    @Id
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
}
