package crm.wei.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @BelongsProject: springboot01holleword
 * @BelongsPackage: crm.wei.cotroller
 * @Author: Tom
 * @CreateTime: 2019-10-11 23:07
 * @Description: helloCotroller
 */
@Controller
public class HelloCotroller {
	@RequestMapping("/hello")
	public @ResponseBody
	String hello() {
		return "hello World";
	}

}
