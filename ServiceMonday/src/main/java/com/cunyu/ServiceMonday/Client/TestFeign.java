package com.cunyu.ServiceMonday.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "ServiceSaturday")
public interface TestFeign {
    @GetMapping("feign")
    Integer TestFeign1(@RequestParam Integer Id);
}
