package com.serguipe.webservices.rest.ticket.service;

import com.serguipe.webservices.rest.ticket.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
}
