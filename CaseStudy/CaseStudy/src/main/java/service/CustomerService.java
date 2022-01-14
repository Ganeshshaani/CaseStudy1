package service;

import java.sql.SQLException;

import bean.Customer;

public interface CustomerService 
{
boolean signingUp(Customer customer)throws ClassNotFoundException,SQLException;
boolean logingIn(String name, String Password)throws ClassNotFoundException,SQLException;
}
