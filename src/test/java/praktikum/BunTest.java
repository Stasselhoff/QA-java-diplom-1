package praktikum;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Тестирование класса Bun
 */
public class BunTest extends BaseClass {

    Bun bun = new Bun(bunName, price);
    /*
    shouldGetName проверяет верно ли возвращается имя
     */
    @Test
    public void shouldGetNameTest() {
        assertEquals(bunName, bun.getName());
    }
    /*
    shouldGetPrice проверяет верное ли возвращается цена
     */
    @Test
    public void shouldGetPriceTest() {
        assertEquals(price, bun.getPrice(), 0.01);
    }
}