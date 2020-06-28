package com.xr.service.impl;

import com.xr.mapper.SysDeptMapper;
import com.xr.model.SysDept;
import com.xr.model.SysDeptExample;
import com.xr.service.SysDeptService;
import com.xr.util.SysDeptGroupUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zephyr.Liu
 * @date 2020/6/14 12:48
 * @Description
 */
@Service
public class SysDeptServiceImpl implements SysDeptService {


    private SysDeptMapper sysDeptMapper;

    @Autowired
    public SysDeptServiceImpl(SysDeptMapper sysDeptMapper) {
        this.sysDeptMapper = sysDeptMapper;
    }

    @Override
    public List<SysDept> getGroupDept() {
        // 查询出所有的部门信息
        SysDeptExample example = new SysDeptExample();
        SysDeptExample.Criteria criteria = example.createCriteria();
        // 查询所有状态为0的
        criteria.andStatusEqualTo(new Byte("0"));
        List<SysDept> list = sysDeptMapper.selectByExample(example);
        // 使用部门分组工具类来对所有部门进行分组
        if (list != null && list.size() > 0) {
            SysDeptGroupUtil util = new SysDeptGroupUtil();
            list = util.getFirstDept(list);
            return list;
        }
        return null;
    }

    @Override
    public void updateDept(SysDept sysDept) {
        sysDeptMapper.updateByPrimaryKeySelective(sysDept);
    }

    @Override
    public void addSysDept(SysDept sysDept) {
        sysDeptMapper.insertSelective(sysDept);
    }

    @Override
    public void deleteSysDeptById(Integer id) {
        sysDeptMapper.updateStatusById((byte) 1,id);
    }

    @Override
    public List<SysDept> selectSysDept(SysDept sysDept) {
        SysDeptExample sysDeptExample=new SysDeptExample();
        SysDeptExample.Criteria criteria=sysDeptExample.createCriteria();
        criteria.andStatusEqualTo((byte) 0);
        criteria.andParentDeptIdNotEqualTo((long) 0);
        if(sysDept!= null){
            if (sysDept.getDeptName() !=null){
                criteria.andDeptNameLike("%"+sysDept.getDeptName()+"%");
            }
            if (sysDept.getDutyPrincipal() !=null){
                criteria.andDutyPrincipalLike("%"+sysDept.getDutyPrincipal()+"%");
            }
            if (sysDept.getStatus() !=null){
                criteria.andStatusEqualTo(sysDept.getStatus());
            }
        }

        return sysDeptMapper.selectByExample(sysDeptExample);
    }




}
