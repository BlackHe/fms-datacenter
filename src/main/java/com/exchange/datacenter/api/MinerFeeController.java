package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.bean.MinerFee;
import com.exchange.datacenter.mock.Mock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/miner")
public class MinerFeeController {
    @RequestMapping("/fee")
    @Mock(type = MinerFee.class)
    public BaseResponse getSettlement(@RequestParam String coinName, @RequestParam String clientId,
                                      @RequestParam String startDate, @RequestParam String endDate){
        return null;
    }
}
