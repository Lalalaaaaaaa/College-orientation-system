package cn.edu.scau.yx.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.scau.yx.entity.Department;

/**
 *@author 赵文俊 
 *@email 1142265923@qq.com
 *@decription TODO
 *@date 2016年8月17日下午2:44:23
 *@version v1.0
 */
public interface DepartmentMapper {
	
	int departmentCount();
	
	ArrayList<Department> findByName(@Param("dpname")String dpname);
	
	Department findById(int dpid);
	
	int deleteDepartment(int dpid);
	
	int insertDepartment(Department department);
	
	int updateDepartment(Department department);
	
	ArrayList<String> findAllDepartmentName();
	
	ArrayList<Department> findAllDepartment();
	
}
