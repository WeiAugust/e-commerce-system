package com.wzg.ecommerce.eproducts.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 属性分组
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 20:21:25
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * $column.comments
	 */
	private String attrGroupName;
	/**
	 * $column.comments
	 */
	private Integer sort;
	/**
	 * $column.comments
	 */
	private String descript;
	/**
	 * $column.comments
	 */
	private String icon;
	/**
	 * $column.comments
	 */
	private Long catelogId;

}
