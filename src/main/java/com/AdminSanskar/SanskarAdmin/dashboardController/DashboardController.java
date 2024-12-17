package com.AdminSanskar.SanskarAdmin.dashboardController;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;



@RestController
@RequestMapping("dashboard")
public class DashboardController {

	@GetMapping("/sessionDashboard")
	public ResponseEntity<Map<String, Object>> getSession(HttpSession session) {
	    // Retrieve session attributes
	    String adminName = (String) session.getAttribute("AdminName");
	    String adminId = (String) session.getAttribute("AdminId");
	    Integer  AdminUserId = (Integer ) session.getAttribute("AdminUserId");
	    String AdminProfielPicture = (String) session.getAttribute("AdminProfielPicture");

	    // Do something with the retrieved attributes
	    System.out.println("AdminName: " + adminName);
	    System.out.println("AdminId: " + adminId);
	    Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("status", "success");
        responseMap.put("adminName",adminName);
        responseMap.put("adminId", adminId);
        responseMap.put("AdminUserId", AdminUserId);
        responseMap.put("AdminProfielPicture", AdminProfielPicture);
       return ResponseEntity.ok(responseMap);
	}
}
