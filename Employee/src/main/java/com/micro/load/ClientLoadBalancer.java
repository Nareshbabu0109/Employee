

package com.micro.load;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ClientLoadBalancer {
	@Bean
	public IRule randonRule() {
		return new RandomRule();
		
	}

}
