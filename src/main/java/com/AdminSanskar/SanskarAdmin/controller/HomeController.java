package com.AdminSanskar.SanskarAdmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {

	public String Index() {
		return "index";
	}
	
	@GetMapping("adminLogin")
    public ModelAndView adminLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/admin/adminLogin");
        return modelAndView;
    }
	
	@GetMapping("adminDashboard")
    public ModelAndView adminDashboard() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/admin/adminDashboard");
        return modelAndView;
    }
	@GetMapping("adminIndex")
    public ModelAndView adminIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/akademi.dexignlab.com/xhtml/index");
        return modelAndView;
    }
	
	@GetMapping("finance")
    public ModelAndView finance() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/akademi.dexignlab.com/xhtml/finance");
        return modelAndView;
    }
	@GetMapping("student")
	public ModelAndView student() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/student");
		return modelAndView;
	}
	
	@GetMapping("studentdetail")
	public ModelAndView studentDetial() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/student-detail");
		return modelAndView;
	}
	
	@GetMapping("addNewStudent")
	public ModelAndView addNewStudent() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/add-student");
		return modelAndView;
	}
	
	@GetMapping("teacher")
	public ModelAndView teacher() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/teacher");
		return modelAndView;
	}
	
	@GetMapping("teacherDetails")
	public ModelAndView teacherDetails() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/teacher-detail");
		return modelAndView;
	}
	
	@GetMapping("addTeacher")
	public ModelAndView addTeacher() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/add-teacher");
		return modelAndView;
	}
	
	@GetMapping("foodMenu")
	public ModelAndView foodMenu() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/food");
		return modelAndView;
	}
	
	@GetMapping("foodDetial")
	public ModelAndView foodDetial() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/food-details");
		return modelAndView;
	}
	
	
	@GetMapping("fileManager")
	public ModelAndView fileManager() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/file-manager");
		return modelAndView;
	}
	
	@GetMapping("user")
	public ModelAndView user() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/user");
		return modelAndView;
	}
	
	@GetMapping("celandar")
	public ModelAndView celandar() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/celandar");
		return modelAndView;
	}
	
	
	@GetMapping("chat")
	public ModelAndView chat() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/chat");
		return modelAndView;
	}
	
	@GetMapping("activity")
	public ModelAndView activity() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/activity");
		return modelAndView;
	}
	
	@GetMapping("appProfile")
	public ModelAndView appProfile() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/app-profile");
		return modelAndView;
	}
	
	@GetMapping("editProfile")
	public ModelAndView editProfile() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/edit-profile");
		return modelAndView;
	}
	
	@GetMapping("postDetails")
	public ModelAndView postDetails() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/post-details");
		return modelAndView;
	}
	
	@GetMapping("emailCompose")
	public ModelAndView emailCompose() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/email-compose");
		return modelAndView;
	}
	
	@GetMapping("emailInbox")
	public ModelAndView emailInbox() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/email-inbox");
		return modelAndView;
	}
	
	@GetMapping("emailRead")
	public ModelAndView emailRead() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/email-read");
		return modelAndView;
	}
	
	@GetMapping("appCalender")
	public ModelAndView appCalender() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/app-calender");
		return modelAndView;
	}
	
	@GetMapping("ecomProductGrid")
	public ModelAndView ecomProductGrid() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ecom-product-grid");
		return modelAndView;
	}

	@GetMapping("ecomProductList")
	public ModelAndView ecomProductList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ecom-product-list");
		return modelAndView;
	}
	
	@GetMapping("ecomProductDetail")
	public ModelAndView ecomProductDetail() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ecom-product-detail");
		return modelAndView;
	}
	
	@GetMapping("ecomProductOrder")
	public ModelAndView ecomProductOrder() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ecom-product-order");
		return modelAndView;
	}
	
	@GetMapping("ecomCheckout")
	public ModelAndView ecomCheckout() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ecom-checkout");
		return modelAndView;
	}
	
	@GetMapping("ecomInvoice")
	public ModelAndView ecomInvoice() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ecom-invoice");
		return modelAndView;
	}
	
	@GetMapping("ecomCustomers")
	public ModelAndView ecomCustomers() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ecom-customers");
		return modelAndView;
	}
	
	@GetMapping("chartFlot")
	public ModelAndView chartFlot() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/chart-flot");
		return modelAndView;
	}
	
	@GetMapping("chartMorris")
	public ModelAndView chartMorris() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/chart-morris");
		return modelAndView;
	}
	
	@GetMapping("chartChartjs")
	public ModelAndView chartChartjs() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/chart-chartjs");
		return modelAndView;
	}
	
	@GetMapping("chartChartist")
	public ModelAndView chartChartist() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/chart-chartist");
		return modelAndView;
	}
	
	@GetMapping("chartSparkline")
	public ModelAndView chartSparkline() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/chart-sparkline");
		return modelAndView;
	}
	
	@GetMapping("chartPeity")
	public ModelAndView chartPeity() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/chart-peity");
		return modelAndView;
	}
	
	@GetMapping("uiAccordion")
	public ModelAndView uiAccordion() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ui-accordion");
		return modelAndView;
	}
	
	@GetMapping("uiAlert")
	public ModelAndView uiAlert() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ui-alert");
		return modelAndView;
	}
	
	@GetMapping("uiBadge")
	public ModelAndView uiBadge() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ui-badge");
		return modelAndView;
	}
	
	@GetMapping("uiButton")
	public ModelAndView uiButton() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ui-button");
		return modelAndView;
	}
	
	@GetMapping("uiModal")
	public ModelAndView uiModal() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ui-modal");
		return modelAndView;
	}
	
	@GetMapping("uiButtonGroup")
	public ModelAndView uiButtonGroup() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/ui-button-group");
		return modelAndView;
	}
	
	/********************* Error messege Start *************************/
	@GetMapping("badRequest")
	public ModelAndView pageError400() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/error/page-error-400");
		return modelAndView;
	}
	
	@GetMapping("forbiddenError")
	public ModelAndView forbiddenError() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/error/page-error-403");
		return modelAndView;
	}
	
	@GetMapping("pageYouWereLooking")
	public ModelAndView pageYouWereLooking() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/error/page-error-404");
		return modelAndView;
	}
	
	@GetMapping("InternalServerError")
	public ModelAndView InternalServerError() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/error/page-error-500");
		return modelAndView;
	}
	
	@GetMapping("ServiceUnavailable")
	public ModelAndView ServiceUnavailable() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/error/page-error-503");
		return modelAndView;
	}
	
	@GetMapping("pagelockscreen")
	public ModelAndView pageLockScreen() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/akademi.dexignlab.com/xhtml/error/page-lock-screen");
		return modelAndView;
	}
	
	/********************* Error messege End *************************/
}
