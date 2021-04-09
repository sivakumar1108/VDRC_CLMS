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

WebUI.openBrowser('', FailureHandling.OPTIONAL)

WebUI.navigateToUrl(GlobalVariable.url, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_User Name_uid'), 
    GlobalVariable.username, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_Password_pwd'), 
    GlobalVariable.password, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Login'), 
    FailureHandling.OPTIONAL)

WebUI.maximizeWindow(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/01_Click_Configuration Manager'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/001_API Management'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/002_API Db Call'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/003_Drop_select_Name'), 
    'Name', false, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/004_Input_API_DB_call'), GlobalVariable.apidbcall_and_apidbcall_name, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/005_Click_API_db_call_search_button'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'), 
    FailureHandling.OPTIONAL)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC013.03_01_Before_deleting_the_API_DB_CALL.png', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/008_Click_DELETE_api_db_call'), 
    FailureHandling.OPTIONAL)

WebUI.dismissAlert(FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/008_Click_DELETE_api_db_call'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/003_Drop_select_Name'), 
    'Name', false, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/004_Input_API_DB_call'), GlobalVariable.apidbcall_and_apidbcall_name, 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/005_Click_API_db_call_search_button'), 
    FailureHandling.OPTIONAL)

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    20, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC013.03_02_After_deleting_the_API_DB_CALL.png', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/007_Click_CLOSE_comeoutfrom_apidbcallmain'))

WebUI.comment('Api DB call Delete functionality is working fine')

WebUI.closeBrowser()

