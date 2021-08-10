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



class SingUP_Steps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	/**
	 * these steps for the use who click on the "Don't have an Account"
	 */
	@Given("the user navigates to the Login Page")
	def navigate_to_the_loginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.Url)
	}

	@When("the user clicks on Don't have an account option")
	def user_clicks_SingUp() {
		WebUI.click(findTestObject('Object Repository/Regression/Sign Up/Obj_DontHaveAnAccount'))
	}

	@Then("the user will navigated to the Sign Up page")
	def user_navigated_to_Signup() {
		WebUI.verifyTextPresent('Welcome', false)

		WebUI.verifyTextPresent('Please complete to create a provider account', false)
	}

	/**
	 * these steps use for registering a user
	 */

	@Given("the user navigates to the SingUp Page")
	def navigate_to_the_SignUPpage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.RegUrl)
	}
	@And("the user Enter his (.*)")
	def user_enters_FirstName(String FirstName) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_FirstName'),
				FirstName)
	}

	@And("the user Entered his (.*)")
	def user_enters_LastName(String LastName) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_LastName'),
				LastName )
	}
	@Keyword
	@And("the user set his (.*)")
	def user_set_RoomName(String RoomName) {

		//int RN = ((Math.random() * 10000) as int)

		int rand;
		rand = (int)(Math.random()*500)


		/*String chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'
		 int length = 5 ;
		 Random rand = new Random();
		 StringBuilder sb = new StringBuilder();
		 for (int i=0; i<length; i++) {
		 sb.append(chars.charAt(rand.nextInt(chars.length())));
		 }
		 return sb.toString();
		 WebUI.setText(findTes*/
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_RoomName'),"" +RoomName+ "" +rand+ "")


	}

	@And("the user enter his (.*)")
	def user_set_Email(String Email) {

		int random;
		random = (int)(Math.random()*500)


		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_Email'),"" +random+ "" +Email+ "")
	}


	@And("the user entered his (.*)")
	def user_set_Password(String Password) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_Password'),
				Password)
	}

	@And("the user confirmed his (.*)")
	def user_confirms_Passowrds(String ConfirmPassword) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_ConfirmPassword'),
				ConfirmPassword)
	}

	@And("the user clicks on the i agree button")
	def user_agree_termsConstions(){
		WebUI.click(findTestObject('Object Repository/Regression/Sign Up/Obj_IAgree'))
	}

	@And("clicks on the Singup button")
	def user_clicks_on_SingUp() {
		WebUI.click(findTestObject('Object Repository/Regression/Sign Up/Obj_SubmitButton'))
	}

	@Then("the profile of the user will be created")
	def profile_is_created() {
		println("\nthe profile of the user will be created")
	}

	@And("the user will be navigated to the Home page")
	def user_navigated_to() {
		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Logout'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Regression/Logout/Obj_Yes'))
	}


	/**
	 * Sign up With Empty Fields
	 */
	@Given("the user navigates to the Signup Page")
	def navigates_to_the_Signuppage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.RegUrl)
	}
	@And("the user clicks on the SignUp button without any information")
	def user_clicks_on_signup() {
		WebUI.click(findTestObject('Object Repository/Regression/Sign Up/Obj_IAgree'))

		WebUI.click(findTestObject('Object Repository/Regression/Sign Up/Obj_SubmitButton'))
	}

	@Then("the user will not be able to Register a user")
	def user_is_registerd() {
		println("\nthe profile of the user is not created")
	}

	@And("user will see the error messages against the fields")
	def user_will_see_error_messages() {
		WebUI.verifyTextPresent('First name is required', false)

		WebUI.verifyTextPresent('Last name is required', false)

		WebUI.verifyTextPresent('Email is required', false)

		WebUI.verifyTextPresent('Password is required', false)

		WebUI.verifyTextPresent('Password confirmation is required', false)

		WebUI.takeFullPageScreenshotAsCheckpoint('First Name')

		WebUI.takeFullPageScreenshot()
	}


	/**
	 * these steps use for registering a user with same room name
	 */

	@Given("the user navigate to the SingUp Page")
	def navigate_to_the_SignuPpage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.RegUrl)
	}
	@And("user fill his (.*)")
	def user_enters_firstname(String FirstName) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_FirstName'),
				FirstName)
	}

	@And("the user filled (.*)")
	def user_enters_lastname(String LastName) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_LastName'),
				LastName)
	}

	@And("the user Set his (.*)")
	def user_set_roomname(String RoomName) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_RoomName'),
				RoomName)
	}

	@And("user entered his (.*)")
	def user_set_email(String Email) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_Email'),
				Email)
	}

	@And("the user placed his (.*)")
	def user_set_password(String Password) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_Password'),
				Password)
	}

	@And("the user Confirmed his (.*)")
	def user_confirms_passowrds(String ConfirmPassword) {
		WebUI.setText(findTestObject('Object Repository/Regression/Sign Up/Obj_ConfirmPassword'),
				ConfirmPassword)
	}

	@And("the user Clicks on the i agree button")
	def user_agree_terms_Conditions(){
		WebUI.click(findTestObject('Object Repository/Regression/Sign Up/Obj_IAgree'))
	}

	@And("clicks on the SingUP button")
	def user_clicks_on_Singup_btton() {
		WebUI.click(findTestObject('Object Repository/Regression/Sign Up/Obj_SubmitButton'))
	}

	@Then("the user profile will not be created")
	def Profile_is_not_created() {
		println("\nthe profile of the user will be created")
		WebUI.takeScreenshot('Room name')
	}

	@And("the user will see the error on the Room name")
	def user_see_errors() {
		WebUI.click(findTestObject('Object Repository/Regression/Sign Up/Obj_RoomName'))
		WebUI.closeBrowser()
		
	
	}
}