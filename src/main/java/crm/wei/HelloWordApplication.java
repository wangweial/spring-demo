package crm.wei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*步骤
 *1.创建maven
 *2.创建主程序
 *3.编写控制层
 * 4.打包成jar 可以直接用java -jar 运行jar包
 * */

/**
 * @BelongsProject: springboot01holleword
 * @BelongsPackage: crm
 * @Author: Tom
 * @CreateTime: 2019-10-11 22:38
 * @Description: 主程序启动类 需要放在根目录
 */
/*必须需要的注解
 * springBoot应用,主配置类
 * 构成:
 * @SpringBootConfiguration
 * 表示是springboot的配置类 Configuration:配置类(配置文件)
 * @EnableAutoConfiguration
 * 开启自动配置功能
 * @AutoConfigurationPackage:自动配置包 主配置类的包和所有子包中的多有组件注入到容器中
 * @Import({EnableAutoConfigurationImportSelector.class})容器中导入某些组件(自动配置类)
 *
 *
 *
 * */
@SpringBootApplication
public class HelloWordApplication {
	public static void main(String[] args) {
		//启动主程序
		SpringApplication.run(HelloWordApplication.class, args);
	}
}

