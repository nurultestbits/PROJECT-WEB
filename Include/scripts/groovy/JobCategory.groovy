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


class JobCategory {

	@Given("I login to OrangeHRM successfully")
	def I_login_to_OrangeHRM_successfully() {

		WebUI.callTestCase(findTestCase('Login/Login-main'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password],
		FailureHandling.STOP_ON_FAILURE)
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index')
	}

	@When("I click tab admin")
	def I_click_tab_admin() {

		WebUI.click(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/a_Admin'))
	}

	@And("I click Job list and select Job Categories")
	def I_click_Job_list_and_select_Job_Categories() {

		WebUI.click(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/i_Job_oxd-icon bi-chevron-down'))
		WebUI.click(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/li_Job Categories'))
	}

	@And("I click Add button")
	def I_click_Add_button() {

		WebUI.click(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/button_Add'))
	}

	@And("I enter Job Name (.*) and click Save")
	def I_enter_Job_Name_and_click_Save(String jobName) {

		WebUI.setText(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/input_Name'), jobName)
		WebUI.click(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/button_Save'))
	}

	@Then("I should be able to add new category successfully")
	def I_should_be_able_to_add_new_category_successfully() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/div_SuccessSuccessfully Saved'))
		WebUI.closeBrowser()
	}

	@And("I enter existing Job Name (.*)")
	def I_enter_existing_Job_Name(String jobName) {

		WebUI.setText(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/input_Name'), jobName)
	}

	@Then("I should NOT be able to add new category")
	def I_should_NOT_be_able_to_add_new_category() {

		WebUI.verifyElementText(findTestObject('Object Repository/Job Category/TCCategory1 and TCCategory2/span_Already exists'),
		'Already exists')
		WebUI.click(findTestObject('Job Category/TCCategory1 and TCCategory2/button_Cancel'))
	}

	@And("I mark the job category to be deleted and click delete button")
	def I_mark_the_job_category_to_be_deleted_and_click_delete_button() {

		WebUI.click(findTestObject('Object Repository/Job Category/TCCategory3/tick_CategoryDelete'))
		WebUI.click(findTestObject('Object Repository/Job Category/TCCategory3/button_Delete Selected'))
	}

	@And("I click delete button and select yes")
	def I_click_delete_button_and_select_yes() {

		WebUI.click(findTestObject('Object Repository/Job Category/TCCategory3/button_Yes, Delete'))
	}
	
	@Then("The job category successfully deleted")
	def The_job_category_successfully_deleted() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/Job Category/TCCategory3/p_Successfully Deleted'))
		WebUI.closeBrowser()
	}
}