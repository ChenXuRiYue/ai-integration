package indi.axel.ai.integrate.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description coupon
 * @author zhengkai.blog.csdn.net
 * @date 2024-09-18
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Coupon extends BaseDO {

    @TableId(type = IdType.AUTO)

    private Integer id;

    /**
    * 优惠券名称
    */
    private String name;

    /**
    * 优惠券描述
    */
    private String description;

    /**
    * 折扣金额
    */
    private BigDecimal discount;

    /**
    * 过期日期
    */
    private Date expiryDate;

}