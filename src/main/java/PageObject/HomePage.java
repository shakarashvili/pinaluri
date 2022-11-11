package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


//აქ ვწერთ ელემენტებს
public class HomePage {

   public SelenideElement

           button2 = (SelenideElement) $(byXpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/button/div/div"));



public SelenideElement
        button3email = (SelenideElement) $(by("autocomplete", "email"));

public SelenideElement
        button4password = $(by("autocomplete", "new-password"));
public SelenideElement
   button5 =$(byXpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div/div/div/div[4]/form/div[7]/button/div"));
   public SelenideElement
   button6 = $(byClassName("Hn_"));

public   SelenideElement
        button7 = $(byXpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/ul/div/div/div/div[1]/div/div[1]/div[2]"));
public SelenideElement
   button8 = $("#messageDraft");


public SelenideElement
   button9 = $(byText("Edit Profile"));
public SelenideElement
   button10 = $(by("rows", "3"));
public SelenideElement
   button11 = $(by("aria-label", "Change profile picture")),
   button12 = $(".gUZ",0);




}
