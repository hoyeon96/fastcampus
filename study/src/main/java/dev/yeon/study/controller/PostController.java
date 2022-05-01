package dev.yeon.study.controller;


import dev.yeon.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form / text-plain

    @PostMapping("/postMethod") // localhost:8080/api/postMethod
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }

}
