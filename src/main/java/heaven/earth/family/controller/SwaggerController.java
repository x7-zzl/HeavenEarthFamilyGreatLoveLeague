package heaven.earth.family.controller;

import heaven.earth.family.entity.VO.SwaggerReqVO;
import heaven.earth.family.entity.VO.SwaggerResVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author nightmare
 * @date 2023/12/16 15:41
 *
 */
@RestController
@RequestMapping("/swagger")
@Api(value = "用户接口", tags = {"用户接口"},description = "接口测试类")
public class SwaggerController {

    @ApiOperation("新增用户")
    @PostMapping("save")
    public String save(@RequestBody SwaggerReqVO req) {
        return "success";
    }

    @GetMapping("getById")
    @ApiOperation("根据条件查询用户")
    public SwaggerResVO getById(@RequestBody SwaggerResVO req) {
        return new SwaggerResVO();
    }
}