package com.wu.mapper;

import com.wu.entity.Cart;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartMapperTests {

    @Autowired
    private CartMapper mapper;

    @Test
    public void insert() {
        Cart cart = new Cart();
        cart.setUid(1);
        cart.setPid(2);
        cart.setNum(3);
        cart.setPrice(4L);
        Integer rows = mapper.insert(cart);
        System.err.println("rows=" + rows);
        System.err.println(cart);
    }

    @Test
    public void updateNumByCid() {
        Integer cid = 1;
        Integer num = 10;
        String modifiedUser = "admin";
        Date modifiedTime = new Date();
        Integer rows = mapper.updateNumByCid(cid, num, modifiedUser, modifiedTime);
        System.err.println("rows=" + rows);
    }

    @Test
    public void findByUidAndPid() {
        Integer uid = 1;
        Integer pid = 2;
        Cart result = mapper.findByUidAndPid(uid, pid);
        System.err.println(result);
    }

}
