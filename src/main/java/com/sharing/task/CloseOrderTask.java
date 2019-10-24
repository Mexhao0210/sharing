package com.sharing.task;

import com.sharing.service.iOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CloseOrderTask {

    @Autowired
    private iOrderService iOrderService;

    @Scheduled(cron="0 */5 * * * ?")
    public void closeOrderTask(){
        log.info("start scheduled close order");
        iOrderService.closeOrder(1);
        log.info("scheduled task finished");
    }
}
