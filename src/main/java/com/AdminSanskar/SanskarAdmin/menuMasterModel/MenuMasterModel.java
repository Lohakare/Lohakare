package com.AdminSanskar.SanskarAdmin.menuMasterModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu_master")
public class MenuMasterModel {

	@Id
	@Column
	private String menu_master_id;
	
	@Column
	private String menu_parent_id;
	
	@Column
	private String menu_name;
	
	@Column
	private String menu_name_ol;
	
	@Column 
	private String menu_child_id;
	
	@Column 
	private String menu_page_name_url;
	
	@Column
	private String menu_level_type;
	
	@Column
	private String menu_menu_type;
	
	@Column
	private String menu_visible_flag;
	
	@Column
	private String menu_password;
	
	@Column
	private String menu_image;
	
	@Column
	private String menu_enter_desc;

	public String getMenu_master_id() {
		return menu_master_id;
	}

	public void setMenu_master_id(String menu_master_id) {
		this.menu_master_id = menu_master_id;
	}

	public String getMenu_parent_id() {
		return menu_parent_id;
	}

	public void setMenu_parent_id(String menu_parent_id) {
		this.menu_parent_id = menu_parent_id;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenu_name_ol() {
		return menu_name_ol;
	}

	public void setMenu_name_ol(String menu_name_ol) {
		this.menu_name_ol = menu_name_ol;
	}

	public String getMenu_child_id() {
		return menu_child_id;
	}

	public void setMenu_child_id(String menu_child_id) {
		this.menu_child_id = menu_child_id;
	}

	public String getMenu_page_name_url() {
		return menu_page_name_url;
	}

	public void setMenu_page_name_url(String menu_page_name_url) {
		this.menu_page_name_url = menu_page_name_url;
	}

	public String getMenu_menu_type() {
		return menu_menu_type;
	}

	public void setMenu_menu_type(String menu_menu_type) {
		this.menu_menu_type = menu_menu_type;
	}

	public String getMenu_visible_flag() {
		return menu_visible_flag;
	}

	public void setMenu_visible_flag(String menu_visible_flag) {
		this.menu_visible_flag = menu_visible_flag;
	}

	public String getMenu_password() {
		return menu_password;
	}

	public void setMenu_password(String menu_password) {
		this.menu_password = menu_password;
	}

	public String getMenu_image() {
		return menu_image;
	}

	public void setMenu_image(String menu_image) {
		this.menu_image = menu_image;
	}

	public String getMenu_enter_desc() {
		return menu_enter_desc;
	}

	public void setMenu_enter_desc(String menu_enter_desc) {
		this.menu_enter_desc = menu_enter_desc;
	}

    public String getMenu_level_type() {
		return menu_level_type;
	}

	public void setMenu_level_type(String menu_level_type) {
		this.menu_level_type = menu_level_type;
	}

	public void setMenuMasterId(String randomUserId) {
		// TODO Auto-generated method stub
		
	}
	
	
}
