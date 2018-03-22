package cn.stu.testP2P;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by Administrator on 2018/1/3.
 */
public class P2PJob implements Job {


    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("要执行的任务");
    }
}
