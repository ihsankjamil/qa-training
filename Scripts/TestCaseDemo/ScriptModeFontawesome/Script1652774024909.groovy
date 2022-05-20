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


WebUI.openBrowser("")

WebUI.navigateToUrl("https://fontawesome.com/")

WebUI.click(findTestObject('Object Repository/Fontawesome/Page_Font Awesome/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Fontawesome/Page_Font Awesome/input_Email Address_email_address'), "ihsankjamil@gmail.com")

WebUI.setEncryptedText(findTestObject('Object Repository/Fontawesome/Page_Font Awesome/input_Password_password'), "Ue6vYlRkIdi9zqAnXUwTQw==")

WebUI.click(findTestObject('Object Repository/Fontawesome/Page_Font Awesome/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Fontawesome/Page_Font Awesome/a_Your Account'))

WebUI.verifyTextPresent("Thanks for using Font Awesome", false)

WebUI.click(findTestObject('Object Repository/Fontawesome/Page_Font Awesome/button_Sign Out'))

WebUI.closeBrowser()