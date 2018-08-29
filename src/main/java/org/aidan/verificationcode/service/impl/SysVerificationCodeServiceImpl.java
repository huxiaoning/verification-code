package org.aidan.verificationcode.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.aidan.verificationcode.entity.SysVerificationCode;
import org.aidan.verificationcode.mapper.SysVerificationCodeMapper;
import org.aidan.verificationcode.service.ISysVerificationCodeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 发送短信验证码记录  服务实现类
 * </p>
 *
 * @author Aidan
 * @since 2018-08-29
 */
@Service
public class SysVerificationCodeServiceImpl extends ServiceImpl<SysVerificationCodeMapper, SysVerificationCode> implements ISysVerificationCodeService {

    @Override
    public List<SysVerificationCode> findByCode(String verificationCode) {
        return baseMapper.findByCode(verificationCode);
    }
}
