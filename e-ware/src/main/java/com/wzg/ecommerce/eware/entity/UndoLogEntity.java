package com.wzg.ecommerce.eware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author wzg
 * @email 285357487@qq.com
 * @date 2020-08-18 22:10:45
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long branchId;
	/**
	 * $column.comments
	 */
	private String xid;
	/**
	 * $column.comments
	 */
	private String context;
	/**
	 * $column.comments
	 */
	private Longblob rollbackInfo;
	/**
	 * $column.comments
	 */
	private Integer logStatus;
	/**
	 * $column.comments
	 */
	private Date logCreated;
	/**
	 * $column.comments
	 */
	private Date logModified;
	/**
	 * $column.comments
	 */
	private String ext;

}
