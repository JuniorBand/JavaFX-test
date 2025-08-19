package com.app.javafx.model.services;

import com.app.javafx.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll() {
        List<Department> mock = new ArrayList<>();

        mock.add(new Department(1, "Books"));
        mock.add(new Department(2, "Computers"));
        mock.add(new Department(3, "Eletronics"));

        return mock;
    }


}
