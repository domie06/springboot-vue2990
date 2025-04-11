package com.entity.vo;

import com.entity.BiyexinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 毕业信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("biyexinxi")
public class BiyexinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
