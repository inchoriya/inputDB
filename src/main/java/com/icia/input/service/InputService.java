package com.icia.input.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.input.dao.InputDAO;
import com.icia.input.dto.InputDTO;

@Service
public class InputService {
	
	// 서비스 : 비즈니스 로직 처리
	// [Ctrl] + [Shift] + [O] : 자동 import
	
	@Autowired
	private InputDAO dao; 
	
	

	public void insert(InputDTO dto) {
		System.out.println("[2] controller → service : " + dto);
		dao.insert(dto);
	}

}
