package com.cunyu.ServiceMonday;

import com.cunyu.ServiceMonday.Thread.AsyncTaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsyncTaskServiceTest {

    @Autowired
    private AsyncTaskService asyncTaskService;
    @Test
    void testExecuteAsyncTask() {
        for (int i = 0; i < 8; i++) {
            asyncTaskService.executeAsyncTask(i);
        }
    }

}
