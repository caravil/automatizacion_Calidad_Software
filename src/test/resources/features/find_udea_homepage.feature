#Autores: Modulo 5
  #language: en

  Feature: consultar la pagina principal de la U de A
    como estudiante de la U de A necesito buscar homepage de la U en google
    para ingresar al sitio oficial de la UdeA

  Scenario: Ir a la pagina oficial de la UdeA pasando por el motor de busqueda de Google
    Given que me encuentro en la pagina principal de google
    When escriba la palabra Amazon
    Then puedo ver el link de la pagina oficial de la U y poder navegar hacia alla