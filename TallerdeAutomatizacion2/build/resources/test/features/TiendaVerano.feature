Feature: Como comprador de la tienda online
  	 deseo realizar una Compra Online 
  	 del vestido mas economico de la tienda.

  # Background para el logueo en todos los escenarios.
  Background: Logueo
    Given Que me logueo en la tienda online
    And ingreso usuario y contrasena
      | victor1133@gmail.com | 123456 |
    When Selecciono el boton de loguear
    Then Estoy logeado en la tienda

  # Escenario de compra de vestido de verano
  Scenario: Compra de vestido de verano
    Given Que selecciono la categoria de summer dresses
    And Selecciono el vestido mas economico de la lista de resultados
    When Compro el vestido
    And Pago con cheque
    Then He comprado el vestido

  # Escenario de Verificar historial de ordenes
  Scenario: Verificar historial de ordenes
    Given Que tengo la orden de compra de un vestido
    When Ingreso al historial de compras
    Then Veo la orden de compra en el historial
