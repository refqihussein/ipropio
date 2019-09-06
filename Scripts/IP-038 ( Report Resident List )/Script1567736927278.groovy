import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('IP-001 (Login hit berkali kali)'), [('Email') : 'aaa@gmail.com', ('Password') : '123445656'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Report Resident list/div_Reports'))

WebUI.click(findTestObject('Object Repository/Report Resident list/a_Resident List'))

WebUI.delay(0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Report Resident list/td_test resident 2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Report Resident list/button_Edit Resident Data'))

WebUI.setText(findTestObject('Report Resident list/input__first name'), 'testing')

WebUI.setText(findTestObject('Report Resident list/input__last name'), 'resident 3')

WebUI.setText(findTestObject('Report Resident list/input_House Telephone Number_house-telephone-number'), '021222222')

WebUI.delay(0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Report Resident list/button_Save Resident Data'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Report Resident list/button_Back'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Report Resident list/button_Assign'))

WebUI.click(findTestObject('Report Resident list/button_Yes Assign'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Report Resident list/button_Delete'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Report Resident list/button_Yes Delete'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

