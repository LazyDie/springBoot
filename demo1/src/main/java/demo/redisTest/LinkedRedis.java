package demo.redisTest;

import redis.clients.jedis.Jedis;

/**
 * Created by TIAN on 2018/5/30.
 */
public class LinkedRedis {
    public static void main(String[] args) throws InterruptedException {
        Jedis jedis = new Jedis("192.168.198.141",6379);
        jedis .setex("tian",10, "风");
        System.out.println(jedis.get("tian"));
        Thread.sleep(5000);
        System.out.println("5秒后："+jedis.get("tian"));
        Thread.sleep(5000);
        System.out.println("10秒后："+jedis.get("tian"));
        //System.out.println(jedis.get("hello1"));
    }
}
