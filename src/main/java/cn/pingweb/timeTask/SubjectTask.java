package cn.pingweb.timeTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/8.
 */
@Component
public class SubjectTask {

    @Scheduled(cron = "0/1 * * * * ?")
    public void sendSubject () {
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId()+ "send subject!");

    }

    public void generateSubject () {
        System.out.println("generate subject!");
    }

}
