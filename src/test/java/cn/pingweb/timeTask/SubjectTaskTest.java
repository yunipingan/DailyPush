package cn.pingweb.timeTask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/8/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SubjectTaskTest {

    @Test
    public void test1() throws InterruptedException {
        //Thread.sleep(10000);
        Thread.currentThread().setDaemon(true);
        System.out.println("Junit:"+Thread.currentThread().getName()+Thread.currentThread().getId());
    }

}