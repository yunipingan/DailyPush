package cn.pingweb.service;

public interface MailService {
    /**
     * 发送普通邮件
     * @param to
     * @param subject
     * @param content
     */
    void sendSimpleMail(String to, String subject, String content);
}
