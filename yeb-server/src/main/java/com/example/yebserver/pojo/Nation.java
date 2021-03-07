package com.example.yebserver.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 
 * </p>
 *
 * @author zjc
 * @since 2021-02-16
 */
@Data
//根据name重写EqualsAndHashCode
@EqualsAndHashCode(callSuper = false,of = "name")
@TableName("t_nation")
@NoArgsConstructor
//有参构造
@RequiredArgsConstructor
@ApiModel(value="Nation对象", description="")
public class Nation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "民族")
    @Excel(name = "民族")
    //写新的有参构造时，name必填
    @NonNull
    private String name;


}
