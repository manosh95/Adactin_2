package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.adactin.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookHotel;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Before
	public void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("scenario :" + name);
	}

	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("   status:" + status);
		if (scenario.isFailed()) {
			takesScreenShot(scenario.getName());
		}

	}

	/////////////////////////// scenario 1 ////////////////////////////////

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		// driver = getBrowser("chrome");
		// getUrl("https://adactinhotelapp.com/");

		// ConfigurationReader cr =new ConfigurationReader();
		// String urlname = cr.getUrlName();
		// getUrl(urlname);

		String urlName = FileReaderManager.getInstance().getCrInstance().getUrlName();
		getUrl(urlName);
	}

	/*
	 * @When("^user enter the valid username in the username field$") public void
	 * user_enter_the_valid_username_in_the_username_field() throws Throwable {
	 * HomePage hp = new HomePage(driver); InputToWebelement(hp.getUsernmae(),
	 * "manosh95");
	 * 
	 * }
	 * 
	 * @When("^user  enter the valid password in the password field$") public void
	 * user_enter_the_valid_password_in_the_password_field() throws Throwable {
	 * HomePage hp = new HomePage(driver); InputToWebelement(hp.getPassword(),
	 * "manosh95");
	 * 
	 * }
	 */
	@When("^user enter the valid \"([^\"]*)\" in the username field$")
	public void user_enter_the_valid_in_the_username_field(String username) throws Throwable {
		// HomePage hp =new HomePage(driver);
		// InputToWebelement(hp.getUsernmae(), username);
		InputToWebelement(pom.getHp().getUsernmae(), username);

	}

	@When("^user  enter the valid \"([^\"]*)\" in the password field$")
	public void user_enter_the_valid_in_the_password_field(String password) throws Throwable {
		HomePage hp = new HomePage(driver);
		InputToWebelement(hp.getPassword(), password);

	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		HomePage hp = new HomePage(driver);
			clickOnWebElement(hp.getSubmit());
		}
			
		
    @Then("^user verify home page navigate to search hotel page$")
	public void user_verify_home_page_navigate_to_search_hotel_page() throws Throwable {
     String title = driver.getTitle();
     System.out.println(title);
     if (title.equalsIgnoreCase("Adactin.com - Search Hotel")) {
		System.out.println("login sucess");
		
	}
     
	}
	/////////////////////////////////// scenario 2 ////////////////////////////

	@When("^user select the location in location field$")
	public void user_select_the_location_in_location_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		dropDown(sh.getLocation(), "Melbourne", "text");

	}

	@When("^user select the hotel in hotel field$")
	public void user_select_the_hotel_in_hotel_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		dropDown(sh.getHotel(), "Hotel Sunshine", "text");

	}

	@When("^user select the room type in Room type field$")
	public void user_select_the_room_type_in_Room_type_field() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		dropDown(sh.getRoomtype(), "Double", "text");

	}

	@When("^user select the number of rooms$")
	public void user_select_the_number_of_rooms() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		dropDown(sh.getRoomno(), "3 - Three", "text");

	}

	@When("^user select the check in date$")
	public void user_select_the_check_in_date() throws Throwable {
		//SearchHotel sh = new SearchHotel(driver);
		//sh.getCheckin().clear();
		pom.getSh().getCheckin().clear();
		//InputToWebelement(sh.getCheckin(), "16/03/2021");
		InputToWebelement(pom.getSh().getCheckin(),"16/03/2021");

	}

	@When("^user select the check out date$")
	public void user_select_the_check_out_date() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		sh.getCheckout().clear();
		InputToWebelement(sh.getCheckout(), "17/03/2021");
	}

	@When("^user select the adult per room$")
	public void user_select_the_adult_per_room() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		dropDown(sh.getAdaultroom(), "2 - Two", "text");

	}

	@When("^user select the child per room$")
	public void user_select_the_child_per_room() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		dropDown(sh.getChildroom(), "2 - Two", "text");

	}

	@When("^user click the search button to search the page$")
	public void user_click_the_search_button_to_search_the_page() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		clickOnWebElement(sh.getSubmit());

	}

	@Then("^user verify search page naviagte the select hotel page$")
	public void user_verify_search_page_naviagte_the_select_hotel_page() throws Throwable {
		//Assert.assertEquals("A", "a");

	}
	//////////////////////////////// Scenario 3 //////////////////////////

	@When("^verify the user given data and click the Radio button$")
	public void verify_the_user_given_data_and_click_the_Radio_button() throws Throwable {
		SelectHotel sl = new SelectHotel(driver);
		clickOnWebElement(sl.getRadioclick());

	}

	@When("^user click the continue button$")
	public void user_click_the_continue_button() throws Throwable {
		SelectHotel sl = new SelectHotel(driver);
		clickOnWebElement(sl.getClicksearch());

	}

	@Then("^user verify select hotel page to book hotel page$")
	public void user_verify_select_hotel_page_to_book_hotel_page() throws Throwable {
		//Assert.assertEquals("B", "b");
	}

///////////////////////////// Scenario 4 //////////////////////////

	@When("^user enter the valid first name in first nname field$")
	public void user_enter_the_valid_first_name_in_first_nname_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		InputToWebelement(bh.getFirstName(), "manosh");

	}

	@When("^user enter the valid last name in last name field$")
	public void user_enter_the_valid_last_name_in_last_name_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		InputToWebelement(bh.getLastname(), "manu");

	}

	@When("^user enter billing address in address column$")
	public void user_enter_billing_address_in_address_column() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		InputToWebelement(bh.getAddress(), "oldwashermenpet");

	}

	@When("^user enter the cc no in cc column$")
	public void user_enter_the_cc_no_in_cc_column() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		InputToWebelement(bh.getCcnum(), "9876543211234567");

	}

	@When("^user select the card type in type column$")
	public void user_select_the_card_type_in_type_column() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		dropDown(bh.getCctype(), "VISA", "text");

	}

	@When("^user select the month of expiry date field$")
	public void user_select_the_month_of_expiry_date_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		dropDown(bh.getExpmonth(), "December", "text");

	}

	@When("^user select the year of expiry date field$")
	public void user_select_the_year_of_expiry_date_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		dropDown(bh.getExpyear(), "2022", "text");

	}

	@When("^user enter the cvv number of cvv field$")
	public void user_enter_the_cvv_number_of_cvv_field() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		InputToWebelement(bh.getCvvno(), "333");

	}

	@When("^user click the booknow button to book now page$")
	public void user_click_the_booknow_button_to_book_now_page() throws Throwable {
		BookHotel bh = new BookHotel(driver);
		clickOnWebElement(bh.getClickbooknow());

	}

	@Then("^user verify the book page navigate to booked itineray page$")
	public void user_verify_the_book_page_navigate_to_booked_itineray_page() throws Throwable {
	
	}

}
