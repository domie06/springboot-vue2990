package com.entity.model;

import com.entity.BiyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 毕业信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BiyexinxiModel implements Serializable {
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
     * 毕业信息名称
     */
    private String biyexinxiName;


    /**
     * 毕业信息内容
     */
    private String biyexinxiContent;


    /**
     * 毕业时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date biyeTime;


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
	 * 获取：毕业信息名称
	 */
    public String getBiyexinxiName() {
        return biyexinxiName;
    }


    /**
	 * 设置：毕业信息名称
	 */
    public void setBiyexinxiName(String biyexinxiName) {
        this.biyexinxiName = biyexinxiName;
    }
    /**
	 * 获取：毕业信息内容
	 */
    public String getBiyexinxiContent() {
        return biyexinxiContent;
    }


    /**
	 * 设置：毕业信息内容
	 */
    public void setBiyexinxiContent(String biyexinxiContent) {
        this.biyexinxiContent = biyexinxiContent;
    }
    /**
	 * 获取：毕业时间
	 */
    public Date getBiyeTime() {
        return biyeTime;
    }


    /**
	 * 设置：毕业时间
	 */
    public void setBiyeTime(Date biyeTime) {
        this.biyeTime = biyeTime;
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
