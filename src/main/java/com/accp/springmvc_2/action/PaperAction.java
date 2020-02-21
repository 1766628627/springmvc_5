package com.accp.springmvc_2.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.accp.springmvc_2.biz.PaperBiz;
import com.accp.springmvc_2.biz.UserBiz;
import com.accp.springmvc_2.pojo.Paper;


@Controller
@RequestMapping("/p") // 命名空间
public class PaperAction {
	@Resource
	private PaperBiz biz;
	
	
	@PostMapping("/add")
	public String add(Paper paper ,MultipartFile imgFile,Model model) {
		String fileName=null;
				
		try {
			fileName = UUID.randomUUID().toString().replace("-", "")
			+ imgFile.getOriginalFilename().
			substring(imgFile.getOriginalFilename().lastIndexOf("."));
			imgFile.transferTo(new File("F:\\myfile\\images\\" + fileName));
		} catch (Exception e) {
			e.printStackTrace();
		} 	
		System.out.println(fileName);
		Date date = new Date();
		paper.setFilename(fileName);
		paper.setCreationdate(date);
		model.addAttribute("paper", biz.queryAll());
		biz.add(paper);
		return "shouye";
	}
	@GetMapping("/remove")
	public String remove(int id,Model model) {
		
		Paper paper=biz.querybyid(id);
		System.out.println(paper.getFilename());
		
		  File file2=new File("F:\\myfile\\images\\"+paper.getFilename());
		  file2.delete();
		
		biz.remove(id);
		model.addAttribute("paper", biz.queryAll());
		return "shouye";
	}
	@PostMapping("/query")
	public String query(String name,String type,Model model) {
		if(name.equals("")) {
			name=null;
		}
		if(type.equals("")) {
			type=null;	
		}
		model.addAttribute("paper", biz.queryby(name, type));
		return "shouye";
	}
	@GetMapping("/queryid")
	public String queryid(int id,Model model) {
		
		
		
		model.addAttribute("paper",biz.querybyid(id));
		return "update";
	}
	@PostMapping("/modify")
	public String modify(Paper paper ,MultipartFile imgFile,Model model) {
		String fileName=null;	
		try {
			fileName = UUID.randomUUID().toString().replace("-", "")
			+ imgFile.getOriginalFilename().
			substring(imgFile.getOriginalFilename().lastIndexOf("."));
			System.out.println(fileName+"2222");
			imgFile.transferTo(new File("F:\\myfile\\images\\" + fileName));
			
		} catch (Exception e) {
			e.printStackTrace();
		} 	
		
		Date date = new Date();
		paper.setFilename(fileName);
		paper.setModifydate(date);
		model.addAttribute("paper", biz.queryAll());
		biz.modify(paper);
		return "shouye";
	}
	
	
	
	
	
}
