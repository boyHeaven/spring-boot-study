package com.xuebin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @Date: 2022/3/25 11:36 上午
 * @Author: xuebin.yang
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@EnableKafka
public class SpringBootStudyApplication {
//        implements WebSocketConfigurer {

    private final static Logger LOGGER = LoggerFactory.getLogger(SpringBootStudyApplication.class);


    public static void main(String[] args) {

        /*
         * TODO：SpringApplication构造方法:
         *  设置ResourceLoader
         *  设置primarySources：也就是SpringBootStudyApplication
         *  推导ApplicationType
         *  设置ApplicationContextInitializer
         *      根据SPI机制，加载MEAT-INF/spring.factories，记载ApplicationContextInitializer的类
         *  设置ApplicationListener
         *      同ApplicationContextInitializer
         *  推导MainClass
         * TODO：SpringApplication run方法
         *  设置启动器开始
         *  获取SpringApplicationRunListener并且发送starting事件
         *      根据SPI机制获取org.springframework.boot.SpringApplicationRunListener
         *  设置默认的ApplicationArgs
         *  准备environment信息
         *      根据ApplicationType创建Environment
         *      配置环境信息：PropertySource与Profile
         *      SpringApplicationRunListener.environmentPrepared事件
         *   打印Banner
         *   创建ApplicationContext：
         *      根据ApplicationType创建
         *   通过MEAT-INF/spring.factories中获取ApplicationExceptionReporter获取异常报告器
         *   准备ApplicationContext
         *      设置environment
         *      执行initialize方法（ApplicationContextInitializer）
         *      发送SpringApplicationRunListener.contextPrepared事件
         *      创建BeanDefinitionLoader并且调用load方法，将AllSource数据注册到beanDefinitionMap中
         *      发送SpringApplicationRunListener.contextLoaded事件
         *   刷新ApplicationContext
         *      调用Spring中的refresh方法，进行Spring容器的初始化工作
         *   执行刷新后方法
         *   发送SpringApplicationRunListener.started事件
         *   设置启动器关闭
         *   回调ApplicationRunner，CommandLineRunner
         *   执行SpringApplicationRunListener.started事件
         */
        SpringApplication.run(SpringBootStudyApplication.class, args);
    }

//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        EchoMessageHandler messageHandler = getMessageHandler();
////        registry.addHandler(messageHandler).withSockJS();
//    }
//
//    @Bean
//    public DefaultEchoServiceImpl getDefaultEchoServiceImpl() {
//        return new DefaultEchoServiceImpl("you said \"%s\" !");
//    }
//
//    @Bean
//    public EchoMessageHandler getMessageHandler() {
//        DefaultEchoServiceImpl defaultEchoServiceImpl = getDefaultEchoServiceImpl();
//        return new EchoMessageHandler(defaultEchoServiceImpl);
//    }
}
