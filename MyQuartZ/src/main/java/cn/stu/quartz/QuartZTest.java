package cn.stu.quartz;

import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Administrator on 2017/11/10.
 */
public class QuartZTest {

    public static void main(String[] args) {
        //作业类
       JobDetail jobDetail = JobBuilder.newJob(QuartZJob.class)
               .withIdentity("jobDetail1", "group1").build();

        //触发器
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * 15 10 11 ?"))
                .build();

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
