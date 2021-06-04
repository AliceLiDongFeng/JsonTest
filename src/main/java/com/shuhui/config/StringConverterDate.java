package com.shuhui.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author 李东峰
 * @create_ 2021-05-19 12:26
 */

@Component
public class StringConverterDate implements Converter<String, LocalDate> {
    @Override
    public LocalDate convert(String source) {
        if (source != null){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(source, dateTimeFormatter);
            return date;
        }
        return null;
    }
}
