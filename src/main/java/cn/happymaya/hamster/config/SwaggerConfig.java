package cn.happymaya.hamster.config;

import cn.happymaya.hamster.common.config.BaseSwaggerConfig;
import cn.happymaya.hamster.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API 文档相关配置
 * Created by superhsc on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("cn.happymaya.hamster.modules")
                .title("hamster 项目骨架")
                .description("hamster 项目骨架相关接口文档")
                .contactName("superhsc")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
