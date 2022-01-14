package service;

import java.sql.SQLException;

import bean.Customer;
import persistance.CustomerDao;
import persistance.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService
{
CustomerDao customerDao=new CustomerDaoImpl();
	public boolean signingUp(Customer customer) throws ClassNotFoundException,SQLException
	{
			int  rows=customerDao.signUp(customer);
			if(rows>0) return true;
		return false;
	}

	public boolean logingIn(String name, String Password)throws ClassNotFoundException,SQLException
	{  
		Customer customer=customerDao.logIn(name, Password);
		
	if(customer!=null)
		return true;
	return false;
	}

	

}
