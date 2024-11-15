package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(partialLinkText = "Log out")
	private WebElement LogoutLink;
	
	@FindBy(partialLinkText = "books")
	private WebElement BooksLink;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement ComputersLink;
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement ElectronicsLink;
	
	@FindBy(partialLinkText = "GiftCards")
	private WebElement GiftcardsLink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getBooksLink() {
		return BooksLink;
	}

	public WebElement getComputersLink() {
		return ComputersLink;
	}

	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}

	public WebElement getGiftcardsLink() {
		return GiftcardsLink;
	}

	}

