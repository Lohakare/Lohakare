package com.AdminSanskar.SanskarAdmin.adminService;

import java.util.List;

import com.AdminSanskar.SanskarAdmin.adminModel.AdminModel;

public interface AdminService {

	//create
	 AdminModel saveAdmin(AdminModel user);
	 
	 //get all user
	 List<AdminModel> getAllAdmins();
	 
	 //get single user by using id
	 AdminModel getAdmins(String adminUserName);

	AdminModel AdminLogin(String adminUserName, String adminPassword);

	AdminModel AdminName(String adminUserName);

	void updateAdminLoginFlag(String adminId, String adminLoginFlag, String serverIp);

	

	
}
