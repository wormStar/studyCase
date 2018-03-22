package main.java.cn.stu.quartz;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/11/10.
 */
public class TimerTest {

    /**
     * 在制定的时间执行任务，执行完后关闭，也可不关闭，schedule中加第3个叁数，以ms为单位，表明指定周期
     * @param args
     */
   public static void main(String []args){
      final Timer timer = new Timer();
      Calendar calendar = Calendar.getInstance();
      calendar.set(2017, 10, 10, 14, 36, 58);
       timer.schedule(new TimerTask() {
           @Override
           public void run() {
               System.out.println("run...");
               timer.cancel();
           }
       }, calendar.getTime());
   }
}
