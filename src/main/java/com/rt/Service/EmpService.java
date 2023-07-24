package com.rt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.Dao.EmpDao;
import com.rt.Entity.EmpEntity;

@Service
public class EmpService {
	@Autowired
	EmpDao empDao;

	public boolean Register(EmpEntity e) {

		return empDao.Register(e);

	}

	public boolean Update(EmpEntity e) {
		return empDao.Update(e);

	}

	public boolean Delete(int id) {
		return empDao.Delete(id);

	}

	public EmpEntity GetEmp(int id) {
		return empDao.GetEmp(id);

	}

	public List<EmpEntity> AllEmployees() {
		return empDao.GetEmp();

	}

}
