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

WebUI.click(findTestObject('Object Repository/NewInquiryCustomer/img_Search By_ctl00_BodyContent_rpSearch_cmbSearchByField_B-1Img'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NewInquiryCustomer/td_Full Name'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/NewInquiryCustomer/input_SID_ctl00BodyContentrpSearchtxtSearchByValue'), 
    'Novianty', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NewInquiryCustomer/span_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NewInquiryCustomer/td_IDD0811H7373042'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('BtnNewSub/span_New Subscription'), FailureHandling.CONTINUE_ON_FAILURE)

