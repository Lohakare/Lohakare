package com.AdminSanskar.SanskarAdmin.adminModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
  // Added default constructor

@Builder
@Entity
@ToString
@Table(name = "admindetail")
public class AdminModel {

    @Id
    @Column
    private String adminId;

    @Column
    private String adminName;

    @Column
    private String adminUserName;

    @Column
    private String adminPassword;

    @Column
    private int adminUserId;
    
    @Column
    private String adminLoginFlag;
    
    @Column
    private String adminLoginServerId;
    @Lob
    @Column(length = 100000)
    private String adminProfielPicture;


    // Default constructor
    public AdminModel() {
    }

    @Override
    public String toString() {
        return "AdminModel [adminId=" + adminId + ", adminName=" + adminName + ", adminUserName=" + adminUserName
                + ", adminPassword=" + adminPassword + ", adminUserId=" + adminUserId + ", getAdminId()=" + getAdminId()
                + ", getAdminName()=" + getAdminName() + ", getAdminUserName()=" + getAdminUserName()
                + ", getAdminPassword()=" + getAdminPassword() + ", getAdminUserId()=" + getAdminUserId()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public int getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(int adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getAdminLoginFlag() {
		return adminLoginFlag;
	}

	public void setAdminLoginFlag(String adminLoginFlag) {
		this.adminLoginFlag = adminLoginFlag;
	}

	public String getAdminLoginServerId() {
		return adminLoginServerId;
	}

	public void setAdminLoginServerId(String adminLoginServerId) {
		this.adminLoginServerId = adminLoginServerId;
	}

	public String getAdminProfielPicture() {
		return adminProfielPicture;
	}

	public void setAdminProfielPicture(String adminProfielPicture) {
		this.adminProfielPicture = adminProfielPicture;
	}

	
	public AdminModel(String adminId, String adminName, String adminUserName, String adminPassword, int adminUserId,
			String adminLoginFlag, String adminLoginServerId, String adminProfielPicture) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
		this.adminUserId = adminUserId;
		this.adminLoginFlag = adminLoginFlag;
		this.adminLoginServerId = adminLoginServerId;
		this.adminProfielPicture = adminProfielPicture;
	}
	
	
}
