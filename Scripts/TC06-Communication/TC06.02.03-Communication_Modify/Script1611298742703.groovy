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

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/01_Click_Configuration Manager'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/02_Click_Customer Contact'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/03_Click_Communications'))

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/04_Drop_down_select_Communication IDCommunication Name'), 
    'Communication Name', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/05_Input_Search - Communications_Search'), 
    GlobalVariable.communication_duplicate_name)

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    0)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/12_1_First_Search_Results'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_Click_MODIFY'))

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_2_Input_Comm_NAME'), 
    GlobalVariable.communication_modiify_delete)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_3_Input_Description'), 
    'This test communication is modified with comm expiry date and this can be deleted')

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_4_Click_First_template'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_5_Click_Modify_button'))

WebUI.delay(10)

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_6_Check_communication_Expiry'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_6_1_Click_Set_comm'))

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_7_2_Check_Search_ygtvspacer'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_8_Click_In X days'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_9_Click_button_Add_to_xdate'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_10_Click_span_days'))

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_11_Input_Communication_expiry_days'), 
    '5')

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_12_Click_OK_button_toaddxdays'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_13_Click_OK_button_comeoutfrom_expiry_day'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_14_Click_OK_button_comeout_comm_templ_detail'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/13_15_Click_OK_comeout_communication_details'))

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/04_Drop_down_select_Communication IDCommunication Name'), 
    'Communication Name', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/05_Input_Search - Communications_Search'), 
    GlobalVariable.communication_modiify_delete)

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    0)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC06.02.03-communication_modify.png')

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Communication modify functionality is working fine. For screenshot go and refer the Screenshot folder.')

WebUI.closeBrowser()

