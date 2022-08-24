package Lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Lesson14Test {
    private Lesson14 lesson14;

    @BeforeEach
    void setUp() {
        lesson14 = new Lesson14();
    }

    @Test
    @DisplayName("Test 1 convertArray")
    void test1ConvertArray(){
        Assertions.assertArrayEquals(new Integer[]{1, 7}, lesson14.convertArray(1, 7, 2, 2, 3, 5));
    }

    @Test
    @DisplayName("Test 2 convertArray")
    void test2ConvertArray(){
        Assertions.assertArrayEquals(new Integer[]{2, 6}, lesson14.convertArray(2, 5, 3, 4, 2, 6));
    }

    @Test
    @DisplayName("convertArray. Test array = null")
    public void checkNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Integer[] array = new Integer[0];
            lesson14.convertArray(array);
        });
    }

    @Test
    @DisplayName("convertArray. The array does not have 4")
    public void checkNot4() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            lesson14.convertArray(1, 2, 3, 5);
        });
    }

    @Test
    @DisplayName("Test 1 checkArray")
    void test1CheckArray(){
        Assertions.assertTrue(lesson14.checkArray(1, 1, 1, 4, 4, 1, 4, 4));
    }

    @Test
    @DisplayName("Test 2 checkArray")
    void test2CheckArray(){
        Assertions.assertFalse(lesson14.checkArray(1, 1, 1, 1, 1, 1));
    }

    @Test
    @DisplayName("Test 3 checkArray")
    void test3CheckArray(){
        Assertions.assertFalse(lesson14.checkArray(4, 4, 4, 4));
    }


    @Test
    @DisplayName("Test 4 checkArray")
    void test4CheckArray(){
        Assertions.assertFalse(lesson14.checkArray(1, 4, 4, 1, 1, 4, 3));
    }

}