package default_package
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Logout_Steps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("The user navigate to sign in page")
	def User_navigate_to_the_sign_in_page() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.Url)
	}

	@When("The user is going to enter (.*) and (.*)")
	def the_user_enters_username_password_info(String Username ,String Password) {
		WebUI.setText(findTestObject('Object Repository/Regression/Login/Obj_Email'),
				GlobalVariable.Username)

		WebUI.setText(findTestObject('Object Repository/Regression/Login/Obj_Password'),
				GlobalVariable.Password)
	}

	@And("Click on the Sign in button")
	def User_click_sign_in_button() {
		WebUI.click(findTestObject('Object Repository/Regression/Login/Obj_Submit'))
	}

	@And("The user will be nevigated to the home page")
	def the_provider_nevigate_home() {
	}


	@Then('The user clicked on the logout button')
	def the_user_click_the_logout() {

		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Logout'))
	}


	@And('The user click on the Yes button')
	def The_User_click_Yes_button() {

		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Yes'))
		WebUI.delay(5)
	}


	// User click on the logout button then cancel confirmation.

	@Given("The user navigates to the login page")
	def user_navigates_to_Loginpage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.Url)
	}

	@When("The user enter the (.*) and (.*)")
	def user_enter_the_username_and_password(String Username ,String Password) {
		WebUI.setText(findTestObject('Object Repository/Regression/Login/Obj_Email'),
				GlobalVariable.Username)

		WebUI.setText(findTestObject('Object Repository/Regression/Login/Obj_Password'),
				GlobalVariable.Password)
	}

	@And("The user click on the login button")
	def User_click_Login_on_button() {
		WebUI.click(findTestObject('Object Repository/Regression/Login/Obj_Submit'))
	}

	@And("The user nevigates to the home")
	def user_nevigates_to_the_homepage() {


	}
	@Then('User click on the logout button')
	def User_click_on_Logout_button() {

		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Logout'))
	}


	@And('The user clicks on the Cancel button')
	def User_click_Cancel_button() {

		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Cancel'))
	}

}