/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: App
 * Author:   ASUS
 * Date:     2019/10/10 20:34
 * Description: App
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 〈一句话功能简述〉<br>
 * 〈App〉
 *
 * @author ASUS
 * @create 2019/10/10
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan("com.cjx.dao")
public class App extends SpringBootServletInitializer {
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(this.getClass());
//    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
