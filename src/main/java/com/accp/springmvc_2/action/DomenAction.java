package com.accp.springmvc_2.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.accp.springmvc_2.biz.DomenBiz;
import com.accp.springmvc_2.pojo.Domen;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/domens")
public class DomenAction {
	@Resource
	private DomenBiz biz;
	
	@GetMapping("domen/{pageNum}")
	public PageInfo<Domen> querybyid(@PathVariable Integer pageNum){
		System.out.println("第一次修改");
		System.out.println("第二次修改");
		System.out.println("第三次修改");
		return  biz.pageInfo(pageNum, 3);
		
	}
	
	@PostMapping("domen")
	public Map<String, Object>add(@RequestBody Domen domen){
		Map<String, Object> message=new HashMap<String, Object>();
		int count=biz.add(domen);
		if(count>0) {
			message.put("code", "200");
			
		}else {
			message.put("code", "300");
		}
		
		return message;
		
	}
	@GetMapping("domenc/{id}")
	public Domen queryby(@PathVariable Integer id){
		
		return  biz.querybyid(id);
		
	}
	@PutMapping("domen")
	public Map<String, Object>modify(@RequestBody Domen domen){
		Map<String, Object> message=new HashMap<String, Object>();
		int count=biz.modify(domen);
		if(count>0) {
			message.put("code", "200");
			
		}else {
			message.put("code", "300");
		}
		
		return message;
		
	}
	@DeleteMapping("domen/{id}")
	public Map<String, Object>remove(@PathVariable Integer id){
		Map<String, Object> message=new HashMap<String, Object>();
		int count=biz.remove(id);
		if(count>0) {
			message.put("code", "200");
			
		}else {
			message.put("code", "300");
		}
		
		return message;
		
	}
}
