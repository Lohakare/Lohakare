package com.AdminSanskar.SanskarAdmin.menuMasterRepositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AdminSanskar.SanskarAdmin.menuMasterModel.MenuMasterModel;

public interface MenuMasterRepositry extends JpaRepository<MenuMasterModel, String>{

	MenuMasterModel save(MenuMasterModel[] menu);

	

}
