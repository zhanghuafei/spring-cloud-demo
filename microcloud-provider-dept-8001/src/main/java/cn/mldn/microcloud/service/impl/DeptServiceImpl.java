package cn.mldn.microcloud.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.microcloud.dao.IDeptDAO;
import cn.mldn.microcloud.service.IDeptService;
import cn.mldn.vo.Dept;

@Service
class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;

	public Dept get(long id) {
		return this.deptDAO.findById(id);
	}

	public boolean add(Dept dept) {
		return deptDAO.doCreate(dept);
	}

	public List<Dept> list() {
		return deptDAO.findAll();
	}

}
