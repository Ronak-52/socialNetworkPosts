package com.task.socialNetworkPosts;

import com.task.socialNetworkPosts.Entity.SocialNetworkPost;
import com.task.socialNetworkPosts.Service.SocialNetworkPostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SocialNetworkPostsServiceTests {

    @Autowired
    private SocialNetworkPostService service;

    @Test
    public void testGetTopPostsByCategory() {
        List<SocialNetworkPost> posts = service.getTopPostsByCategory("Music");
        assertEquals(10, posts.size());
    }

    @Test
    public void testSearchPostsByAuthor() {
        List<SocialNetworkPost> posts = service.searchPostsByAuthor("Alice");
        assertEquals(1, posts.size());
    }
}