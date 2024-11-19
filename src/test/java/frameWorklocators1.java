import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class frameWorklocators1 extends FrameWork{
	@FindBy(xpath="//span[@class='Icon-styled__Icon-sc-4f97ed13-1 losMOV']")
	WebElement close;
	
	@FindBy(xpath="//span[@class='Icon-styled__Icon-sc-4f97ed13-1 losMOV']")
	WebElement close1;
	
	@FindBy(xpath="//button[@aria-label='Log In']")
	WebElement button;
 
	@FindBy(id="login_email")
	WebElement txtemail1;
 
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[@class='Button-styled__Button-sc-faa870ce-0 gnkLuW']")
	WebElement login;
	
	@FindBy(xpath="(//span[@class=\"Icon-styled__Icon-sc-4f97ed13-1 losMOV\"])[2]")
	WebElement close2;
	
	@FindBy(xpath="(//span[@size='22'])[2]")
	WebElement search;
	
	@FindBy(id="search")
	WebElement searchText;
	
	@FindBy(partialLinkText = "See All Results")
	WebElement seeAll;
	
	@FindBy(partialLinkText = "Women's Air Slub V-Neck T-Shirt 3-Pack")
	WebElement seeDetails;
	
	@FindBy(xpath="//button[@data-label='add_to_bag_button']")
	WebElement addToCart;
	
	@FindBy(xpath="//span[@class=\"Puck-styled__Hexagon-sc-3d83cca5-1 eGSpPc\"]")
	WebElement seeCart;
	
	@FindBy(partialLinkText = "Checkout")
	WebElement checkout;
	
	public void verifyclose()
	{
		close.click();
	}
	
	public void verifyclose1()
	{
		close1.click();
	}
	
	public void verifyloginClick()
	{
		button.click();
	}
	public void verifyEmail1(String str)
	{
		txtemail1.sendKeys(str);
	}
	public void verifyPassword(String str)
	{
		txtpassword.sendKeys(str);
	}
	public void verifyClicj()
	{
		login.click();
	}
	public void verifyclose2()
	{
		close2.click();
	}
	public void verifysearchClick()
	{
		search.click();
	}
	public void verifysearchText(String str)
	{
		searchText.sendKeys(str);
	}
	public void verifyseeAllClick()
	{
		seeAll.click();
	}
	
	public void verifyseeDatailsClick()
	{
		seeDetails.click();
	}
	
	public void verifyaddToCartClick()
	{
		addToCart.click();
	}
	
	public void verifyseeCartClick()
	{
		seeCart.click();
	}
	
	public void verifycheckoutClick()
	{
		checkout.click();
	}

}


