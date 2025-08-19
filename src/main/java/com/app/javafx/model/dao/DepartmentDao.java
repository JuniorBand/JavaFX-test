package com.app.javafx.model.dao;



import com.app.javafx.model.entities.Department;
import com.app.javafx.model.entities.Seller;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
    List<Seller> findSellers(Department department);
}
