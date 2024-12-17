package com.AdminSanskar.SanskarAdmin.adminServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminSanskar.SanskarAdmin.adminModel.AdminModel;
import com.AdminSanskar.SanskarAdmin.adminRepositry.AdminRepositry;
import com.AdminSanskar.SanskarAdmin.adminService.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepositry adminRepositry;

	@Override
	public AdminModel saveAdmin(AdminModel user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setAdminId(randomUserId);
		return adminRepositry.save(user);
	}

	@Override
	public List<AdminModel> getAllAdmins() {
		return adminRepositry.findAll();
	}

	@Override
	public AdminModel getAdmins(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminModel AdminLogin(String adminUserName, String adminPassword) {
	    // Use the repository to find an admin by username and password
	    return adminRepositry.findByAdminUserNameAndAdminPassword(adminUserName, adminPassword);
	}

	@Override
	public AdminModel AdminName(String adminUserName) {
		// TODO Auto-generated method stub
		return adminRepositry.findByAdminUserName(adminUserName);
	}

	 @Override
	    public void updateAdminLoginFlag(String adminId, String adminLoginFlag, String serverIp) {
	        // Implement the logic to update the adminLoginFlag in your database or storage
	        // This is a simplified example, adapt it to your data access mechanism.

	        AdminModel admin = adminRepositry.findById(adminId).orElse(null);

	        if (admin != null) {
	            admin.setAdminLoginFlag(adminLoginFlag);
	            admin.setAdminLoginServerId(serverIp);
	            adminRepositry.save(admin);
	        }
	    }




	
	


	
	
}
