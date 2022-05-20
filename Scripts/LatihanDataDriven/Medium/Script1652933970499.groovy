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

WebUI.navigateToUrl('https://medium.com/')

WebUI.click(findTestObject('Object Repository/latihanmedium/Page_Medium  Where good ideas find you/a_Sign In'))

WebUI.click(findTestObject('Object Repository/latihanmedium/Page_Medium  Where good ideas find you/b_Create one'))

WebUI.click(findTestObject('Object Repository/latihanmedium/Page_Medium  Where good ideas find you/div_Sign up with email'))

WebUI.setText(findTestObject('Object Repository/latihanmedium/Page_Medium  Where good ideas find you/input_Your email_ou ov ow ox oy oz pa pb pc_b45929'), 
    username)

WebUI.click(findTestObject('Object Repository/latihanmedium/Page_Medium  Where good ideas find you/button_Continue'))

WebUI.closeBrowser()

