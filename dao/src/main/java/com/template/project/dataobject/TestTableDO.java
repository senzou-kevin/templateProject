package com.template.project.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test_table")
public class TestTableDO {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String testContent;
}
