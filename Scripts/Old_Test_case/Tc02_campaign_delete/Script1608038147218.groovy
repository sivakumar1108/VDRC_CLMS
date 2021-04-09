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

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/a_Configuration Manager'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/a_Customer Contact'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/a_Campaigns'))

WebUI.selectOptionByValue(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/select_Campaign CodeCampaign IDCampaign Nam_e00e6e'), 
    'label', true)

WebUI.setText(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/input_Search - Campaigns_Search_Campaigns_s_5a257b'), 
    GlobalVariable.campaign_name)

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.click(findTestObject('Old_Test_case/campaign_visualization/campaign_start_restart/Page_Emagine Administration Application 11.5.0/div_Automation testing'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/campaign_delete_button'))

WebUI.waitForAlert(5)

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.comment('Campaign Delete functionality is working fine"')

WebUI.closeBrowser()

