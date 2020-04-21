package wooteco.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import wooteco.helloworld.domain.User;

import java.util.Map;

@RestController
public class UserController {
    /**
     * GET /users
     */
    @GetMapping("/users")
    public String sayHi(@RequestParam String name) {
        return "Hi " + name;
    }

    /**
     * GET /users/{id}
     */
    @GetMapping("/users/{id}")
    public String retrieveUser(@PathVariable Long id) {
        return "user's id is " + id;
    }

    /**
     * POST /users
     */
    @PostMapping("/users")
    public String createUserWithJson(@RequestBody User user) {
        return "Hello " + user.getName();
    }

    /**
     * POST /users/form
     */
    @PostMapping("/users/form")
    public String createUserWithForm(@RequestParam Map<String, String> paramMap) {
        return "Hello " + paramMap.get("name");
    }

}