package com.didispace;

import com.didispace.domain.p.User_test;
import com.didispace.domain.p.UserRepository;
import com.didispace.domain.s.Message;
import com.didispace.domain.s.MessageRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private MessageRepository messageRepository;

	@Before
	public void setUp() {
	}

	@Test
	public void test() throws Exception {

		userRepository.save(new User_test(1,"aaa", 10));
		userRepository.save(new User_test(2,"bbb", 20));
		userRepository.save(new User_test(3,"ccc", 30));
		userRepository.save(new User_test(4,"ddd", 40));
		userRepository.save(new User_test(5,"eee", 50));
		Assert.assertEquals(5, userRepository.findAll().size());

		messageRepository.save(new Message("o1", "aaaaaaaaaa"));
		messageRepository.save(new Message("o2", "bbbbbbbbbb"));
		messageRepository.save(new Message("o3", "cccccccccc"));

		Assert.assertEquals(3, messageRepository.findAll().size());

	}


}
