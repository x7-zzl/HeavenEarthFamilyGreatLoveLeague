package heaven.earth.family.entity.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author nightmare
 * @date 2023/12/16 15:39
 */
//@ApiModel注解和 @ApiModelProperty 注解定义了实体的名称和字段的名称，方便生成接口文档时展示
@Data
@ApiModel("创建Swagger请求参数")
public class SwaggerReqVO {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("性别")
    private Integer gender;
}