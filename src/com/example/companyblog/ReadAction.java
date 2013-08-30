package com.example.companyblog;

import java.util.List;

import com.example.companyblog.model.Article;

@SuppressWarnings("serial")
public class ReadAction extends BlogAction {
    
    public List<Article> getArticles() {
        return blog().getArticles();
    }
}
