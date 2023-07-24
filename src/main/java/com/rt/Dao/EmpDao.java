package com.rt.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rt.Entity.EmpEntity;

@Repository
public class EmpDao {
	@Autowired
	JdbcTemplate template;

	public boolean Register(EmpEntity emp) {
		try {
			Object[] args = { emp.getUname(), emp.getEmail(), emp.getPwd(), emp.getConfpwd(), emp.getAdr(),
					emp.getPhone(), emp.getCity(), emp.getState(), emp.getZip() };
			int data = template.update(
					"insert into regemployee(`Uname`,`EmailId`,`Password`,`ConfirmPassword`,`Address`,`Phone`,`City`,`State`,`Zip`) values(?,?,?,?,?,?,?,?,?)",
					args);
			System.out.println(data);

			if (data == 1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean Update(EmpEntity emp) {

		try {

			Object[] args = { emp.getUname(), emp.getEmail(), emp.getPwd(), emp.getConfpwd(), emp.getAdr(),
					emp.getPhone(), emp.getCity(), emp.getState(), emp.getZip(), emp.getId() };
			int data = template.update(
					"update regemployee set Uname = ?, EmailId = ?, Password = ?, ConfirmPassword = ?, Address = ?, Phone = ?, City=?, State=?,Zip=?  where id = ?",
					args);

			if (data == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;

	}

	public boolean Delete(int id) {
		try {

			Object[] args = { id };
			int data = template.update("delete from regemployee where id = ?", args);

			if (data == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;

	}

	public EmpEntity GetEmp(int id) {
		EmpEntity e = null;
		try {

			Object[] args = { id };
			e = template.queryForObject("select * from regemployee where id = ?", args, new RowMapper<EmpEntity>() {

				public EmpEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new EmpEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getLong(7), rs.getString(8), rs.getString(9),
							rs.getLong(10));
				}
			});

		} catch (Exception e2) {
			e2.printStackTrace();

		}
		return e;
	}

	public List<EmpEntity> GetEmp() {

		List<EmpEntity> list = null;
		try {

			list = template.query("select * from regemployee", new RowMapper<EmpEntity>() {

				public EmpEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new EmpEntity(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getLong(7), rs.getString(8), rs.getString(9),
							rs.getLong(10));
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
