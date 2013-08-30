package com.example.companyblog;

import com.example.companyblog.model.PostCommand;

@SuppressWarnings("serial")
public class PostAction extends BlogAction {
    
    private String body;
    private String title;

    public String execute() {
        if (title != null && body != null) {
            prevayler().execute(new PostCommand(title, body));
            return SUCCESS;
        } else {
            return INPUT;
        }
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
