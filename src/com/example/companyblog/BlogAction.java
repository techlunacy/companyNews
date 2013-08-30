package com.example.companyblog;

import static com.example.companyblog.AppConstants.PREVAYLER_KEY;

import java.util.Map;

import org.prevayler.Prevayler;

import com.example.companyblog.model.Blog;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public abstract class BlogAction extends ActionSupport {
    
    public Blog blog() {
        return (Blog) prevayler().prevalentSystem();
    }

    public Prevayler prevayler() {
        Map<String, Object> application = ActionContext.getContext().getApplication();
        return (Prevayler) application.get(PREVAYLER_KEY);
    }
}
