package org.aidan.verificationcode.service;

import com.baomidou.mybatisplus.service.IService;
import org.aidan.verificationcode.entity.SysVerificationCode;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Aidan
 * @since 2018-08-29
 */
public interface ISysVerificationCodeService extends IService<SysVerificationCode> {

    List<SysVerificationCode> findByCode(String verificationCode);
}
