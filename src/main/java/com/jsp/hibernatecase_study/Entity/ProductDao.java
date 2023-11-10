package com.jsp.hibernatecase_study.Entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.*;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernatecase_study.dao.Cart;
import com.jsp.hibernatecase_study.dao.Product;

@Entity 
public class ProductDao {

	Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Cart.class);
	SessionFactory sf=cfg.buildSessionFactory();

	public  void commonUnitHiber(int key) {


		Product p=new Product();
		Cart c=new Cart();
		Scanner sc=new Scanner(System.in);
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		switch(key) {  
		case 1:
			System.out.println("Enter Id: ");
			int id=sc.nextInt();
			System.out.println("Enter Name: ");
			String name=sc.next();
			System.out.println("Enter price: ");
			double price=sc.nextDouble();
			System.out.println("Enter quality");
			int quality=sc.nextInt();
			List<Product> list=new LinkedList<Product>();
			list.add(p);
			System.out.println("enter cart id");
			int cartId=sc.nextInt();
			p.setProductId(id);
			p.setProductName(name);
			p.setProductPrice(price);
			p.setProductQuality(quality);
			c.setCartId(cartId);
			c.setProductls(list);

			s.save(c);
			s.save(p);
			t.commit();
			t.begin();

			break;
		case 2:
			System.out.println("Enter product Id: ");
			int pid=sc.nextInt();
			Product product=s.get(Product.class, pid);
			System.out.println(product);
			t.commit();
			t.begin();
			break;
		case 3:
			Query q=s.createQuery("from Product");
			List<Product> products=	q.getResultList();
			for(Product pro:products) {
				System.out.println(pro);
			}
			t.commit();
			t.begin();
			break;
		case 4:

			System.out.println("Enter id :");
			int pid12=sc.nextInt();

			CriteriaBuilder builder = s.getCriteriaBuilder();
			CriteriaUpdate<Product> update = builder.createCriteriaUpdate(Product.class);
			Root<Product> root4 = update.from(Product.class);
			System.out.println("enter name");
			String name1=sc.next();
			System.out.println("enter price");
			double price1=sc.nextDouble();
			System.out.println("enter quality");
			int quality1=sc.nextInt();
		
			update.set("productName", name1);
			update.set("productPrice", price1);
			update.set("productQuality", quality1);
			update.where(builder.equal(root4.get("productId"), pid12));
			Query query4 = s.createQuery(update);
			query4.executeUpdate();
			t.commit();
			t.begin();
			break;
		case 5:
			System.out.println("Enter product Id: ");
			int pid1=sc.nextInt();
			Product product1=s.get(Product.class, pid1);
			s.remove(product1);
			System.out.println("DATA DELETED SUCCESSFULLY");
			t.commit();
			t.begin();

			break;
		case 6: 
			System.out.println("THANK YOU....VISIT AGAIN!!!!!");
			System.exit(0);
			break;
		}

	}
	public void addproduct(int key) {

		commonUnitHiber(key);
	}
	public void getproductbyid(int key) {
		commonUnitHiber(key);
	}
	public void getallproduct(int key) {
		commonUnitHiber(key);
	}
	public void updateproduct(int key) {
		commonUnitHiber(key);
	}
	public void deleteproduct(int key) {
		commonUnitHiber(key);

	}
	public void exit(int key) {
		commonUnitHiber(key);

	}
}
