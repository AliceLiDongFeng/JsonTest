package com.shuhui.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

/**
 * @author 李东峰
 * @create_ 2021-05-19 11:25
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
// @RequiredArgsConstructor
public class User {

    private String username;
    private String password;
    private Integer age;    // String 转 Integer(自动转换)
    private String gender;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")    // 自定义返回值类型
    private LocalDate birthday;    // String 转 LocalDate(自己编写的转换类)
    private String phone;
    private String email;
}
