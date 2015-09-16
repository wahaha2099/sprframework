package com.dreamwork.spring.cache.impl;

import com.dreamwork.spring.cache.JedisFactory;
import com.dreamwork.spring.exception.AppException;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * 以redis set的形式存储
 */
@Component
public class BaseSetCache {

    /**
     * 增加元素到该key下的缓存
     *
     * @param key
     * @param data
     * @throws AppException
     */
    public void sadd(String key, String... data) throws AppException {
        Jedis jedis = null;
        try {
            jedis = JedisFactory.getJedisInstance();
            jedis.sadd(key, data);
        } catch (Exception e) {
            throw new AppException("100", "增加redis set类型列表异常！", e);
        } finally {
            JedisFactory.release(jedis);
        }
    }

    /**
     * 弹出一个该key下的元素
     *
     * @param key
     * @return
     * @throws AppException
     */
    public String spop(String key) throws AppException {
        String result = null;
        Jedis jedis = null;
        try {
            jedis = JedisFactory.getJedisInstance();
            result = jedis.spop(key);
        } catch (Exception e) {
            throw new AppException("100", "从redis set类型中弹出元素异常！", e);
        } finally {
            JedisFactory.release(jedis);
        }
        return result;
    }

    /**
     * 删除指定元素
     *
     * @param key
     * @param member
     * @return
     * @throws AppException
     */
    public long del(String key, String... member) throws AppException {
        long result = 0;
        Jedis jedis = null;
        try {
            jedis = JedisFactory.getJedisInstance();
            result = jedis.srem(key, member);
        } catch (Exception e) {
            throw new AppException("100", "从redis set类型中删除指定元素异常！", e);
        } finally {
            JedisFactory.release(jedis);
        }
        return result;
    }

    /**
     * 删除该key的所有元素
     *
     * @param key
     * @throws AppException
     */
    public void remove(String key) throws AppException {
        Jedis jedis = null;
        try {
            jedis = JedisFactory.getJedisInstance();
            jedis.del(key);
        } catch (Exception e) {
            throw new AppException("100", "从redis set类型中删除指定元素异常！", e);
        } finally {
            JedisFactory.release(jedis);
        }
    }

    public Set<String> smembers(String key) throws AppException {
        Set<String> set = null;
        Jedis jedis = null;
        try {
            jedis = JedisFactory.getJedisInstance();
            set = jedis.smembers(key);
        } catch (Exception e) {
            throw new AppException("100", "获取redis中set: + " + key + ", 所有元素异常！", e);
        } finally {
            JedisFactory.release(jedis);
        }
        return set;
    }
}
