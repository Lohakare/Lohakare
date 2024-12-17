package com.AdminSanskar.SanskarAdmin.adminController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.AdminSanskar.SanskarAdmin.adminModel.AdminModel;
import com.AdminSanskar.SanskarAdmin.adminService.AdminService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@RestController
@RequestMapping("/admin")
public class AdminController {

	    @Autowired
	    private AdminService adminService;
	    
	    @Value("${server.static-ip}")
	    private String staticIp;

	    @PostMapping
	    public ResponseEntity<?> createAdmin(@RequestBody AdminModel admin) {
	        try {
	            // Retrieve all existing admin records
	            List<AdminModel> existingAdmins = adminService.getAllAdmins();

	            // Check if the provided admin's username already exists in the list of existing admins
	            for (AdminModel existingAdmin : existingAdmins) {
	                if (admin.getAdminUserName().equals(existingAdmin.getAdminUserName())) {
	                    // If the admin username already exists, return an error response
	                    Map<String, Object> responseMap = new HashMap<>();
	                    responseMap.put("status", "error");
	                    responseMap.put("message", admin.getAdminName() + " User is already registered");
	                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseMap);
	                }
	            }

	            // If the admin username does not exist, save the new admin record
	            AdminModel savedAdmin = adminService.saveAdmin(admin);
	            return ResponseEntity.status(HttpStatus.CREATED).body(savedAdmin);

	        } catch (DataIntegrityViolationException ex) {
	            // Handle data integrity violation and return an appropriate error response
	            Map<String, Object> responseMap = new HashMap<>();
	            responseMap.put("status", "error");
	            responseMap.put("message", "Data integrity violation: " + ex.getMessage());
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseMap);
	            
	        } catch (Exception ex) {
	            // Handle other exceptions and return an internal server error response
	            Map<String, Object> responseMap = new HashMap<>();
	            responseMap.put("status", "error");
	            responseMap.put("message", "An error occurred: " + ex.getMessage());
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseMap);
	        }
	    }


	    
	    @GetMapping("/adminList")
	    public ResponseEntity<List<AdminModel>> getAllUser() {
	        try {
	            List<AdminModel> allUsers = adminService.getAllAdmins();
	            return ResponseEntity.ok(allUsers);
	        } catch (Exception e) {
	            // Handle exceptions, log, and return an appropriate error response
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }
	    }
	    
	    //Checking User and Password Match or not
	    @PostMapping("/adminLogin")
	    public ResponseEntity<Map<String, Object>> adminLogin(@RequestBody AdminModel model, HttpServletResponse response, HttpServletRequest request) {
	       
	    	try {
	            List<AdminModel> loggedInAdmins = adminService.getAllAdmins();

	            for (AdminModel admin : loggedInAdmins) {
	                if ("Y".equals(admin.getAdminLoginFlag())) {
	                    // Admin is already logged in, return an error response
	                	System.out.println(admin.getAdminName());
	                    Map<String, Object> responseMap = new HashMap<>();
	                    responseMap.put("status", "error");
	                    responseMap.put("address", admin.getAdminLoginServerId());
	                    responseMap.put("adminId", admin.getAdminId());
	                    responseMap.put("msg", "Do you want to log out this user to continue logging in?");
	                    responseMap.put("message", admin.getAdminName()+" User is already logged in");
	                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseMap);
	                }
	            }

	            // If no user is already logged in, proceed with the login attempt
	            AdminModel admin = adminService.AdminLogin(model.getAdminUserName(), model.getAdminPassword());
	           
	            if (admin != null) {
	                // Update the adminLoginFlag to 'Y'
	                adminService.updateAdminLoginFlag(admin.getAdminId(), "Y", staticIp);
	                HttpSession session = request.getSession();
	                session.setAttribute("AdminName", admin.getAdminName());
	                session.setAttribute("AdminId", admin.getAdminId());
	                session.setAttribute("AdminProfielPicture", admin.getAdminProfielPicture());
	                session.setAttribute("AdminUserId", admin.getAdminUserId());
	               
                    Map<String, Object> responseMap = new HashMap<>();
	                responseMap.put("status", "success");
	                responseMap.put("msg", "Login Successfully !!!"+admin.getAdminName());
	                responseMap.put("admin", admin);
	                responseMap.put("pagepath", "adminDashboard");
	               
	                return ResponseEntity.ok(responseMap);
	            } else {
	                // Authentication failed
	                Map<String, Object> responseMap = new HashMap<>();
	                responseMap.put("status", "error");
	                responseMap.put("message", "Invalid username or password");
	                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseMap);
	            }
	        } catch (Exception e) {
	            // Handle exceptions, log, and return an appropriate error response
	            e.printStackTrace(); // Log the exception for debugging purposes
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }
	    }
	    
	    //Logout and chang the flag
	    @PostMapping("/adminLogout")
	    public ResponseEntity<Map<String, Object>> adminLogout(@RequestBody AdminModel model, HttpServletResponse response, HttpServletRequest request) {
	        try {
                   if (model != null) {
	                // Update the adminLoginFlag to 'Y'
	                adminService.updateAdminLoginFlag(model.getAdminId(), "N", staticIp);
	                HttpSession session = request.getSession();
	                session.setAttribute("AdminName","");
	                session.setAttribute("AdminId", "");
	                session.setAttribute("AdminProfielPicture", "");
	                session.setAttribute("AdminUserId", "");
	                Map<String, Object> responseMap = new HashMap<>();
	                responseMap.put("status", "success");
	                responseMap.put("msg", "Logout Successfully !!!");
	                responseMap.put("admin", model);
	                responseMap.put("pagepath", "adminLogin");
	                return ResponseEntity.ok(responseMap);
	            } else {
	                // Authentication failed
	                Map<String, Object> responseMap = new HashMap<>();
	                responseMap.put("status", "error");
	                responseMap.put("message", "Error Found");
	                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseMap);
	            }
	        } catch (Exception e) {
	            // Handle exceptions, log, and return an appropriate error response
	            e.printStackTrace(); // Log the exception for debugging purposes
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }
	    }


	    
	    @PostMapping("/adminUserName")
	    public ResponseEntity<Map<String, Object>> getUserName(@RequestBody AdminModel model) {
	        try {
	            AdminModel admin = adminService.AdminName(model.getAdminUserName());

	            if (admin != null) {
	                // Authentication successful
	                Map<String, Object> responseMap = new HashMap<>();
	                responseMap.put("status", "success");
	                responseMap.put("admin", admin);
	                return ResponseEntity.ok(responseMap);
	            } else {
	                // Authentication failed
	                Map<String, Object> responseMap = new HashMap<>();
	                responseMap.put("status", "error");
	                responseMap.put("message", "Invalid User Name");
	                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseMap);
	            }
	        } catch (Exception e) {
	            // Handle exceptions, log, and return an appropriate error response
	            e.printStackTrace(); 
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	        }
	    }

	    
	   

	   
}
	

