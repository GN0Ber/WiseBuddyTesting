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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8081/')

WebUI.click(findTestObject('Object Repository/Cadastro/Page_Login/div_Entrar_css-text-146c3p1 r-color-jwli3a _e965ab'))

WebUI.click(findTestObject('Object Repository/Cadastro/Page_Register/input_Registrar_css-textinput-11aywtz r-pla_efc88f'))

WebUI.setText(findTestObject('Object Repository/Cadastro/Page_Register/input_Registrar_css-textinput-11aywtz r-pla_efc88f_1'), 
    'a')

WebUI.click(findTestObject('Object Repository/Cadastro/Page_Register/div_Registrar_css-view-g5y9jx r-backgroundC_842b40'))

WebUI.click(findTestObject('Object Repository/Cadastro/Page_Register/input_Registrar_css-textinput-11aywtz r-pla_efc88f'))

WebUI.setText(findTestObject('Object Repository/Cadastro/Page_Register/input_Registrar_css-textinput-11aywtz r-pla_efc88f_2'), 
    'b')

WebUI.setText(findTestObject('Object Repository/Cadastro/Page_Register/input_Registrar_css-textinput-11aywtz r-pla_efc88f_13'), 
    'c@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cadastro/Page_Register/input_Registrar_css-textinput-11aywtz r-pla_efc88f_14'), 
    'bTVIq92haJs=')

WebUI.click(findTestObject('Object Repository/Cadastro/Page_Register/input_Registrar_css-textinput-11aywtz r-pla_efc88f'))

WebUI.setText(findTestObject('Object Repository/Cadastro/Page_Register/input_Registrar_css-textinput-11aywtz r-pla_efc88f_15'), 
    '5')

WebUI.click(findTestObject('Object Repository/Cadastro/Page_Register/div_Registrar_css-text-146c3p1 r-color-jwli_b037f6'))

