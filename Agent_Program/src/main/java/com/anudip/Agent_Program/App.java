package com.anudip.Agent_Program;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration con = new Configuration().configure().addAnnotatedClass(Agent.class);
       SessionFactory sf = con.buildSessionFactory();
       
       createAgent(sf, "Abhimanyu","abhi@gmail.com", "9856745632");
       createAgent(sf, "Rahul","Rahul@gmail.com", "8545663250");
       createAgent(sf, "Rinshu","R@gmail.com", "9845663250");
       updateagent(sf, 1, "kaju","Ramu@gmail.com", "8459656329");
       deletagent(sf, 1);
       showagent(sf, 2);
    }
    
    
    public static void createAgent( SessionFactory ss, String name , String mail, String phone ){
    	
    	Session session = ss.openSession();
    	 Transaction transaction = session.beginTransaction();
    	 
    	 Agent a1 = new Agent();
         
         
         a1.setAname(name);
         a1.setAemail(mail);
         a1.setAphone(phone);
           
         session.persist(a1);
         transaction.commit();
	}
    
    public static void updateagent( SessionFactory ss, int id, String name , String mail, String phone ){
    	
    	Session session = ss.openSession();
    	 Transaction transaction = session.beginTransaction(); 
    	 
    	 Agent  agent = session.load(Agent.class,id);
    	 agent.setAname(name);
    	 agent.setAemail(mail);
         agent.setAphone(phone);
      	
         session.persist(agent);
         transaction.commit();
	}
    
    public static void deletagent( SessionFactory ss, int id) {
    	
    	Session session = ss.openSession();
   	 Transaction transaction = session.beginTransaction(); 
   	 Agent agent =session.get(Agent.class, id);
   	 session.delete(agent);
   	 
   	 
//   	session.persist(agent);
    transaction.commit();
	}
    
    public static void showagent( SessionFactory ss, int id ) {
    	
    	Session session = ss.openSession();
      	 Transaction transaction = session.beginTransaction(); 
      	   
      	 Agent agent = session.get(Agent.class, id);
      	 System.out.println(agent.getId()+" ");
      	System.out.println(agent.getAname()+" ");
      	System.out.println(agent.getAemail()+" ");
      	System.out.println(agent.getAphone()+" ");
      	 
	}
}
