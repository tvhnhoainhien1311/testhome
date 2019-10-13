package vn.com.nhien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.com.nhien.config.NhanVien;

@Controller
public class NhanVienController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNV(Model model) {
		model.addAttribute("nhanvien", new NhanVien());
		return "addNhanVien";
	}

	@RequestMapping(value = "/addNhanVien", method = RequestMethod.POST)
	public String doAddEmployee(@ModelAttribute("nhanvien") NhanVien nhanvien, ModelMap modelMap) {
		nhanvien.SetName(nhanvien.GetName().toUpperCase());
		modelMap.addAttribute("nhanvien", nhanvien);
		return "view-employee";
	}
}
