package com.icia.input.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icia.input.dto.InputDTO;
import com.icia.input.service.InputService;

@Controller
public class InputController {
	
	// service 객체 생성
	@Autowired
	private InputService isvc;

	// 프로젝트 시작페이지
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		return "index";
	}

	// next : 다음(input.jsp)페이지로 이동
	@RequestMapping(value = "/next", method = RequestMethod.GET)
	public String next() {

		return "input";
	}

//  insert : data1, data2 내용 입력
//  <form action="insert" method="get">
//	@RequestMapping(value = "/insert", method = RequestMethod.GET)
//	public String insert(@RequestParam("data1") String data1, @RequestParam("data2") int data2) {
//		System.out.println("data1 : " + data1);
//		System.out.println("data2 : " + data2);
//		
//		InputDTO dto = new InputDTO();
//		dto.setData1(data1);
//		dto.setData2(data2);
//		
//		// sql.isvc(dto);	// sql은 다른 클래스
//				
//		return "index";
//	}

	// insert : data1, data2 내용 입력
	// <form action="insert" method="get">
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(@ModelAttribute InputDTO dto) {
		
		// DTO의 필드값 이름과 ex) (InputDTO클래스) private String data1;
		
		// jsp에서 name로 넘겨주는 속성값 ex) (JSP) <input type="text" name="data1"/> 이 같을 경우
		System.out.println("[1] jsp → controller : " + dto);
		isvc.insert(dto);
		// isvc : InputService 클래스
		// insert(dto) : insert() 메소드를 생성하고 매개변수는 dto를 담아서 전달
		
		
		return "index";
	}

}
