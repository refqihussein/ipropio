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

WebUI.click(findTestObject('Object Repository/Report Property List/div_Reports'))

WebUI.click(findTestObject('Report Property List/a_Property List'))

WebUI.setText(findTestObject('Report Property List/input_House Number___BVID__171'), '2')

WebUI.clearText(findTestObject('Report Property List/input_House Number___BVID__171'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Report Property List/input_Street Name_vs__search'))

WebUI.click(findTestObject('Report Property List/li_Jl Mentari Bersinar'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Report Property List/input_Street Name_vs__search'))

WebUI.delay(1)

WebUI.click(findTestObject('Report Property List/input_Property Type_vs__search'))

WebUI.click(findTestObject('Report Property List/li_Bungalow'))

WebUI.takeScreenshot()

WebUI.clearText(findTestObject('Report Property List/input_Property Type_vs__search'))

WebUI.delay(1)

WebUI.click(findTestObject('Report Property List/input_Property Status_vs__search'))

WebUI.click(findTestObject('Report Property List/li_Resident'))

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Report Property List/input_Property Status_vs__search'))

WebUI.click(findTestObject('Object Repository/Report Property List/li_No Resident'))

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Report Property List/a_Edit'))

WebUI.click(findTestObject('Report Property List/input_Bungalow_vs__search'))

WebUI.click(findTestObject('Report Property List/li_Bungalow'))

WebUI.click(findTestObject('Object Repository/Report Property List/button_Update Property Details'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

