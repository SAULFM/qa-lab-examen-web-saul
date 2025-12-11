#language: es
@testfeature
Característica: Product - Store
  Como automatizador principal de NTT
  Quiero, Automatizar las Pruebas de Regresión de una Tienda en Línea
  Para encontrar defectos en la página principal de la tienda

  @test
  Escenario: Validación del precio de un producto
    Dado estoy en la página de la tienda
    Y me logueo con mi usuario "<usuario>" y clave "<clave>"
    Cuando navego a la categoría "<categoria>" y subcategoria "<subcategoria>"
    Y agrego <cantidad> unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito

    Ejemplos:
      |usuario|clave|categoria|subcategoria|cantidad|
      |sacfm.123@gmail.com|s@cfm.123|Clothes|Men|2|
      |sacfm@gmail.com|123456|Clothes|Men|2|
      |sacfm.123@gmail.com|s@cfm.123|Dresses|Men|2|