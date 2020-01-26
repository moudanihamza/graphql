package com.example.graphql.repository;

import com.example.graphql.domaine.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface Posts extends CrudRepository<Post, UUID> {

    @Query(value="SELECT * FROM POST ORDER BY ID LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<Post> findAll(@Param("offset") int offset,@Param("limit") int count);
}
