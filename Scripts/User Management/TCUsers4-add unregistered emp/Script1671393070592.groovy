import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Login-main'), [('username') : GlobalVariable.username, ('password') : GlobalVariable.password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index')

WebUI.click(findTestObject('Object Repository/User Management/TCUsers3 and TCUsers4/a_Admin'))

WebUI.click(findTestObject('Object Repository/User Management/TCUsers3 and TCUsers4/button_Add'))

WebUI.click(findTestObject('User Management/TCUsers3 and TCUsers4/userRole-select-text--arrow'))

WebUI.click(findTestObject('User Management/TCUsers3 and TCUsers4/div_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/User Management/TCUsers3 and TCUsers4/input_EmployeeName'), 'lisa')

WebUI.click(findTestObject('User Management/TCUsers3 and TCUsers4/status-select-text--arrow'))

WebUI.click(findTestObject('User Management/TCUsers3 and TCUsers4/div_Enabled'))

WebUI.setText(findTestObject('Object Repository/User Management/TCUsers3 and TCUsers4/input_Username'), 'Azizah3')

WebUI.setText(findTestObject('User Management/TCUsers3 and TCUsers4/input_Password'), 'Azizah3%')

WebUI.setText(findTestObject('User Management/TCUsers3 and TCUsers4/input_ConfirmPass'), 'Azizah3%')

WebUI.click(findTestObject('Object Repository/User Management/TCUsers3 and TCUsers4/button_Save'))

WebUI.verifyElementText(findTestObject('User Management/TCUsers3 and TCUsers4/span_Invalid'), 'Invalid')

WebUI.closeBrowser()

