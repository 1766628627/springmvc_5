package com.accp.springmvc_2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springmvc_2.biz.CurriculumBiz;
import com.accp.springmvc_2.pojo.Curriculum;
import com.accp.springmvc_2.pojo.Student;

@RestController
@RequestMapping("/api/currs")
public class CurriculumAction {
	@Resource
	private CurriculumBiz biz;
	
	@GetMapping("curr/{id}")
	public List<Curriculum> querybymid(@PathVariable Integer id) {
		return biz.querybymid(id);
	}
}
