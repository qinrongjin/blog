package cn.tiny77.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Component
public class RedisConfig {

	@Bean
	public Jedis getJedis() {
		JedisPool pool = CtxUtils.getBean(JedisPool.class);
		return pool.getResource();
	}
	
	@Bean
	public JedisPool getJedisPool() {

        // 建立连接池配置参数
        JedisPoolConfig config = new JedisPoolConfig();

        // 设置最大连接数
        config.setMaxTotal(100);

        // 设置最大阻塞时间，记住是毫秒数milliseconds
        config.setMaxWaitMillis(1000);

        // 设置空间连接
        config.setMaxIdle(10);

        JedisPool jedisPool = new JedisPool(config, "127.0.0.1", 6379);
        
        // 创建连接池
        return jedisPool; 

    }
	
}
