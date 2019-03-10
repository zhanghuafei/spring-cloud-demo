package cn.mldn.microcloud.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.microcloud.service.IDeptService;
import cn.mldn.vo.Dept;

@RestController
public class DeptRest {
	
	@Resource
	private IDeptService deptService;
	
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Object get(@PathVariable("id") long id) {
		return deptService.get(id);
	}
	
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public Object get() {
		Dept dept = new Dept();
		dept.setDeptno(1L);
		dept.setLoc("hahaha");
		return dept;
	}

}
