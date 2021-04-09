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

WebUI.setText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'))

WebUI.click(findTestObject('TC12-API_CALL/009_00_Click_MODIFY'))

WebUI.setText(findTestObject('TC12-API_CALL/008_01_Input_apicall_name'), GlobalVariable.modify_api_call_name)

WebUI.setText(findTestObject('TC12-API_CALL/008_05_Input_apicall_action_name'), GlobalVariable.modify_api_call_name)

WebUI.click(findTestObject('TC12-API_CALL/009_01_Click_FIRST_RESULT'))

WebUI.click(findTestObject('TC12-API_CALL/009_02_A_Click_Modify'))

WebUI.click(findTestObject('TC12-API_CALL/009_02_A_01_Click_Firt_request_param'))

WebUI.click(findTestObject('TC12-API_CALL/009_05_02_Request_modify'))

WebUI.setText(findTestObject('TC12-API_CALL/009_05_01_01_input_element_name'), 'mod_MSISDN')

WebUI.click(findTestObject('TC12-API_CALL/009_05_01_05_Click_OK'))

WebUI.click(findTestObject('TC12-API_CALL/009_01_Click_Second_Result'))

WebUI.click(findTestObject('TC12-API_CALL/009_06_B_Click_Modify_Response'))

WebUI.setText(findTestObject('TC12-API_CALL/009_06_A_01_Input_Response_add_name'), 'mod_RESULT')

WebUI.click(findTestObject('TC12-API_CALL/009_06_A_04_Click_OK_button'))

WebUI.delay(10)

WebUI.click(findTestObject('TC12-API_CALL/009_06_04_Click_Ok_button'))

WebUI.click(findTestObject('TC12-API_CALL/009_06_Click_ok_comeout_apicalldefinition'))

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/003_Drop_apicall_search'), 'API Call Name', false)

WebUI.setText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), GlobalVariable.modify_api_call_name)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC012.02.01_after_modifying_the_API_CALL.png')

WebUI.click(findTestObject('TC12-API_CALL/010_Click_CLOSE_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    20, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

