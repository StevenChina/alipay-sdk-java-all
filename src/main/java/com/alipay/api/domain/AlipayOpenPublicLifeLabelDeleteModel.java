package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签删除接口
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:33
 */
public class AlipayOpenPublicLifeLabelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2578982362188629734L;

	/**
	 * 标签id, 只支持生活号自定义标签
	 */
	@ApiField("label_id")
	private String labelId;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

}