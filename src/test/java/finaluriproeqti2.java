import StepObject.HomeSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;
@Listeners(org.example.Utils.TestLister.class)
public class finaluriproeqti2 {

    SoftAssert soft = new SoftAssert();
    @Test
    @Description("შემყავს მონაცემები და ვაგზავნი ესმესს")
    @Severity(SeverityLevel.BLOCKER)

    public void fina1 (){
        open("https://www.pinterest.com/");
        HomeSteps steps = new HomeSteps();
        steps.input1();
sleep(2000);
    }
    @Test
    @Description("შემყავს ტექსტი და ვტვირთავ ფოტოს")
    @Severity(SeverityLevel.BLOCKER)
    public  void fina2() {
        open("https://www.pinterest.com/shaqarashvili25/");
        HomeSteps steps = new HomeSteps();
        steps.input2();
        File file = $("#file-input").uploadFile(new File("C:\\Users\\Gio\\Desktop\\DSC_1608.jpg"));

    }
    @Test
    @Description("ვამოწმებ ფერებს და ფონტებს")
    @Severity(SeverityLevel.NORMAL)

    public void fina3(){
        open("https://www.pinterest.com/");
    HomeSteps steps = new HomeSteps();

steps.input3();
    Assert.assertEquals($(".gUZ",0).getCssValue("color"),"rgba(204, 0, 0, 1)");
    Assert.assertEquals($(".tBJ",0).getCssValue("font-size"),"16px");
    soft.assertAll();
    sleep(5000);
}
}
