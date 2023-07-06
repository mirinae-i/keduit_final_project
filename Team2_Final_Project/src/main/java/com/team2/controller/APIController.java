package com.team2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team2.domain.api.DisasterInfoDTO;
import com.team2.service.api.DisasterInfoAPIService;
import com.team2.service.api.LocationAPIService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/api/*")
@AllArgsConstructor
@Slf4j
public class APIController {

	@Autowired
	DisasterInfoAPIService disasterInfoAPIService;

	@Autowired
	LocationAPIService locationAPIService;

	@ResponseBody
	@RequestMapping(value = "/disaster_info", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
	public DisasterInfoDTO disasterInfo() {
		log.info("** APIController - disaster_info **");
		return disasterInfoAPIService.show();
	}

}
