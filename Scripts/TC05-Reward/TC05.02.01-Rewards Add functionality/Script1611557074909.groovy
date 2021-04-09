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

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/01_Click_Configuration Manager'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/02_Click_Rewards'))

WebUI.check(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_Click_ADD_button'))

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_01_Input_Reward_Id'), GlobalVariable.reward_id)

WebUI.selectOptionByLabel(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_04_Drop_Supplier_Name'), 
    GlobalVariable.reward_supplier, false)

WebUI.check(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_Check_Valid_period'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_01_Click_Set_button'))

WebUI.check(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_02_Check_Timing'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_03_Click_In_X_days'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_04_Click_Add'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_05_Click_Days'))

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_06_Input_Days_value'), '5')

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_07_Click_OK_button_tocomeoutfromdays'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_05_08_Click_OK_tocomeout_validity_period'))

WebUI.check(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_06_Check_Communication_search_filter'))

'Please change this name to manual incase communication is not existing'
WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_06_01_Input_Communication_name'), 
    GlobalVariable.communication_name)

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_06_02_Click_First_Search_Results'))

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_06_03_Click_OK_comeout_Advance_filter'))

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_07_Drop_Suppplier_Reward_type'), 
    1)

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_11_Drop_Language'), 
    0)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_08_Input_Reward_description'), 
    GlobalVariable.reward_description)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_02_Input_Reward_Name'), GlobalVariable.reward_name)

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_11_Drop_Language'), 
    1)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_08_Input_Reward_description'), 
    GlobalVariable.reward_description)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_02_Input_Reward_Name'), GlobalVariable.reward_name)

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_11_Drop_Language'), 
    2)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_08_Input_Reward_description'), 
    GlobalVariable.reward_description)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_02_Input_Reward_Name'), GlobalVariable.reward_name)

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_11_Drop_Language'), 
    3)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_08_Input_Reward_description'), 
    GlobalVariable.reward_description)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_02_Input_Reward_Name'), GlobalVariable.reward_name)

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_11_Drop_Language'), 
    4)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_08_Input_Reward_description'), 
    GlobalVariable.reward_description)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_02_Input_Reward_Name'), GlobalVariable.reward_name)

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_11_Drop_Language'), 
    5)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_08_Input_Reward_description'), 
    GlobalVariable.reward_description)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_02_Input_Reward_Name'), GlobalVariable.reward_name)

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_09_Click_Reward_category_and_cost'))

WebUI.check(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_10_Check_Reward_Category'))

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_12_Input_Supplier_Reward_ID'), 
    '0000')

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/08_13_Click_OK_button'))

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/04_Drop_Reward_type'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/03_Drop_Reward_name_ID'), 
    'Reward Name', false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/03_01_Input_Reward_search_input'), 
    GlobalVariable.reward_name, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC05-Rewards/Page_Emagine Administration Application 11.5.0/05_Click_Reward_search_button'))

WebUI.verifyElementNotPresent(findTestObject('TC06-Communication/Page_Emagine Administration Application 11.5.0/11_Search_results_Not_Found'), 
    0)

WebUI.comment('Reward add functionality is working fine as expected')

WebUI.closeBrowser()

