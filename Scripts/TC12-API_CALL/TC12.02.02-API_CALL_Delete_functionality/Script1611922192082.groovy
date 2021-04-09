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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_User Name_uid'), 
    GlobalVariable.username)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_Password_pwd'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/01_Click_Configuration Manager'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/001_API Management'))

WebUI.click(findTestObject('TC12-API_CALL/002_Click_API_CALL'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/003_Drop_apicall_search'), 'API Call Name', false)

WebUI.setText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), GlobalVariable.modify_api_call_name)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'))

WebUI.click(findTestObject('TC12-API_CALL/011_Click_DELETE'))

WebUI.dismissAlert()

WebUI.delay(0)

WebUI.click(findTestObject('TC12-API_CALL/011_Click_DELETE'), FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/003_Drop_apicall_search'), 'API Call Name', false)

WebUI.setText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), GlobalVariable.modify_api_call_name)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC012.02.03_after_deleting_the_API_CALL.png')

WebUI.verifyElementPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    20, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

