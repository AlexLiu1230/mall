package com.yuhsin.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuhsin.mall.product.entity.BrandEntity;
import com.yuhsin.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
//		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setName("Shopee");
//		brandService.save(brandEntity);
//		System.out.println("Save success!");

//		brandEntity.setBrandId(1L);
//		brandEntity.setDescript("aaa");
//		brandService.updateById(brandEntity);

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		list.forEach((item)->{
			System.out.println(item);
		});
	}

}
