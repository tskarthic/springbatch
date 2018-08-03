package com.tsk.batch.example.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsk.batch.example.model.User;
import com.tsk.batch.example.repository.UserRepository;

@Component
public class H2DBWriter implements ItemWriter<User> {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("Data Saved for Users: " + users);
		userRepository.save(users);
		
	}

}
