package com.example.companyblog;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;

import com.example.companyblog.model.Blog;

import static com.example.companyblog.AppConstants.*;

public class BlogListener implements ServletContextListener {
    
    Prevayler prevayler;
    
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("Setting up Prevayler.");
        try {
            prevayler = PrevaylerFactory.createPrevayler(new Blog(), "/home/russell/persistence/files*");   
            event.getServletContext().setAttribute(PREVAYLER_KEY, prevayler);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("Tearing down Prevayler.");
        try {
            prevayler.takeSnapshot();
        } catch (IOException e) {
            e.printStackTrace();            
        }
    }
}
