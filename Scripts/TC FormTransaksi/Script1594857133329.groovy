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

WebUI.callTestCase(findTestCase('Login WMS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Menu Entry Transaksi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC InquiryCustomer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NewInquiryCustomer/img_Product_ctl00_BodyContent_rpDetail_cpNAV_cmbProduct_B-1Img'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/NewInquiryCustomer/td_SCHEQ90'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/NewInquiryCustomer/input_Nett Amount_ctl00BodyContentrpDetailc_859f4c'), 
    '100000000', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('FormTransaksi/input_Amount_ctl00BodyContentrpDetailcpSubscriptionspinSubAmount'), 
    '102,000,000.0000')

