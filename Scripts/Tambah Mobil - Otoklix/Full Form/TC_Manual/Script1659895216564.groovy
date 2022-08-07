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

WebUI.navigateToUrl('https://otoklix.com/servis')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/h5_Tambah Mobil'))

WebUI.setText(findTestObject('Object Repository/Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/input_Cari Mobil Kamu_form-control'), 
    'ava')

WebUI.click(findTestObject('Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/button_Avanza - E 1300'))

WebUI.setText(findTestObject('Object Repository/Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/input_(Opsional)_license-plate-prefix'), 
    'AD')

WebUI.setText(findTestObject('Object Repository/Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/input_(Opsional)_license-plate-number'), 
    '1232')

WebUI.setText(findTestObject('Object Repository/Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/input_(Opsional)_license-plate-suffix'), 
    'AD')

WebUI.click(findTestObject('Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/button_Manual'))

WebUI.setText(findTestObject('Object Repository/Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/input_Tahun_tahun'), 
    '2013')

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Otoklix Aplikasi Booking Bengkel  Serv_2bf528/button_Tambah Mobil'))

WebUI.delay(2)

WebUI.closeBrowser()

