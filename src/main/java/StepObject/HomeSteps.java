package StepObject;

import PageObject.HomePage;
import com.codeborne.selenide.Condition;

import static Dataobject.HomeData.*;


// აქ მოგვაქვს ელემენტები და მოგვყვავს მოქმედებაში
public class HomeSteps extends HomePage {
    public HomeSteps input1 () {
        button2.click();
        button3email.setValue(mailname);
        button4password.setValue(passwordname);
        button5.click();
        button6.click();
        button7.click();
        button8.setValue(H).pressEnter();

        return this;
    }
public void input2(){

        button9.click();
        button10.setValue(textabout);
        button11.click();


}
public void input3(){
       button12.shouldBe(Condition.visible);



}
    }

