package com.example.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ShopController {

    private ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @PostMapping(value = "/shops/add",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.addShop(shop);
    }

    @DeleteMapping("/{id}")
    public Shop delete(@PathVariable String id) {
        return shopService.deleteShopId(id);
    }

    @GetMapping("/{id}")
    public Shop getShop(@PathVariable String id) {
        return shopService.getShop(id);
    }

    @GetMapping
    public Collection<Shop> getShops() {
        return shopService.getShops();
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Shop update(@RequestBody Shop shop, @PathVariable String id) {

        return shopService.update(shop, id);
    }

}