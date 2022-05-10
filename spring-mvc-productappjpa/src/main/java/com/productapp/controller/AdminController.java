package com.productapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminController {
@RequestMapping("/admin")
public String admin() {
	return "admin";
	
	
	}
@RequestMapping("/addForm")
public String ShowAddForm() {
	return "addProductForm";
}
@RequestMapping("/deleteForm")
public String ShowDeleteForm() {
	return "deleteProductForm";
}
@RequestMapping("/updateForm")
public String showeditForm() {
    return "getOneProduct";
}


}
