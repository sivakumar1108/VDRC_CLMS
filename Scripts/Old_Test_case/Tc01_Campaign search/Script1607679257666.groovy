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

WebUI.callTestCase(findTestCase('Old_Test_case/Tc_01'), [:], FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/a_Configuration Manager'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/a_Customer Contact'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/a_Campaigns'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Search - Campaigns_Search_Campaigns_s_5a257b'), 
    'test')

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Search_Search_Campaigns_search2_val'), 
    'test')

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.click(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/tr_Campaign CodeCampaign IDCampaign NameCam_c0ca08'))

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Search_Search_Campaigns_search2_val'), 
    '')

WebUI.click(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/tr_Campaign CodeCampaign IDCampaign NameCam_c0dfd9'))

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Search - Campaigns_Search_Campaigns_s_5a257b'), 
    '')

WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_CreatedReadyRunningSuspendedWind UpC_176aa5'), 
    '1', true)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_CreatedReadyRunningSuspendedWind UpC_176aa5'), 
    '3', true)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_CreatedReadyRunningSuspendedWind UpC_176aa5'), 
    '6', true)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Search'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Add'))

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Name _111ae913985f1aca1ad08f99298dc30a_name'), 
    'Automation testing')

WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_Default Campaign GroupAcquisition'), 
    'Default', true)

WebUI.click(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/div_Extended Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_Cross sell - ProductCross sell - Pac_76d917'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_Poly Phase 1 - Day   1Poly Phase 1 -_4cbf2b'), 
    '1', true)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_ok_for_campaign_add'))

WebUI.delay(10)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Details'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/campaign_process_flow'))

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Add Step'))

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Step Name_87f6d594723f5b2f60614247b8d_ea2320'), 
    'Enter to the campaign')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_OK'), 
    10)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Add Step'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Step Name_87f6d594723f5b2f60614247b8d_ea2320'), 
    'wait for 1 mins and send comms')

WebUI.delay(5)

WebUI.click(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/div_generate_alter'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Set'))

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button set alter'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/a_Communication'))

WebUI.click(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Advanced Filter_c245544ec737e83e6ee93_e493de'))

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Filter_adv_sel_id'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_EnabledDisabled'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_df - test uniduplicate TEST_SHIVA_JU_da3e37'), 
    'TEST JULY FIRST TEST', true)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_ok_communication'))

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/campaign_ok_button'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Add Step'))

WebUI.setText(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/input_Step Name_87f6d594723f5b2f60614247b8d_ea2320'), 
    'Exit from the campaign')

WebUI.delay(5)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/add_response_S1'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Add Response'))

WebUI.setText(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/S1-Response_input'), 
    'no wait')

WebUI.click(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/s1_response_ok'))

WebUI.delay(5)

WebUI.click(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/s2-response selection'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Add Response'))

WebUI.setText(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/s2_input_response'), 
    'wait for a minute')

//WebUI.selectOptionByValue(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_S1 - Enter to the campaignS3 - Exit _0af996'), 
//   '132056', true)
WebUI.selectOptionByLabel(findTestObject('Object Repository/campaign search and create/Page_Emagine Administration Application 11.5.0/select_S1 - Enter to the campaignS3 - Exit _0af996'), 
    'S3 - Exit from the campaign', true)

WebUI.click(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/s2(R1)_response_submit'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Validation Details'))

WebUI.delay(3)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/a_s3_exit_from_the_campaign_alternate'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Modify'))

WebUI.click(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/s3_termination_step_checkbox'))

WebUI.selectOptionByLabel(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/S3_success_indicator_selection'), 
    'Successful', true)

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_OK'))

WebUI.click(findTestObject('Old_Test_case/campaign search and create/Page_Emagine Administration Application 11.5.0/button_Close'))

WebUI.click(findTestObject('campaign search and create/Page_Emagine Administration Application 11.5.0/start_campaign_button'))

WebUI.waitForAlert(5)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.acceptAlert()

