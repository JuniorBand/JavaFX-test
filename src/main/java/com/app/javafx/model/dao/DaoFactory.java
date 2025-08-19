package com.app.javafx.model.dao;


public class DaoFactory {

    public static SellerDao createSellerDao(SellerDao sellerDao) {
        return sellerDao;
    }

    public static DepartmentDao createDepartmentDao(DepartmentDao departmentDao) {
        return departmentDao;
    }


}
