package cn.pingweb.timeTask;

import cn.pingweb.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/8.
 */
@Component
public class SubjectTask {

    @Autowired
    MailService mailService;

    @Scheduled(cron = "0 0 8 * * ?")
    public void sendSubject () {
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId()+ "send subject!");
        String toUser = "523786283@qq.com";
        String subject = "DailyPush";
        String content = "Hello World!  ——From YP";
        mailService.sendSimpleMail(toUser, subject, content);
    }

    public void generateSubject () {
        System.out.println("generate subject!");
    }

    @Scheduled(cron = "0 0 * * *")
    public void resetDailyTask () {
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId()+ "send subject!");
        String toUser = "523786283@qq.com";
        String subject = "DailyPush";
        String content = "Hello World!  ——From YP";
        mailService.sendSimpleMail(toUser, subject, content);
    }

    @Scheduled(cron = "0 0 * * 0")
    public void resetWeekTask () {
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId()+ "send subject!");
        String toUser = "523786283@qq.com";
        String subject = "DailyPush";
        String content = "Hello World!  ——From YP";
        mailService.sendSimpleMail(toUser, subject, content);
    }

    @Scheduled(cron = "0 0 1 * *")
    public void resetMonthTask () {
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getId()+ "send subject!");
        String toUser = "523786283@qq.com";
        String subject = "DailyPush";
        String content = "Hello World!  ——From YP";
        mailService.sendSimpleMail(toUser, subject, content);
    }

}
