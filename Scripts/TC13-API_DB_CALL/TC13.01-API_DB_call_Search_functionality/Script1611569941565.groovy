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

WebUI.selectOptionByLabel(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/003_Drop_select_Name'), 
    'Name', false)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/004_Input_API_DB_call'), 'test')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/005_Click_API_db_call_search_button'), 
    FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/004_Input_API_DB_call'), 'API')

WebUI.click(findTestObject('TC13_API_DB_CALL/Page_Emagine Administration Application 11.5.0/005_Click_API_db_call_search_button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    5, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('TC13.01-ApiDBcall search functionality is working fine')

WebUI.closeBrowser()

