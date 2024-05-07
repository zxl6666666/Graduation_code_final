package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 学习足迹
 *
 * @author 
 * @email
 */
@TableName("xuexizuji")
public class XuexizujiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XuexizujiEntity() {

	}

	public XuexizujiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 视频
     */
    @ColumnInfo(comment="视频",type="int(11)")
    @TableField(value = "shipin_id")

    private Integer shipinId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="开始时间",type="timestamp")
    @TableField(value = "xuexizuji_time")

    private Date xuexizujiTime;


    /**
     * 学习状态
     */
    @ColumnInfo(comment="学习状态",type="int(11)")
    @TableField(value = "xuexizuji_types")

    private Integer xuexizujiTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：视频
	 */
    public Integer getShipinId() {
        return shipinId;
    }
    /**
	 * 设置：视频
	 */

    public void setShipinId(Integer shipinId) {
        this.shipinId = shipinId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：开始时间
	 */
    public Date getXuexizujiTime() {
        return xuexizujiTime;
    }
    /**
	 * 设置：开始时间
	 */

    public void setXuexizujiTime(Date xuexizujiTime) {
        this.xuexizujiTime = xuexizujiTime;
    }
    /**
	 * 获取：学习状态
	 */
    public Integer getXuexizujiTypes() {
        return xuexizujiTypes;
    }
    /**
	 * 设置：学习状态
	 */

    public void setXuexizujiTypes(Integer xuexizujiTypes) {
        this.xuexizujiTypes = xuexizujiTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xuexizuji{" +
            ", id=" + id +
            ", shipinId=" + shipinId +
            ", yonghuId=" + yonghuId +
            ", xuexizujiTime=" + DateUtil.convertString(xuexizujiTime,"yyyy-MM-dd") +
            ", xuexizujiTypes=" + xuexizujiTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
