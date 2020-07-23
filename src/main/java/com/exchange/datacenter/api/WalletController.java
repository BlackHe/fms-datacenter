package com.exchange.datacenter.api;

import com.exchange.datacenter.bean.BaseResponse;
import com.exchange.datacenter.bean.WalletBalance;
import com.exchange.datacenter.mock.Mock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wallet")
public class WalletController {

    @RequestMapping("/balance")
    @Mock(type = WalletBalance.class)
    public BaseResponse getTrade(@RequestParam(required = false) String coinName,
                                 @RequestParam String startDate,
                                 @RequestParam String endDate){
        return  null;
    }
}
