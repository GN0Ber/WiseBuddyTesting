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

WebUI.setText(findTestObject('Object Repository/Editar-Perfil/Page_Login/input_Login_css-textinput-11aywtz r-placeho_f2d72d'), 
    'teste2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Editar-Perfil/Page_Login/input_Login_css-textinput-11aywtz r-placeho_f2d72d_9'), 
    'iEJD8MEks6rvy5tk59lHxA==')

WebUI.click(findTestObject('Object Repository/Editar-Perfil/Page_Login/div_Login_css-text-146c3p1 r-color-jwli3a r_992836'))

WebUI.click(findTestObject('Object Repository/Editar-Perfil/Page_Main/a_Suitability_css-view-g5y9jx r-touchAction_81ef73'))

WebUI.click(findTestObject('Object Repository/Editar-Perfil/Page_Profile/div_teste2gmail.com_css-view-g5y9jx r-trans_0c5ab2'))

WebUI.setText(findTestObject('Object Repository/Editar-Perfil/Page_EditProfile/input_Editar Perfil_css-textinput-11aywtz r_9c9e5f_13'), 
    '11111111111111')

WebUI.setText(findTestObject('Object Repository/Editar-Perfil/Page_EditProfile/input_Editar Perfil_css-textinput-11aywtz r_9c9e5f_14'), 
    '')

WebUI.click(findTestObject('Object Repository/Editar-Perfil/Page_EditProfile/input_Editar Perfil_css-textinput-11aywtz r_9c9e5f_14'))

WebUI.setText(findTestObject('Object Repository/Editar-Perfil/Page_EditProfile/input_Editar Perfil_css-textinput-11aywtz r_9c9e5f_25'), 
    '22222222222')

WebUI.click(findTestObject('Object Repository/Editar-Perfil/Page_EditProfile/div_Editar Perfil_css-view-g5y9jx r-transit_56b852'))

WebUI.click(findTestObject('Object Repository/Editar-Perfil/Page_EditProfile/div_Profile_css-text-146c3p1 r-userSelect-lrvibr'))

