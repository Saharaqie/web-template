package com.wh.web.myweb.dao.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by superman on 2019/1/1.
 */

@Data
@TableName("photo")
public class PhotoPO {

    private Long id;
    private String name;
    private String url;
}
