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

WebUI.selectOptionByLabel(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/07_Drop_down_select_Trigger IDTrigger Name'), 
    'Trigger Name', false)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_Input_Search - Triggers_Search_Triggers_search1_val'), 
    GlobalVariable.trigger_duplicate_name)

WebUI.uncheck(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_Uncheck__Last Run Date_Search_Triggers_lastrun_date1_cal_check'))

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_a_Drop_down_select_DisabledEnabledCurrent'), 
    0)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/27.01_Click_First_result_triggerresult'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/27_Click_Trigger_MODIFY_button'))

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/26.01_Input_Triggger_duplicate_name'), 
    GlobalVariable.trigger_modify_delete)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/26.02_Input_Trigger_Description_for_duplicatetrigger'), 
    'This trigger is modified and need to be delete by another script')

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/26.03_Input_participant_limit'), 
    '1')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/15_Click_OK_Trigger_Final_submission'))

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/07_Drop_down_select_Trigger IDTrigger Name'), 
    'Trigger Name', false)

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_a_Drop_down_select_DisabledEnabledCurrent'), 
    0)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_Input_Search - Triggers_Search_Triggers_search1_val'), 
    GlobalVariable.trigger_modify_delete)

WebUI.uncheck(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_Uncheck__Last Run Date_Search_Triggers_lastrun_date1_cal_check'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC02.02.02_After_trigger_MODIFIED.png')

WebUI.comment('Trigger Duplicate Functionality is working fine')

