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

WebUI.maximizeWindow()

WebUI.navigateToUrl("https://budgetbakers.com/")

WebUI.click(findTestObject('Object Repository/budgetbakers/Page_Wallet by BudgetBakers - Your New Personal Finance Manager/i__eicon-close'))

WebUI.click(findTestObject('Object Repository/budgetbakers/Page_Wallet by BudgetBakers - Your New Personal Finance Manager/a_Try Web App'))

WebUI.setText(findTestObject('Object Repository/budgetbakers/Page_Wallet by BudgetBakers/input_Email_email'), "ihsankjamil@gmail.com")

WebUI.setEncryptedText(findTestObject('Object Repository/budgetbakers/Page_Wallet by BudgetBakers/input_Password_password'), "Ue6vYlRkIdi9zqAnXUwTQw==")

WebUI.click(findTestObject('Object Repository/budgetbakers/Page_Wallet by BudgetBakers/button_Log In'))

WebUI.verifyElementText(findTestObject('Object Repository/budgetbakers/Page_Wallet by BudgetBakers/span_Cash'), "Cash")

WebUI.click(findTestObject('Object Repository/budgetbakers/Page_Wallet by BudgetBakers/div_ihsankjamilgmail.comAdd voucherUpgradeSettingsLog out'))

WebUI.click(findTestObject('Object Repository/budgetbakers/Page_Wallet by BudgetBakers/div_Log out'))

WebUI.closeBrowser()