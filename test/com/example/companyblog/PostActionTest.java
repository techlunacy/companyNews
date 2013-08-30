package com.example.companyblog;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.prevayler.PrevaylerFactory;

import com.example.companyblog.model.Blog;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class PostActionTest {
    
    private Blog blog;
    
    @Before
    public void setupPrevalentBlog() {
        blog = new Blog();
        Map<String, Object> applicationContext = new HashMap<String, Object>();
        applicationContext.put(AppConstants.PREVAYLER_KEY, PrevaylerFactory.createTransientPrevayler(blog));
        ActionContext.setContext(new ActionContext(new HashMap<String, Object>()));
        ActionContext.getContext().setApplication(applicationContext);
    }

    @Test
    public void shouldReturnSuccessWhenTitleAndBodyArePresent() {
        PostAction action = new PostAction();
        action.setTitle("some title");
        action.setBody("some body");
        assertEquals(Action.SUCCESS, action.execute());
    }
    
    @Test
    public void shouldPostArticleWhenTitleAndBodyArePresent() {
        PostAction action = new PostAction();
        action.setTitle("some title");
        action.setBody("some body");
        action.execute();
        assertEquals("some title", blog.getArticles().get(0).getTitle());
        assertEquals("some body", blog.getArticles().get(0).getBody());
    }
    
    @Test
    public void shouldReturnInputIfTitleIsNull() {
        PostAction action = new PostAction();
        action.setTitle(null);
        assertEquals(Action.INPUT, action.execute());
    }
}
