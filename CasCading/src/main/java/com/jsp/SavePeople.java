package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		NetWork netWork1=new NetWork();
		netWork1.setNetworkname("aircel");
		
		NetWork netWork2=new NetWork();
		netWork2.setNetworkname("bsnl");
		
		NetWork netWork3=new NetWork();
		netWork3.setNetworkname("airtel");
		
		People people1=new People();
		people1.setName("raj");
		
		People people2=new People();
		people2.setName("kamal");
		
		People people3=new People();
		people3.setName("rajkamal");
		
		People people4=new People();
		people4.setName("kamalraj");
		
		List<People> list1=new ArrayList<People>();
		list1.add(people1);
		list1.add(people2);
		
		List<People> list2=new ArrayList<People>();
		list2.add(people3);
		list2.add(people4);
		
		List<People> list3=new ArrayList<People>();
		list3.add(people1);
		list3.add(people3);
		
		netWork1.setPeoples(list1);
		netWork2.setPeoples(list2);
		netWork3.setPeoples(list3);
		
		List<NetWork> list4=new ArrayList<NetWork>();
		list4.add(netWork1);
		list4.add(netWork3);
		
		people1.setNetworks(list4);
		
		List<NetWork> list5=new ArrayList<NetWork>();
		list5.add(netWork2);
		list5.add(netWork1);
		
		people2.setNetworks(list5);
		
		List<NetWork> list6=new ArrayList<NetWork>();
		list6.add(netWork2);
		list6.add(netWork3);
		
		people3.setNetworks(list6);
		
		List<NetWork> list7=new ArrayList<NetWork>();
		list7.add(netWork3);
		list7.add(netWork1);
		
		people4.setNetworks(list7);
		
		entityTransaction.begin();
		entityManager.persist(netWork1);
		entityManager.persist(netWork2);
		entityManager.persist(netWork3);
		
		entityTransaction.commit();
		
		
		
		
		
	}

}
