package com.task.socialNetworkPosts.Repository;

import com.task.socialNetworkPosts.Entity.SocialNetworkPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocialNetworkPostRepository extends JpaRepository<SocialNetworkPost, Long> {

    List<SocialNetworkPost> findTop10ByPostCategoryOrderByViewCountDesc(String postCategory);

    List<SocialNetworkPost> findByAuthorContainingIgnoreCase(String author);
}