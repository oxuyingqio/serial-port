package cn.xuyingqi.serial.port.protocol.di.impl;

import cn.xuyingqi.serial.port.protocol.di.Di;

/**
 * 申请测量点号
 * 
 * @author XuYQ
 *
 */
public class ApplicationMeasuringPoint extends Di {

	/**
	 * 默认DI值
	 */
	public static final byte DI = 0x4C;

	/**
	 * 原型
	 */
	private Prototype prototype;

	/**
	 * 申请测量点号
	 */
	public ApplicationMeasuringPoint() {

		this.prototype = new Prototype();
	}

	/**
	 * 填充数据
	 * 
	 * @param data
	 *            数据
	 * @param index
	 *            数据索引值
	 * @return
	 */
	@Override
	public int fill(byte[] data, int index) {

		index = super.fill(data, index);

		return this.prototype.fill(data, index);
	}

	@Override
	public String getDi() {

		return "申请测量点号";
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();

		sb.append(super.toString());

		return sb.toString();
	}

	/**
	 * 原型
	 * 
	 * @author XuYQ
	 *
	 */
	private class Prototype {

		/**
		 * 填充数据
		 * 
		 * @param data
		 * @param index
		 * @return
		 */
		public int fill(byte[] data, int index) {

			return index;
		}
	}
}