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

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/01_input_User Name_uid'), GlobalVariable.username)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/02_input_Password_pwd'), GlobalVariable.password)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/03_Click_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/04_Click_Configuration Manager'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/05_Click_Customer Contact'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/06_Click_Triggers'))

WebUI.delay(3)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_Click_Trigger_Add_Button'))

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_a_Input_Trigger_name'), GlobalVariable.campaign_name)

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_b_Drop_down_Trigger_Owner'), 
    1)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_c_Input_Description_for_triggername'), 
    'This Trigger for automation testing purpose')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_d_Click_Action_Set_button'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_e_Click_Action_Set_Type_button'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_f_Click_Campaign_action_type'))

WebUI.check(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_g_Check_Advance_filter_to_select_the_campaign'))

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_h_Input_Campaign_name_Filter_adv_sel_id'), 
    GlobalVariable.campaign_name)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_h1_select_first_first_element_from_the_results'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_h2_Click_Advance_filter_OK_button'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/11_j_Click_Action-Trigger-details_button'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/12_Input_Participant_limit'), 
    '1')

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/13_Input_Participant_list'), GlobalVariable.serviceid)

WebUI.check(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/14_Check_Run_trigger_Next_date'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/15_Click_OK_Trigger_Final_submission'))

WebUI.delay(10)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/16_Click_Operations Manager'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/17_Click_Application'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/18_Click_Trigger History'))

WebUI.check(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/19_Check_Execution Date_'))

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/20_Input_Trigger_name_Search'), 
    GlobalVariable.campaign_name)

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/20_a_Drop_down_Trigger_history_button'), 
    1)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/21_Click_Trigger search button'))

WebUI.delay(10)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/22_Click_Trigger_history_first_results'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/23_Click_Trigger_history_view_button'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/24_Click_Trigger_history_details_search'))

WebUI.delay(10)

WebUI.closeBrowser()

