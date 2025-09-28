package com.nasro.book.feedback;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    @Query("SELECT feedback from Feedback feedback where feedback.book.id = :bookId")
    Page<Feedback> findAllByBookId(int bookId, Pageable pageable);
}
