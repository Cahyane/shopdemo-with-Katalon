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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Tokyo Talkies'))

WebUI.click(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Tokyo Talkies  ToolsQA Demo Site/a_View cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'widya')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'cahyani')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_India'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'maju terus')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2'), 'jakarta')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'bunga')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_Select an option'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_DKI Jakarta'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '10010')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '0123456')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'cahyaniwidya5@gmail.com')

WebUI.scrollToElement(findTestObject('Page_Checkout  ToolsQA Demo Site/h1_Checkout'), 50)

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/h1_Checkout'), 'CHECKOUT')

WebUI.closeBrowser()

