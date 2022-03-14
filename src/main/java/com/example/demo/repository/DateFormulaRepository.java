package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Formula;

@Mapper
public interface DateFormulaRepository {

	public List<Formula> selectAll();

	public void insert(Formula dateName);

	public void update(Formula dateName);

	public void delete(Formula dateName);

}
