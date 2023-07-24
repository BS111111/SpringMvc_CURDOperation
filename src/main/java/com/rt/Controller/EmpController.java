package com.rt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rt.Entity.EmpEntity;
import com.rt.Service.EmpService;

@Controller
public class EmpController {
	@Autowired
	EmpService empService;

	@RequestMapping("/")
	public String Home() {
		System.out.println("WELCOME TO HOME..!");
		return "Home";
	}

	@RequestMapping("/registerForm")
	public String Register() {
		System.out.println("Registration");
		return "Register";
	}

	@RequestMapping("/register")
	public String Register(@ModelAttribute EmpEntity e, Model m) {
		boolean isAdded = empService.Register(e);
		if (isAdded) {
			m.addAttribute("successMsg", "Employee Added Successfully...");
		} else {
			m.addAttribute("errMsg", "Unable to Add...");
		}

		return "Register";
	}

	@RequestMapping("/updateForm")
	public String updateForm() {
		return "Update";
	}

	@RequestMapping("/update")
	public String updateData(@ModelAttribute EmpEntity e, Model m) {

		boolean isUpdated = empService.Update(e);

		if (isUpdated) {
			m.addAttribute("successMsg", "Employee Updated Successfully...");
		} else {
			m.addAttribute("errMsg", "Unable to Update...");
		}

		return "Update";
	}

	@RequestMapping("/deleteForm")
	public String deleteForm() {
		return "Delete";
	}

	@RequestMapping("/delete")
	public String Delete(@RequestParam int id, Model m) {

		boolean isDeleted = empService.Delete(id);

		if (isDeleted) {
			m.addAttribute("successMsg", "Employee Deleted Successfully...");
		} else {
			m.addAttribute("errMsg", "Unable to Delete...");
		}

		return "Delete";

	}

	@RequestMapping("/getEmployee")
	public String GetEmployee() {
		return "GetEmployee";
	}

	@RequestMapping("/getEmp")
	public String GetEmp(@RequestParam int id, Model m) {

		EmpEntity e = empService.GetEmp(id);

		m.addAttribute("empData", e);

		return "display";
	}

	@RequestMapping("/allEmployees")
	public String AllEmployees(Model m) {

		List<EmpEntity> list = empService.AllEmployees();

		m.addAttribute("empList", list);

		return "displayAll";
	}

}
