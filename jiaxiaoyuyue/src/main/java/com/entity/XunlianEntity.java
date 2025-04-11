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
 * 训练
 *
 * @author 
 * @email
 */
@TableName("xunlian")
public class XunlianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XunlianEntity() {

	}

	public XunlianEntity(T t) {
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
     * 训练名称
     */
    @TableField(value = "xunlian_name")

    private String xunlianName;


    /**
     * 训练类型
     */
    @TableField(value = "xunlian_types")

    private Integer xunlianTypes;


    /**
     * 训练内容
     */
    @TableField(value = "xunlian_content")

    private String xunlianContent;


    /**
     * 训练开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kaishi_time")

    private Date kaishiTime;


    /**
     * 训练结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jieshu_time")

    private Date jieshuTime;


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
	 * 设置：训练名称
	 */
    public String getXunlianName() {
        return xunlianName;
    }


    /**
	 * 获取：训练名称
	 */

    public void setXunlianName(String xunlianName) {
        this.xunlianName = xunlianName;
    }
    /**
	 * 设置：训练类型
	 */
    public Integer getXunlianTypes() {
        return xunlianTypes;
    }


    /**
	 * 获取：训练类型
	 */

    public void setXunlianTypes(Integer xunlianTypes) {
        this.xunlianTypes = xunlianTypes;
    }
    /**
	 * 设置：训练内容
	 */
    public String getXunlianContent() {
        return xunlianContent;
    }


    /**
	 * 获取：训练内容
	 */

    public void setXunlianContent(String xunlianContent) {
        this.xunlianContent = xunlianContent;
    }
    /**
	 * 设置：训练开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 获取：训练开始时间
	 */

    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 设置：训练结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 获取：训练结束时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
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
        return "Xunlian{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xunlianName=" + xunlianName +
            ", xunlianTypes=" + xunlianTypes +
            ", xunlianContent=" + xunlianContent +
            ", kaishiTime=" + kaishiTime +
            ", jieshuTime=" + jieshuTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
