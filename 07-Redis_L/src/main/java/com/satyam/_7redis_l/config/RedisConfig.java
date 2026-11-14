package com.satyam._7redis_l.config;

import com.satyam._7redis_l.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

    // JedisConnectionFactory
    @Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        JedisConnectionFactory jedis = new JedisConnectionFactory();
        //redis server config if not localhost
        //jedis.setPort(454554);
        return jedis;
    }

    //RestTemplate
    @Bean
    public RedisTemplate<String, Country> redisTemplate() {

        RedisTemplate<String, Country> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
