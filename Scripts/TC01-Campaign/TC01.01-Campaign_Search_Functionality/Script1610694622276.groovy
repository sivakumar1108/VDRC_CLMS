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

WebUI.delay(3)

WebUI.click(findTestObject('TC01-Campaign/02_Configuration_manager_campaign/01_Click_Configuration Manager'))

WebUI.click(findTestObject('TC01-Campaign/03_Customer_Contact/02_Click_Customer Contact'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/03_Click_a_Campaigns'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/01_Drop_down_select_Campaign CodeCampaign IDCampaign'), 
    'Campaign Name', false)

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/01_input_Search - Campaigns_Search_Campaigns_search1_val'), 
    'test')

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/02_Drop_down_select_Campaign CodeCampaign ID'), 
    'Campaign ID', false)

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/02_input_Search_Search_Campaigns_search2_val'), 
    '%test%')

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/01_Drop_down_select_Campaign CodeCampaign IDCampaign'), 
    'Campaign Code', false)

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/01_input_Search - Campaigns_Search_Campaigns_search1_val'), 
    '10')

WebUI.clearText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/02_input_Search_Search_Campaigns_search2_val'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.clearText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/01_input_Search - Campaigns_Search_Campaigns_search1_val'))

WebUI.clearText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/02_input_Search_Search_Campaigns_search2_val'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_Drop_down_select_CreatedReadyRunningSuspended'), 
    1)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_Drop_down_select_CreatedReadyRunningSuspended'), 
    2)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_Drop_down_select_CreatedReadyRunningSuspended'), 
    3)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_Drop_down_select_CreatedReadyRunningSuspended'), 
    4)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_Drop_down_select_CreatedReadyRunningSuspended'), 
    5)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_Drop_down_select_CreatedReadyRunningSuspended'), 
    6)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_Drop_down_select_CreatedReadyRunningSuspended'), 
    7)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_Drop_down_select_CreatedReadyRunningSuspended'), 
    8)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.closeBrowser()

