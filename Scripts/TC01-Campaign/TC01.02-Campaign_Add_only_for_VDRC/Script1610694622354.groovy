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

WebUI.delay(5)

WebUI.click(findTestObject('TC01-Campaign/03_Customer_Contact/02_Click_Customer Contact'))

WebUI.delay(5)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/03_Click_a_Campaigns'))

WebUI.delay(5)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_Click_Campaign_Add_button'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_01_Input_text_Campaign_Name'), 
    GlobalVariable.campaign_name)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_02_Drop_down_select_Single_entry_or_Multiple_entry'), 
    'Multi-Entry', false)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_03_Drop_down_Campaign_Objective'), 
    1, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_04_Drop_down_Campaign_type_Cross sell - Product'), 
    1, FailureHandling.OPTIONAL)

WebUI.selectOptionByIndex(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_05_Drop_down_Campaign_Owner_'), 
    '1', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_06_Input_text_Description'), 
    'This is for testing purpose')

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_07_Campaign_OK_button'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_08_Click_Campaign_Process_flow_details_button'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_09_Click_Add Step_button'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_10_input_text_Step_name'), 
    'Enter into the campaign')

WebUI.check(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_11_Check_box_Generate_action'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_12_Click_Action_Set_button'))

WebUI.delay(3)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_12b_Click_Set_for_communication_as_a_action'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_12b_Communication'))

WebUI.check(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_12b_Check_box_select_communication'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_12c_Input_Text_field_to_provide_the_communication_name'), 
    'test')

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_12e_select_first_option_as_a_communication'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_12f_Click_OK_buttonto_confirm_the_communication_selection'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_12g_Click_OK_button_to_confirm_the_communication'))

WebUI.delay(5)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_13_Click_Campaign_steps_submit_ok_button'))

WebUI.delay(5)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_09_Click_Add Step_button'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_10_input_text_Step_name'), 
    'Wait for 2 minutes')

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_13_Click_Campaign_steps_submit_ok_button'))

WebUI.delay(5)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_09_Click_Add Step_button'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_10_input_text_Step_name'), 
    'Exit from the campaign')

WebUI.check(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_14a_Check_box_Click_control_group_for_Step_successful_exit'))

WebUI.check(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_14b_Check_box_Click_Termination_Step_for_Step_successful_exit'))

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_14c_Drop_down_select_SuccessfulUnsuccessful'), 
    'Successful', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_14d_Click_OK_button_to_save_the_Campaign_step'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_15_Click_the_steps_S1_Sample'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_15a_Click_Add Response_button'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_15a1_Input_Step_Response_R1_Name'), 
    'No Response')

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/06_15a2_Click_Step Response_Save_OK_button'))

WebUI.delay(5)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a_Click_on_S2_Step_to_add_response'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a1_Click_Add_Response_button_to_add_the_Response_R2'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a2_Input_text_Response_R2_Wait_for_2_minutes'), 
    'Wait for 2 minutes')

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a3_Drop_down_for_selecting_Next_step_select_S1 - sampleS3 - Successful_exit'), 
    'S3 - Exit from the campaign', false)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a31_Drop_down_to_select_reponse_type(timing)'), 
    'Timing', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a4_Click_Set_button_to_set_the_timings'))

WebUI.check(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a5_Check_box_click_timings'))

WebUI.delay(3)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a6_Click_X minutes_to_set_the_minutes'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a7_Click_Add_button'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a8_Click_span_30_to_adjust_the_minutes'))

WebUI.clearText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a9_Clear_input_and_set_text_2_minutes'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a9_Clear_input_and_set_text_2_minutes'), 
    '2')

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a10_Click_OK_button'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16a11_Click_OK_button_OK'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_16b_Click_OK_button_to_comeout_from_Response_step'))

WebUI.delay(3)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_17_Click_Validation_button_Details'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_18_Click_campaign_process_flow_Close_button'))

WebUI.delay(3)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/06_18_Click_Close_button_campaign_overview'))

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/01_input_Search - Campaigns_Search_Campaigns_search1_val'), 
    GlobalVariable.campaign_name)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/01_Drop_down_select_Campaign CodeCampaign IDCampaign'), 
    'Campaign Name', false)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/05_Click_the_Search_result_1st_option'))

Text = WebUI.getText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/05_a_Click_search_result_Campaign_id'))

println(Text)

WebUI.comment(Text)

WebUI.selectOptionByLabel(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/02_Drop_down_select_Campaign CodeCampaign ID'), 
    'Campaign ID', false)

WebUI.setText(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/02_input_Search_Search_Campaigns_search2_val'), 
    Text)

WebUI.click(findTestObject('TC01-Campaign/04_Campaign(config_manager)/Customer_contact_Campaign/Customer_contact_Campaign/04_Click_Campaign_Search_button'))

WebUI.comment('Campaign creation functionality is working fine as Expected')

