package com.app.javafx.model.services;

import com.app.javafx.db.DB;
import com.app.javafx.model.dao.DaoFactory;
import com.app.javafx.model.dao.DepartmentDao;
import com.app.javafx.model.dao.impl.DepartmentDaoJDBC;
import com.app.javafx.model.entities.Department;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao(new DepartmentDaoJDBC(DB.getConnection()));

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj){
        if(obj.getId() == null){
            dao.insert(obj);
        }else{
            dao.update(obj);
        }
    }

    public void remove(Department obj) {
        dao.deleteById(obj.getId());
    }

}
