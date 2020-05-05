package com.yuhaisheng.github.mapper;


import com.yuhaisheng.github.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentMapper {
    StudentEntity getNameById(@Param("id") String id);
}
