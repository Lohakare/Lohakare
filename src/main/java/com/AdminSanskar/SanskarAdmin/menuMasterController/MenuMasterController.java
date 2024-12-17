package com.AdminSanskar.SanskarAdmin.menuMasterController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AdminSanskar.SanskarAdmin.adminModel.AdminModel;
import com.AdminSanskar.SanskarAdmin.menuMasterModel.MenuMasterModel;
import com.AdminSanskar.SanskarAdmin.menuMasterService.MenuMasterService;

@RestController
@RequestMapping("/menuMaster")
public class MenuMasterController {
	
	@Autowired
	private MenuMasterService menuService;
	
	@PostMapping
    public ResponseEntity<?> createAdmin(@RequestBody MenuMasterModel menu) {
        try {
            
            MenuMasterModel savedAdmin = menuService.saveMenuService(menu);
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
	
}
