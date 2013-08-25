/**
 * 
 */
package com.grandmaster.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.grandmaster.db.connection.DBConnector;

/**
 * @author Rahul
 * 
 */
public class GrandmasterContextInitializer implements ServletContextListener {

    /*
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(ServletContextEvent contextEvent) {
        System.out.println(">>>>>>>>>>>>>>> CONTEXT STARTED <<<<<<<<<<<<<<<");
        DBConnector connector = new DBConnector();
        contextEvent.getServletContext().setAttribute("DB_Connector", connector);
    }

    /*
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent contextEvent) {
        contextEvent.getServletContext().setAttribute("DB_Connector", null);
        contextEvent.toString();
    }

}
