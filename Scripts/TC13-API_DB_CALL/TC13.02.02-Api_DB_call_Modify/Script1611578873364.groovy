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

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_User Name_uid'), 
    GlobalVariable.username, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/input_Password_pwd'), 
    GlobalVariable.password, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Old_Test_case/complete_campaign_visualization/Page_Emagine Administration Application 11.5.0/button_Login'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/01_Click_Configuration Manager'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/001_API Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/002_API Db Call'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/003_Drop_select_Name'), 
    'Name', false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/004_Input_API_DB_call'), GlobalVariable.apidbcall_and_apidbcall_name, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/005_Click_API_db_call_search_button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_Click_MODIFY'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_Click_MODIFY'), 
    5)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_1_Click_first_paramter_results'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC013.02.02_Before_deleting_the_parameter.png')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_06_Click_Modify_parameter'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_A_Insert_Parameter_name'), 
    'inputMSISDN', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_B_Drop_Type_string'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_D_Insert_Description'), 
    'This input value has been modified to check the modify functionality', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_EB_Click_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_10_Click_SavePriority_tosaveandcomeout'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_3_Click_third_paramter_results'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_07_Click_Delete_parameter'), 
    FailureHandling.STOP_ON_FAILURE)

'Delete cancel functionality is working fine'
WebUI.dismissAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_07_Click_Delete_parameter'), 
    FailureHandling.STOP_ON_FAILURE)

'Delete Accept functionality is working fine'
WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC013.02.02_after_deleting_the_parameter.png')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_10_Click_SavePriority_tosaveandcomeout'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_10_Click_Close_tocomeoutfrom_APIDBCALL'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Api Db call modify functionality is working fine.')

WebUI.closeBrowser()

