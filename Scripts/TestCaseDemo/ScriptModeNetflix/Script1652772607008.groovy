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

WebUI.navigateToUrl("netflix.com")

WebUI.click(findTestObject('Object Repository/Netflix/Page_Netflix Indonesia - Watch TV Shows Online, Watch Movies Online/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Netflix/Page_Netflix/input_Sign In_userLoginId'), "aripborip@gmail.com")

WebUI.setEncryptedText(findTestObject('Object Repository/Netflix/Page_Netflix/input_Zimbabwe_password'), "8SQVv/p9jVRYfSV/eMGvjg==")

WebUI.click(findTestObject('Object Repository/Netflix/Page_Netflix/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Netflix/Page_Netflix/div_Ibnu_profile-icon'))

WebUI.click(findTestObject('Object Repository/Netflix/Page_Home - Netflix/div_My List_account-dropdown-button'))

WebUI.click(findTestObject('Object Repository/Netflix/Page_Home - Netflix/a_Sign out of Netflix'))

WebUI.closeBrowser()

