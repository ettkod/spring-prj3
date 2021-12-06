package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;

public interface ICustomerDAO {
    public void save(Customer t);
    public void delete(Customer t);
    public void update(Customer t);
    public void findByHQL(String h);
}
