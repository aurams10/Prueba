
Feature: Realizar busqueda en google
Description: Esta caracteristica permite realizar la busqueda de una palabra en google


    #1-Realizar una busqueda
	Scenario: Reaizar busqueda de la palabra Pruebaz
	Given Abrir el navegador
	When Enter the URL "http://www.google.com"
	And Ingresar la palabra "Pruebaz"
	And Click en el boton "Buscar con Google"
	Then Validar que se cargue la palabra correcta "Pruebas"
