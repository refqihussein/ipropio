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

WebUI.click(findTestObject('Object Repository/admin collection/div_Reports'))

WebUI.click(findTestObject('admin collection/a_Admin Collections'))

WebUI.click(findTestObject('admin collection/input_Admin Name_vs__search'))

WebUI.click(findTestObject('Object Repository/admin collection/li_Keith'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('admin collection/input_Admin Name_vs__search'))

WebUI.click(findTestObject('Object Repository/admin collection/li_Emerson'))

WebUI.click(findTestObject('admin collection/input_Admin Name_vs__search'))

WebUI.click(findTestObject('Object Repository/admin collection/li_Saudara'))

WebUI.click(findTestObject('admin collection/input_Admin Name_vs__search'))

WebUI.click(findTestObject('Object Repository/admin collection/li_iprop'))

WebUI.click(findTestObject('admin collection/input_Admin Name_vs__search'))

WebUI.click(findTestObject('Object Repository/admin collection/li_jumat'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('admin collection/input_Date Range_date'))

WebUI.click(findTestObject('Object Repository/admin collection/button_previous 30 days'))

WebUI.click(findTestObject('admin collection/input_All_vs__search'))

WebUI.click(findTestObject('Object Repository/admin collection/li_In-Hand'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.closeBrowser()

