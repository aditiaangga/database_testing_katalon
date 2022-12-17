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
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Connection globalConnection = null

ResultSet data_pelanggan

globalConnection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

data_pelanggan = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(globalConnection,
	'select * from data_pelanggan')

'Example: check result set is empty'
println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult'(data_pelanggan))

'Example: Get total of rows from a result set'
println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount'(data_pelanggan))

'Example: Get total of coulmns from a result set'
println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount'(data_pelanggan))

'Example: Export a result set to csv file'
CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV'(data_pelanggan, RunConfiguration.getProjectDir() +
	'/Output Files/data_pelanggan.csv')

'Example: Get single cell value using row and column index'
println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(data_pelanggan, 2, 2))

'Example: Get single cell value using row and column index'
println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(data_pelanggan, 2, 'Nama'))

'Example: Get list of cell value using row and column index'
println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(data_pelanggan, 3))

'Example: Get list of cell value using row and column label'
println(CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue'(data_pelanggan, 'Alamat'))

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(globalConnection)

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(null)


