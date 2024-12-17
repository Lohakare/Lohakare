package com.AdminSanskar.SanskarAdmin.menuMasterServiceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdminSanskar.SanskarAdmin.menuMasterModel.MenuMasterModel;
import com.AdminSanskar.SanskarAdmin.menuMasterRepositry.MenuMasterRepositry;
import com.AdminSanskar.SanskarAdmin.menuMasterService.MenuMasterService;

@Service
public class MenuMasterServiceImpl implements MenuMasterService {

	@Autowired
	private MenuMasterRepositry menuRepo;
	
	@Override
	public MenuMasterModel saveMenuService(MenuMasterModel menu) {
		String randomUserId = UUID.randomUUID().toString();
		menu.setMenu_master_id(randomUserId);
		return menuRepo.save(menu);
	}

	
}
