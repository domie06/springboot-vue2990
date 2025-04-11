package com.entity.model;

import com.entity.XunlianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 训练
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XunlianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学员
     */
    private Integer yonghuId;


    /**
     * 训练名称
     */
    private String xunlianName;


    /**
     * 训练类型
     */
    private Integer xunlianTypes;


    /**
     * 训练内容
     */
    private String xunlianContent;


    /**
     * 训练开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaishiTime;


    /**
     * 训练结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jieshuTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：学员
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学员
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：训练名称
	 */
    public String getXunlianName() {
        return xunlianName;
    }


    /**
	 * 设置：训练名称
	 */
    public void setXunlianName(String xunlianName) {
        this.xunlianName = xunlianName;
    }
    /**
	 * 获取：训练类型
	 */
    public Integer getXunlianTypes() {
        return xunlianTypes;
    }


    /**
	 * 设置：训练类型
	 */
    public void setXunlianTypes(Integer xunlianTypes) {
        this.xunlianTypes = xunlianTypes;
    }
    /**
	 * 获取：训练内容
	 */
    public String getXunlianContent() {
        return xunlianContent;
    }


    /**
	 * 设置：训练内容
	 */
    public void setXunlianContent(String xunlianContent) {
        this.xunlianContent = xunlianContent;
    }
    /**
	 * 获取：训练开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 设置：训练开始时间
	 */
    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 获取：训练结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 设置：训练结束时间
	 */
    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
