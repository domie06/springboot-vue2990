package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 毕业信息
 *
 * @author 
 * @email
 */
@TableName("biyexinxi")
public class BiyexinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BiyexinxiEntity() {

	}

	public BiyexinxiEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 学员
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 毕业信息名称
     */
    @TableField(value = "biyexinxi_name")

    private String biyexinxiName;


    /**
     * 毕业信息内容
     */
    @TableField(value = "biyexinxi_content")

    private String biyexinxiContent;


    /**
     * 毕业时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "biye_time")

    private Date biyeTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学员
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：毕业信息名称
	 */
    public String getBiyexinxiName() {
        return biyexinxiName;
    }


    /**
	 * 获取：毕业信息名称
	 */

    public void setBiyexinxiName(String biyexinxiName) {
        this.biyexinxiName = biyexinxiName;
    }
    /**
	 * 设置：毕业信息内容
	 */
    public String getBiyexinxiContent() {
        return biyexinxiContent;
    }


    /**
	 * 获取：毕业信息内容
	 */

    public void setBiyexinxiContent(String biyexinxiContent) {
        this.biyexinxiContent = biyexinxiContent;
    }
    /**
	 * 设置：毕业时间
	 */
    public Date getBiyeTime() {
        return biyeTime;
    }


    /**
	 * 获取：毕业时间
	 */

    public void setBiyeTime(Date biyeTime) {
        this.biyeTime = biyeTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Biyexinxi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", biyexinxiName=" + biyexinxiName +
            ", biyexinxiContent=" + biyexinxiContent +
            ", biyeTime=" + biyeTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
