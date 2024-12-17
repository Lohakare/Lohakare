package com.AdminSanskar.SanskarAdmin.adminRepositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AdminSanskar.SanskarAdmin.adminModel.AdminModel;

public interface AdminRepositry extends JpaRepository<AdminModel, String> {

	AdminModel findByAdminUserNameAndAdminPassword(String adminUserName, String adminPassword);

	AdminModel findByAdminUserName(String adminUserName);

}
