package cn.stu.job;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/11/10.
 */
@Component
public class MyJob {

    /**
     * 靠配置运行
     */
    public void run() {
        System.out.println("我的任务");
    }

}
