package com.pig4cloud.pig.common.xxl.job.annotation;

import com.pig4cloud.pig.common.xxl.job.XxlJobAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 激活xxl-job配置
 *
 * @author techgrow
 * @date 2025/02/18
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({ XxlJobAutoConfiguration.class })
public @interface EnablePigXxlJob {

}
