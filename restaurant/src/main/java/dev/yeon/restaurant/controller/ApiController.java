package dev.yeon.restaurant.controller;


import dev.yeon.restaurant.wishlist.dto.WishListDto;
import dev.yeon.restaurant.wishlist.repository.WishListRepository;
import dev.yeon.restaurant.wishlist.service.WishListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/food")
@RequiredArgsConstructor
public class ApiController {

    private final WishListService wishListService;

    @GetMapping("/search")
    public WishListDto search(@RequestParam String query){
        return wishListService.search(query);
    }

    @PostMapping("")
    public WishListDto add(@RequestBody WishListDto wishListDto){

        log.info("{}", wishListDto);

        return wishListService.add(wishListDto);

    }

    @GetMapping("/wish-list")
    public List<WishListDto> findAll(){

        return wishListService.findAll();
    }

    @DeleteMapping("/{index}")
    public void delete(@PathVariable int index){
        wishListService.delete(index);
    }

    @PostMapping("/{index}")
    public void addVisit(@PathVariable int index){ wishListService.addVisit(index);}
}
