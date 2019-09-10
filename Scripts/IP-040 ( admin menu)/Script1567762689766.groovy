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

WebUI.click(findTestObject('Object Repository/admin menu/a_Admins'))

WebUI.click(findTestObject('Object Repository/admin menu/button_Actions'))

WebUI.click(findTestObject('Object Repository/admin menu/a_Edit'))

WebUI.setText(findTestObject('Object Repository/admin menu/input__first name'), 'tesq')

WebUI.setText(findTestObject('Object Repository/admin menu/input__last name'), 'otomasi')

WebUI.setText(findTestObject('Object Repository/admin menu/input_House Telephone Number_house_telephone'), '09292929292')

WebUI.setText(findTestObject('Object Repository/admin menu/input__email'), 'aaa@gmail.com')

WebUI.click(findTestObject('Object Repository/admin menu/button_Save Admin Details'))

WebUI.setText(findTestObject('Object Repository/admin menu/input__email'), 'aaaaaa@gmail.com')

WebUI.click(findTestObject('Object Repository/admin menu/button_Save Admin Details'))

WebUI.delay(6)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/admin menu/button_Actions'))

WebUI.delay(4)

WebUI.takeScreenshot()

WebUI.click(findTestObject('admin menu/a_Delete'))

WebUI.delay(5)

WebUI.click(findTestObject('admin menu/button_Yes Delete'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

