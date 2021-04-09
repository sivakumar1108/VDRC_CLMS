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

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/002_API Db Call'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_Click_ADD_button'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_03_A_Click_Close_button'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_Click_ADD_button'))

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_01_Insert_API_DB_call_NAME'), 
    GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_02_Insert_Description'), 
    'This api db call for automation testing purpose')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_03_B_Click_OK'))

WebUI.selectOptionByLabel(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/003_Drop_select_Name'), 
    'Name', false)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/004_Input_API_DB_call'), GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/005_Click_API_db_call_search_button'))

WebUI.delay(3)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_Click_MODIFY'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_Click_first_result'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_Click_Add Parameter'))

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_A_Insert_Parameter_name'), 
    'iMSISDN')

WebUI.selectOptionByIndex(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_B_Drop_Type_string'), 
    1)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_D_Insert_Description'), 
    ' This is first input with Number')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_EB_Click_OK'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_Click_first_result'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_Click_Add Parameter'))

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_A_Insert_Parameter_name'), 
    'iMSISDNTYPE')

WebUI.selectOptionByIndex(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_B_Drop_Type_string'), 
    0)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_D_Insert_Description'), 
    'This is second input data')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_EB_Click_OK'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_Click_first_result'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_Click_Add Parameter'))

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_A_Insert_Parameter_name'), 
    'iCAMID')

WebUI.selectOptionByIndex(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_B_Drop_Type_string'), 
    0)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_D_Insert_Description'), 
    'This is third input string')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_EB_Click_OK'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_Click_first_result'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_Click_Add Parameter'))

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_A_Insert_Parameter_name'), 
    'oResult')

WebUI.selectOptionByIndex(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_B_Drop_Type_string'), 
    0)

WebUI.selectOptionByLabel(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_C_Drop_select_IN,OUT,INOUT'), 
    'OUT', false)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_D_Insert_Description'), 
    'This is First Output')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_02_EB_Click_OK'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_1_Click_first_paramter_results'))

WebUI.doubleClick(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_09_B_DOWN_arrow'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_2_Click_second_paramter_results'))

WebUI.doubleClick(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_09_B_DOWN_arrow'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_3_Click_third_paramter_results'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_09_A_UP_arrow'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_4__Click_fourth_paramter_results_output'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_09_A_UP_arrow'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_10_Click_Close_tocomeoutfrom_APIDBCALL'))

WebUI.dismissAlert()

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_Click_MODIFY'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_08_A_Click_- All'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_08_B_Click_ plus_All'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_1_Click_first_paramter_results'))

WebUI.doubleClick(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_09_B_DOWN_arrow'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_05_01_3_Click_third_paramter_results'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_09_A_UP_arrow'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_09_A_UP_arrow'))

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_10_Click_SavePriority_tosaveandcomeout'))

WebUI.acceptAlert()

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_10_Click_Close_tocomeoutfrom_APIDBCALL'))

WebUI.selectOptionByLabel(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/003_Drop_select_Name'), 
    'Name', false)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/004_Input_API_DB_call'), GlobalVariable.apidbcall_and_apidbcall_name)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/005_Click_API_db_call_search_button'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/006_04_Click_FIRST_SEARCH_RESULTS'))

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC13.02_After_creating_the_api_DB_call.png')

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/007_Click_CLOSE_comeoutfrom_apidbcallmain'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Api_DB_call_Add functionality is working fine')

WebUI.closeBrowser()

