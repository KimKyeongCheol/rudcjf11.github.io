package com.company.kim.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("nBoard")
public class NBoardController {

	@RequestMapping("nList")
	public String nListGet() {
		return "bbs/nBoard/nList";
	}
}
