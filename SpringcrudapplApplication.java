package com.dsrc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dsrc.bean.User;
import com.dsrc.repository.UserRepository;

@SpringBootApplication
public class SpringcrudapplApplication  implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	

	public static void main(String[	] args) {
		
		SpringApplication.run(SpringcrudapplApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//userRepository.save(new User("one","one"));
		//userRepository.save(new User("two","one"));
		//userRepository.save(new User("three","one"));
		//userRepository.save(new User("four","one"));

		
	}

}
