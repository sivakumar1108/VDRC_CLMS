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

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/01_Click_Configuration Manager'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/02_Click_Rewards'))

WebUI.selectOptionByLabel(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/03_Drop_Reward_name_ID'), 
    'Reward Name', false)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/03_01_Input_Reward_search_input'), 
    GlobalVariable.reward_name)

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/05_Click_Reward_search_button'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/10_1_Click_First_Search_results'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/10_Click_DUPLICATE'))

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_01_Input_Reward_Id'), GlobalVariable.reward_dup_id)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_02_Input_Reward_Name'), GlobalVariable.reward_dup_name)

WebUI.uncheck(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_Check_Valid_period'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_13_Click_OK_button'))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/04_Drop_Reward_type'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/03_Drop_Reward_name_ID'), 
    'Reward Name', false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/03_01_Input_Reward_search_input'), 
    GlobalVariable.reward_dup_name, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/05_Click_Reward_search_button'))

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    0)

WebUI.comment('Reward Duplicate functionality is working fine as expected')

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/09_Click_CLOSE_button'))

WebUI.closeBrowser()

