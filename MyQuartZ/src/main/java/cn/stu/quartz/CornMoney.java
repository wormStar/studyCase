package cn.stu.quartz;

import cn.stu.job.CornJobMoney;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Administrator on 2018/1/2.
 */
public class CornMoney {

    public static void main(String[] args) {
        //作业类
        JobDetail jobDetail = JobBuilder.newJob(CornJobMoney.class)
                .withIdentity("cornJob", "group2").build();
        //触发器
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("cornTrigger", "group2")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 * 8-22 * * ? *")).build();

        //调度器
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
