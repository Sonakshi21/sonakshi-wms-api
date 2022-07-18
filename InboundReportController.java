package com.task.controller;

import com.task.api.request.InboundReportRequest;
import com.task.api.response.InboundReportResponse;
import com.task.service.InboundReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/report")
public class InboundReportController {
	
	@Autowired(required = false)
	private InboundReportService inboundReportService;
	
	@PostMapping("/fetch/inbound")
	public InboundReportResponse inboundReportResponse(@RequestBody InboundReportRequest inboundReportRequest) {
		return inboundReportService.inboundReportResponse(inboundReportRequest);
	}

}
