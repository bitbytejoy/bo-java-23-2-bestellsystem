package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductRepoTest {
    @Test
    public void get_when1_thenBrot() {
        // given
        ProductRepo productRepo = new ProductRepo();

        // when
        Product actual = productRepo.get("1");

        // then
        Assertions.assertEquals(new Product("1", "Brot"), actual);
    }
}