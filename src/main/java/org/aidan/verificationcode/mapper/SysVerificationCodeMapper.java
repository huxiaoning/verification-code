package org.aidan.verificationcode.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.aidan.verificationcode.entity.SysVerificationCode;

import java.util.List;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author Aidan
 * @since 2018-08-29
 */
public interface SysVerificationCodeMapper extends BaseMapper<SysVerificationCode> {

    List<SysVerificationCode> findByCode(String verificationCode);
}