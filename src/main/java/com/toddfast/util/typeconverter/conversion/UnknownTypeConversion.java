package com.toddfast.util.typeconverter.conversion;

import com.toddfast.util.typeconverter.TypeConverter;

/**
 * Returns the value as-is (no conversion)
 *
 */
public class UnknownTypeConversion implements TypeConverter.Conversion {

	@Override
	public Object[] getTypeKeys() {
		return new Object[] { TypeConverter.TYPE_UNKNOWN };
	}

	@Override
	public Object convert(Object value) {
		return value;
	}
}