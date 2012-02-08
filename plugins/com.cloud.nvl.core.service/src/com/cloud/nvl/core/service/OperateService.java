package com.cloud.nvl.core.service;


import java.util.Date;
import org.springframework.stereotype.Component;

import com.cloud.nvl.core.service.inter.IOperateService;

@Component
public class OperateService implements IOperateService {

	public String getDate() {
		return new Date().toString();
	}
}
