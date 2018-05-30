package demo.redisTest;

import redis.clients.jedis.Jedis;

/**
 * Created by TIAN on 2018/5/30.
 */
public class LinkedRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.198.141",6379);
        System.out.println(jedis.get("hello1"));
    }
}
