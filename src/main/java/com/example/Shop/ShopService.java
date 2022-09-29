package com.example.Shop;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class ShopService {

    private final HashMap<String, Shop> shopHashMap = new HashMap<>();

    public Shop addShop(Shop shop) {
        shopHashMap.put(shop.getId(), shop);
        return shop;
    }

    public Shop deleteShopId(String id) {
        return shopHashMap.remove(id);
    }

    public Shop getShop(String id) {
        Shop shop1 = shopHashMap.get(id);
        return shop1;
    }

    public Collection<Shop> getShops() {
        return shopHashMap.values();
    }

    public Shop update(Shop shop, String id) {

        Shop shop2 = shopHashMap.get(id);

        shop2.setCity(shop.getCity());
        shop2.setStreet(shop.getStreet());
        shop2.setNameShop(shop.getNameShop());
        shop2.setWorkers(shop.getWorkers());
        shop2.setWebsite(shop.isWebsite());

        return shop2;
    }
}