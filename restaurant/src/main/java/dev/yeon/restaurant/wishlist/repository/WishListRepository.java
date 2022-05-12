package dev.yeon.restaurant.wishlist.repository;

import dev.yeon.restaurant.naver.db.MemoryDbRepositoryAbstract;
import dev.yeon.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
