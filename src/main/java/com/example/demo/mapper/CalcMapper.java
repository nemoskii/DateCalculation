package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Formula;

@Mapper
public interface CalcMapper {
	public List<Formula> selectAll();
}
