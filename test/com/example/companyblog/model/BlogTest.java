package com.example.companyblog.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class BlogTest {
    @Test
    public void shouldPutNewestArticleFirst() {
        Blog blog = new Blog();
        blog.postArticle(new Article("first", null, null));
        blog.postArticle(new Article("second", null, null));
        assertEquals("second", blog.getArticles().get(0).getTitle());
    }
    
    @Test
    public void shouldNotLetMeMessUpTheInternalArticleList() {
        Blog blog = new Blog();
        blog.postArticle(new Article("first", null, null));
        List<Article> list = blog.getArticles();
        try {
            list.add(new Article(null, null, null));
            fail("list should not be modifiable");
        } catch (UnsupportedOperationException expected) {}
    }
}
