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

WebUI.click(findTestObject('CreateAppointment/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.selectOptionByValue(findTestObject('CreateAppointment/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center  Hongkong CURA Healthcare Center  Seoul CURA Healthcare Center'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('CreateAppointment/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('CreateAppointment/Page_CURA Healthcare Service/label_Medicare'))

WebUI.click(findTestObject('CreateAppointment/Page_CURA Healthcare Service/div_Visit Date (Required)_input-group-addon'))

WebUI.click(findTestObject('CreateAppointment/Page_CURA Healthcare Service/td_23'))

WebUI.click(findTestObject('CreateAppointment/Page_CURA Healthcare Service/div_Visit Date (Required)_input-group-addon'))

WebUI.setText(findTestObject('CreateAppointment/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Test Seoul Appointment - Medicare')

WebUI.click(findTestObject('CreateAppointment/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('ValidationCura/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 0)

WebUI.verifyTextPresent('Seoul CURA Healthcare Center', false)

WebUI.verifyTextPresent('Yes', false)

WebUI.verifyTextPresent('Medicare', false)

WebUI.verifyTextPresent('23/05/2022', false)

WebUI.click(findTestObject('ValidationCura/Page_CURA Healthcare Service/a_Go to Homepage'))

