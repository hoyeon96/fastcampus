package dev.yeon.client.controller;

import dev.yeon.client.dto.Req;
import dev.yeon.client.dto.UserResponse;
import dev.yeon.client.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ApiController {

    private final RestTemplateService restTemplateService;

    public ApiController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping("/hello")
    public Req<UserResponse> getHello(){
//        return restTemplateService.hello();
//        return restTemplateService.post();

        return restTemplateService.genericExchange();

    }


}
