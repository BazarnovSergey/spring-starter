package com.dmdev.spring.integration.service;

import com.dmdev.spring.database.pool.ConnectionPool;
import com.dmdev.spring.integration.IntegrationTestBase;
import com.dmdev.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

@RequiredArgsConstructor
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class UserServiceIT extends IntegrationTestBase {

    private UserService userService;
    private final ConnectionPool pool1;

    @Test
    void test() {
        System.out.println();
    }
}
