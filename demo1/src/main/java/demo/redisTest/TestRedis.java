package demo.redisTest;

import redis.clients.jedis.Jedis;

/**
 * Created by TIAN on 2018/6/8.
 */
public class TestRedis {

    public static void main(String[] args) {
        Jedis jedis = RedisUtil.getJedis();

    }

}
