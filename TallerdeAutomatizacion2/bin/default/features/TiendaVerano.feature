Feature: Como comprador de la tienda online 
 		 deseo realizar una Compra Online
 		 del vestido mas economico de la tienda.

Scenario: compra de vestido de verano

    Given que me logueo en la tienda online 
    And selecciono la categoria de summer dresses
    And selecciono el vestido mas economico de la lista de resultados
    
    When compro el vestido
    And pago con cheque
    
    Then he comprado el vestido
   
Scenario: Verificar historial de ordenes
  
	  Given que tengo la orden de compra de un vestido
		When ingreso al historial de compras
		Then veo la orden de compra en el historial