package demo.redisTest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import static org.apache.naming.ResourceRef.AUTH;

/**
 * Created by TIAN on 2018/6/8.
 */
public class RedisUtil {

    private static String host = "192.168.198.141";

    private static int port = 6379;

    //可用连接实例的最大数目，默认值为8
    //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个实例，则此时pool的状态为exhausted(耗尽)
    private static int MAX_ACTIVE = 1024;

    //控制一个pool最多有多少个状态为idle（空闲的）的jedis实例，默认值也是8
    private static int MAX_IDLE = 200;

    //等待可以用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException;
    private static int MAX_WAIT = 10000;

    private static int TIMEOUT = 10000;

    private static JedisPool jedisPool = null;
    private RedisUtil() {

    }

    private static Jedis jedis = null;

    public static Jedis getJedis() {

        jedisPool = getJedisPool();

        if(jedis == null) {
            synchronized(RedisUtil.class) {
                if(jedis == null) {
                    jedis = new Jedis(host,port);
                }
            }
        }
        return jedis;
    }

    private static JedisPool getJedisPool(){
            JedisPoolConfig config = new JedisPoolConfig();
       /*      config.setMaxActive(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWait(MAX_WAIT);
           config.setTestOnBorrow(TEST_ON_BORROW);*/
           jedisPool = new JedisPool(config, host, port, TIMEOUT);
           return jedisPool;
    }
}