package com.entity.view;

import com.entity.KaoshiyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 考试预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoshiyuyue")
public class KaoshiyuyueView extends KaoshiyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 kaoshi
			/**
			* 考试名称
			*/
			private String kaoshiName;
			/**
			* 考试时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date kaoshiTime;
			/**
			* 考试介绍
			*/
			private String kaoshiContent;

		//级联表 yonghu
			/**
			* 学号
			*/
			private String yonghuUuidNumber;
			/**
			* 学员姓名
			*/
			private String yonghuName;
			/**
			* 学员手机号
			*/
			private String yonghuPhone;
			/**
			* 学员身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 学员头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public KaoshiyuyueView() {

	}

	public KaoshiyuyueView(KaoshiyuyueEntity kaoshiyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, kaoshiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set kaoshi
					/**
					* 获取： 考试名称
					*/
					public String getKaoshiName() {
						return kaoshiName;
					}
					/**
					* 设置： 考试名称
					*/
					public void setKaoshiName(String kaoshiName) {
						this.kaoshiName = kaoshiName;
					}
					/**
					* 获取： 考试时间
					*/
					public Date getKaoshiTime() {
						return kaoshiTime;
					}
					/**
					* 设置： 考试时间
					*/
					public void setKaoshiTime(Date kaoshiTime) {
						this.kaoshiTime = kaoshiTime;
					}
					/**
					* 获取： 考试介绍
					*/
					public String getKaoshiContent() {
						return kaoshiContent;
					}
					/**
					* 设置： 考试介绍
					*/
					public void setKaoshiContent(String kaoshiContent) {
						this.kaoshiContent = kaoshiContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 学号
					*/
					public String getYonghuUuidNumber() {
						return yonghuUuidNumber;
					}
					/**
					* 设置： 学号
					*/
					public void setYonghuUuidNumber(String yonghuUuidNumber) {
						this.yonghuUuidNumber = yonghuUuidNumber;
					}
					/**
					* 获取： 学员姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学员姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 学员手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学员手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学员身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学员身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 学员头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 学员头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
