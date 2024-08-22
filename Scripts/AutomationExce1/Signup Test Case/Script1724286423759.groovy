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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.verifyElementPresent(findTestObject('Signup/Page_Automation Exercise/h1_AutomationExercise'), 0)

WebUI.click(findTestObject('Object Repository/Signup/Page_Automation Exercise/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 
    'irshad')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    'irshad.mtdcc@gmail.com')

WebUI.click(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.setEncryptedText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__password'), 'bM7re9hieIhOdbLMVkyZQg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__first_name'), 'Bangalore')

WebUI.doubleClick(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/div_Enter Account InformationTitleMr.Mrs.Na_528aaf'))

WebUI.click(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/body_Home Products Cart Signup  Login Test _3f87f2'))

WebUI.doubleClick(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__first_name'))

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__first_name'), 'Bangalore')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__last_name'), 's')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input_Company_company'), 'ty')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    'kathriguppe')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input_Address 2_address2'), 'begur')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__state'), 'karnataka')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__city'), 'blr')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__zipcode'), '560068')

WebUI.setText(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/input__mobile_number'), '9035922895')

WebUI.click(findTestObject('Object Repository/Signup/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.click(findTestObject('Object Repository/Signup/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.click(findTestObject('Object Repository/Signup/Page_Automation Exercise/a_Logout'))

WebUI.closeBrowser()

