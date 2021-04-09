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

WebUI.delay(3)

WebUI.click(findTestObject('TC01-Campaign/03_Customer_Contact/02_Click_Customer Contact'))

WebUI.delay(3)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/03_Click_a_Campaigns'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/02_Drop_down_select_Campaign CodeCampaign ID'), 
    'Campaign Name', false)

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/02_input_Search_Search_Campaigns_search2_val'), 
    GlobalVariable.campaign_name)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.delay(3)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/08_a_Click_First_search_Result_for'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/10_Click_Campaign_Export_import'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/10_d_Click_OK_button_for_Export_import'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/10_g_Drop_down_Import_export_selection'), 
    'Import', false)

WebUI.uploadFile(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/10_e_Upload_file_Campaign_export'), 
    '‪C:\\\\Users\\\\sivakumar.a\\\\Downloads\\\\470-C469.xml')

