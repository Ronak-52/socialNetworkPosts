package com.task.socialNetworkPosts.Service;

import com.task.socialNetworkPosts.Entity.SocialNetworkPost;
import com.task.socialNetworkPosts.Repository.SocialNetworkPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialNetworkPostService {

    @Autowired
    private SocialNetworkPostRepository repository;

    public List<SocialNetworkPost> getTopPostsByCategory(String category) {
        return repository.findTop10ByPostCategoryOrderByViewCountDesc(category);
    }

    public List<SocialNetworkPost> searchPostsByAuthor(String author) {
        return repository.findByAuthorContainingIgnoreCase(author);
    }
}
