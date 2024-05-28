package com.icia.input.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.input.dto.InputDTO;

@Repository
public class InputDAO {
	
	// DAO(Data Access Object)
	// 어떤 mapper로 데이터를 전송할 것인지
	
	@Autowired
	private SqlSessionTemplate sql;

	public void insert(InputDTO dto) {
		System.out.println("[3] service → dao : " + dto);
		// sql.insert("namespace.method이름", 가져갈 정보);
		
		sql.insert("Input.insert", dto);
	}

}
