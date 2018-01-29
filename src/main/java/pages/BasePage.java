package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
    //Раздел Маркет на странице Яндекса
    @FindBy(xpath = "//a[contains(@class,'home-link')][contains(text(),'Маркет')]")
    public WebElement marketButtonElement;

    //Раздел Электроника на странице Маркета
    @FindBy(xpath = "//a[contains(@class,'topmenu__link')][contains(text(),'Электроника')]")
    public WebElement electronicsButtonElement;

    //Раздел Телевизоры на странце Электроника
    @FindBy(xpath = "//a[contains(@class,'catalog-menu__list-item')][contains(text(),'Телевизоры')]")
    public WebElement tvButtonElement;

    //Расширенный поиск
    @FindBy(xpath = "//a[contains(text(),'Перейти ко всем фильтрам')]")
    public WebElement filtrButtonElement;

    //Поле поиска минимальная цена
    @FindBy(xpath = ".//input[contains(@class,'input__control')][contains(@id,'glf-pricefrom-var')]")
    public WebElement priceFromFieldElement;

    //Флажок производитель LG
    @FindBy(xpath = ".//label[contains(@class,'checkbox__label')][contains(text(),'LG')]")
    public WebElement lgCheckBox;

    //Флажок производитель Samsung
    @FindBy(xpath = ".//label[contains(@class,'checkbox__label')][contains(text(),'Samsung')]")
    public WebElement lgSamsungBox;

    //Кнопка Показать подходящие
    @FindBy(xpath = ".//a[contains(@class,'button_action_show-filtered')]")
    public WebElement buttonShow;

    //Количество элементов на странице
    @FindBy(xpath = "//select[@class=\"select__control\"]")
    public WebElement buttonSelectControl;

    //Первыйэлемент в списке
    @FindBy(xpath = "//a[@class='n-snippet-card2__part']")
    public WebElement finalSearchElement;
}
