//https://www.tutorialspoint.com/hibernate/hibernate_architecture.htm

package com.prankster.demo_hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class App 
{
    public static void main( String[] args )
    {
    	prankname pname=new prankname();
    	pname.setPfname("y");
    	pname.setPmname("s");
    	pname.setPlname("k");
    	
      prankster prank=new prankster();
      prank.setPid(1101);
      prank.setPrankster("goodone");
      prank.setPname(pname);
      
      address ads=new address();
      ads.setAid(101);
      ads.setCity("bgm");
      ads.setName(pname);
      
      Configuration config=new Configuration().configure();
      config.addAnnotatedClass(prankster.class);
      config.addAnnotatedClass(address.class);
      
      ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
      SessionFactory sf=config.buildSessionFactory(sr);
      
      Session session=sf.openSession();     
      Transaction tx=session.beginTransaction();
    
    session.save(prank);
    session.save(ads);
      tx.commit();
      
      System.out.println(prank);
      }
}
