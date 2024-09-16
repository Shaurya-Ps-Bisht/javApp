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
    @JoinColumn(name = "commentid", referencedColumnName = "commentid")
    private Comment comment;

    @Id
    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private User user;
}
