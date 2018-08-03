package com.tsk.batch.example.batch;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.tsk.batch.example.model.User;

@Component
public class Processor implements ItemProcessor<User, User> {
	
	private static final Map<String, String> DEPT_NAMES = new HashMap<>();

	public Processor() {
		DEPT_NAMES.put("101", "Technology");
		DEPT_NAMES.put("102", "Operations");
		DEPT_NAMES.put("103", "Accounts");
	}

	@Override
	public User process(User user) throws Exception {
		String code = user.getDept();
		user.setDept(DEPT_NAMES.get(user.getDept()));
		user.setTime(new Date());
		System.out.printf("Converted from [%s] to [%s]", code, user.getDept());
		return user;
	}

}
