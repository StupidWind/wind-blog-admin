package com.stupidwind.blog.utils;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: StupidWind
 * @date: 2019/9/21 11:27
 * @description: 公共工具类
 * @ver: 1.0.0
 */
public class CommonUtils {

	/**
	 * @param source 要拷贝的对象
	 * @return
	 * @description 获取对象中属性为null的属性名
	 * @author: stupidwind
	 * @date: 2019/9/21 11:29
	 */
	public static final String[] getNullPropertyNames(Object source) {
		final BeanWrapper src = new BeanWrapperImpl(source);
		PropertyDescriptor[] pds = src.getPropertyDescriptors();

		Set<String> emptyNames = new HashSet<>();
		for (PropertyDescriptor pd : pds) {
			Object srcValue = src.getPropertyValue(pd.getName());
			if (srcValue == null)
				emptyNames.add(pd.getName());
		}
		String[] result = new String[emptyNames.size()];
		return emptyNames.toArray(result);
	}

}
