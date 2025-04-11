package com.entity.model;

import com.entity.KaoshiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考试预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoshiyuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 考试
     */
    private Integer kaoshiId;


    /**
     * 学员
     */
    private Integer yonghuId;


    /**
     * 考试详情
     */
    private String kaoshiyuyueContent;


    /**
     * 考试得分
     */
    private Double kaoshiyuyueDefen;


    /**
     * 考试结果
     */
    private String kaoshiyuyueText;


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
	 * 获取：考试
	 */
    public Integer getKaoshiId() {
        return kaoshiId;
    }


    /**
	 * 设置：考试
	 */
    public void setKaoshiId(Integer kaoshiId) {
        this.kaoshiId = kaoshiId;
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
	 * 获取：考试详情
	 */
    public String getKaoshiyuyueContent() {
        return kaoshiyuyueContent;
    }


    /**
	 * 设置：考试详情
	 */
    public void setKaoshiyuyueContent(String kaoshiyuyueContent) {
        this.kaoshiyuyueContent = kaoshiyuyueContent;
    }
    /**
	 * 获取：考试得分
	 */
    public Double getKaoshiyuyueDefen() {
        return kaoshiyuyueDefen;
    }


    /**
	 * 设置：考试得分
	 */
    public void setKaoshiyuyueDefen(Double kaoshiyuyueDefen) {
        this.kaoshiyuyueDefen = kaoshiyuyueDefen;
    }
    /**
	 * 获取：考试结果
	 */
    public String getKaoshiyuyueText() {
        return kaoshiyuyueText;
    }


    /**
	 * 设置：考试结果
	 */
    public void setKaoshiyuyueText(String kaoshiyuyueText) {
        this.kaoshiyuyueText = kaoshiyuyueText;
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
