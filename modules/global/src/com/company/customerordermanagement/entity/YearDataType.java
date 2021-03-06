package com.company.customerordermanagement.entity;

import com.google.common.base.Strings;
import com.haulmont.chile.core.annotations.JavaClass;
import com.haulmont.chile.core.datatypes.Datatype;
import com.haulmont.chile.core.datatypes.impl.IntegerDatatype;
import org.dom4j.Element;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

@JavaClass(Integer.class)
public class YearDataType extends IntegerDatatype implements Datatype<Integer> {

    private static final String PATTERN = "##00";

    public YearDataType(Element element) {
        super(element);
    }

    @Override
    public String format(@Nullable Object value) {
        if (value == null) {
            return "";

        }
        DecimalFormat format = new DecimalFormat(PATTERN);
        return format.format(value);
    }

    @Override
    public String format(@Nullable Object value, Locale locale) {
        return format(value);
    }

    @Nullable
    @Override
    public Integer parse(@Nullable String value) throws ParseException {
        if (Strings.isNullOrEmpty(value)) {
            return null;
        }
        DecimalFormat format = new DecimalFormat(PATTERN);
        int year = format.parse(value).intValue();
        if (year > 2100 || year < 0) {
            throw new ParseException("Invalid year", 0);
        }
        if (year < 100) {
            year += 2000;
        }
        return year;
    }

    @Nullable
    @Override
    public Integer parse(@Nullable String value, Locale locale) throws ParseException {
        return parse(value);
    }
}