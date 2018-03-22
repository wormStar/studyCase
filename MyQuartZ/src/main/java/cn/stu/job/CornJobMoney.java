package cn.stu.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by Administrator on 2018/1/2.
 */
public class CornJobMoney implements Job {


    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("一个季度了，发放金额");
    }
}
