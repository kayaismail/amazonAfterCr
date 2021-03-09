package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
  Amazon Test Task
1.       Login olma
2.       Random kategori sayfasına git
3.       Random ürün ekleme. Stock kontrolü eklemeli. Stockta yoksa yeni bir ürün ekle.
4.       Check-out sayfasına kadar ilerle
5.       Cart sayfasına geri dönüp sepetten ürünleri çıkarma
.
 */

public class TestChrome extends BaseTest{

        @Test
        public static void amazon() {
                new MainPage(driver).openMainPage();
                Assert.assertEquals(driver.getTitle(), AllPageCollections.getMainPageTitle());
                new MainPage(driver).loginButtonClick();
                new LoginPage(driver).signIn(AllPageCollections.getCorrectMail(), AllPageCollections.getCorrectPassword());
                new MainPage(driver).findAndClick(MainPage.getBtnHamburgerLocator());
                new MainPage(driver).findAndClick(MainPage.getFullStoreDirectory());
                new MainPage(driver).ramdomClick(MainPage.getCategoriesListLocator());
                new CategoryPage(driver).ramdomClick(CategoryPage.getProductListSelector());
                new ProductDetailPage(driver).setBtnAddToCart();
                new ProductDetailPage(driver).findAndClick(ProductDetailPage.getBtnGoToCart());
                new CartPage(driver).findAndClick(CartPage.getBtnCheckout());
                new CartPage(driver).backToPage();
                new CartPage(driver).findAndClick(CartPage.getBtnDelete());

        }

}


