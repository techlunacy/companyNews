package com.example.companyblog.model;

import java.util.Date;

import org.prevayler.Transaction;

/**
 * A Prevayler transaction to post an article to the {@link Blog}.
 */
public class PostCommand implements Transaction {

    private static final long serialVersionUID = -3637435757951084285L;
    private String title;
    private String body;

    public PostCommand(String title, String body) {
        this.title = title;
        this.body = body;
    }
    
    public void executeOn(Object prevalentSystem, Date executionTime) {
        Blog blog = (Blog) prevalentSystem;
        blog.postArticle(new Article(title, body, new Date()));
    }

}
