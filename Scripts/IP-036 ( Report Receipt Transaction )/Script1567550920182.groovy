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

WebUI.click(findTestObject('receipt transactions/div_Reports'))

WebUI.delay(2)

WebUI.click(findTestObject('receipt transactions/a_Receipts Transactions'))

WebUI.click(findTestObject('receipt transactions/input_Date Range_date'))

WebUI.delay(3)

WebUI.click(findTestObject('receipt transactions/button_previous 30 days'))

WebUI.delay(3)

WebUI.setText(findTestObject('receipt transactions/input_Receipt Number___BVID__176'), 'CBA00021')

WebUI.clearText(findTestObject('receipt transactions/input_Receipt Number___BVID__176'))

WebUI.click(findTestObject('receipt transactions/input_All_vs__search'))

WebUI.click(findTestObject('receipt transactions/li_Cash'))

WebUI.click(findTestObject('receipt transactions/a_cash too00023'))

WebUI.delay(3)

WebUI.click(findTestObject('receipt transactions/button_Email Receipt'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('receipt transactions/button_Cancel Receipt'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('receipt transactions/input_Enter your password to continue_swal2-input'), 'testing12345')

WebUI.click(findTestObject('receipt transactions/button_Yes Cancel'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

