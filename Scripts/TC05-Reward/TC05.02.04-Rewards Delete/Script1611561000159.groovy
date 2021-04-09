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
    GlobalVariable.reward_mod_name)

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/05_Click_Reward_search_button'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/10_1_Click_First_Search_results'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/12_Click_DELETE_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.delay(10)

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/12_Click_DELETE_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/04_Drop_Reward_type'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/03_Drop_Reward_name_ID'), 
    'Reward Name', false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/03_01_Input_Reward_search_input'), 
    GlobalVariable.reward_mod_name, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/05_Click_Reward_search_button'))

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC05.02.04-Rewards_After_deleted.png')

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    5)

WebUI.comment('Reward Modify functionality is working fine as expected')

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/09_Click_CLOSE_button'))

WebUI.closeBrowser()

