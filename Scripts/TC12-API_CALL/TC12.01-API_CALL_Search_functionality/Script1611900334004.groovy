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

WebUI.click(findTestObject('TC12-API_CALL/002_Click_API_CALL'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/003_Drop_apicall_search'), 'API Call ID', false)

WebUI.setText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), '11')

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.selectOptionByLabel(findTestObject('TC12-API_CALL/003_Drop_apicall_search'), 'API Call Name', false)

WebUI.setText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), 'join')

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('TC12-API_CALL/004_Input_api_call_name_id'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/005_Drop_APICALL_TYPE'), 0)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/005_Drop_APICALL_TYPE'), 1)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/005_Drop_APICALL_TYPE'), 2)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/005_Drop_APICALL_TYPE'), 3)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/005_Drop_APICALL_TYPE'), 4)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/005_Drop_APICALL_TYPE'), 0)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/006_Drop_apicall_direction'), 1)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC12-API_CALL/006_Drop_apicall_direction'), 2)

WebUI.click(findTestObject('TC12-API_CALL/007_Click_apicall_SEARCH_button'), FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC012.01_Search_function_API_CALL.png', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC12-API_CALL/010_Click_CLOSE_button'))

WebUI.closeBrowser()

