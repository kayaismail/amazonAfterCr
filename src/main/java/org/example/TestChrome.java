package org.example;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.InvocationTargetException;

/*
  Amazon Test Task
1.  http://www.amazon.com sitesine gidecek ve anasayfanın açıldığını assertion ile onaylayacak,
 2. Login ekranını açıp, bir kullanıcı ile login olunacak ( daha önce siteye üyeliği varsa o olabilir )
3. Ekranin ustundeki Search alanına 'samsung' yazıp ara butonuna tıklanacak,
4. Gelen sayfada samsung icin sonuc bulunduğunu onaylayacak,
5. Arama sonuçlarından 2. sayfaya tıklayacak ve açılan sayfada 2. sayfanin şu an gösterimde oldugunu onaylayacak,
6. Üstten 3. urunun içindeki 'Add to List' butonuna tıklayacak,
7. Ekranin en üstündeki 'List' linkine tiklayacak içerisinden Wish listi seçecek,
8. Acilan sayfada bir onceki sayfada izlemeye alinmis urunun bulundugunu onaylayacak,
9. Favorilere alinan bu urunun yanindaki 'Delete' butonuna basarak, favorilerimden cikaracak,
10. Sayfada bu urunun artik favorilere alinmadigini onaylayacak.
 */

public class TestChrome extends BaseTest
{
        @Test
        public static void amazon() throws InterruptedException{
                new MainPage(driver).openMainPage();
                Assert.assertEquals(driver.getTitle(), AllPageCollections.getMainPageTitle());   //step 1 end
                new MainPage(driver).loginButtonClick();
                new LoginPage(driver).signIn(AllPageCollections.getCorrectMail(), AllPageCollections.getCorrectPassword());//step 2 end
                new MainPage(driver).search(AllPageCollections.getSearchWords()); //step3 end
                JavascriptExecutor jse = (JavascriptExecutor)driver;
                jse.executeScript("window.scrollBy(0,5200)");
                new CategoryPage(driver).selectPage(); //step5 end
                new CategoryPage(driver).selectProduct(); //step 6 end
                new ProductDetailPage(driver).addCrateSelectList();  //step 7 end
                new ListPage(driver).removeList();  // stap 9 end



        }

}


