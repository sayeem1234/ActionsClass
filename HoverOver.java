package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {



    public void hoverOver(By locator) {
        Actions actions = new Actions(DriverWrapper2.getDriver());
        WebElement hoverOverSpot = DriverWrapper2.getDriver().findElement(locator);
        actions.moveToElement(hoverOverSpot).build().perform();
    }






}

