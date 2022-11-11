import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.Utils.Retry;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


@Listeners(org.example.Utils.TestLister.class)
public class finaluriproeqti  {

    SoftAssert soft = new SoftAssert();

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.BLOCKER)
    @Description("შემყავს მონაცემები")

    public void test1() {

//გადავდივარ საიტზე , შემყავს მონაცემები და შევდივარ პროფილზე .
//ვამოწმებ რომ შესვლის ღილაკი ჩანს
        open("https://www.pinterest.com/");
//        $(by("aria-disabled","false")).scrollIntoView(false);
//        sleep(40000);
//        $("#my-button").scrollIntoView(false);

        $(byClassName("tBJ")).shouldBe(Condition.visible);
        $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/button/div/div")).click();
        $(by("autocomplete", "email")).setValue("shaqarashvili25@gmail.com");

        $(by("autocomplete", "new-password")).setValue("shaqarashvili.25");
        $(byXpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[4]/form/div[7]/button/div")).click();
        sleep(10000);
        $(byClassName("Hn_")).shouldBe(Condition.visible);
        $(byClassName("Hn_")).click();


        $(byXpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/ul/div/div/div/div[1]/div/div[1]/div[2]")).click();
        $("#messageDraft").setValue("Hello").pressEnter();


    }

    @Test
    public void test2() {
// გადავდივარ ჩემს პროფილზე და ედითში ვწერ ინფორმაციას
// და ვცვლი ფოტოს
        open("https://www.pinterest.com/shaqarashvili25/");

        $(byText("Edit Profile")).click();

        $(by("rows", "3")).setValue("Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work. And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it. — Steve Jobs");
        $(by("aria-label", "Change profile picture")).click();

        File file = $("#file-input").uploadFile(new File("C:\\Users\\Gio\\Desktop\\DSC_1608.jpg"));
sleep(50000);
    }

    @Test
    public void test3() {
// გადავდივარ მთავარ გვერდზე
// და ვამოწმებ მარცხენა ზედა ჰოუმის ფერს , ნაწერის ზომას და მოკლედ სთაილებს .
        open("https://www.pinterest.com/");
        $(".gUZ",0).shouldBe(Condition.visible);
        Assert.assertEquals($(".gUZ",0).getCssValue("color"),"rgba(204, 0, 0, 1)");
        Assert.assertEquals($(".tBJ",0).getCssValue("font-size"),"16px");

        soft.assertAll();
        sleep(5000);


    }
//    @Test
//public void testExcel() throws IOException, BiffException{
//        String exe = "files/fina.xlsx";
//        FileInputStream ex = new FileInputStream(exe);
//        Workbook book = Workbook.getWorkbook(ex);
//        Sheet sheet = book.getSheet("Sheet2");
//
//        int rows = sheet.getRows();
//        for (int i = 1; i < rows ; i++){
//            System.out.println(sheet.getCell(2,i).getContents());
        }






