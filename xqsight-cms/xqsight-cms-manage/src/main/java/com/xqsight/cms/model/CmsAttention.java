package com.xqsight.cms.model;import com.xqsight.common.model.Model;import java.io.Serializable;/******************************************************************************* * javaBeans * CMS_ATTENTION --> CmsAttention  * <table explanation> * @author 2016-05-06 15:07:04 *  */	public class CmsAttention extends Model implements java.io.Serializable {	/**	 * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）	 */	private static final long serialVersionUID = -6020779062895215472L;	//field	/** 收藏主键 **/	private Long attentionId;	/** 收藏的ID **/	private Long associcationId;	/** 收藏类型 1:收藏 2:顶 3:关注 **/	private int attentionType;	/** 来源 **/	private String fromSource;	//method	public Long getAttentionId() {		return attentionId;	}	public void setAttentionId(Long attentionId) {		this.attentionId = attentionId;	}	public Long getAssocicationId() {		return associcationId;	}	public void setAssocicationId(Long associcationId) {		this.associcationId = associcationId;	}	public int getAttentionType() {		return attentionType;	}	public void setAttentionType(int attentionType) {		this.attentionType = attentionType;	}	/**	 * getter method	 * @return the fromSource	 */		public String getFromSource() {		return fromSource;	}	/**	 * setter method	 * @param fromSource the fromSource to set	 */		public void setFromSource(String fromSource) {		this.fromSource = fromSource;	}	@Override	public Serializable getPK() {		return this.attentionId;	}}