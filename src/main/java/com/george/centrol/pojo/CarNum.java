package com.george.centrol.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarNum {
    @TableId(type= IdType.AUTO)
    private Integer cnid;

    private Date time;

    private Integer num;
}
