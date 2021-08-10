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



class Login_Steps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	@Given("The user navigate to login page")
	def user_navigate_to_loginpage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.Url)
	}

	@When("The user enters (.*) and (.*)")
	def user_enters_username_password(String Username ,String Password) {
		WebUI.setText(findTestObject('Object Repository/Regression/Login/Obj_Email'),
				GlobalVariable.Username)

		WebUI.setText(findTestObject('Object Repository/Regression/Login/Obj_Password'),
				GlobalVariable.Password)
	}

	@And("Click on the login button")
	def User_click_login_button() {
		WebUI.click(findTestObject('Object Repository/Regression/Login/Obj_Submit'))
	}

	@Then("The user will nevigate to the home page")
	def user_nevigate_homepage() {

		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Logout'))

		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Yes'))
	}



	/**
	 * Login with invalid credentials 
	 */


	@Given("User navigates to login page")
	def user_lands_on_loginpage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.Url)
	}

	@When("User enters (.*) and (.*)")
	def user_enters_username_password_as(String Username ,String Password) {
		WebUI.setText(findTestObject('Object Repository/Regression/Login/Obj_Email'),
				Username)

		WebUI.setText(findTestObject('Object Repository/Regression/Login/Obj_Password'),
				Password)
	}

	@And("User click on the login button")
	def User_clicks_on_login_button() {
		WebUI.click(findTestObject('Object Repository/Regression/Login/Obj_Submit'))
	}

	@Then("The user will see the authentication message")
	def user_see_authentication_message() {
		WebUI.verifyTextPresent('Account with this login does not exist', false)

		WebUI.takeScreenshot()

		WebUI.closeBrowser()
	}
}