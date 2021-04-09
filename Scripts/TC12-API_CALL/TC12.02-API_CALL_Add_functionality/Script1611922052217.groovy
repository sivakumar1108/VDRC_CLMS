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

WebUI.delay(15)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/01_Click_Configuration Manager'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/001_API Management'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC12-API_CALL/002_Click_API_CALL'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC12-API_CALL/008_00_Click_ADD_button'))

WebUI.delay(5)

WebUI.click(findTestObject('TC12-API_CALL/008_06_Click_cancel_button'))

WebUI.click(findTestObject('TC12-API_CALL/008_00_Click_ADD_button'))

WebUI.setText(findTestObject('TC12-API_CALL/008_01_Input_apicall_name'), GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.setText(findTestObject('TC12-API_CALL/008_05_Input_apicall_action_name'), GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.click(findTestObject('TC12-API_CALL/008_07_Click_OK_button'))

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/003_Drop_apicall_search'), 'API Call Name', false)

WebUI.setText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC12-API_CALL/009_00_Click_MODIFY'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC12-API_CALL/009_00_A_Click_Add_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC12-API_CALL/009_03_Input_Name'), GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/009_04_Drop_API_DB_CALL'), GlobalVariable.apidbcall_and_apidbcall_name, 
    false)

WebUI.acceptAlert()

WebUI.click(findTestObject('TC12-API_CALL/009_05_Click_REQUEST'))

WebUI.click(findTestObject('TC12-API_CALL/009_05_01_Request_add'))

WebUI.setText(findTestObject('TC12-API_CALL/009_05_01_01_input_element_name'), 'MSISDN')

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/009_05_01_02_Drop_Type'), 'Bind', false)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/009_05_01_03_Drop_Bind'), 0, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC12-API_CALL/009_05_01_05_Click_OK'))

WebUI.click(findTestObject('TC12-API_CALL/009_05_01_Request_add'))

WebUI.setText(findTestObject('TC12-API_CALL/009_05_01_01_input_element_name'), 'MSISDNTYPE')

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/009_05_01_02_Drop_Type'), 'Bind', false)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/009_05_01_03_Drop_Bind'), 1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC12-API_CALL/009_05_01_05_Click_OK'))

WebUI.click(findTestObject('TC12-API_CALL/009_05_01_Request_add'))

WebUI.setText(findTestObject('TC12-API_CALL/009_05_01_01_input_element_name'), 'CAMID')

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/009_05_01_02_Drop_Type'), 'Bind', false)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/009_05_01_03_Drop_Bind'), 2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC12-API_CALL/009_05_01_05_Click_OK'))

WebUI.click(findTestObject('TC12-API_CALL/009_06_Click_NEW_Response'))

WebUI.setText(findTestObject('TC12-API_CALL/009_06_01_Input_response_name'), 'Response')

WebUI.click(findTestObject('TC12-API_CALL/009_06_02_Click_Responsename_OK'))

WebUI.click(findTestObject('TC12-API_CALL/009_06_03_Click_RESPONSE_First'))

WebUI.click(findTestObject('TC12-API_CALL/009_06_A_Click_Add_Response'))

WebUI.setText(findTestObject('TC12-API_CALL/009_06_A_01_Input_Response_add_name'), 'RESULT')

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/009_06_A_02_Drop_Type'), 'Bind', false)

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/009_06_A_03_Drop_bind_selection'), 'oResult', false)

WebUI.click(findTestObject('TC12-API_CALL/009_06_A_04_Click_OK_button'))

WebUI.delay(10)

WebUI.click(findTestObject('TC12-API_CALL/009_06_04_Click_Ok_button'))

WebUI.click(findTestObject('TC12-API_CALL/009_06_Click_ok_comeout_apicalldefinition'))

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/003_Drop_apicall_search'), 'API Call Name', false)

WebUI.setText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC012.02_after_creating_the_API_CALL.png')

WebUI.click(findTestObject('TC12-API_CALL/010_Click_CLOSE_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    20, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

