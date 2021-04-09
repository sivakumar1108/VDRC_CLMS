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

WebUI.click(findTestObject('TC01-Campaign/02_Configuration_manager_campaign/01_Click_Configuration Manager'))

WebUI.click(findTestObject('TC01-Campaign/03_Customer_Contact/02_Click_Customer Contact'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/03_Click_a_Campaigns'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/01_Drop_down_select_Campaign CodeCampaign IDCampaign'), 
    'Campaign Name', false)

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/01_input_Search - Campaigns_Search_Campaigns_search1_val'), 
    GlobalVariable.campaign_name)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(5)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/03_a_Click_Search_Result_First_Row_Selection'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/07_Click_Campaign_Modify_button'))

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19a_Drop_down_Campaign_Visualization'), 
    'Right to left', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19b_Click_Visualise_button'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19a_Drop_down_Campaign_Visualization'), 
    'LR', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19b_Click_Visualise_button'))

WebUI.delay(3)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19a_Drop_down_Campaign_Visualization'), 
    'BT', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19b_Click_Visualise_button'))

WebUI.delay(3)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19a_Drop_down_Campaign_Visualization'), 
    'TB', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19b_Click_Visualise_button'))

WebUI.delay(3)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19c_Click_On_Export_Layout_button'))

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19d_Drop_down_Select_Export_layout_format'), 
    'Dot', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19e_Click_Ok_button_for_Export_layout'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19d_Drop_down_Select_Export_layout_format'), 
    'Graffle', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19e_Click_Ok_button_for_Export_layout'))

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19d_Drop_down_Select_Export_layout_format'), 
    'GraphML', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19e_Click_Ok_button_for_Export_layout'))

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19d_Drop_down_Select_Export_layout_format'), 
    'PDF', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19e_Click_Ok_button_for_Export_layout'))

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19d_Drop_down_Select_Export_layout_format'), 
    'PNG', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19e_Click_Ok_button_for_Export_layout'))

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19d_Drop_down_Select_Export_layout_format'), 
    'SVG', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19e_Click_Ok_button_for_Export_layout'))

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19d_Drop_down_Select_Export_layout_format'), 
    'VRML', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19e_Click_Ok_button_for_Export_layout'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_19f_Click_Export_layout_cancel_button'))

WebUI.comment('Campaign visualize and export funtionality is working fine')

WebUI.delay(10)

WebUI.closeBrowser()

