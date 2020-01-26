package com.example.graphql;

import com.example.graphql.repository.Posts;
import com.example.graphql.domaine.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.UUID;

@Component
public class DataSeed implements CommandLineRunner {

    @Autowired
    private Posts posts;

    @Override
    public void run(String... args) throws Exception {
        posts.saveAll(
                Arrays.asList(
                        new Post(UUID.randomUUID(),"title","category","text"),
                        new Post(UUID.randomUUID(),"title2","category2","text2"),
                        new Post(UUID.randomUUID(),"title2","category3","text3")
                )
        );
    }
}
