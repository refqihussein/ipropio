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

WebUI.click(findTestObject('guard shift/div_Guard  Security'))

WebUI.click(findTestObject('Object Repository/guard shift/a_Guard Shift'))

WebUI.click(findTestObject('Object Repository/guard shift/a_Add New Shift'))

WebUI.setText(findTestObject('Object Repository/guard shift/input_Name_name'), 'Malam Minggu Assyi\'')

WebUI.delay(3)

WebUI.click(findTestObject('guard shift/input_Start Time_start time'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('guard shift/input_Start Time_start time'), '10:30')

WebUI.click(findTestObject('guard shift/input_End Time_end time'))

WebUI.setText(findTestObject('guard shift/input_End Time_end time'), '20 30')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/guard shift/label_Thursday'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/guard shift/button_Create Shift Now'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/guard shift/button_Delete'))

WebUI.click(findTestObject('Object Repository/guard shift/button_Yes Delete'))

WebUI.takeScreenshot()

