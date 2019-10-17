package com.zy.config.redis;

import com.zy.common.utils.properties.PropertiesUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/17   10:49
 */
@Slf4j
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

    private String database = PropertiesUtils.getProperties("spring.redis.database");

    private String host = PropertiesUtils.getProperties("spring.redis.host");

    private String port = PropertiesUtils.getProperties("spring.redis.port");

    private String password = PropertiesUtils.getProperties("spring.redis.password");

    private String maxActive = PropertiesUtils.getProperties("spring.redis.jedis.pool.max-active");

    private String maxWait = PropertiesUtils.getProperties("spring.redis.jedis.pool.max-wait");

    private String maxIdle = PropertiesUtils.getProperties("spring.redis.jedis.pool.max-idle");

    private String minIdle = PropertiesUtils.getProperties("spring.redis.jedis.pool.min-idle");

    private String timeOut = PropertiesUtils.getProperties("spring.redis.timeout");

    @Value("${spring.redis.block-when-exhausted}")
    private boolean blockWhenExhausted;

    @Bean
    public JedisPool jedisPool(){
        try {
            JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
            jedisPoolConfig.setMaxTotal(Integer.parseInt(maxActive));
            jedisPoolConfig.setMaxIdle(Integer.parseInt(maxIdle));
            jedisPoolConfig.setMaxWaitMillis(Integer.parseInt(maxWait));
            jedisPoolConfig.setMinIdle(Integer.parseInt(minIdle));
            // 连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
            jedisPoolConfig.setBlockWhenExhausted(blockWhenExhausted);
            // 是否启用pool的jmx管理功能, 默认true
            jedisPoolConfig.setJmxEnabled(true);
            JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, Integer.parseInt(port), Integer.parseInt(timeOut), password);
            log.info("初始化JedisPool成功,地址为:[{}]",host + ":" + port);
            return jedisPool;
        } catch (NumberFormatException e) {
            log.error("初始化JedisPool失败,失败原因为:{}",e.getMessage());
        }
        return null;
    }
}
