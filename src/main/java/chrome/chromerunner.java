package chrome;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class chromerunner {
    @BeforeTest

    public void beforetest(){

        open("https://www.pinterest.com/");


    }
    @BeforeTest
    public void beforetest2(){
        open("https://www.pinterest.com/shaqarashvili25/"); // da es rogor davsva meore testze?
    }
}
