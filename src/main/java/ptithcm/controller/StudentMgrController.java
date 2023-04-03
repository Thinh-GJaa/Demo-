package ptithcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Bai 1,2,3

@Controller
@RequestMapping("/student-mgr")
	public class StudentMgrController {
		@RequestMapping("")
		public String index(ModelMap model) {
			model.addAttribute("message","Ban goi index()");
			return "student-mgr";
		}
//		@RequestMapping(params = "btnInsert")
//		public String insert(ModelMap model) {
//			model.addAttribute("message","Ban goi insert()");
//			return "student-mgr";
//		}
		
	// btnInsert của bài 4
		@RequestMapping(params = "btnInsert")
		public String insert(ModelMap model,
			@RequestParam("name")String name,
			@RequestParam("mark")Double mark,
			@RequestParam("major")String major) {
			model.addAttribute("name", name);
			model.addAttribute("mark", mark );
			model.addAttribute("major", major );
			return "success_b4";
		}
	// btnUpdate của bài 5
		@RequestMapping(params = "btnUpdate")
		public String update(ModelMap model,Student Student) {
//			model.addAttribute("Student", Student);
			return "success2";
		}
//		@RequestMapping(params = "btnUpdate")
//		public String update(ModelMap model) {
//			model.addAttribute("message","Ban goi update()");
//			return "student-mgr";
//		}
		@RequestMapping(params = "btnDelete")
		public String delete(ModelMap model) {
			model.addAttribute("message","Ban goi delete()");
			return "student-mgr";
		}
		@RequestMapping(params = "InkEdit")
		public String edit(ModelMap model) {
			model.addAttribute("message","Ban goi edit()");
			return "student-mgr";
		}
	}
	

	
		



