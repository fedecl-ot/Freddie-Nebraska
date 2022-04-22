import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class protonEmailVerify {

	/*************
	 * Objects
	 *************/

	private TestObject inputUsername	= findTestObject('Page_ProtonEmail/Page_Proton Account/input_username')
	private TestObject inputPassword	= findTestObject('Page_ProtonEmail/Page_Proton Account/input_password')
	private TestObject checkboxStay		= findTestObject('Page_ProtonEmail/Page_Proton Account/checkbox_staySignedIn')
	private TestObject btnLogin			= findTestObject('Page_ProtonEmail/Page_Proton Account/button_login')
	private TestObject newEmailMsj		= findTestObject('Page_ProtonEmail/Page_Bandeja de entrada  freddie41testingproton.me  ProtonMail/new_email_obj')
	private TestObject clickHereLink	= findTestObject('Page_ProtonEmail/Page_Bandeja de entrada  freddie41testingproton.me  ProtonMail/a_Click Here')

	/*************
	 * Inputs
	 *************/
	@Keyword
	def enterUsername (String username) {
		WebUI.waitForElementVisible(inputUsername, 0)
		WebUI.sendKeys(inputUsername, username)
	}

	@Keyword
	def enterPassword (String pwd) {
		WebUI.waitForElementVisible(inputPassword, 0)
		WebUI.sendKeys(inputPassword, pwd)
	}

	/*************
	 * Buttons
	 *************/
	@Keyword
	def clickOnLoginBtn () {
		WebUI.waitForElementVisible(btnLogin, 10)
		WebUI.click(btnLogin)
	}

	/*************
	 * Checkboxes
	 *************/
	@Keyword
	def clickOnStayCheckbox () {
		WebUI.waitForElementVisible(checkboxStay, 10)
		WebUI.click(checkboxStay)
	}

	/*********************
	 * Click Elements
	 ********************/
	@Keyword
	def openEmailMsj () {
		WebUI.waitForElementVisible(newEmailMsj, 10)
		WebUI.click(newEmailMsj)
	}

	@Keyword
	def clickOnVerifyLink () {
		WebUI.waitForElementVisible(clickHereLink, 10)
		WebUI.click(clickHereLink)
	}
}
