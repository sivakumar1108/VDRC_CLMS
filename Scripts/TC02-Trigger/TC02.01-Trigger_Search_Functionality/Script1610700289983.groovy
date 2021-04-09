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

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.comment('These are the latest run trigger details')

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/07_Drop_down_select_Trigger IDTrigger Name'), 
    'Trigger Name', false)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_Input_Search - Triggers_Search_Triggers_search1_val'), 
    GlobalVariable.campaign_name)

WebUI.uncheck(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_Uncheck__Last Run Date_Search_Triggers_lastrun_date1_cal_check'))

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.comment('we are checking the trigger name')

WebUI.delay(3)

WebUI.clearText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_Input_Search - Triggers_Search_Triggers_search1_val'))

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_a_Drop_down_select_DisabledEnabledCurrent'), 
    '1')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_a_Drop_down_select_DisabledEnabledCurrent'), 
    '2')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_a_Drop_down_select_DisabledEnabledCurrent'), 
    '3')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_a_Drop_down_select_DisabledEnabledCurrent'), 
    '0')

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_b_Drop_down_Owner_select_Marketing - SalesMarketing - Retention'), 
    '1')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_b_Drop_down_Owner_select_Marketing - SalesMarketing - Retention'), 
    '2')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_b_Drop_down_Owner_select_Marketing - SalesMarketing - Retention'), 
    '0')

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_c_Input_Max Records_Search_Triggers_searchBy'), 
    '5')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.takeFullPageScreenshot('Screenshots/Screenshots_CLMS/TC02.01_Trigger_Max_Records_for_5_Results.png')

WebUI.comment('Verify the screenshot to check whether it given 5 max records or not.')

printing = WebUI.getText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_d_Get_Element_of_Maximum_results_shown'))

println(printing)

secondprint = WebUI.getText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_d1_Get_Text_of_Max_Trigger_Search_Results'))

println(secondprint)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_c_Input_Max Records_Search_Triggers_searchBy'), 
    '100')

WebUI.check(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_Uncheck__Last Run Date_Search_Triggers_lastrun_date1_cal_check'))

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_D_Input_Date(01-02-2021)_For_first'), 
    '01/01/2021')

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_e_Drop_down_Last run less than , greater than'), 
    1)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_e_Drop_down_Last run less than , greater than'), 
    2)

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_e_Drop_down_Last run less than , greater than'), 
    4)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_D_Input_Date(02-01-2021)_End_date'), 
    '31/12/2021')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.delay(3)

WebUI.uncheck(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/09_Uncheck__Last Run Date_Search_Triggers_lastrun_date1_cal_check'))

WebUI.selectOptionByIndex(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/07_Drop_down_select_Trigger IDTrigger Name'), 
    0)

WebUI.setText(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/08_Input_Search - Triggers_Search_Triggers_search1_val'), 
    '%1%')

WebUI.click(findTestObject('TC02-Trigger/Page_Emagine Administration Application 11.5.0/10_Click_Trigger_Search_button'))

WebUI.comment('Trigger Search Functionality is working fine')

