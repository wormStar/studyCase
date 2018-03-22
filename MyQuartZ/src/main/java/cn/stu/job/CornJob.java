package cn.stu.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import sun.misc.JavaObjectInputStreamAccess;

/**
 * Created by Administrator on 2017/11/10.
 */
public class CornJob implements Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("cornJob...");
    }
}
