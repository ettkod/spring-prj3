package cn.edu.zjut.service;

import cn.edu.zjut.dao.ICustomerDAO;
import cn.edu.zjut.po.Customer;

public class UserService implements IUserService{
    private ICustomerDAO customerDAO = null;

    public void setCustomerDAO(ICustomerDAO customerDAO){
        System.out.println("call setCustomerDAO in UserService.");
        this.customerDAO = customerDAO;
    }

    public void addUser(Customer cust){
        System.out.println("execute --addUser() -- method.");
        customerDAO.save(cust);
    }
    public void delUser(Customer cust){}
    public void updateUser (Customer cust){}
    public void findUser(Customer cust){}

}
