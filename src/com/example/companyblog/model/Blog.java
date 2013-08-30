package com.example.companyblog.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;


public class Blog implements Serializable {

    private static final long serialVersionUID = 4765516104300565199L;
    
    private LinkedList<Article> articles = new LinkedList<Article>();
    
    /**
     * Posts an article. Only package-visible because the outside world
     * should use {@link PostCommand} to post articles.
     */
    void postArticle(Article article) {
        articles.addFirst(article);
    }
    
    public List<Article> getArticles() {
        return Collections.unmodifiableList(articles);
    }
}
