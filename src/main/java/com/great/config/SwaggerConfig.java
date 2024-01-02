package com.great.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig {
    @Bean(value = "createRestApi")
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.great.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("天地一家大爱盟")
                        .version("1.0")
                        .description("早岁已知世事艰，仍许飞鸿荡云间。\n" +
                                "一路寒风身如絮，命海沉浮客独行。\n" +
                                "千磨万击心铸铁，殚精竭虑铸一剑。\n" +
                                "今朝剑指叠云处，炼蛊炼人还炼天！")
                        .termsOfServiceUrl("http://localhost:12345/")
                        .build());
    }
}
