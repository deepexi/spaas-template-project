package ${package}.api.impl;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ${package}.api.${appName}Api;

/**
 * Created by yangxi on 2019/05/04.
 */
@RestController
public class ${appName}ApiImpl implements ${appName}Api { // 类名首字母请手工调整为大写

	@GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
		return "hello, " + name;
	}
}