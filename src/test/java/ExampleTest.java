import org.testng.Assert;
import org.testng.annotations.*;

public class ExampleTest {
//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("Этот метод должен выполниться один раз перед запуском тестового класса");
//    }
//
//    @AfterClass
//    public void afterClass() {
//        System.out.println("Этот метод должен выполниться один раз после запуска тестового класса");
//    }
//
    @BeforeMethod(onlyForGroups = {"group"})
    public void beforeMethod() {
        System.out.println("Этот метод должен выполниться каждый раз перед запуском каждого теста");
    }

    @AfterMethod(onlyForGroups = {"group"})
    public void afterMethod() {
        System.out.println("Этот метод должен выполниться каждый раз после запуска каждого теста");
    }
//
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("Этот метод должен выполниться один раз перед запуском всех тестов");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.println("Этот метод должен выполниться один раз после запуска всех тестов");
//    }

    @Test(groups = {"group"}, priority = 1)
    public void sum1() {
        Example example = new Example();
        Assert.assertEquals(example.sum(4, 3), 7);
        System.out.println("Это первый тест");
    }

    @Test(priority = 2)
    public void sum2() {
        Example example = new Example();
        Assert.assertEquals(example.sum(5, 5), 10);
        System.out.println("Это второй тест");
    }

    @Test(priority = 3, dependsOnMethods = {"sum1"})
    public void sum3() {
        Example example = new Example();
        Assert.assertEquals(example.sum(8, 7), 15);
        System.out.println("Это третий тест");
    }

    @Test(groups = {"group"}, priority = 4, invocationCount = 5, invocationTimeOut = 10)
    public void sum4() {
        Example example = new Example();
        Assert.assertEquals(example.sum(10, 23), 33);
        System.out.println("Это четвертый тест");
    }

    @Test(expectedExceptions = {ArithmeticException.class})
    public void test5() {
        int x = 4/0;
    }

    @Test
    @Parameters({"x", "y", "z"})
    public void paramTest(String x, String y, String z) {
        int xx = Integer.parseInt(x);
        int yy = Integer.parseInt(y);
        int zz = Integer.parseInt(z);

        Example example = new Example();
        Assert.assertEquals(example.sum(xx, yy), zz);
    }
}
