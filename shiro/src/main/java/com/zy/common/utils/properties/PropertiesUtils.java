package com.zy.common.utils.properties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description :配置文件读取工具
 * @Author : zhangyan
 * @Date : 2019/10/17   11:22
 */
@Slf4j
public class PropertiesUtils {

    private static final String RESOURCE_NAME = "application.properties";

    /**
     * @Description //TODO 通过propertiesFactoryBean读取配置文件
     * @Author zhangyan
     * @Date 2019/10/17 14:14
     * @param: key
     * @return java.lang.String
    **/
    public static String getProperties(String key){
        Resource resource = new ClassPathResource(RESOURCE_NAME);
        Properties properties = new Properties();
        try {
            InputStream inputStream = resource.getInputStream();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return properties.getProperty(key);
    }
}
