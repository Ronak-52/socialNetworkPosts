package com.task.socialNetworkPosts.Controller;

import com.task.socialNetworkPosts.Entity.SocialNetworkPost;
import com.task.socialNetworkPosts.Service.SocialNetworkPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class SocialNetworkPostController {

    @Autowired
    private SocialNetworkPostService service;

    @GetMapping("/top")
    public List<SocialNetworkPost> getTopPosts(@RequestParam String category) {
        return service.getTopPostsByCategory(category);
    }

    @GetMapping("/search")
    public List<SocialNetworkPost> searchPosts(@RequestParam String author) {
        return service.searchPostsByAuthor(author);
    }
}

