package com.app.javafx.model.services;

import com.app.javafx.db.DB;
import com.app.javafx.model.dao.DaoFactory;
import com.app.javafx.model.dao.SellerDao;
import com.app.javafx.model.dao.impl.SellerDaoJDBC;
import com.app.javafx.model.entities.Seller;

import java.util.List;

public class SellerService {

    private SellerDao dao = DaoFactory.createSellerDao(new SellerDaoJDBC(DB.getConnection()));

    public List<Seller> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Seller obj){
        if(obj.getId() == null){
            dao.insert(obj);
        }else{
            dao.update(obj);
        }
    }

    public void remove(Seller obj) {
        dao.deleteById(obj.getId());
    }

}
