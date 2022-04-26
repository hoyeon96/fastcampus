package dev.yeon.post.controller;


import dev.yeon.post.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public void put(@RequestBody PutRequestDto requestDto, @PathVariable(name = "userId") Long id){
        System.out.println(requestDto);
    }
}
