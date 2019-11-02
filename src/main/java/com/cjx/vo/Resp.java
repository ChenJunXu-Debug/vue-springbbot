/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Resp
 * Author:   ASUS
 * Date:     2019/10/10 20:53
 * Description: 接口返回值类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx.vo;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈接口返回值类〉
 *
 * @author ASUS
 * @create 2019/10/10
 * @since 1.0.0
 */
public class Resp {
    private Integer status;
    private Object message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
