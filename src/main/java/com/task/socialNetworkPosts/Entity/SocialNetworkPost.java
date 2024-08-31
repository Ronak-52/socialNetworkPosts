package com.task.socialNetworkPosts.Entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class SocialNetworkPost {

    public SocialNetworkPost() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Temporal(TemporalType.TIMESTAMP)
    private Date postDate;

    private String postCategory;
    private String author;
    private String content;
    private Long viewCount;

    public SocialNetworkPost(Long id, Date postDate, String postCategory, String author, String content,
			Long viewCount) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.postCategory = postCategory;
		this.author = author;
		this.content = content;
		this.viewCount = viewCount;
	}
    
    // Getters and Setters
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getPostCategory() {
		return postCategory;
	}
	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getViewCount() {
		return viewCount;
	}
	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}
	
	@Override
	public String toString() {
		return "SocialNetworkPost [id=" + id + ", postDate=" + postDate + ", postCategory=" + postCategory + ", author="
				+ author + ", content=" + content + ", viewCount=" + viewCount + "]";
	}
	
}