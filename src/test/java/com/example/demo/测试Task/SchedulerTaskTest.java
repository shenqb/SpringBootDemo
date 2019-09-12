package com.example.demo.测试Task;

import com.example.demo.task.SchedulerTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchedulerTaskTest {

    @Autowired
    private SchedulerTask schedulerTask;

    @Test
    public void test(){
        schedulerTask.reportCurrentTime();
    }
}
