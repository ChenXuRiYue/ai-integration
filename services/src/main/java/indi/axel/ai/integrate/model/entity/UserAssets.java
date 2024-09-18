package indi.axel.ai.integrate.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description user_assets
 * @author zhengkai.blog.csdn.net
 * @date 2024-09-18
 */
@Data
public class UserAssets extends BaseDO {


    @TableId(type = IdType.AUTO)

    private Integer id;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 积分
    */
    private Integer points;

    /**
    * 余额
    */
    private BigDecimal balance;

    /**
    * 优惠券数量
    */
    private Integer couponCount;

}