package com.example.graphql.defaultbehavior.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.domaine.Post;
import com.example.graphql.repository.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private Posts posts;

    public Post writePost(String title, String text, String category){
      return posts.save(
              new Post(UUID.randomUUID(),title,text,category)
      );
    }
}
