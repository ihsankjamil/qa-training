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

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

WebUI.click(findTestObject('Object Repository/LatihanGoogle/Page_Google/a_Login'))

WebUI.click(findTestObject('Object Repository/LatihanGoogle/Page_Login - Akun Google/span_Buat akun'))

WebUI.click(findTestObject('Object Repository/LatihanGoogle/Page_Login - Akun Google/span_Untuk diri sendiri'))

WebUI.setText(findTestObject('Object Repository/LatihanGoogle/Page_Buat Akun Google/input_Buat Akun Google_firstName'), 
    fname)

WebUI.setText(findTestObject('Object Repository/LatihanGoogle/Page_Buat Akun Google/input_Buat Akun Google_lastName'), lname)

WebUI.setText(findTestObject('Object Repository/LatihanGoogle/Page_Buat Akun Google/input_Buat Akun Google_Username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/LatihanGoogle/Page_Buat Akun Google/input_Gunakan alamat email saya saat ini se_55ce11'), 
    password)

WebUI.setEncryptedText(findTestObject('Object Repository/LatihanGoogle/Page_Buat Akun Google/input_Gunakan alamat email saya saat ini se_83a7dd'), 
    password)

WebUI.click(findTestObject('LatihanGoogle/Page_Buat Akun Google/span_Berikutnya'))

WebUI.setText(findTestObject('Object Repository/LatihanGoogle/Page_Buat Akun Google/input_Nomor telepon_phoneNumberId'), 
    notelp)

WebUI.click(findTestObject('Object Repository/LatihanGoogle/Page_Buat Akun Google/span_Kembali'))

WebUI.click(findTestObject('Object Repository/LatihanGoogle/Page_Buat Akun Google/span_Kembali'))

WebUI.closeBrowser()

