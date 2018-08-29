package org.aidan.verificationcode.web;

import org.aidan.verificationcode.entity.SysVerificationCode;
import org.aidan.verificationcode.service.ISysVerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 发送短信验证码记录  前端控制器
 * </p>
 *
 * @author Aidan
 * @since 2018-08-29
 */
@RestController
@RequestMapping
public class SysVerificationCodeController {
    @Autowired
    private ISysVerificationCodeService sysVerificationCodeService;

    @GetMapping
    public Map<String, Object> hello() {
        Map<String, Object> resp = new HashMap<>();
        SysVerificationCode sysVerificationCode = new SysVerificationCode();
        sysVerificationCode.setVerificationCode("156fds");
        boolean insert = sysVerificationCodeService.insert(sysVerificationCode);
        resp.put("code", "000000");
        resp.put("insert", insert);
        List<SysVerificationCode> svc = sysVerificationCodeService.findByCode("156fds");

        resp.put("sysVerificationCode", svc);
        return resp;
    }

}
