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

WebUI.click(findTestObject('Object Repository/Invoice Report/div_Reports'))

WebUI.click(findTestObject('Object Repository/Invoice Report/a_Invoices Transactions'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Invoice Report/input_Show_vs__search'))

WebUI.click(findTestObject('Object Repository/Invoice Report/li_10'))

WebUI.delay(9)

WebUI.scrollToPosition(0, 9999999)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.scrollToPosition(9999999, 0)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Invoice Report/input_Show_vs__search'))

WebUI.click(findTestObject('Object Repository/Invoice Report/li_20'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Invoice Report/input_Date Range_date'))

WebUI.click(findTestObject('Invoice Report/button_previous 30 days'))

WebUI.click(findTestObject('Invoice Report/a_ABC00633'))

WebUI.delay(3)

WebUI.click(findTestObject('Invoice Report/button_Email Invoice'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Invoice Report/button_Cancel Invoice'))

WebUI.delay(2)

WebUI.setText(findTestObject('Invoice Report/input__swal2-input'), 'testing12345')

WebUI.delay(3)

WebUI.click(findTestObject('Invoice Report/Page_iPropio Resident Association and Security Management/button_Cancel Invoice'))

WebUI.delay(5)

WebUI.takeScreenshot()

