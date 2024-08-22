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

WebUI.openBrowser("https://automationexercise.com")
WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise/a_Products'))
//WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - All Products/input_Contact us_search'))
//WebUI.setText(findTestObject('Object Repository/Products/Page_Automation Exercise - All Products/input_Contact us_search'), "bluetop")
//WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - All Products/button_Contact us_submit_search'))
//WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - All Products/i_View Product_fa fa-plus-square'))
WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - All Products/i_View Product_fa fa-plus-square'))
WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/input_Write Your Review_name'))
WebUI.setText(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/input_Write Your Review_name'), "irshad shaik")
WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/input_Write Your Review_email'))
WebUI.setText(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/input_Write Your Review_email'), "irshad.mtdc@gmail.com")
WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/textarea_Write Your Review_review'))
WebUI.setText(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/textarea_Write Your Review_review'), "Hello World")
WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/button_Submit'))
WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/button_Add to cart'))
WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/button_Continue Shopping'))
WebUI.scrollToElement(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/u_View Cart'), 4)
//WebUI.click(findTestObject('Object Repository/Products/Page_Automation Exercise - Product Details/u_View Cart'))

if(WebUI.verifyElementVisible('Object Repository/Products/Page_Automation Exercise - Checkout/a_Blue Top'))
	{
	println("Product Added Successfully")
	}

else {
	println("Please Add the Product")
	}

