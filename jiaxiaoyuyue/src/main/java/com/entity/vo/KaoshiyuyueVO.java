package com.entity.vo;

import com.entity.KaoshiyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考试预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoshiyuyue")
public class KaoshiyuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 考试
     */

    @TableField(value = "kaoshi_id")
    private Integer kaoshiId;


    /**
     * 学员
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 考试详情
     */

    @TableField(value = "kaoshiyuyue_content")
    private String kaoshiyuyueContent;


    /**
     * 考试得分
     */

    @TableField(value = "kaoshiyuyue_defen")
    private Double kaoshiyuyueDefen;


    /**
     * 考试结果
     */

    @TableField(value = "kaoshiyuyue_text")
    private String kaoshiyuyueText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：考试
	 */
    public Integer getKaoshiId() {
        return kaoshiId;
    }


    /**
	 * 获取：考试
	 */

    public void setKaoshiId(Integer kaoshiId) {
        this.kaoshiId = kaoshiId;
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
	 * 设置：考试详情
	 */
    public String getKaoshiyuyueContent() {
        return kaoshiyuyueContent;
    }


    /**
	 * 获取：考试详情
	 */

    public void setKaoshiyuyueContent(String kaoshiyuyueContent) {
        this.kaoshiyuyueContent = kaoshiyuyueContent;
    }
    /**
	 * 设置：考试得分
	 */
    public Double getKaoshiyuyueDefen() {
        return kaoshiyuyueDefen;
    }


    /**
	 * 获取：考试得分
	 */

    public void setKaoshiyuyueDefen(Double kaoshiyuyueDefen) {
        this.kaoshiyuyueDefen = kaoshiyuyueDefen;
    }
    /**
	 * 设置：考试结果
	 */
    public String getKaoshiyuyueText() {
        return kaoshiyuyueText;
    }


    /**
	 * 获取：考试结果
	 */

    public void setKaoshiyuyueText(String kaoshiyuyueText) {
        this.kaoshiyuyueText = kaoshiyuyueText;
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

}
