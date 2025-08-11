package com.nasro.book.book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

interface BookRepository extends JpaRepository<Book, Integer>, JpaSpecificationExecutor<Book> {
    @Query("SELECT book from Book book where book.archived =false  and book.shareable=true and book.owner.id != :userId")
    Page<Book> findAllDisplayableBooks(Pageable pageable, Integer userId);
}
