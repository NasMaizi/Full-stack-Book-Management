package com.nasro.book.book;

import org.springframework.data.jpa.domain.Specification;

public class BookSpecification {

    public static Specification<Book> withOwnerId(Integer ownerId){
        return (root, criteriaQuery, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("owner").get("id"),ownerId);

    }
}
