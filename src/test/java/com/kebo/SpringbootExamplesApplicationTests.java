package com.kebo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootExamplesApplicationTests {

	@Autowired
	private RedisTemplate<String,Object> redisTemplate;

	@Test
	public void set(){
		redisTemplate.opsForValue().set("myKey","柯博");
		System.out.println(redisTemplate.opsForValue().get("myKey"));
	}

}
