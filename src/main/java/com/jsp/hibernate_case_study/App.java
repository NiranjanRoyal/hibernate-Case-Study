package com.jsp.hibernate_case_study;

import java.util.Scanner;

import com.jsp.hibernatecase_study.Entity.ProductDao;
import com.jsp.hibernatecase_study.dao.Cart;
import com.jsp.hibernatecase_study.dao.Product;

public class App 
{
	 
    public static void main( String[] args )
    {
    	while(true) {
      Scanner sc=new Scanner(System.in);
      
    	   System.out.println("Welcome page ");
    	   
    	   System.out.println(" 1.Add products\n 2.Get product by id\n 3.Get all product\n 4.Update product\n 5.delete product\n 6.Exit");
    	   
    	   ProductDao pd=new ProductDao();
    	 int key=sc.nextInt();
    	 switch(key) {
    	 case 1:
    		 pd.addproduct(key);
    		 break;
    		 
    	 case 2:
    		 pd.getproductbyid(key);
    		 break;
    	 case 3:
    		 pd.getallproduct(key);
    		 break;
    	 case 4:
    		 
    		 pd.updateproduct(key);
    		 break;
    	 case 5:
    		 pd.deleteproduct(key);
    		 break;
    	 case 6:
    		 pd.exit(key);
    		 break;
    	 } 
    	}   
       
    }
}
