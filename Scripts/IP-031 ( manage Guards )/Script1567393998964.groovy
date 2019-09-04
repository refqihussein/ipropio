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

WebUI.click(findTestObject('Object Repository/Manage Guards/div_Guard  Security'))

WebUI.click(findTestObject('Object Repository/Manage Guards/a_Manage Guards'))

WebUI.click(findTestObject('Object Repository/Manage Guards/a_Add New Guard'))

WebUI.setText(findTestObject('Object Repository/Manage Guards/input__first name'), 'Henry')

WebUI.setText(findTestObject('Object Repository/Manage Guards/input__last name'), 'Messi')

WebUI.setText(findTestObject('Object Repository/Manage Guards/input_land Islands_mobile number'), '0812191633333')

WebUI.setText(findTestObject('Object Repository/Manage Guards/input__email'), 'bb@gmail.com')

WebUI.click(findTestObject('Object Repository/Manage Guards/img'))

WebUI.setText(findTestObject('Object Repository/Manage Guards/input_Staff ID_staff_id'), '0003')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Manage Guards/span_Guard'))

WebUI.click(findTestObject('Object Repository/Manage Guards/li_Guard'))

WebUI.click(findTestObject('Object Repository/Manage Guards/button_Generate PIN'))

WebUI.click(findTestObject('Object Repository/Manage Guards/button_Create Guard Now'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Manage Guards/button_Delete'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Manage Guards/button_Yes Delete'))

WebUI.takeScreenshot()

