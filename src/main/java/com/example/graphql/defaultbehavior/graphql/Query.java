package com.example.graphql.defaultbehavior.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.repository.Posts;
import com.example.graphql.domaine.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private Posts posts;
    public List<Post> getRecentPosts(int count, int offset) {
        return posts.findAll(offset,count);
    }
}
