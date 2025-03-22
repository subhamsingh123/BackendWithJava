package com.example.dao;

import com.example.entity.Users;

import static com.example.dao.HibernateConfig.getCurrentSession;

public class UserDaoHibernate implements UserDao{




    @Override
    public String createUser(Users user) throws Exception {
        try {
            String userId = (String) getCurrentSession().save(user);
            getCurrentSession().flush();
            return userId;
        } catch (Exception e) {
            System.out.println("Error occured while adding Alert:" + e.getMessage() + e);
            throw new Exception("ADD_EXCEPTION", e);
        }
    }



}
