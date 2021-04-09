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

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_button_Add'))

'For Communication ID change this value\r\n'
WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_1_Input_Communication_ID'), 
    GlobalVariable.commuication_id)

'This is communication name\r\n'
WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_2_Input_Communication_Name'), 
    GlobalVariable.communication_name)

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_6_Drop_Owner'), 
    1)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_Click_ADD_communication_template'))

WebUI.acceptAlert()

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_2_Drop_communication_channel'), 
    3)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_2_Drop_communication_channel'), 
    'SMS (via SMSC)', false)

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_3_Drop_From_Address'), 
    1)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_5_Drop_Importance'), 
    'Dialog', false)

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_6_Check_Registered_Delivery'))

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_7_Drop_Data_code'), 
    'LATIN-1', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_8_Input_Content'), 
    GlobalVariable.communication_content)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_1_Drop_Language'), 
    'English', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_8_Input_Content'), 
    GlobalVariable.communication_english)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_1_Drop_Language'), 
    'Kikongo', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_8_Input_Content'), 
    GlobalVariable.communication_content)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_1_Drop_Language'), 
    'Swahili', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_8_Input_Content'), 
    GlobalVariable.communication_content)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_1_Drop_Language'), 
    'Lingala', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_8_Input_Content'), 
    GlobalVariable.communication_content)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_1_Drop_Language'), 
    'Tshiluba', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_8_Input_Content'), 
    GlobalVariable.communication_content)

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_9_Check_Send_Timing_Window'))

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_9_0_Check_Monday'))

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_9_1_Check_Tuesday'))

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_9_2_Check_Wednesday'))

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_9_3_Check_Thursday'))

WebUI.check(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_9_4_Check_Friday'))

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_9_5_Input_Communication_start_time'), 
    '00:01')

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_9_6_Input_Communication_end_time'), 
    '23:59')

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_10_Click_Communication_Template_OK'))

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/10_7_11_Click_OK_to_comeout_from_add'))

WebUI.delay(10)

WebUI.selectOptionByLabel(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/04_Drop_down_select_Communication IDCommunication Name'), 
    'Communication Name', false)

WebUI.setText(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/05_Input_Search - Communications_Search'), 
    GlobalVariable.communication_name)

WebUI.selectOptionByIndex(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/06_Drop_down_select_DisabledEnabled'), 
    0)

WebUI.click(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/09_Click_SEARCH_button'))

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC06.02.01-communication_created.png')

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Communication is created successfully. For screenshot go and refer the Screenshot folder.')

WebUI.closeBrowser()

