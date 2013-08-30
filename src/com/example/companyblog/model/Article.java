package com.example.companyblog.model;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    
    private static final long serialVersionUID = -8984371782422340342L;
    
    private String title;
    private String body;
    private Date createDate;
    
    public Article(String title, String body, Date createDate) {
        this.title = title;
        this.body = body;
        this.createDate = createDate;
    }
    
    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Date getCreateDate() {
        return createDate;
    }
    
}
