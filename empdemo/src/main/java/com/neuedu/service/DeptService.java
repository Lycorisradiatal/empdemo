package com.neuedu.service;

import com.neuedu.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptService {

    /**
     * 查询所有dept
     * @return
     */
    List<Dept> listDept();

    /**
     * 根据id查询dept
     * @param id
     * @return
     */
    Dept getDeptById(int id);

    /**
     * 根据id的数组来删除多个dept
     * @param ids
     * @return 影响行数
     */
    int deleteDeptByIds(int[] ids);

    /**
     * 添加dept
     * @param dept
     * @return
     */
    int saveDept(@Param("dept") Dept dept);

    /**
     * 修改dept
     * @param dept
     * @return
     */
    int updateDept(@Param("dept") Dept dept);
}
